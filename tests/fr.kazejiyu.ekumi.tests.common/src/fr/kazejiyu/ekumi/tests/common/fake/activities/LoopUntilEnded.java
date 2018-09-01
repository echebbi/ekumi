package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class LoopUntilEnded extends ActivityImpl {
	
	private boolean shouldEnd = false;
	
	@Override
	public void run(Context context) {
		setStatus(Status.RUNNING);
		
		long start = System.currentTimeMillis();
		
		while (! shouldEnd) {
			
			// Prevents an infinite loop when running headless tests
			if (System.currentTimeMillis() - start > 2000)
				break;
		}
		
		setStatus(Status.SUCCEEDED);
	}
	
	/** Asks the activity to end its execution */
	public void ends() {
		shouldEnd = true;
	}
	
}
