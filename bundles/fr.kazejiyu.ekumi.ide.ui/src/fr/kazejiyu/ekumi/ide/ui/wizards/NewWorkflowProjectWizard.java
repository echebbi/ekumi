/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui.wizards;

import static java.util.Arrays.asList;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import fr.kazejiyu.ekumi.core.EKumiExtensions;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.ide.EKumiIdeExtensions;
import fr.kazejiyu.ekumi.ide.common.languages.ExtensionToScriptingLanguageAdapter;
import fr.kazejiyu.ekumi.ide.nature.WorkflowProject;
import fr.kazejiyu.ekumi.ide.project.customization.Customization;
import fr.kazejiyu.ekumi.ide.project.customization.Representation;
import fr.kazejiyu.ekumi.ide.ui.Activator;
import fr.kazejiyu.ekumi.ide.ui.nature.impl.WorkspaceWorkflowProject;

/**
 * A wizard used to create new workflow projects. 
 */
public class NewWorkflowProjectWizard extends Wizard implements INewWizard {
	
	/** Used to choose the name and the location of the project */
	private WizardNewProjectCreationPage newProjectPage;

	/** Used to choose the information of the workflow to create */
	private NewActivityPage newActivityPage;
	
	/** Creates a new wizard */
	public NewWorkflowProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Workflow Project Wizard");
		setDefaultPageImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.ID, "icons/logo.png"));
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// nothing to initialize
	}
	
	@Override
	public void addPages() {
		super.addPages();
		 
	    newProjectPage = new WizardNewProjectCreationPage("EKumi Workflow Project");
	    newProjectPage.setTitle("New Workflow Project");
	    newProjectPage.setDescription("Create a new Workflow project.");
	    
		newActivityPage = new NewActivityPage(availableScriptingLanguages(), availableRepresentations());

	    addPage(newProjectPage);
	    addPage(newActivityPage);
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);

		if (nextPage == newActivityPage) {
			String projectName = newProjectPage.getProjectName();
			newActivityPage.setActivityName(projectName);
		}
		return nextPage;
	}

	@Override
	public boolean canFinish() {
		return ! newProjectPage.getProjectName().isEmpty()
			&& ! newProjectPage.getLocationPath().isEmpty()
			&& ! newActivityPage.getActivityName().isEmpty()
			&& newActivityPage.getSelectedRepresentation().isPresent();
	}

	@Override
	public boolean performFinish() {
	    try {
	    	// Must be retrieved out of the IRunnable to prevent invalid thread accesses
	    	String projectName = newProjectPage.getProjectName();
	    	IPath projectLocation = newProjectPage.getLocationPath();
	    	String activityName = newActivityPage.getActivityName();
	    	Set<ScriptingLanguage> selectedLanguages = newActivityPage.getSelectedLanguages();
	    	Representation selectedRepresentation = newActivityPage.getSelectedRepresentation()
	    														   .orElseThrow(() -> new IllegalStateException("No Representation have been selected"));
	    	
			getContainer().run(true, false, new IRunnableWithProgress() {	
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						Set<Customization> customizations = customizationsFor(selectedRepresentation, selectedLanguages);
						WorkflowProject project = new WorkspaceWorkflowProject(ResourcesPlugin.getWorkspace());
						project.create(projectName, projectLocation, activityName, customizations, monitor);
					} 
					catch (Exception e) {
			            throw new InvocationTargetException(e, "An error occurred while creating the new EKumi workflow project " + projectName);
					}
				}
			});
			return true;
		} 
	    catch (InvocationTargetException | InterruptedException e) {
	    	if (e instanceof InterruptedException) {
	    		Thread.currentThread().interrupt();
	    	}
	    	Activator.error(e, "An error occurred while creating the new EKumi project");
	    	showErrorDialog(e, "Project creation failed", e.getMessage());
		}
	    return false;
	}
	
	private static Set<Customization> customizationsFor(Representation selectedRepresentation, Set<ScriptingLanguage> selectedLanguages) throws CoreException {
		Set<Customization> customizations = new HashSet<>();
		
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiIdeExtensions.PROJECT_CUSTOMIZATION_EXTENSION_ID);
		
		for (IConfigurationElement element : elements) {
			// Scripting Language-specific customizations
			if (element.getName().equals("language-specific")) {
				String id = element.getAttribute("language");
				boolean correspondingLanguageIsSelected = selectedLanguages.stream().anyMatch(language -> language.id().equals(id));
						
				if (correspondingLanguageIsSelected) {
					customizations.add((Customization) element.createExecutableExtension("class"));
				}
			}
			// representation-specific customizations
			else if (element.getName().equals("representation")) {
				String id = element.getAttribute("id");

				if (id.equals(selectedRepresentation.id())) {
					customizations.add((Customization) element.createExecutableExtension("class"));
				}
			}
		}
		return customizations;
	}

	private static Set<ScriptingLanguage> availableScriptingLanguages() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiExtensions.LANGUAGES_EXTENSION_ID);
		List<ScriptingLanguage> languages = new ExtensionToScriptingLanguageAdapter().adapt(asList(elements));
		return new HashSet<>(languages);
	}
	
	private static Set<Representation> availableRepresentations() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(EKumiIdeExtensions.PROJECT_CUSTOMIZATION_EXTENSION_ID);
		
		Set<Representation> representations = new HashSet<>();
		for (IConfigurationElement element : elements) {
			try {
				if (element.getName().equals("representation")) {
					representations.add((Representation) element.createExecutableExtension("class"));
				}
			} 
			catch (CoreException e) {
				Activator.warn(e, "Unable to create a new Representation from " + element);
			}
		}
		return representations;
	}
	
	/**
	 * Shows an error dialog displaying an exception's stack trace.
	 * 
	 * @param e
	 * 			The exception to show.
	 * @param title
	 * 			The title of the dialog.
	 * @param message
	 * 			The message of the dialog.
	 */
	private void showErrorDialog(Exception e, String title, String message) {
		// Compute a String containing the whole stack trace
		StringWriter sw = new StringWriter();
	    PrintWriter pw = new PrintWriter(sw);
	    e.printStackTrace(pw);

	    String trace = sw.toString();

	    List<Status> childStatuses = new ArrayList<>();

	    for (String line : trace.split(System.getProperty("line.separator"))) {
	        childStatuses.add(new Status(IStatus.ERROR, "fr.kazejiyu.ekumi.ide.ui", line));
	    }

	    // Create a status owning the String stack trace
        MultiStatus status = new MultiStatus(
        		"fr.kazejiyu.ekumi.ide.ui", IStatus.ERROR, 
                childStatuses.toArray(new Status[] {}),
                e.toString(), e
        );
        ErrorDialog.openError(getShell(), title, message, status);
    }

}
