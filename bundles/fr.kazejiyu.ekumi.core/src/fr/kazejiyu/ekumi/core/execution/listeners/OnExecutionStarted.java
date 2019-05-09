/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * A listener that is notified when an {@link Execution} starts.
 */
@FunctionalInterface
public interface OnExecutionStarted {

	/**
	 * Called when an execution is started.
	 * 
	 * @param execution
	 * 				The execution that has just started.
	 */
	void onExecutionStarted(Execution execution);
	
}
