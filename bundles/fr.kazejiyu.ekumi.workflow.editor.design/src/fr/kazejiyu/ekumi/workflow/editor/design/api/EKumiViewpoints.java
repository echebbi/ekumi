/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.workflow.editor.design.api;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.sirius.viewpoint.description.Viewpoint;

import fr.kazejiyu.ekumi.workflow.editor.design.Activator;

/**
 * <p>Provides access to EKumi Sirius viewpoints.</p>
 * 
 * <p>Currently, the following viewpoints are available:
 * 	<ul>
 * 		<li>{@value #WORKFLOW_NAME} -> provides representations of a workflow
 * 	</ul>
 * </p>
 */
public enum EKumiViewpoints {
	
	INSTANCE;
	
	/** The name of the 'EKumi Workflow' viewpoint. */
	public static final String WORKFLOW_NAME = "EKumi Workflow";
	
	/**
	 * Returns all the Sirius viewpoints related to EKumi.
	 * @return all the Sirius viewpoints related to EKumi
	 */
	public static Set<Viewpoint> all() {
		return new HashSet<>(Activator.getViewpoints());
	}
	
	/**
	 * <p>Returns the 'EKumi Workflow viewpoint</p>
	 * 
	 * <p>This viewpoint provides representations of a workflow.</p>
	 * 
	 * <p>Should never return an empty Optional.</p>
	 *  
	 * @return the viewpoint, if found
	 */
	public static Optional<Viewpoint> workflow() {
		return all().stream()
					.filter(viewpoint -> WORKFLOW_NAME.equals(viewpoint.getName()))
					.findAny();
	}

}
