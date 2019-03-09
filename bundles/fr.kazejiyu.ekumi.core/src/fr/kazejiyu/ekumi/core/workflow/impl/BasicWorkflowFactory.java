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

import org.eclipse.emf.ecore.EDataType;

import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import fr.kazejiyu.ekumi.model.workflow.impl.WorkflowFactoryImpl;

/**
 * <p>Custom factory used to instantiate custom sub-classes of the {@link WorkflowPackage}.</p>  
 */
public class BasicWorkflowFactory extends WorkflowFactoryImpl {

	@Override
	public DataFlows createDataFlows() {
		return new BasicDataFlows();
	}

	@Override
	public Execution createExecution() {
		return new BasicExecution();
	}
	
	@Override
	public ParallelSplit createParallelSplit() {
		return new BasicParallelSplit();
	}

	@Override
	public Sequence createSequence() {
		return new BasicSequence();
	}

	@Override
	public StructuredLoop createStructuredLoop() {
		return new BasicStructuredLoop();
	}

	@Override
	public ScriptedTask createScriptedTask() {
		return new BasicScriptedTask();
	}

	@Override
	public ScriptingLanguage createScriptingLanguageFromString(EDataType eDataType, String initialValue) {
		// TODO Should instantiate the language from the given id.
		// Requires the Platform.getExtensionRegistry but I'm a tired of those singletons
		return null;
	}

	@Override
	public String convertScriptingLanguageToString(EDataType eDataType, Object instanceValue) {
		// Properly serialize the language
		return ((ScriptingLanguage) instanceValue).id();
	}
	
	

}
