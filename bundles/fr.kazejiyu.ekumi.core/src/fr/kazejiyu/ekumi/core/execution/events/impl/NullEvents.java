/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.events.impl;

import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionListener;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityFailed;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivitySucceeded;
import fr.kazejiyu.ekumi.core.execution.listeners.OnExecutionFailed;
import fr.kazejiyu.ekumi.core.execution.listeners.OnExecutionStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnExecutionSucceeded;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * An implementation of {@link Events} with no behavior. 
 */
public class NullEvents implements Events {

	@Override
	public void hasStarted(Activity activity) {
		// does nothing
	}

	@Override
	public void hasSucceeded(Activity activity) {
		// does nothing
	}

	@Override
	public void hasFailed(Activity activity) {
		// does nothing
	}

	@Override
	public void hasStarted(Execution execution) {
		// does nothing
	}

	@Override
	public void hasSucceeded(Execution execution) {
		// does nothing
	}

	@Override
	public void hasFailed(Execution execution) {
		// does nothing
	}

	@Override
	public void onActivityStarted(OnActivityStarted listener) {
		// does nothing
	}

	@Override
	public void onActivityFailed(OnActivityFailed listener) {
		// does nothing
	}

	@Override
	public void onActivitySucceeded(OnActivitySucceeded listener) {
		// does nothing
	}

	@Override
	public void onActivityEvent(ActivityListener listener) {
		// does nothing
	}

	@Override
	public void onExecutionStarted(OnExecutionStarted listener) {
		// does nothing
	}

	@Override
	public void onExecutionSucceeded(OnExecutionSucceeded listener) {
		// does nothing
	}
	
	@Override
	public void onExecutionFailed(OnExecutionFailed listener) {
		// does nothing
	}

	@Override
	public void onExecutionEvent(ExecutionListener listener) {
		// does nothing
	}

}
