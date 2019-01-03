package fr.kazejiyu.ekumi.languages.java.inject;

import static java.util.Objects.requireNonNull;

import com.google.inject.AbstractModule;

import fr.kazejiyu.ekumi.model.execution.events.Events;

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
