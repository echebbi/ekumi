package fr.kazejiyu.ekumi.core.execution.listeners;

import java.util.Optional;

/**
 * Provides access to available execution hooks. 
 */
@FunctionalInterface
public interface ExecutionHookFactory {

	/**
	 * Returns the hook identified by the given id.
	 * 
	 * @param id
	 * 			The identifier of the hook to find.
	 * 
	 * @return the corresponding hook, if found
	 */
	Optional<ExecutionHook> find(String id);
	
}
