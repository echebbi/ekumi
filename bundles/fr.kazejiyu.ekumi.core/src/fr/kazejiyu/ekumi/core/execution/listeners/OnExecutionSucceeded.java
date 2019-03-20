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
 * A listener that is notified when an {@link Execution} succeeds.
 */
@FunctionalInterface
public interface OnExecutionSucceeded {

	/**
	 * Called when an execution succeeds.
	 * 
	 * @param succeeded
	 * 			The successful execution.
	 * 			Must not be {@code null}.
	 */
	void onExecutionSucceeded(Execution succeeded);
	
}
