package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * 
 * @author Kaze
 *
 */
@FunctionalInterface
public interface OnExecutionStarted {

	void onExecutionStarted(Execution execution);
	
}
