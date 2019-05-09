/**
 */
package fr.kazejiyu.ekumi.core.execution;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

import fr.kazejiyu.ekumi.core.workflow.Execution;

/**
 * An ordered set of {@link Execution} instances.
 * <p>
 * An history is supposed to keep track of a set of executions
 * that have been launched.
 */
public interface History extends Iterable<FrozenExecution> {
	
	/**
	 * Returns the number of executions in this
	 * @return the number of executions in this
	 */
	default int size() {
		return executions().size();
	}
	
	/**
	 * Returns all the executions that compose this history.
	 * <p>
	 * The executions are ordered by {@link Execution#startDate() start date}
	 * (the older first).
	 * 
	 * @return all the executions that compose this history
	 */
	default ImmutableList<FrozenExecution> executions() {
		// relies on this.iterable()
		return Lists.immutable.ofAll(this);
	}
	
}
