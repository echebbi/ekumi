package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

public class FakeActivity extends ActivityImpl {
	
	private int callsToRun = 0;
	
	@Override
	public void run(Context context) {
		++callsToRun;
	}
	
	public boolean hasBeenRun() {
		return callsToRun > 0;
	}
	
	public boolean hasBeenRunOnce() {
		return callsToRun == 1;
	}

}
