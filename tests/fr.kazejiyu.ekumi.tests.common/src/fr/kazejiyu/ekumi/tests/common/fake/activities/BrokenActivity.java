package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.State;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * A fake activity that sets its status to {@link State#FAILED} when executed. 
 */
public class BrokenActivity extends AbstractActivityWithStateManagement {
	
	public BrokenActivity() {
		super("" + new Date().hashCode(), "Broken");
	}

	@Override
	public void doRun(Context context) {
		throw new EKumiRuntimeException("I won't run!");
	}
	
}
