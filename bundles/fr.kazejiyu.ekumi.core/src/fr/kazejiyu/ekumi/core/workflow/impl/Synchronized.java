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

import org.eclipse.collections.api.map.ImmutableMap;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * A {@link Context} decorator providing thread-safe methods.
 */
public final class Synchronized implements Context {
	
	/**
	 * The context to make thread-safe.
	 */
	private final Context unsafeContext;
	
	/**
	 * Decorates given context to make it thread-safe.
	 * 
	 * @param unsafeContext
	 * 			The context to make thread-safe.
	 */
	public Synchronized(Context unsafeContext) {
		this.unsafeContext = requireNonNull(unsafeContext, "context");
	}

	@Override
	public Events events() {
		// FIXME make this thread-safe
		return unsafeContext.events();
	}

	@Override
	public ExecutionState execution() {
		return unsafeContext.execution();
	}

	@Override
	public synchronized ImmutableMap<String, Object> env() {
		return unsafeContext.env();
	}

	@Override
	public synchronized void set(String name, Object value) {
		unsafeContext.set(name, value);
	}

	@Override
	public synchronized void unset(String name) {
		unsafeContext.unset(name);
	}

}
