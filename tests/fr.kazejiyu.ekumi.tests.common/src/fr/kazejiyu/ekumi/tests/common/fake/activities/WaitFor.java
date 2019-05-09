package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * A stub activity that waits for a given delay.
 */
public class WaitFor extends AbstractActivityWithStateManagement {
	
	private final long delay;
	
	public WaitFor(long delay) {
		super("" + new Date().hashCode(), "Wait For " + delay + "ms");
		this.delay = delay;
	}
	
	@Override
	public void doRun(Context context) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new EKumiRuntimeException("Thread interrupted while sleeping", e);
		}
	}

}
