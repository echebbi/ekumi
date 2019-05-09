/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * The state of an activity, specifying what it's doing. 
 */
public enum State {
	
	/**
	 * When the activity's execution has not started yet.
	 */
	IDLE,

	/**
	 * When the activity's execution is on going.
	 */
	RUNNING,

	/**
	 * When the activity's execution has finished without error.
	 */
	SUCCEEDED,

	/**
	 * When the activity's execution has been interrupted
	 * by a runtime error.
	 */
	FAILED,

	/**
	 * When the activity's execution has been cancelled while running.
	 */
	CANCELLED,

	/**
	 * When the activity's execution has been paused while running.
	 */
	PAUSED,
	
	/**
	 * When the activity's execution has been skipped while it was
	 * about to start.
	 */
	SKIPPED;

}
