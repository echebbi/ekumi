/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.State.RUNNING;
import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.func.Try;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Outputs;

/**
 * An abstract class that makes easier to focus on behavior when implementing new activities.
 * <p>
 * Concretely, it:
 * <ul>
 * 	<li>hides the changes made to the state of the activity which goes from running
 * to succeeded (or failed in case of Exceptions),
 * 	<li>allows sub-classes to provides run's outputs by overriding the {@link #doOutputs()}
 *		method instead of having to return them all in the run method, which can be inconvenient,
 *	<li>broadcasts {@link Context#events() events} when the activity {@link Events#hasStarted(Activity) starts}, 
 *		{@link Events#hasSucceeded(Activity) succeeds} or {@link Events#hasFailed(Activity) fails}.
 * </ul>
 * <p>
 * This class uses the <strong>Template Method Pattern</strong> to define an execution algorithm.
 * When executed, it:
 * <ol>
 * 	<li>Checks whether the execution {@link ExecutionState#isCancelled() is cancelled}
 * 		<ul>
 * 			<li>if it is, it calls {@link #cancel()} then return a success containing {@link #doOutputs()}
 * 		</ul>
 *  <li>Sets its state to running
 *  <li>Calls {@link #doRun(Context)} to actually run
 *  <li>Checks whether its state is still running
 *  	<ul>
 *  		<li>if it is, sets its state to succeeded
 *  		<li>if it isn't, assumes that the state has been changed by the sub-class
 *  			and does not change it
 *  	</ul>
 *  <li>Returns a success containing {@link #doOutputs()}
 * </ol>
 */
public abstract class AbstractActivityWithStateManagement extends AbstractActivity {
	
	/**
	 * Initializes this activity.
	 * 
	 * @param id
	 * 			The string uniquely identifying this activity.
	 * @param name
	 * 			A human-readable name of the activity.
	 */
	public AbstractActivityWithStateManagement(String id, String name) {
		super(id, name);
	}

	/**
	 * Executes this.
	 * <p>
	 * Sub-classes must override this method in order to specify
	 * the behavior of this activity during the execution.
	 * <p>
	 * This method is not intended to be called directly by clients;
	 * the {@link #run(Context)} method should be called instead.
	 * 
	 * @param context
	 * 			The execution context.
	 * 
	 * @throws Exception if anything goes wrong
	 */
	@SuppressWarnings("squid:S00112") // we want to support all possible exceptions
	protected abstract void doRun(Context context) throws Exception;

	@Override
	public final Try<Outputs> run(Context context) {
		try {
			if (context.execution().isCancelled()) {
				cancel();
				return Try.success(outputs());
			}
			state = RUNNING;
			context.events().hasStarted(this);
			doRun(context);
			
			// Prevent erasing state changes performed by the sub-class
			if (state == RUNNING) {
				state = SUCCEEDED;
				context.events().hasSucceeded(this);
			}
		}
		catch (Exception e) {
			state = FAILED;
			context.events().hasFailed(this);
			return Try.failure(e);
		}
		return Try.success(outputs());
	}
	
	protected Outputs run(Activity activity, Context context) {
		activity.inputs().resolve();
		Try<Outputs> outputs = activity.run(context);
		return outputs.get();
	}

}
