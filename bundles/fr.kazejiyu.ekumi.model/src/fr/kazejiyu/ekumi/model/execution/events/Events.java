/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.model.execution.events;

/**
 * Event bus used to listen for activity-related events at runtime.<br>
 * <br>
 * An event bus is able to:
 * <ul>
 * 	<li>broadcast specific events,
 * 	<li>register callbacks for specific events.
 * </ul>
 */
public interface Events extends EventSource, CallbackRegistry {
	
}
