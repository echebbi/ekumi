package fr.kazejiyu.ekumi.core.execution.listeners;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

@FunctionalInterface
public interface OnExecutionResumed {

	void onExecutionResumed(Execution execution);
	
}
