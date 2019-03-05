/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.execution.impl;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;

/**
 * An implementation of {@link ExecutionStatus} with no behavior. 
 */
public class NullExecutionStatus implements ExecutionStatus {

	@Override
	public boolean isCancelled() {
		return false;
	}

}
