package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

public final class DoNothing extends AbstractActivityWithStateManagement {
	
	public DoNothing() {
		super("" + new Date().hashCode(), "Do Nothing");
	}

	@Override
	protected void doRun(Context context) {
		// do nothing
	}

}
