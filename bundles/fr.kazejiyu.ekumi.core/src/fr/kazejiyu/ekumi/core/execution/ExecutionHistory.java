package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.core.ekumi.Execution;

/**
 * A list of {@link Execution} instances ordered by their 
 * {@link Execution#getStartDate() start date}.
 * 
 * @author Emmanuel CHEBBI
 */
public interface ExecutionHistory extends Iterable<Execution> {
	
	

}
