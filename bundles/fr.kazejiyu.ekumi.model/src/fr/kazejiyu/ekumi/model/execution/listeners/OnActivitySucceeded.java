package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * A listener that is notified when an {@link Activity} succeeds. 
 */
@FunctionalInterface
public interface OnActivitySucceeded {
	
	/**
	 * Called when an activity succeeds.
	 * 
	 * @param succeeded
	 * 			The activity that succeeded. Must not be {@code null}.
	 */
	void onActivitySucceeded(Activity succeeded);

}
