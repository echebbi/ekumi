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

import static java.util.Objects.requireNonNull;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.Outputs;
import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;

/**
 * A simple implementation of {@link StructuredLoop}.
 * <p>
 * Stops running if the execution {@link ExecutionState#isCancelled() is cancelled}.
 */
public final class BasicStructuredLoop extends AbstractActivityWithStateManagement implements StructuredLoop {
	/**
	 * The activity to execute in a loop.
	 */
	private final Activity activity;
	/**
	 * Used before the execution of the activity to test whether the loop should end.
	 */
	private final Condition preCondition;
	/**
	 * Used after the execution of the activity to test whether the loop should end.
	 */
	private final Condition postCondition;
	
	/**
	 * Creates a new instance able to execute given activity in loop.
	 * <p>
	 * In the case where neither a pre-condition nor a post-condition
	 * is specified, then, when {@link #run(Context) run}, the activity 
	 * can only be stopped by {@link Execution#cancel() canceling} the
	 * execution.
	 * 
	 * @param id
	 * 			The string uniquely identifying the activity.
	 * @param name
	 * 			The human-readable name of the activity.
	 * @param activity
	 * 			The activity to execute in a loop.
	 * @param preCondition
	 * 			The condition used after the execution of the activity to test whether the loop should end,
	 * 			or {@code null} if 
	 * @param postCondition
	 * 			The condition used after the execution of the activity to test whether the loop should end,
	 * 			or {@code null} 
	 */
	public BasicStructuredLoop(String id, String name, Activity activity, Condition preCondition, Condition postCondition) {
		super(id, name);
		this.activity = requireNonNull(activity, "activity");
		this.preCondition = preCondition;
		this.postCondition = postCondition;
	}

	@Override
	public void doRun(Context context) {
		if (hasNeitherPreNorPostCondition()) {
			run(activity, context);
			return;
		}
		loopUntilAConditionIsFulfilled(context);
	}
	
	@Override
	public Outputs outputs() {
		return activity.outputs();
	}

	private void loopUntilAConditionIsFulfilled(Context context) {
		while (! context.execution().isCancelled()) {
			if (preConditionIsFulfilled(context)) {
				break;
			}
			run(activity, context);

			if (postConditionIsFulfilled(context)) {
				break;
			}
		}
	}

	private boolean preConditionIsFulfilled(Context context) {
		return preCondition != null && preCondition.isVerified(context);
	}
	
	private boolean postConditionIsFulfilled(Context context) {
		return postCondition != null && postCondition.isVerified(context);
	}
	
	private boolean hasNeitherPreNorPostCondition() {
		return preCondition == null && postCondition == null;
	}

}
