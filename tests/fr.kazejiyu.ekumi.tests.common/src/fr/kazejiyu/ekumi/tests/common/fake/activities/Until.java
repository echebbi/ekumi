package fr.kazejiyu.ekumi.tests.common.fake.activities;

import org.eclipse.collections.api.set.ImmutableSet;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.Script;

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

	@Override
	public String path() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImmutableSet<Input> inputs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImmutableSet<Output> outputs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Script withInputs(Inputs inputs) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
