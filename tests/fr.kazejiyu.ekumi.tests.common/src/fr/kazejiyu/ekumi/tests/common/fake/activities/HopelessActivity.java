package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Status;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl;

/**
 * An {@link Activity} that sets its status to {@link Status#FAILED} when executed. 
 */
public class HopelessActivity extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		setStatus(Status.FAILED);
	}
	
}
