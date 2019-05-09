package fr.kazejiyu.ekumi.tests.common.fake.activities;

import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;

import java.util.Date;

import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.State;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * An {@link Activity} that sets its status to {@link State#FAILED} when executed. 
 */
public final class HopelessActivity extends AbstractActivityWithStateManagement {
	
	public HopelessActivity() {
		super("" + new Date().hashCode(), "Hopeless");
	}

	@Override
	protected void doRun(Context context) {
		state = FAILED;
	}
	
}
