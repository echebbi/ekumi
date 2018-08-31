package fr.kazejiyu.ekumi.test.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.DriverRunnerImpl;

public class DumbDriverRunner extends DriverRunnerImpl {
	
	@Override
	public void run(Context context) {
		getDriven().run(context);
	}

}
