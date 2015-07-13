package miso.carrascal.nature.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.commands.*;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class AddRemoveDistilNatureHandler extends AbstractHandler {

//	private ISelection selection;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		//
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it
					.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element)
							.getAdapter(IProject.class);
				}
				if (project != null) {
					try {
						toggleNature(project);
					} catch (CoreException e) {
						throw new ExecutionException("Failed to toggle nature",
								e);
					}
				}
			}
		}

		return null;
	}

	/**
	 * Toggles sample nature on a project
	 *
	 * @param project
	 *            to have sample nature added or removed
	 */
	private void toggleNature(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();

		for (int i = 0; i < natures.length; ++i) {
			if (DistilNature.DISTIL_NATURE_ID.equals(natures[i])) {
				// Remove the nature
				String[] newNatures = new String[natures.length - 1];
				System.arraycopy(natures, 0, newNatures, 0, i);
				System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
				System.out.println("Nature " + DistilNature.DISTIL_NATURE_ID + " removed");
				return;
			}
		}
		
		// Create folder and files
		ConvertToMaven.run(project);
		
		// Add the natures

		ArrayList<String> newNatures = new ArrayList<String>(Arrays.asList(natures));
		newNatures.add(DistilNature.DISTIL_NATURE_ID);
		System.out.println("Nature " + DistilNature.DISTIL_NATURE_ID + " added");
		if(!newNatures.contains(DistilNature.MAVEN_NATURE_ID)) {
			newNatures.add(DistilNature.MAVEN_NATURE_ID);
			System.out.println("Nature " + DistilNature.MAVEN_NATURE_ID + " added");
		}
		if(!newNatures.contains(DistilNature.XTEXT_NATURE_ID)) {
			newNatures.add(DistilNature.XTEXT_NATURE_ID);
			System.out.println("Nature " + DistilNature.XTEXT_NATURE_ID + " added");
		}
			
		description.setNatureIds(newNatures.toArray(new String[0]));
		project.setDescription(description, null);
	}

}