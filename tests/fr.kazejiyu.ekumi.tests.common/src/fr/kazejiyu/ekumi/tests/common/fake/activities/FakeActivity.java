package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl;

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
