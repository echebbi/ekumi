/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.UnsafeContext;

/**
 * The status of an {@link Execution}.<br>
 * <br>
 * Instances of this class are aimed to be given to an {@link UnsafeContext}
 * in order to be injected into running activities.
 */
public interface ExecutionStatus {

	/**
	 * Returns whether the execution has been cancelled
	 * @return whether the execution has been cancelled
	 */
	boolean isCancelled();
	
}
