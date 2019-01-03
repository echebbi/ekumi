package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.RunnerImpl;

public class SetVariableRunner extends RunnerImpl {
	
	private final String name;
	
	private final Object value;
	
	public SetVariableRunner(String name, Object value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public void run(Context context) {
		context.set(name, value);
	}

}
