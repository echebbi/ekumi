package fr.kazejiyu.ekumi.tests.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

/**
 * An {@link Activity} that sets its status to {@link Status#FAILED} when executed. 
 */
public class HopelessActivity extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		setStatus(Status.FAILED);
	}
	
}
