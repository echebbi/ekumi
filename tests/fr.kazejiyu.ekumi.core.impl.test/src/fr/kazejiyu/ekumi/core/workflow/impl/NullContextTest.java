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

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A Null Context")
public class NullContextTest implements WithAssertions {

	private NullContext context;
	
	@BeforeEach
	void createContext() {
		context = new NullContext();
	}
	
	@Test @DisplayName("has non null events")
	void has_non_null_events() {
		assertThat(context.events()).isNotNull();
	}
	
	@Test @DisplayName("has non null execution state")
	void has_non_null_execution_state() {
		assertThat(context.execution()).isNotNull();
	}
	
	@Test @DisplayName("has an empty environement")
	void has_an_empty_environment() {
		assertThat(context.env()).isEmpty();
	}
	
	@Test @DisplayName("can unset an environment variable")
	void can_unset_an_environment_variable() {
		context.unset("var");
		assertThat(context.env()).isEmpty();
	}
	
	@Nested @DisplayName("when setting a new environment variable")
	class WhenSettingANewEnvironmentVariable {
		
		@BeforeEach
		void setNewVariable() {
			context.set("user", "name");
		}
		
		@Test @DisplayName("does not add it to the environement")
		void does_not_add_it_to_the_environment() {
			assertThat(context.env()).isEmpty();
		}
		
		@Test @DisplayName("does not contain it")
		void does_not_contain_it() {
			assertThat(context.contains("user")).isFalse();
		}
		
	}
	
}
