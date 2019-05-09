package fr.kazejiyu.ekumi.tests.common.fake.activities;

import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.impl.factory.Sets;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.RunnableScript;
import fr.kazejiyu.ekumi.core.workflow.Script;

public final class BrokenRunner implements RunnableScript {
	
	@Override
	public void run(Context context) {
		throw new EKumiRuntimeException("I won't run!");
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
