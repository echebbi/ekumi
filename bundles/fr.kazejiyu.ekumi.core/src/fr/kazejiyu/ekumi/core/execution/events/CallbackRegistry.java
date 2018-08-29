package fr.kazejiyu.ekumi.core.execution.events;

import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityFailed;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivityStarted;
import fr.kazejiyu.ekumi.core.execution.listeners.OnActivitySucceeded;

/**
 * Defines a registry able to manage callbacks for specific events.<br>
 * <br>
 * The callbacks are supposed to be instances of {@link ActivityListener} and
 * siblings.<br>
 * <br>
 * The events are supposed to be triggered by an {@link EventSource}.
 */
public interface CallbackRegistry {
	
	/**
	 * Adds a new listener to call when an activity starts.
	 * 
	 * @param listener
	 * 			The listener to call. Must not be {@code null}.
	 */
	void onActivityStarted(OnActivityStarted listener);
	
	/**
	 * Adds a new listener to call when an activity fails.
	 * 
	 * @param listener
	 * 			The listener to call. Must not be {@code null}.
	 */
	void onActivityFailed(OnActivityFailed listener);

	/**
	 * Adds a new listener to call when an activity succeeds.
	 * 
	 * @param listener
	 * 			The listener to call. Must not be {@code null}.
	 */
	void onActivitySucceeded(OnActivitySucceeded listener);

}
