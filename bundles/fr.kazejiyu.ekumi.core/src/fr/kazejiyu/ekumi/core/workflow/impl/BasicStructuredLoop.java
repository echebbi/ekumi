package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.model.workflow.Status.*;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.StructuredLoopImpl;

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
				// TODO broadcast exception somehow
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
