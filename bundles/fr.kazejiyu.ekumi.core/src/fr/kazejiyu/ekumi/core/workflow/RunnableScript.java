/**
 */
package fr.kazejiyu.ekumi.core.workflow;

/**
 * A script that can be run.
 */
public interface RunnableScript extends Script {

	void run(Context context);

}
