package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

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
