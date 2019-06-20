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

import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * An activity that delegates its behavior to a {@link Consumer}.
 * <p>
 * An instance of this class is especially useful to create activities
 * from lambda expressions:
 * <p>
 * <code>Activity greet = new DelegatingActivity("id", "name", context -> System.out.println("Hello!"));</code>
 * 
 * @author Emmanuel CHEBBI
 */
public class DelegatingActivity extends AbstractActivityWithStateManagement {
	
	private final Consumer<Context> behavior;

	/**
	 * Creates a new activity with specified behavior.
	 * 
	 * @param id
	 * 			The string uniquely identifying this activity.
	 * @param name
	 * 			The human-readable name of the activity.
	 * @param behavior
	 * 			The consumer called when the activity is run.
	 */
	public DelegatingActivity(String id, String name, Consumer<Context> behavior) {
		super(id, name);
		this.behavior = behavior;
	}

	@Override
	protected void doRun(Context context) {
		behavior.accept(context);
	}

}
