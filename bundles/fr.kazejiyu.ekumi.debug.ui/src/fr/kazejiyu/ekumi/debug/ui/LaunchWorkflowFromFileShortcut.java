/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.debug.ui;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
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

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.debug.EKumiRunConfiguration;

/**
 * <p>Creates a new Launch Configuration for a given EKumi model then runs it.</p>
 * 
 * <p>This class is intended to be sub-classed by clients. It provides an easy way
 * to add a _Run As_ shortcut on files serializing an EMF model that can be adapted
 * to an EKumi {@link Activity}.</p>
 */
public abstract class LaunchWorkflowFromFileShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		URI fileURI = selectedFileURI(selection);
		
		if (fileURI == null) {
			return;
		}
		try {
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType type = manager.getLaunchConfigurationType(EKumiRunConfiguration.ID);
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);
			
			// Create a new launch configuration
			String baseConfigurationName = configurationNameFor(fileURI);
			String launchConfigurationName = availableLaunchConfigurationName(baseConfigurationName, configurations);
			
			ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null, launchConfigurationName);
			workingCopy.setAttribute(EKumiRunConfiguration.EKUMI_MODEL_URI, fileURI.toString());
			ILaunchConfiguration configuration = workingCopy.doSave();
			
			// Run the new launch configuration
			configuration.launch(ILaunchManager.RUN_MODE, null);
			
		} catch(Exception e) {
			Activator.error(e, "An error occurred while launching the workflow " + fileURI);
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		// should not be called
	}
	
	/**
	 * <p>Returns the name of the new launch configuration that will be created
	 * for the given fileURI.</p>
	 * 
	 * <p>Any exception thrown by this method will be properly handled.</p>
	 * 
	 * @param fileURI
	 * 			The URI of the resource holding the model that is about to be executed.
	 * 
	 * @return the name of the new launch configuration
	 * 
	 * @throws Exception if an error occurs
	 */
	// Ignore the "Define and throw a dedicated exception instead of using a generic one." rule
	// as "throw Exception" is used here on purpose to let client's code fail safely.
	@SuppressWarnings("squid:S00112")
	protected abstract String configurationNameFor(URI fileURI) throws Exception;

	/**
	 * Computes a launch configuration name that is not used by any existing configuration.
	 * 
	 * @param baseConfigurationName
	 *			The name that serves as a base to compute the name of the new launch configuration.
	 * @param configurations
	 * 			The existing launch configurations to ensure that the computed name is unique.
	 * 
	 * @return a unique name based on given base name and that is not used by any existing launch configuration
	 */
	private static String availableLaunchConfigurationName(String baseConfigurationName, ILaunchConfiguration[] configurations) {
		String launchConfigurationName = baseConfigurationName;
		int index = 0;
		
		while (configurationExists(configurations, launchConfigurationName)) {
			++index;
			launchConfigurationName = baseConfigurationName + " (" + index + ")";
		}
		return launchConfigurationName;
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
		if (selection.isEmpty()) {
			return null;
		}
		if (! (selection instanceof TreeSelection)) {
			return null;
		}
		IStructuredSelection tselection = (IStructuredSelection) selection;
		Object selectedElement = tselection.getFirstElement();
		
		if (! (selectedElement instanceof PlatformObject)) {
			return null;
		}
		PlatformObject object = (PlatformObject) selectedElement;
		IPath path = object.getAdapter(IFile.class).getFullPath();
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		
		return URI.createPlatformResourceURI(file.getFullPath().toString(), true);
	}
	
	/**
	 * Loads an object from the given URI.
	 * 
	 * @param uri
	 * 			The URI corresponding to the Resource to load.
	 * 
	 * @param <T>
	 * 			The exact type of the object to load.
	 * 
	 * @return the loaded Activity or {@code null} if the Resource does not contain any
	 * 
	 * @throws IOException if an I/O error occurs while loading the Resource
	 * @throws ClassCastException if the loaded object cannot be casted to T
	 */
	@SuppressWarnings("unchecked")
	protected static <T> T load(URI uri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.load(Collections.emptyMap());
		
		if (resource.getContents().isEmpty())
			return null;
		
		return (T) resource.getContents().get(0);
	}

}
