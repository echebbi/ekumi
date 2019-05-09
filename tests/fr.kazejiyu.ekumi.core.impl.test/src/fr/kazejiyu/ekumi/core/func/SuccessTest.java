/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.func;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.func.Try.Success;

@DisplayName("A Success")
public class SuccessTest implements WithAssertions {
	
	private Success<String> success;
	
	@BeforeEach
	void createSuccess() {
		success = Try.success("hello");
	}
	
	@Test @DisplayName("is a success")
	void is_a_success() {
		assertThat(success.isSuccess()).isTrue();
	}
	
	@Test @DisplayName("is not a failure")
	void is_not_a_failure() {
		assertThat(success.isFailure()).isFalse();
	}
	
	@Test @DisplayName("has a value")
	void has_a_value() {
		assertThat(success.value()).contains("hello");
	}
	
	@Test @DisplayName("does not replace its value")
	void does_not_replace_its_value() {
		assertThat(success.orElse("another value")).isEqualTo("hello");
	}
	
	@Test @DisplayName("does not replace its value with a supplier")
	void does_not_replace_its_value_with_a_supplier() {
		assertThat(success.orElseGet(() -> "another value")).isEqualTo("hello");
	}
	
	@Test @DisplayName("does not have an exception")
	void does_not_have_an_exception() {
		assertThat(success.exception()).isEmpty();
	}
	
	@Test @DisplayName("can map its value")
	void can_map_its_value() {
		assertThat(success.map(String::toUpperCase).value()).contains("HELLO");
	}
	
}
