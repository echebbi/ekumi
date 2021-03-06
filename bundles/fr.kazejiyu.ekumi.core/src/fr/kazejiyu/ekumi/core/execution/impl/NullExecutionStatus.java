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

import fr.kazejiyu.ekumi.core.execution.ExecutionState;

/**
 * An implementation of {@link ExecutionState} with no behavior. 
 */
public class NullExecutionStatus implements ExecutionState {
	
	private boolean isCancelled = false;

	@Override
	public boolean isCancelled() {
		return isCancelled;
	}
	
	@Override
	public void cancel() {
		isCancelled = true;
	}

}
