package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.ActivityImpl;

public class DoNothing extends ActivityImpl {
	
	@Override
	public void run(Context context) {
		// do nothing
	}

}
