/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;

class BasicUnsafeContext extends UnsafeContextImpl {
	
	BasicUnsafeContext() {
		setEvents(new BasicEvents());
	}

	@Override
	public Context safe() {
		return new BasicContext(getEvents(), getExecutionStatus());
	}

}
