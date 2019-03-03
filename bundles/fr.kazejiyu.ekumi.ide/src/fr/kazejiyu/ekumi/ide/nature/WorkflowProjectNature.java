/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.nature;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

/**
 * The nature of a project that hosts EKumi workflows.
 */
public class WorkflowProjectNature implements IProjectNature {
	
	/** The ID of the nature as defined in the plugin.xml file */
	public static final String ID = "fr.kazejiyu.ekumi.ide.workflow-nature";
	
	private IProject project;

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}

	@Override
	public void configure() throws CoreException {
		// nothing to configure
	}

	@Override
	public void deconfigure() throws CoreException {
		// nothing to deconfigure
	}

}
