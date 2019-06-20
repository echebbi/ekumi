/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Optional;
import java.util.function.Consumer;

import fr.kazejiyu.ekumi.core.exceptions.DataNotFoundException;
import fr.kazejiyu.ekumi.core.workflow.impl.DelegatingActivity;

/**
 * An identifiable task.
 */
public interface Activity extends Identifiable, Task, HasState {

	/**
	 * Returns the variables required by the activity.
	 * @return the inputs of the activity
	 */
	Inputs inputs();
	
	/**
	 * Returns a specific input.
	 * 
	 * @param name 
	 * 			The name of the input to look for.
	 * 
	 * @return the input called name
	 * 
	 * @throws DataNotFoundException if no input with the given name can be found
	 */
	default Input input(String name) {
		return inputs().get(name);
	}
	
	/**
	 * Binds an input of this to a given output.
	 * <p>
	 * The consequence is that, when the activity is started,
	 * the specified input is {@link Input#resolve() resolved}
	 * 
	 * @param inputName
	 * @param output
	 */
	default void bind(String inputName, Output output) {
		inputs().get(inputName).bind(output);
	}
	
	/**
	 * Returns the variables produced by the activity.
	 * @return the outputs of the activity
	 */
	Outputs outputs();
	
	/**
	 * Returns a specified output.
	 * 
	 * @param name
	 * 			The name of the output to get.
	 * 
	 * @return the output with the given name, if found
	 * 
	 * @throws DataNotFoundException if no output called {@code name} can be found
	 */
	default Output output(String name) {
		return outputs().get(name);
	}

	/**
	 * Returns the activity that should be executed before this one.
	 * @return the activity that precedes this one, if any
	 */
	Optional<Activity> predecessor();
	
	/**
	 * Returns {@code true} if this is the predecessor of the given activity,
	 * {@code false} otherwise.
	 * 
	 * @param activity
	 * 			The activity to check.
	 * 
	 * @return whether this is the predecessor of the given activity
	 */
	default boolean precedes(Activity activity) {
		return successor().map(predecessor -> predecessor.equals(activity))
  						  .orElse(false);
	}

	/**
	 * Sets the successor of this activity.
	 * <p>
	 * A successor is an activity that should be executed right after this.
	 * <p>
	 * If this has already a successor then:
	 * <ul>
	 * 	<li>successor's predecessor is unset
	 * 	<li>the old successor is replaced with the specified one.
	 * </ul>
	 * <p>
	 * Specified successor's predecessor is set to this.
	 * 
	 * @param successor
	 * 			The activity that should be executed after this.
	 * 			May be {@code null} to indicate no successor.
	 */
	void precede(Activity successor);

	/**
	 * Returns the activity that should be executed after this one.
	 * @return the activity that succeeds to this one, if any
	 */
	Optional<Activity> successor();

	/**
	 * Returns {@code true} if this is the successor of the given activity,
	 * {@code false} otherwise.
	 * 
	 * @param activity
	 * 			The activity to check.
	 * 
	 * @return whether this is the successor of the given activity
	 */
	default boolean succeeds(Activity activity) {
		return predecessor().map(successor -> successor.equals(activity))
 						    .orElse(false);
	}
	
	/**
	 * Sets the predecessor of this activity.
	 * <p>
	 * A predecessor is an activity that should always be executed before this.
	 * <p>
	 * If this has already a predecessor then:
	 * <ul>
	 * 	<li>predecessor's successor is unset
	 * 	<li>the old predecessor is replaced with the specified one.
	 * </ul>
	 * <p>
	 * Specified predecessor's successor is set to this.
	 * 
	 * @param predecessor
	 * 			The activity that should be executed before this.
	 * 			May be {@code null} to indicate no predecessor.
	 */
	void succeed(Activity predecessor);
	
	/**
	 * Creates a new activity from the given runnable.
	 * <p>
	 * When run, the returned activity will execute the runnable.
	 * 
	 * @param behavior
	 * 			The runnable specifying the behavior of the activity.
	 * 
	 * @return a new activity which behavior corresponds to the given runnable.
	 */
	public static Activity of(Runnable behavior) {
		return of(context -> behavior.run());
	}
	
	/**
	 * Creates a new activity from the given consumer.
	 * <p>
	 * When run, the returned activity will execute the consumer.
	 * 
	 * @param behavior
	 * 			The consumer specifying the behavior of the activity.
	 * 
	 * @return a new activity which behavior corresponds to the given consumer.
	 */
	public static Activity of(Consumer<Context> behavior) {
		return new DelegatingActivity(behavior.hashCode() + "", "Delegating to " + behavior.hashCode(), behavior);
	}

}
