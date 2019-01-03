package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Activity;

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
