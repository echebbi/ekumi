package fr.kazejiyu.ekumi.tests.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

public class BrokenActivity extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		setStatus(Status.FAILED);
		throw new EKumiRuntimeException("I won't run!");
	}
	
}
