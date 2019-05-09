package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An Activity that counts the number of times it is executed.
 */
public final class Count extends AbstractActivityWithStateManagement {
	
	private int value;
	
	public Count() {
		this(0);
	}
	
	public Count(int start) {
		super("" + new Date().hashCode(), "Count from " + start);
		this.value = start;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	protected void doRun(Context context) {
		++value;
	}

}
