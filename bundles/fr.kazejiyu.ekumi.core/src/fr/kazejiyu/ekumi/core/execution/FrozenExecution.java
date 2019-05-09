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

import java.sql.Date;

import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.Identifiable;
import fr.kazejiyu.ekumi.core.workflow.State;

/**
 * The state of an {@link Execution}, frozen at one point in time. 
 */
public interface FrozenExecution extends Identifiable {
	
	/**
	 * Returns the state of the execution.
	 * @return the state of the execution
	 */
	State state();

	/**
	 * Returns the date at which the execution started.
	 * @return the date at which the execution started
	 */
	Date startDate();

}
