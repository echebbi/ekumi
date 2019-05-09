package fr.kazejiyu.ekumi.tests.common.fake.activities;

import static fr.kazejiyu.ekumi.core.workflow.State.CANCELLED;
import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class LoopUntilCancelled extends AbstractActivityWithStateManagement {
	
	public LoopUntilCancelled() {
		super("" + new Date().hashCode(), "Loop Until Cancelled");
	}

	@Override
	public void doRun(Context context) {
		long start = System.currentTimeMillis();
		
		while (! context.execution().isCancelled()) {
			
			// Prevents an infinite loop when running headless tests
			if (System.currentTimeMillis() - start > 2000) {
				state = FAILED;
				return;
			}
		}
		state = CANCELLED;
	}
	
}
