/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.ui.nature.impl;

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.SubMonitor;

import fr.kazejiyu.ekumi.ide.nature.WorkflowProject;
import fr.kazejiyu.ekumi.ide.nature.WorkflowProjectNature;
import fr.kazejiyu.ekumi.ide.project.customization.Customization;

/**
 * A workflow project that is located in the workspace.
 */
public class WorkspaceWorkflowProject implements WorkflowProject {
	
	/** The workspace containing the project */
	private final IWorkspace workspace;
	
	/**
	 * Creates a new instance.
	 * 
	 * @param workspace
	 * 			The workspace containing the project.
	 */
	public WorkspaceWorkflowProject(IWorkspace workspace) {
		this.workspace = workspace;
	}

	@Override
	public IProject create(String name, IPath path, String activityName, Set<Customization> customizations, IProgressMonitor monitor) throws CoreException {
		IWorkspaceRunnable createProject = projectMonitor -> {
			SubMonitor subMonitor = SubMonitor.convert(monitor, 1 + customizations.size());
			
			IProject project = createProject(name, subMonitor.split(1));
                
            for (Customization customization : customizations) {
				customization.customize(activityName, workspace, project, subMonitor.split(1));
			}
		};
		workspace.run(createProject, monitor);
		return workspace.getRoot().getProject(name);
	}

	/**
	 * Creates a project with the EKumi and Modeling natures.
	 * 
	 * @param name
	 * 			The name of the project to create.
	 * @param monitor
	 * 			The monitor used to show progression of the creation.
	 * @return the new project
	 * 
	 * @throws CoreException if an error occurs while creating the project
	 */
	private IProject createProject(String name, IProgressMonitor monitor) throws CoreException {
		SubMonitor subMonitor = SubMonitor.convert(monitor);
		subMonitor.setTaskName("Creating the project");
		
		// First create the project in the workspace
		IProject project = workspace.getRoot().getProject(name);
		project.create(null);
		project.open(null);
		
		// Prepare the Workflow project nature 
		String[] natures = new String[] { WorkflowProjectNature.ID };
		IStatus status = workspace.validateNatureSet(natures);

		// Only actually apply new natures if the workspace allows it
		if (status.getCode() == IStatus.OK) {
			IProjectDescription description = project.getDescription();
			description.setNatureIds(natures);
		    project.setDescription(description, null);
		}
		return project;
	}

}
