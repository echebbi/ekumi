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

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.execution.listeners.ExecutionListener;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityFailed;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivitySucceeded;
import fr.kazejiyu.ekumi.core.execution.listeners.OnExecutionStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnExecutionSucceeded;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * A simple event bus.
 */
public class BasicEvents implements Events {
	
	/** Objects listening for an activity to start */
	private final List<OnActivityStarted> activityStartedListeners = new ArrayList<>();
	
	/** Objects listening for an activity to fail */
	private final List<OnActivityFailed> activityFailedListeners = new ArrayList<>();
	
	/** Objects listening for an activity to succeed */
	private final List<OnActivitySucceeded> activitySucceededListeners = new ArrayList<>();
	
	/** Objects listening for an activity to change */
	private final List<ActivityListener> activityListeners = new ArrayList<>();
	
	/** Objects listening for an execution to start */
	private final List<OnExecutionStarted> executionStartedListeners = new ArrayList<>();
	
	/** Objects listening for an execution to succeed */
	private final List<OnExecutionSucceeded> executionSucceededListeners = new ArrayList<>();
	
	/** Objects listening for an execution to change */
	private final List<ExecutionListener> executionListeners = new ArrayList<>();
	
	private static <T, U extends T> List<T> concat(Collection<T> list1, Collection<U> list2) {
		return Stream.concat(list1.stream(), list2.stream())
					 .collect(toList());
	}
	
	@Override
	public void hasStarted(Activity started) {
		for (OnActivityStarted listener : concat(activityStartedListeners, activityListeners))
			listener.onActivityStarted(started);
	}

	@Override
	public void hasSucceeded(Activity succeeded) {
		for (OnActivitySucceeded listener : concat(activitySucceededListeners, activityListeners))
			listener.onActivitySucceeded(succeeded);
	}

	@Override
	public void hasFailed(Activity failed) {
		for (OnActivityFailed listener : concat(activityFailedListeners, activityListeners))
			listener.onActivityFailed(failed);
	}

	@Override
	public void onActivityStarted(OnActivityStarted listener) {
		activityStartedListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

	@Override
	public void onActivityFailed(OnActivityFailed listener) {
		activityFailedListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

	@Override
	public void onActivitySucceeded(OnActivitySucceeded listener) {
		activitySucceededListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

	@Override
	public void onActivityEvent(ActivityListener listener) {
		activityListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}
	
	@Override
	public void hasStarted(Execution execution) {
		for (OnExecutionStarted listener : concat(executionStartedListeners, executionListeners))
			listener.onExecutionStarted(execution);
	}
	
	@Override
	public void hasSucceeded(Execution execution) {
		for (OnExecutionSucceeded listener : concat(executionSucceededListeners, executionListeners))
			listener.onExecutionSucceeded(execution);
	}

	@Override
	public void onExecutionStarted(OnExecutionStarted listener) {
		executionStartedListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

	@Override
	public void onExecutionSucceeded(OnExecutionSucceeded listener) {
		executionSucceededListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

	@Override
	public void onExecutionEvent(ExecutionListener listener) {
		executionListeners.add(requireNonNull(listener, "Cannot register a null listener"));
	}

}
