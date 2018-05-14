package fr.kazejiyu.ekumi.core.ekumi.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.*;

import fr.kazejiyu.ekumi.core.ekumi.Context;

public class BasicStructuredLoop extends StructuredLoopImpl {
	
	@Override
	public void run(Context context) {
		boolean endConditionIsSatisfied = false;
		boolean encounteredErrors = false;
		
		while ((!endConditionIsSatisfied) && (!encounteredErrors)) {
			if (preConditionIsFulfilled(context)) {
				endConditionIsSatisfied = true;
			}
			
			try {
				getActivity().run(context);
			}
			catch (Exception e) {
				// TODO log error
				encounteredErrors = true;
			}
			
			if (postConditionIsFulfilled(context)) {
				endConditionIsSatisfied = true;
			}
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
