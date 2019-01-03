package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Activity;

/**
 * A listener that is notified when an {@link Activity} fails. 
 */
@FunctionalInterface
public interface OnActivityFailed {
	
	/**
	 * Called when an activity fails.
	 * 
	 * @param failed
	 * 			The activity that failed. Must not be {@code null}.
	 */
	void onActivityFailed(Activity failed);

}
