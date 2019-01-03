package fr.kazejiyu.ekumi.launchconfiguration.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;

import fr.kazejiyu.ekumi.debug.EKumiRunConfiguration;
import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * <p>Creates a new Launch Configuration for a given EKumi model.</p>
 * 
 * <p>The {@link #launch(ISelection, String)} method is supposed to be called
 * from Eclipse IDE's contextual menu on an *.ekumi model file. It then creates
 * a corresponding Launch Configuration and runs it.</p>
 */
public class LaunchWorkflowShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		URI fileURI = selectedFileURI(selection);
		
		if (fileURI == null)
			return;
		
		try {
			Activity activity = loadActivity(fileURI);
			
			if (activity == null)
				return;
			
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType type = manager.getLaunchConfigurationType(EKumiRunConfiguration.ID);
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);
			
			// Create a new launch configuration
			String launchConfigurationName = activity.getName();
			int index = 1;
			
			while (configurationExists(configurations, launchConfigurationName)) {
				++index;
				launchConfigurationName = activity.getName() + " (" + index + ")";
			}
			
			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, launchConfigurationName);
			workingCopy.setAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, activity.eResource().getURI().toString());
			ILaunchConfiguration configuration = workingCopy.doSave();
			
			// Run the new launch configuration
			configuration.launch(ILaunchManager.RUN_MODE, null);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		// should not be called
	}
	
	/**
	 * Returns whether a launch configuration with the given name already exists.
	 * 
	 * @param configurations
	 * 			The launch configurations to check.
	 * @param name
	 * 			The name to validate.
	 * 
	 * @return whether a launch configuration with the given name already exists
	 */
	private static boolean configurationExists(ILaunchConfiguration[] configurations, String name) {
		for (ILaunchConfiguration launchConfiguration : configurations) {
			if (launchConfiguration.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns the URI of the selected file.
	 * 
	 * @param selection
	 * 			The current selection
	 * 
	 * @return the URI of the selected file, or null if no URI can be found from the selection 
	 */
	private static URI selectedFileURI(ISelection selection) {
		if (selection.isEmpty())
			return null;
		
		if (! (selection instanceof TreeSelection))
			return null;
		
		IStructuredSelection tselection = (IStructuredSelection) selection;
		Object selectedElement = tselection.getFirstElement();
		
		if (! (selectedElement instanceof PlatformObject))
			return null;
		
		PlatformObject object = (PlatformObject) selectedElement;
		IPath path = object.getAdapter(IFile.class).getFullPath();
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}
	
	/**
	 * Loads an Activity from the given URI.
	 * 
	 * @param uri
	 * 			The URI corresponding to the Resource to load.
	 * 
	 * @return the loaded Activity or {@code null} if the Resource does not contain any
	 * 
	 * @throws IOException if an I/O error occurs while loading the Resource
	 */
	private static Activity loadActivity(URI uri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.load(Collections.emptyMap());
		
		if (resource.getContents().isEmpty())
			return null;
		
		return (Activity) resource.getContents().get(0);
	}

}
