package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl;
import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;

public class BrokenRunner extends RunnerImpl {
	
	@Override
	public void run(Context context) {
		throw new EKumiRuntimeException("I won't run!");
	}

}
