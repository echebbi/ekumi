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
