package fr.kazejiyu.ekumi.core.execution.listeners;

/**
 * A hook used to monitor the execution of an activity.
 * <p>
 * Can be registered with the {@code fr.kazejiyu.ekumi.execution} extension point. 
 */
public interface ExecutionHook extends ActivityListener, ExecutionListener {
	
	/**
	 * Returns an identifier that uniquely identifies this hook.
	 * @return an identifier that uniquely identifies this hook
	 */
	String id();

}
