package fr.kazejiyu.ekumi.core.ekumi.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.*;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;

public class BasicSequence extends SequenceImpl {

	@Override
	public void run(Context context) {
		boolean oneActivityHasFailed = false;
		
		for (Activity activity : getActivities()) {
			oneActivityHasFailed = ! runSafely(activity, context);
			
			if (oneActivityHasFailed)
				break;
		}
		
		setStatus(oneActivityHasFailed ? FAILED : SUCCEEDED);
	}
	
	private boolean runSafely(Activity activity, Context context) {
		try {
			activity.getFlows().resolveInputs();
			activity.run(context);
		}
		catch (Exception e) {
			// TODO log exception
			return false;
		}
		
		return activity.getStatus() == SUCCEEDED;
	}
	
}
