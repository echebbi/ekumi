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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import fr.kazejiyu.ekumi.core.workflow.Condition;

@DisplayName("A Condition")
public class ConditionTest implements WithAssertions {
	
	@ParameterizedTest 
	@ValueSource(strings = {"true", "false"})
	@DisplayName("can create a Condition from a Supplier<Boolean>")
	void can_create_a_Condition_from_a_Boolean_supplier(boolean isVerified) {
		Condition condition = Condition.of(() -> isVerified);
		assertThat(condition.isVerified(new NullContext())).isEqualTo(isVerified);
	}
	
	@ParameterizedTest 
	@ValueSource(strings = {"true", "false"})
	@DisplayName("can create a Condition from a Predicate<Context>")
	void can_create_a_Condition_from_a_Context_predicate(boolean isVerified) {
		Condition condition = Condition.of(context -> isVerified);
		assertThat(condition.isVerified(new NullContext())).isEqualTo(isVerified);
	}
}
