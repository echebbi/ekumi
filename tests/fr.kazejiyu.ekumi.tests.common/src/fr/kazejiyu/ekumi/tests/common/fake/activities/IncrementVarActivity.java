package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class IncrementVarActivity extends ActivityImpl {
	
	private final String variable;
	
	private int value;
	
	public IncrementVarActivity(String variable) {
		this(variable, 0);
	}
	
	public IncrementVarActivity(String variable, int start) {
		this.variable = variable;
		this.value = start;
	}
	
	@Override
	public void run(Context context) {
		context.set(variable, value++);
	}

}
