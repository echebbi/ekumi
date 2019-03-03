/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.project.customization;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Customizes a given project by adding specific natures or new resources. 
 */
public interface Customization {
	
	/**
	 * Customizes the given project.
	 * @param workspace
	 * 			The workspace that contains the project.
	 * @param project
	 * 			The project to customize.
	 * @param monitor
	 * 			The monitor used to follow the progress of the operation.
	 * 
	 * @throws CoreException if an error occurs during the customization.
	 */
	void customize(IWorkspace workspace, IProject project, IProgressMonitor monitor) throws CoreException;

}
