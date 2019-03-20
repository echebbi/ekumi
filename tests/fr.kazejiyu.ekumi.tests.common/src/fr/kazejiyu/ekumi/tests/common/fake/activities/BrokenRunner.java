package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl;

public class BrokenRunner extends RunnerImpl {
	
	@Override
	public void run(Context context) {
		throw new EKumiRuntimeException("I won't run!");
	}

}
