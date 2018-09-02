package fr.kazejiyu.ekumi.core.execution.events;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Execution;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;

/**
 * Defines an object able to trigger activity-related events.<br>
 * <br>
 * These events are supposed to be handled by instances of {@link ActivityListener}.
 */
public interface EventSource {

	/**
	 * Triggers an event indicating that activity has started its execution.
	 * 
	 * @param activity
	 * 			The activity that begins to run.
	 * 			Must not be {@code null}.
	 */
	void hasStarted(Activity activity);

	/**
	 * Triggers an event indicating that activity has successfully finished its execution.
	 * 
	 * @param activity
	 * 			The activity that succeeded.
	 * 			Must not be {@code null}.
	 */
	void hasSucceeded(Activity activity);

	/**
	 * Triggers an event indicating that activity has failed its execution.
	 * 
	 * @param activity
	 * 			The activity that failed.
	 * 			Must not be {@code null}.
	 */
	void hasFailed(Activity activity);
	
	/**
	 * Triggers an event indicating that execution has started.
	 * 
	 * @param execution
	 * 			The execution that has started.
	 * 			Must not be {@code null}.
	 */
	void hasStarted(Execution execution);
	
	/**
	 * Triggers an event indicating that execution has succeeded.
	 * 
	 * @param execution
	 * 			The execution that ended successfully.
	 * 			Must not be {@code null}.
	 */
	void hasSucceeded(Execution execution);

}
