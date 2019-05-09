/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.impl;

import static java.util.Objects.requireNonNull;

import org.eclipse.core.runtime.IProgressMonitor;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * An {@link ExecutionState} relying on {@link IProgressMonitor}
 * in order to work with {@link JobsExecution}. 
 */
public class BasicExecutionStatus implements ExecutionState {
	
	/** The execution which status is represented by the current instance */
	private final Execution execution;
	
	/** Monitors the job launched in background by this.execution */
	private final IProgressMonitor monitor;
	
	/**
	 * Creates a new status for the given execution.
	 * 
	 * @param execution
	 * 			The execution which status is represented by this instance.
	 * @param monitor
	 * 			The instance monitoring the job launched in background by execution.
	 */
	public BasicExecutionStatus(Execution execution, IProgressMonitor monitor) {
		this.execution = requireNonNull(execution, "Cannot be the status of a null execution");
		this.monitor = requireNonNull(monitor, "Cannot rely on a null monitor");
	}

	@Override
	public boolean isCancelled() {
		return monitor.isCanceled() || execution.isCancelled();
	}

}
