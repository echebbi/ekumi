package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class LoopUntilEnded extends AbstractActivityWithStateManagement {
	
	public LoopUntilEnded() {
		super("" + new Date().hashCode(), "Loop Until Ended");
	}

	private boolean shouldEnd = false;
	
	@Override
	public void doRun(Context context) {
		long start = System.currentTimeMillis();
		
		while (! shouldEnd) {
			
			// Prevents an infinite loop when running headless tests
			if (System.currentTimeMillis() - start > 2000)
				break;
		}
	}
	
	/** Asks the activity to end its execution */
	public void ends() {
		shouldEnd = true;
	}
	
}
