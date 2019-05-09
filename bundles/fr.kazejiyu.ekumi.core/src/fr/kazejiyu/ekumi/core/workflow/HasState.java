/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * An object which has an {@link State execution state}.
 * <p>
 * This state implies that the object can be executed.
 */
public interface HasState {
	
	/**
	 * Returns the current execution state.
	 * @return the current execution state
	 */
	State state();
	
	void skip();
	
	/**
	 * 
	 */
	void cancel();

}
