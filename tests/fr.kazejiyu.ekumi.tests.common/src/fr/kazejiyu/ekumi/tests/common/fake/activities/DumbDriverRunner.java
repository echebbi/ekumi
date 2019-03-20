package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverRunnerImpl;

public class DumbDriverRunner extends DriverRunnerImpl {
	
	@Override
	public void run(Context context) {
		getDriven().run(context);
	}

}
