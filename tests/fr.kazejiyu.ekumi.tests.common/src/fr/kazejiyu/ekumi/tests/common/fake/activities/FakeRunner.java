package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl;

public class FakeRunner extends RunnerImpl {
	
	private int callsToRun = 0;
	
	private Context contextOnRun;
	
	@Override
	public void run(Context context) {
		++callsToRun;
		contextOnRun = context;
	}
	
	public boolean hasBeenRun() {
		return callsToRun > 0;
	}
	
	public boolean hasBeenRunOnce() {
		return callsToRun == 1;
	}
	
	public Context getContextOnRun() {
		return contextOnRun;
	}

}
