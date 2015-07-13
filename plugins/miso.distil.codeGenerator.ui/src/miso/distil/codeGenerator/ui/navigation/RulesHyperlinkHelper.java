package miso.distil.codeGenerator.ui.navigation;

import java.util.ArrayList;
import java.util.List;

import miso.carrascal.nature.builder.DistilNature;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.common.types.xtext.ui.JdtHyperlink;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;

import codeGeneratorModel.Artifact;
import codeGeneratorModel.Service;
import codeGeneratorModel.Entity;
import codeGeneratorModel.ServiceEnum;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * To create hyperlinks from language to files
 * 
 * @author Carlos Carrascal
 */
public class RulesHyperlinkHelper implements IHyperlinkHelper  {
	
	@Inject
    private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject
    private Provider<JdtHyperlink> jdtHyperlinkProvider;

	@Inject 
	private miso.distil.codeGenerator.generator.Names names;
	
	@Override
	public IHyperlink[] createHyperlinksByOffset(XtextResource resource,
			int offset, boolean createMultipleHyperlinks) {

		// elemento en .rules
		IParseResult parseResult = resource.getParseResult();
		if(parseResult == null || parseResult.getRootNode() == null)
			return null;

		INode node = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
		if(node == null)
			return null;
		EObject elem = eObjectAtOffsetHelper.resolveElementAt(resource, offset);
//		EObject elem = node.getSemanticElement();
		if(elem == null)
			return null;
		
		System.out.println(elem);
		System.out.println(offset);
		
		// proyecto
		String filePath = resource.getURI().toPlatformString(true);
		IFile file_project = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(filePath));
		IProject project = file_project.getProject();
		
		try {
			// si el proyecto es tipo java y tipo distil
			if(project.hasNature(JavaCore.NATURE_ID) && project.hasNature(DistilNature.DISTIL_NATURE_ID)) {

				try {	
					List<String> paths = new ArrayList<String>();
					if(elem instanceof Artifact) {
						Artifact artifact = (Artifact) elem;
						paths.add(names.getArtifactFileChar(artifact).toString());
				        if(artifact.getBasicServices().contains(ServiceEnum.UPDATE) || artifact.getBasicServices().contains(ServiceEnum.UPLOAD)) {
				        	paths.add(names.getArtifactJsonFileChar(artifact).toString());
				        }
					} else if(elem instanceof Service) {
						Service service = (Service) elem;
						paths.add(names.getServiceFileChar(service).toString());
					} else if(elem instanceof Entity) {
						Entity entity = (Entity) elem;
						paths.add(names.getEntityFileChar(entity).toString());
					}
			        
					return createHyperlinks(project, paths, node.getOffset(), node.getLength());
				} catch (JavaModelException e) {
					e.printStackTrace();
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	private IHyperlink[] createHyperlinks(IProject project, List<String> paths, Integer offset, Integer length) throws JavaModelException {
		IJavaProject jproject = JavaCore.create(project);
		List<JdtHyperlink> hyperlinks = new ArrayList<JdtHyperlink>();
		for(String path : paths) {
			System.out.println(path);
			IType type = jproject.findType(path);
			if(type == null) {
				return null;
			}
			JdtHyperlink hyperlink = jdtHyperlinkProvider.get();
			hyperlink.setJavaElement(type);
		    hyperlink.setHyperlinkText("Go to " + type.getTypeQualifiedName());
		    hyperlink.setTypeLabel("Go to " + type.getTypeQualifiedName());
		    hyperlink.setHyperlinkRegion(new Region(offset, length));
		    hyperlinks.add(hyperlink);
		}
		if(hyperlinks.isEmpty()) {
			return null;
		} else {
			return hyperlinks.toArray(new JdtHyperlink[0]);
		}
	}
	
}
