package fr.kazejiyu.ekumi.model.execution.listeners;

import fr.kazejiyu.ekumi.model.workflow.Execution;

/**
 * 
 * @author Kaze
 *
 */
@FunctionalInterface
public interface OnExecutionStarted {

	void onExecutionStarted(Execution execution);
	
}
