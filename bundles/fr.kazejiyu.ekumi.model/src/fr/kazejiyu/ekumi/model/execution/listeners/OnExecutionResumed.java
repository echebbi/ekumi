package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Execution;

/**
 * A listener that is notified when an {@link Execution} is resumed.
 */
@FunctionalInterface
public interface OnExecutionResumed {

	/**
	 * Called when an execution is resumed.
	 * 
	 * @param resumed
	 * 			The execution that is resumed. 
	 * 			Must not be {@code null}.
	 */
	void onExecutionResumed(Execution resumed);
	
}
