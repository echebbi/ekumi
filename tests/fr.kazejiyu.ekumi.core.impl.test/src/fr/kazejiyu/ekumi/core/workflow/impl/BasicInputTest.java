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

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.workflow.Data;
import fr.kazejiyu.ekumi.core.workflow.exceptions.IncompatibleDataTypesException;
import fr.kazejiyu.ekumi.datatypes.DoubleType;
import fr.kazejiyu.ekumi.datatypes.StringType;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicInput")
public class BasicInputTest implements WithAssertions {
	
	private BasicInput input;
	
	@Nested @DisplayName("when instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("throws if name is null")
		void throws_if_name_is_null(@Mock DataType<?> type) {
			assertThatNullPointerException().isThrownBy(() -> 
				new BasicInput(null, type)
			);
		}
		
		@Test @DisplayName("throws if name is empty")
		void throws_if_name_is_empty(@Mock DataType<?> type) {
			assertThatIllegalArgumentException().isThrownBy(() -> 
				new BasicInput("", type)
			);
		}
		
		@Test @DisplayName("throws if type is null")
		void throws_if_type_is_null() {
			assertThatNullPointerException().isThrownBy(() -> 
				new BasicInput("name", null)
			);
		}
		
		@Test @DisplayName("throws if the value is not handled by the type")
		void throws_if_the_value_is_not_handled_by_the_type(@Mock DataType<?> type) {
			doThrow (IllegalArgumentException.class) .when (type).assertHandles(any());
			
			assertThatIllegalArgumentException().isThrownBy(() -> 
				new BasicInput("name", type, "")
			);
		}
		
	}
	
	@Nested @DisplayName("when not bound to another data")
	class WhenNotBoundToAnotherData {
		
		@BeforeEach
		void createInput() {
			input = new BasicInput("name", new DoubleType(), 3.0);
		}
		
		@Test @DisplayName("does nothing when resolved")
		void does_nothing_when_resolved() {
			input.resolve();
			assertThat(input.value()).isEqualTo(3.0);
		}
		
		@Test @DisplayName("does nothing when unbound")
		void does_nothing_when_unbound() {
			input.unbind();
			assertThat(input.value()).isEqualTo(3.0);
		}
		
		@Test @DisplayName("has no binding")
		void has_no_binding() {
			assertThat(input.binding()).isEmpty();
		}
	}
	
	@Nested @DisplayName("when bound to another data")
	class WhenBoundToAnotherData {
		
		private DoubleType doubleType;
		private Data output;
		
		@BeforeEach
		void createBinding() {
			doubleType = new DoubleType();
			input = new BasicInput("name", doubleType);
			output = new BasicInput("name", doubleType, 5.0);
			
			input.bind(output);
		}
		
		@Test @DisplayName("resolves to the other data's value")
		void resolves_to_the_other_data_value() {
			input.resolve();
			assertThat(input.value()).isEqualTo(output.value());
		}
		
		@Test @DisplayName("throws if the type of the other data is not compatible with its own")
		void throws_if_the_type_of_the_other_data_is_not_compatible() {
			Data uncompatible = new BasicInput("name", new StringType());
			
			assertThatExceptionOfType(IncompatibleDataTypesException.class).isThrownBy(() -> 
				input.bind(uncompatible)
			);
		}
		
		@Test @DisplayName("throws if this == other data")
		void throws_if_bound_with_itself() {
			assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> 
				input.bind(input)
			);
		}
		
		@Test @DisplayName("knows its binding")
		void knows_its_binding() {
			assertThat(input.binding()).containsSame(output);
		}
		
		@Nested @DisplayName("then unbound")
		class ThenUnbound {
			
			@BeforeEach
			void unbind() {
				input.unbind();
			}
			
			@Test @DisplayName("does nothing when resolved")
			void does_nothing_when_resolved() {
				input.resolve();
				assertThat(input.value()).isEqualTo(doubleType.defaultValue());
			}
			
			@Test @DisplayName("has no binding anymore")
			void has_no_binding_anymore() {
				assertThat(input.binding()).isEmpty();
			}
		}
		
	}

}
