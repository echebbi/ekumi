/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.collections.api.set.ImmutableSet;

/**
 * 
 */
public interface Script {
	
	String path();
	
	ImmutableSet<Input> inputs();
	
	ImmutableSet<Output> outputs();
	
	Script withInputs(Inputs inputs);

} // Script
