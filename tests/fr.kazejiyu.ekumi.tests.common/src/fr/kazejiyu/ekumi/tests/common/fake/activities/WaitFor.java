package fr.kazejiyu.ekumi.tests.common.fake.activities;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl;

public class WaitFor extends ActivityImpl {
	
	private final long delay;
	
	public WaitFor(long delay) {
		super();
		this.delay = delay;
	}
	
	
	@Override
	public void run(Context context) {
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new RuntimeException("Thread interrupted while sleeping", e);
		}
	}

}
