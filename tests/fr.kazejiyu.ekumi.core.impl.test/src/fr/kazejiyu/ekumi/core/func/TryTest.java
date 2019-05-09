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
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.func.Try.Failure;
import fr.kazejiyu.ekumi.core.func.Try.Success;

@DisplayName("A Try")
public class TryTest implements WithAssertions {
	
	@Nested @DisplayName("when instantiated based on a computation")
	class WhenInstantiatedBasedOnAComputation {
		
		@Nested @DisplayName("if the computation succeeds")
		class IfTheComputationSucceeds {
		
			@Test @DisplayName("creates a Success")
			void creates_a_Success() {
				Try<Double> result = Try.of(() -> 42.0);
				assertThat(result).isInstanceOf(Success.class);
			}
			
			@Test @DisplayName("creates a result containing the expected value")
			void creates_a_result_containing_the_expected_value() {
				Try<Double> result = Try.of(() -> 42.0);
				assertThat(result.value()).contains(42.0);
			}
			
			@Test @DisplayName("creates a result with no exception")
			void creates_a_result_with_no_exception() {
				Try<Double> result = Try.of(() -> 42.0);
				assertThat(result.exception()).isEmpty();
			}
		}
		
		@Nested @DisplayName("if the computation fails")
		class IfTheComputationFails {
		
			@Test @DisplayName("creates a Failure")
			void creates_a_Failure() {
				Try<Double> result = Try.of(() -> { throw new IllegalArgumentException(); });
				assertThat(result).isInstanceOf(Failure.class);
			}
			
			@Test @DisplayName("creates a result containing no value")
			void creates_a_result_containing_no_value() {
				Try<Double> result = Try.of(() -> { throw new IllegalArgumentException(); });
				assertThat(result.value()).isEmpty();
			}
			
			@Test @DisplayName("creates a result with the exception")
			void creates_a_result_with_no_exception() {
				Try<Double> result = Try.of(() -> { throw new IllegalArgumentException(); });
				assertThat(result.exception()).containsInstanceOf(IllegalArgumentException.class);
			}
		}
		
	}

}
