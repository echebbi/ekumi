package fr.kazejiyu.ekumi.core.activities.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.SequenceImpl;

public class BasicSequence extends SequenceImpl {

	@Override
	public EList<Activity> getActivities() {
		EList<Activity> activities = new BasicEList<>();
		Activity current = getRoot();
		
		while (current != null) {
			activities.add(current);
			current = current.getSuccessor();
		}
		
		return activities;
	}
	
	@Override
	public boolean isSetActivities() {
		return true;
	}
	
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
			return false;
		}
		
		return activity.getStatus() == SUCCEEDED;
	}
	
}
