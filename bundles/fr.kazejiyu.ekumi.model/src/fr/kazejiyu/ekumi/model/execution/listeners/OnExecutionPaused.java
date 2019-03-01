/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Execution;

/**
 * A listener that is notified when an {@link Execution} is paused.
 */
@FunctionalInterface
public interface OnExecutionPaused {
	
	/**
	 * Called when an execution is paused.
	 * 
	 * @param paused
	 * 			The execution which activity is suspended.
	 * 			Must not be {@code null}.
	 */
	void onExecutionPaused(Execution paused);

}
