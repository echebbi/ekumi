package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.SequenceImpl;

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
