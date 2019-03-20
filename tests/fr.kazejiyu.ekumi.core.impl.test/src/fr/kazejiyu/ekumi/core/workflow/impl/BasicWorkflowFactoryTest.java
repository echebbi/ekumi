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

import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.workflow.DataFlows;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.core.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.core.workflow.WorkflowPackage;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicWorkflowFactory")
public class BasicWorkflowFactoryTest implements WithAssertions {
	
	BasicWorkflowFactory factory;
	
	@BeforeEach
	void createFactory() {
		factory = new BasicWorkflowFactory();
	}
	
	@Test @DisplayName("creates DataFlows")
	void creates_DataFlows() {
		assertThat(factory.createDataFlows()).isInstanceOf(DataFlows.class);
	}
	
	@Test @DisplayName("creates Execution")
	void creates_Execution() {
		assertThat(factory.createExecution()).isInstanceOf(Execution.class);
	}
	
	@Test @DisplayName("creates ParallelSplit")
	void creates_ParallelSplit() {
		assertThat(factory.createParallelSplit()).isInstanceOf(ParallelSplit.class);
	}
	
	@Test @DisplayName("creates Sequence")
	void creates_Sequence() {
		assertThat(factory.createSequence()).isInstanceOf(Sequence.class);
	}
	
	@Test @DisplayName("creates StructuredLoop")
	void creates_StructuredLoop() {
		assertThat(factory.createStructuredLoop()).isInstanceOf(StructuredLoop.class);
	}
	
	@Test @DisplayName("creates ScriptedTask")
	void creates_ScriptedTask() {
		assertThat(factory.createScriptedTask()).isInstanceOf(ScriptedTask.class);
	}
	
	@Test @DisplayName("cannot create ScriptingLanguage from String")
	void cannot_create_ScriptingLanguage_from_String() {
		assertThat(factory.createScriptingLanguageFromString(WorkflowPackage.Literals.SCRIPTING_LANGUAGE, "this.language"))
				.isNull();
	}
	
	@Test @DisplayName("converts ScriptingLanguage to String")
	void converts_ScriptingLanguage_to_String(@Mock ScriptingLanguage language) {
		when(language.id()).thenReturn("this.language.id");
		
		assertThat(factory.convertScriptingLanguageToString(WorkflowPackage.Literals.SCRIPTING_LANGUAGE, language))
				.isEqualTo(language.id());
	}

}
