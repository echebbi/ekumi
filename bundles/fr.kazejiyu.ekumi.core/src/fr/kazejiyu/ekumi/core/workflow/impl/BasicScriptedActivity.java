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

import static fr.kazejiyu.ekumi.core.workflow.State.SUCCEEDED;
import static java.util.Objects.requireNonNull;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.RunnableScript;
import fr.kazejiyu.ekumi.core.workflow.ScriptedActivity;

/**
 * A simple implementation of {@link ScriptedActivity}. 
 */
public final class BasicScriptedActivity extends AbstractActivityWithStateManagement implements ScriptedActivity {
	/**
	 * Used to interpret the script. 
	 */
	private final ScriptingLanguage language;
	/**
	 * Used by the language to dynamically instantiate a RunnableScript.
	 */
	private final String scriptPath;
	/**
	 * The interpreter instantiated by the language.
	 * May be null if the instance has not run yet.
	 */
	private RunnableScript script;

	/**
	 * Creates a new activity able to execute a given script.
	 * 
	 * @param id
	 * 			The string uniquely identifying the activity.
	 * @param name
	 * 			The human-readable name of the activity.
	 * @param language
	 * 			The language used to interpret the script.
	 * @param scriptIdentifier
	 * 			The string used by the language to instantiate a new {@link RunnableScript}.
	 */
	public BasicScriptedActivity(String id, String name, ScriptingLanguage language, String scriptIdentifier) {
		super(id, name);
		this.language = requireNonNull(language, "language");
		this.scriptPath = requireNonNull(scriptIdentifier, "scriptPath");
	}

	@Override
	public void doRun(Context context) {
		script = resolveRunner(context);
		
		if (script == null) {
			state = SUCCEEDED;
			return;
		}
		// TOOD script = script.withData(inputs, outputs);
		script.run(context);
	}
	
	@Override
	public ScriptingLanguage language() {
		return language;
	}
	
	private RunnableScript resolveRunner(Context context) {
		return language.resolveRunner(scriptPath, context);
	}
	
}
