package fr.kazejiyu.ekumi.core.execution.events;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

/**
 * Event bus used to listen for activity-related events at runtime. 
 */
public interface Events {

	/**
	 * Called when an activity starts its execution.
	 * 
	 * @param activity
	 * 			The activity that begins to run.
	 * 			Must not be {@code null}.
	 */
	void hasStarted(Activity activity);

	/**
	 * Called when an activity succeeds its execution.
	 * 
	 * @param activity
	 * 			The activity that succeeded.
	 * 			Must not be {@code null}.
	 */
	void hasSucceeded(Activity activity);

	/**
	 * Called when an activity fails while running.
	 * 
	 * @param activity
	 * 			The activity that failed.
	 * 			Must not be {@code null}.
	 */
	void hasFailed(Activity activity);

}
