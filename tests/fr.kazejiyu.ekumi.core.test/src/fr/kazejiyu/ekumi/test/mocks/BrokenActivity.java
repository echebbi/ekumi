package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

/**
 * An {@link Activity} that sets its status to {@link Status#FAILED}
 * and throws and Exception when executed. 
 */
public class BrokenActivity extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		setStatus(Status.FAILED);
		throw new EKumiRuntimeException("I won't run!");
	}
	
}
