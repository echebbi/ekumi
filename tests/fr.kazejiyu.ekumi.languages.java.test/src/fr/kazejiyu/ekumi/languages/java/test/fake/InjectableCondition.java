package fr.kazejiyu.ekumi.languages.java.test.fake;

import javax.inject.Inject;

import org.eclipse.collections.api.set.ImmutableSet;

import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Inputs;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.Script;
import fr.kazejiyu.ekumi.core.workflow.ScriptedCondition;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;

public class InjectableCondition implements ScriptedCondition, Injectable {
	
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
