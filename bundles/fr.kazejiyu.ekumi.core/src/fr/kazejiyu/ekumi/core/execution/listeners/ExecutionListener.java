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
 * An object that listens for the status of an {@link Execution} to change.
 */
public interface ExecutionListener extends OnExecutionStarted, 
										   OnExecutionSucceeded,
										   OnExecutionFailed,
										   OnExecutionPaused,
										   OnExecutionResumed,
										   OnExecutionCancelled {

	@Override
	default void onExecutionCancelled(Execution terminated) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionResumed(Execution execution) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionPaused(Execution paused) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionSucceeded(Execution succeeded) {
		// in case the implementing class is not interested in this event
	}
	
	@Override
	default void onExecutionFailed(Execution failed) {
		// in case the implementing class is not interested in this event
	}

	@Override
	default void onExecutionStarted(Execution execution) {
		// in case the implementing class is not interested in this event
	}

}
