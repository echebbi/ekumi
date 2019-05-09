/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.factory.Lists;

/**
 * An ordered set of activities.
 * <p>
 * When executed, executes all its activities in order. The behavior
 * in case of error or cancellation is up to the concrete implementation. 
 */
public interface Sequence extends Activity, Iterable<Activity> {
	
	/**
	 * Returns whether the sequence does not contain any activity.
	 * @return true if the sequence does not contain any activity
	 */
	default boolean isEmpty() {
		return activities().isEmpty();
	}
	
	/**
	 * Returns the number of activities that made the sequence
	 * @return the number of activities that make the sequence
	 */
	default int size() {
		return activities().size();
	}
	
	/**
	 * Returns all the activities that compose this sequence.
	 * @return all the activities that compose this sequence
	 */
	default ImmutableList<Activity> activities() {
		// relies on this.iterable()
		return Lists.immutable.ofAll(this);
	}

}
