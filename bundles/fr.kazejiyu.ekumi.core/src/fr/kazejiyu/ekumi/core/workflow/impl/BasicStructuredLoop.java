/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
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
