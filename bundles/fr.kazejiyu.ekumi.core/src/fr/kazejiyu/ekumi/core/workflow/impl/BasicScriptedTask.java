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

import static fr.kazejiyu.ekumi.model.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.model.workflow.Status.SUCCEEDED;

import java.util.Optional;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.impl.NullContext;
import fr.kazejiyu.ekumi.model.workflow.impl.ScriptedTaskImpl;

public class BasicScriptedTask extends ScriptedTaskImpl {

	@Override
	public void run(Context context) {
		Runner script = resolveRunner(context);
		
		if (script == null) {
			setStatus(SUCCEEDED);
			return;
		}
		
		try {
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
	
	@Override
	public Runner getScript() {
		return basicGetScript();
	}
	
	@Override
	public Runner basicGetScript() {
		return resolveRunner(new NullContext());
	}
	
	private Runner resolveRunner(Context context) {
		return Optional.ofNullable(getLanguage())
					   .map(language -> language.resolveRunner(getScriptPath(), context))
					   .orElse(null);
	}
	
}
