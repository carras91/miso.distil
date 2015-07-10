package miso.distil.codeGenerator.ui.navigation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;

public class RulesHyperlinkHelper extends HyperlinkHelper {
	
	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		IParseResult parseResult = resource.getParseResult();
		if(parseResult != null && parseResult.getRootNode() != null) {
			ILeafNode leaf = NodeModelUtils.findLeafNodeAtOffset(parseResult.getRootNode(), offset);
			EObject grammarElement = leaf.getParent().getParent().getGrammarElement();
	        if (grammarElement instanceof RuleCall) {
	        	RuleCall rc = (RuleCall)grammarElement;
	        	AbstractRule rule = rc.getRule();
	        	System.out.println("rule " + rule.getName());
	        	for(String segment : resource.getURI().segmentsList())
	        		System.out.println(segment);
	        	URI uri = URI.createPlatformResourceURI("/" + resource.getURI().segment(1) + "/Procfile", true);
	        	System.out.println("uri " + uri);
	        	XtextHyperlink result = getHyperlinkProvider().get();
	        	result.setURI(uri);
	        	Region region = new Region(1, 1);
	        	result.setHyperlinkRegion(region);
	        	result.setHyperlinkText("wololo");
	        	acceptor.accept(result);
	        	System.out.println("name " + resource.getLanguageName() + "////" + resource.toString() + "////" + offset);
	            System.out.println("text " + leaf.getText() + "////" + leaf.getOffset());
	        }
		}
		
		super.createHyperlinksByOffset(resource, offset, acceptor);
	}
}
