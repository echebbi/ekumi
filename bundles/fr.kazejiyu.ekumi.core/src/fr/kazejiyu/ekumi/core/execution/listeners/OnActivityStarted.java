package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

/**
 * A listener that is notified when an {@link Activity} starts. 
 */
@FunctionalInterface
public interface OnActivityStarted {
	
	/**
	 * Called when an activity starts.
	 * 
	 * @param started
	 * 			The activity that started. Must not be {@code null}.
	 */
	void onActivityStarted(Activity started);

}
