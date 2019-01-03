package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.RunnerImpl;

public class BrokenRunner extends RunnerImpl {
	
	@Override
	public void run(Context context) {
		throw new EKumiRuntimeException("I won't run!");
	}

}
