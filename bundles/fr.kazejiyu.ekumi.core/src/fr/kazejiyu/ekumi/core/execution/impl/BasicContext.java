/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.impl;

import static java.util.Objects.requireNonNull;

import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.impl.factory.Maps;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Context;

public final class BasicContext implements Context {
	
	private final Events events;
	
	private ExecutionState state;
	
	private final MutableMap<String, Object> environment;
	
	BasicContext(Events events, ExecutionState status) {
		this.events = requireNonNull(events, "Context cannot have null events");
		this.state = requireNonNull(status, "Context cannot have null execution status");
		this.environment = Maps.mutable.empty();
	}
	
	void setExecutionState(ExecutionState state) {
		this.state = requireNonNull(state, "state");
	}

	@Override
	public Events events() {
		return events;
	}

	@Override
	public ExecutionState execution() {
		return state;
	}
	
	@Override
	public ImmutableMap<String, Object> env() {
		return environment.toImmutable();
	}

	@Override
	public void set(String name, Object value) {
		requireNonNull(name, "name parameter");
		environment.remove(name);
		environment.put(name, value);
	}

	@Override
	public void unset(String name) {
		environment.remove(name);
	}
	
}
