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

import fr.kazejiyu.ekumi.core.func.Try.Failure;

@DisplayName("A Failure")
public class FailureTest implements WithAssertions {
	
	private Try.Failure<String> failure;
	
	@BeforeEach
	void createSuccess() {
		failure = (Failure<String>) Try.<String>failure(new IllegalArgumentException());
	}
	
	@Test @DisplayName("is not a success")
	void is_not_a_success() {
		assertThat(failure.isSuccess()).isFalse();
	}
	
	@Test @DisplayName("is a failure")
	void is_a_failure() {
		assertThat(failure.isFailure()).isTrue();
	}
	
	@Test @DisplayName("has not value")
	void has_no_value() {
		assertThat(failure.value()).isEmpty();
	}
	
	@Test @DisplayName("replace its value")
	void replace_its_value() {
		assertThat(failure.orElse("another value")).isEqualTo("another value");
	}
	
	@Test @DisplayName("replace its value with a supplier")
	void replace_its_value_with_a_supplier() {
		assertThat(failure.orElseGet(() -> "another value")).isEqualTo("another value");
	}
	
	@Test @DisplayName("has an exception")
	void has_an_exception() {
		assertThat(failure.exception()).containsInstanceOf(IllegalArgumentException.class);
	}
	
	@Test @DisplayName("can map its value")
	void can_map_its_value() {
		assertThat(failure.map(String::toUpperCase).value()).isEmpty();
	}
	
}
