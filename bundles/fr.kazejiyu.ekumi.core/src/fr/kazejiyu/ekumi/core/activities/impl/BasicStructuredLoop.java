package fr.kazejiyu.ekumi.core.activities.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.*;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl;

public class BasicStructuredLoop extends StructuredLoopImpl {
	
	@Override
	public void run(Context context) {
		if (getActivity() == null) {
			setStatus(SUCCEEDED);
			return;
		}
		
		boolean encounteredErrors = false;
		
		while (! encounteredErrors) {
			if (preConditionIsFulfilled(context))
				break;
			
			try {
				getActivity().getFlows().resolveInputs();
				getActivity().run(context);
			}
			catch (Exception e) {
				// TODO log error
				encounteredErrors = true;
			}
			
			if (postConditionIsFulfilled(context))
				break;
		}
		
		setStatus(encounteredErrors ? FAILED : SUCCEEDED);
	}

	private boolean preConditionIsFulfilled(Context context) {
		return getPreCondition() != null && getPreCondition().isVerified(this, context);
	}
	
	private boolean postConditionIsFulfilled(Context context) {
		return getPostCondition() != null && getPostCondition().isVerified(this, context);
	}

}
