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

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import fr.kazejiyu.ekumi.ide.project.customization.Customization;

/**
 * <p>An Eclipse IDE project that owns an {@link WorkflowProjectNature}.</p>
 * 
 * <p>Such a project usually contains a specification model serialized under
 * the <i>model/</i> directory as well as a <i>.aird</i> file containing
 * a diagram representation of the model.
 */
public interface WorkflowProject {
	
	/**
	 * Creates the project.
	 * 
	 * @param name
	 * 			The name of the new project.
	 * @param path
	 * 			The path of the new project.
	 * @param activityName
	 * 			The name of the new activity.
	 * @param customizations
	 * 			The objects allow to customize the project after its creation.
	 * @param monitor
	 * 			The monitor used to follow the execution. Can be null.
	 * @return the new project.
	 * 
	 * @throws CoreException 
	 */
	IProject create(String name, IPath path, String activityName, Set<Customization> customizations, IProgressMonitor monitor) throws CoreException;

}
