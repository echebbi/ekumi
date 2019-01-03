package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class LoopUntilCancelled extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		long start = System.currentTimeMillis();
		
		while (! context.execution().isCancelled()) {
			
			// Prevents an infinite loop when running headless tests
			if (System.currentTimeMillis() - start > 2000) {
				setStatus(Status.FAILED);
				return;
			}
		}
		
		setStatus(Status.CANCELLED);
	}
	
}
