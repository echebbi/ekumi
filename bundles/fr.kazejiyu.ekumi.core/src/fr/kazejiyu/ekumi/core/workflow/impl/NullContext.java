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

import javax.swing.text.AbstractDocument.Content;

import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.impl.factory.Maps;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.execution.events.impl.NullEvents;
import fr.kazejiyu.ekumi.core.execution.impl.NullExecutionStatus;
import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * An implementation of {@link Content} with no behavior. 
 */
public class NullContext implements Context {
	
	private final Events events = new NullEvents();
	
	private final ExecutionState executionStatus = new NullExecutionStatus();
	
	@Override
	public Events events() {
		return events;
	}
	
	@Override
	public ExecutionState execution() {
		return executionStatus;
	}	

	@Override
	public ImmutableMap<String, Object> env() {
		return Maps.immutable.empty();
	}

	@Override
	public boolean contains(String name) {
		return false;
	}

	@Override
	public void set(String name, Object value) {
		// 
	}

	@Override
	public void unset(String name) {
		// TODO Auto-generated method stub
		
	}

}
