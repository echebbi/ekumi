package fr.kazejiyu.ekumi.languages.java.test.fake;

import javax.inject.Inject;

import org.eclipse.collections.api.set.ImmutableSet;
import org.eclipse.collections.impl.factory.Sets;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.Script;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;

public class InjectableCondition implements Condition, Injectable {
	
	@Inject
	private Events events;
	
	@Inject
	private ExecutionState status;
	
	@Override
	public boolean isVerified(Context context) {
		return true;
	}

	@Override
	public boolean hasBeenInjected() {
		return events != null && status != null;
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
