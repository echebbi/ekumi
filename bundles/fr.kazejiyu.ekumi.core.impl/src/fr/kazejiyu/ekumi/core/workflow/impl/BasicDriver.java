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

import static fr.kazejiyu.ekumi.core.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.Status.SUCCEEDED;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.DriverRunner;
import fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl;

public class BasicDriver extends DriverImpl {
	
	@Override
	public void run(Context context) {
		DriverRunner script = getScript();
		
		if (script == null || driven == null) {
			setStatus(SUCCEEDED);
			return;
		}
		
		try {
			script.setDriven(getDriven());
			script.getInputs().clear();
			script.getInputs().addAll(getInputs());
			script.getOutputs().clear();
			script.getOutputs().addAll(getOutputs());
			
			script.run(context);
			
			setStatus(SUCCEEDED);
		}
		catch (Exception e) {
			setStatus(FAILED);
		}
	}

}
