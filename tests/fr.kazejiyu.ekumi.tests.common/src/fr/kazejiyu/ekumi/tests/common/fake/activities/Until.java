package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;

public class Until implements Condition {
	
	private final int max;
	
	private final Count counter;
	
	public Until(Count counter, int max) {
		this.max = max;
		this.counter = counter;
	}

	@Override
	public boolean isVerified(Context context) {
		// CAUTION: assumes that isVerified is called only once per loop
		return counter.getValue() >= max; 
	}
	
}
