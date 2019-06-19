package fr.kazejiyu.ekumi.tests.common.fake.activities;

import org.eclipse.collections.api.set.ImmutableSet;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.Script;

/**
 * A condition that is never verified. 
 */
public class NeverVerified implements Condition {
	
	@Override
	public boolean isVerified(Context context) {
		return false;
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
