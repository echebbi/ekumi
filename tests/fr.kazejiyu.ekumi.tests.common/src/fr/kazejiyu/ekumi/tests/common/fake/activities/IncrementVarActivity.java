package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An Activity that increments the value of a specific variable. 
 */
public final class IncrementVarActivity extends AbstractActivityWithStateManagement {
	
	private final String variable;
	
	private int value;
	
	public IncrementVarActivity(String variable) {
		this(variable, 0);
	}
	
	public IncrementVarActivity(String variable, int start) {
		super("" + new Date().hashCode(), "Increment " + variable + " from " + start);
		this.variable = variable;
		this.value = start;
	}
	
	@Override
	protected void doRun(Context context) {
		context.set(variable, value++);
	}

}
