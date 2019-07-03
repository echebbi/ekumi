/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.tests.common.languages;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.RunnableScript;

/**
 * A stub language that can't resolve anything, for testing purposes.
 * 
 * @author Emmanuel CHEBBI
 */
public class StubScriptingLanguage implements ScriptingLanguage {

	@Override
	public String id() {
		return getClass().getCanonicalName();
	}

	@Override
	public String name() {
		return "Stub Scripting Language";
	}

	@Override
	public RunnableScript resolveRunner(String identifier, Context context) {
		return null;
	}

	@Override
	public Condition resolveCondition(String identifier, Context context) {
		return null;
	}

}
