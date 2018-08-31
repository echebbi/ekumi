package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl;

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
