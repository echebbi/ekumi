/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * An object that can be identified by its name or id.
 */
public interface Identifiable {
	
	/**
	 * Returns the ID uniquely identifying the object.
	 * @return the ID uniquely identifying the object
	 */
	String id();
	
	/**
	 * Returns a human-readable name of the object.
	 * @return a human-readable name of the object
	 */
	String name();
	
}
