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

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.ide.nature.WorkflowProject;
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
	    
	    newActivityPage = new NewActivityPage();
	 
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
			&& ! newActivityPage.getActivityName().isEmpty();
	}

	@Override
	public boolean performFinish() {
	    try {
	    	// Must be retrieved out of the IRunnable to prevent invalid thread accesses
	    	String projectName = newProjectPage.getProjectName();
	    	IPath projectLocation = newProjectPage.getLocationPath();
	    	String activityName = newActivityPage.getActivityName();
	    	
			getContainer().run(true, false, new IRunnableWithProgress() {	
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						WorkflowProject project = new WorkspaceWorkflowProject(ResourcesPlugin.getWorkspace(), ModelingProjectManager.INSTANCE);
						project.create(projectName, projectLocation, activityName, monitor);
						
					} catch (Exception e) {
			            throw new InvocationTargetException(e, "An error occurred while creating the new EKumi workflow project " + projectName);
					}
				}
			});
			return true;
		} 
	    catch (InvocationTargetException | InterruptedException e) {
	    	if (e instanceof InterruptedException)
	    		Thread.currentThread().interrupt();

	    	EKumiPlugin.error(e, "An error occurred while creating the new EKumi project");
	    	showErrorDialog(e, "Project creation failed", e.getMessage());
		}
	    return false;
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
