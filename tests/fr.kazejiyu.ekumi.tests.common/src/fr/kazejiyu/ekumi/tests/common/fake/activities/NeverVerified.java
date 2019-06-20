package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * A condition that is never verified. 
 */
public class NeverVerified implements Condition {
	
	@Override
	public boolean isVerified(Context context) {
		return false;
	}
	
}
