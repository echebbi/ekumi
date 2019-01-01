package fr.kazejiyu.ekumi.ide.events;

/**
 * <p>Defines topics for EKumi events.</p>
 * 
 * <p>Users can subscribe to these topics with an {@code IEventBroker}
 * in order to receive specific events.</p>
 */
public final class EKumiEvents {
	
	private EKumiEvents() {
		// should not be instantiated
	}
	
	/**
	 * Root topic for all EKumi-related events/
	 */
	public static final String EKUMI_TOPIC = "fr/kazejiyu/ekumi/ide";
	
	/**
	 * Subscribe to this topic to receive all EKumi-related events.
	 */
	public static final String EKUMI_ALL_TOPICS = EKUMI_TOPIC + "/*";
	
	/**
	 * Root topic for all history-related events.
	 */
	public static final String HISTORY_TOPIC = EKUMI_TOPIC + "/history";
	
	/**
	 * Subscribe to this topic to receive an event each time a new execution is launched.
	 */
	public static final String HISTORY_EXECUTION_STARTED = HISTORY_TOPIC + "/execution_started";
	
	/**
	 * Subscribe to this topic to receive an event each time an execution is updated.
	 */
	public static final String HISTORY_EXECUTION_CHANGED = HISTORY_TOPIC + "/execution_changed";

}
