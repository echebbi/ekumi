package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.Date;

import fr.kazejiyu.ekumi.core.exceptions.EKumiRuntimeException;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.impl.AbstractActivityWithStateManagement;

/**
 * A stub activity that waits for a given delay.
 */
public class WaitFor extends AbstractActivityWithStateManagement {
	
	private final long delayInMillis;
	
	/**
	 * Creates a new activity that waits when run.
	 * 
	 * @param delayInMillis
	 * 			The delay to wait when run, in milliseconds.
	 */
	public WaitFor(long delayInMillis) {
		super("" + new Date().hashCode(), "Wait For " + delayInMillis + "ms");
		this.delayInMillis = delayInMillis;
	}
	
	@Override
	public void doRun(Context context) {
		try {
			Thread.sleep(delayInMillis);
		} 
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new EKumiRuntimeException("Thread interrupted while sleeping", e);
		}
	}

}
