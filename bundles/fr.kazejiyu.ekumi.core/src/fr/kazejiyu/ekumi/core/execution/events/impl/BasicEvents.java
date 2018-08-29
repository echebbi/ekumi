package fr.kazejiyu.ekumi.core.execution.events.impl;

import static java.util.Objects.requireNonNull;

import java.util.ArrayList;
import java.util.List;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityFailed;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivitySucceeded;

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

	@Override
	public void hasStarted(Activity started) {
		for (OnActivityStarted listener : activityStartedListeners) {
			listener.onActivityStarted(started);
		}
	}

	@Override
	public void hasSucceeded(Activity succeeded) {
		for (OnActivitySucceeded listener : activitySucceededListeners) {
			listener.onActivitySucceeded(succeeded);
		}
	}

	@Override
	public void hasFailed(Activity failed) {
		for (OnActivityFailed listener : activityFailedListeners) {
			listener.onActivityFailed(failed);
		}
		
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

}
