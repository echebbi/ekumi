/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * A script that can be evaluated as a boolean.
 */
public interface Condition extends Script {
	
	boolean isVerified(Context context);

}
