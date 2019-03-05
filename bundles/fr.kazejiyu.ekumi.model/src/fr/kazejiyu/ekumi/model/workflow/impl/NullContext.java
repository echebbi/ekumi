/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.workflow.impl;

import javax.swing.text.AbstractDocument.Content;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.execution.events.impl.NullEvents;
import fr.kazejiyu.ekumi.model.execution.impl.NullExecutionStatus;

/**
 * An implementation of {@link Content} with no behavior. 
 */
public class NullContext extends ContextImpl {
	
	private final Events events = new NullEvents();
	
	private final ExecutionStatus executionStatus = new NullExecutionStatus();
	
	@Override
	public Events events() {
		return events;
	}
	
	@Override
	public ExecutionStatus execution() {
		return executionStatus;
	}

}
