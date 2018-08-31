package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

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
