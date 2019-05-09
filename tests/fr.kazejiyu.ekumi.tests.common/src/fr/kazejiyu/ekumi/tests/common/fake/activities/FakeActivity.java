package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * A stub activity that counts the number of time it is run. 
 */
public final class FakeActivity extends AbstractActivityWithStateManagement {
	
	private int callsToRun = 0;
	
	public FakeActivity() {
		super(new Date().hashCode() + "", "Fake Activity");
	}
	
	@Override
	protected void doRun(Context context) {
		++callsToRun;
	}
	
	public boolean hasBeenRun() {
		return callsToRun > 0;
	}
	
	/**
	 * Returns whether the activity has been run exactly once.
	 * @return whether the activity has been run exactly once
	 */
	public boolean hasBeenRunOnce() {
		return callsToRun == 1;
	}

}
