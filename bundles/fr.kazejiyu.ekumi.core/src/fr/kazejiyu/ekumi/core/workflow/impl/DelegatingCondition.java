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

import java.util.function.Consumer;
import java.util.function.Predicate;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * A condition that delegates its behavior to a {@link Consumer}.
 * <p>
 * An instance of this class is especially useful to create conditions
 * from lambda expressions:
 * <p>
 * <code>Condition neverVerified = new DelegatingCondition("id", "name", context -> false);</code>
 * 
 * @author Emmanuel CHEBBI
 */
public class DelegatingCondition implements Condition {
	
	private final Predicate<Context> isVerified;

	/**
	 * Creates a new condition with specified behavior.
	 * 
	 * @param id
	 * 			The string uniquely identifying this condition.
	 * @param name
	 * 			The human-readable name of the condition.
	 * @param isVerified
	 * 			The consumer called when the condition is run.
	 */
	public DelegatingCondition(Predicate<Context> isVerified) {
		this.isVerified = isVerified;
	}

	@Override
	public boolean isVerified(Context context) {
		return isVerified.test(context);
	}

}
