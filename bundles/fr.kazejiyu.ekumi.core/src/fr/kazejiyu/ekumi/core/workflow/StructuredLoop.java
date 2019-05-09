/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * <p>
 * A loop that conditionally executes another activity.
 * <p>
 * Before each iteration, the loop will execute a pre-condition
 * to check whether the activity can be executed.
 * <p>
 * After each iteration, the loop will execute a post-condition
 * to check whether a new iteration can be launched.
 * <p>
 * A structured loop can typically be used to implement
 * {@code do-while} or {@code repeat-until} control structures.
 */
public interface StructuredLoop extends Activity {

}
