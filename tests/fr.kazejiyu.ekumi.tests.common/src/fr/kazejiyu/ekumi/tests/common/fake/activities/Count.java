package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl;

/**
 * An Activity that increments the value of a specific variable. 
 */
public class Count extends ActivityImpl {
	
	private int value;
	
	public Count() {
		this(0);
	}
	
	public Count(int start) {
		this.value = start;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public void run(Context context) {
		++value;
		setStatus(Status.SUCCEEDED);
	}

}
