package fr.kazejiyu.ekumi.tests.common.fake.activities;

import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.impl.factory.Sets;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.RunnableScript;
import fr.kazejiyu.ekumi.core.workflow.Script;

public final class FakeRunner implements RunnableScript {
	
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

	@Override
	public String path() {
		return "";
	}

	@Override
	public ImmutableSet<Input> inputs() {
		return Sets.immutable.empty();
	}

	@Override
	public ImmutableSet<Output> outputs() {
		return Sets.immutable.empty();
	}

	@Override
	public Script withInputs(Inputs inputs) {
		return this;
	}

}
