package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.ConditionImpl;

public class Until extends ConditionImpl {
	
	private final int max;
	
	private final Count counter;
	
	public Until(Count counter, int max) {
		this.max = max;
		this.counter = counter;
	}

	@Override
	public boolean isVerified(StructuredLoop loop, Context context) {
		// CAUTION: assumes that isVerified is called only once per loop
		return counter.getValue() >= max; 
	}
	
}
