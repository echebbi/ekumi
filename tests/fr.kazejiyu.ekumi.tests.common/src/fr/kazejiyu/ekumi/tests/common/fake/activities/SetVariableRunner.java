package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An activity that sets a specific context variable when run. 
 */
public class SetVariableRunner extends AbstractActivityWithStateManagement {
	
	private final Object value;
	
	/**
	 * Creates a new instance that will create a new context variable when run.
	 * 
	 * @param name
	 * 			The name of the variable to set.
	 * @param value
	 * 			The value of the variable to set.
	 */
	public SetVariableRunner(String name, Object value) {
		super("" + new Date().hashCode(), name);
		this.value = value;
	}
	
	@Override
	public void doRun(Context context) {
		context.set(name(), value);
	}

}
