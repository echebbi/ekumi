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
 * 
 * @author Kaze
 *
 */
@FunctionalInterface
public interface OnExecutionStarted {

	void onExecutionStarted(Execution execution);
	
}
