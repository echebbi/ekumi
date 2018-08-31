package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl;

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
