/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.languages.java.inject;

import static java.util.Objects.requireNonNull;

import com.google.inject.AbstractModule;

import fr.kazejiyu.ekumi.core.execution.events.Events;

/**
 * Allows injection of a specific {@link Events} instance.
 * 
 * @author Emmanuel CHEBBI
 */
public class EventsModule extends AbstractModule {
	
	private final Events eventsToInject;
	
	/**
	 * Creates a new module.
	 * 
	 * @param eventsToInject
	 * 			The event bus to inject.
	 */
	public EventsModule(Events eventsToInject) {
		super();
		this.eventsToInject = requireNonNull(eventsToInject, "Cannot make a null event bus available for injection");
	}
	
	@Override
	protected void configure() {
		bind(Events.class).toInstance(eventsToInject);
	}

}
