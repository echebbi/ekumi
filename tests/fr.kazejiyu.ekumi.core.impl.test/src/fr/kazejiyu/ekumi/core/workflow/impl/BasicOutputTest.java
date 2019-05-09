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
import fr.kazejiyu.ekumi.datatypes.DoubleType;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicOutput")
public class BasicOutputTest implements WithAssertions {
	
	private BasicOutput output;
	
	@Nested @DisplayName("when instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("throws if name is null")
		void throws_if_name_is_null(@Mock DataType<?> type) {
			assertThatNullPointerException().isThrownBy(() -> 
				new BasicOutput(null, type)
			);
		}
		
		@Test @DisplayName("throws if name is empty")
		void throws_if_name_is_empty(@Mock DataType<?> type) {
			assertThatIllegalArgumentException().isThrownBy(() -> 
				new BasicOutput("", type)
			);
		}
		
		@Test @DisplayName("throws if type is null")
		void throws_if_type_is_null() {
			assertThatNullPointerException().isThrownBy(() -> 
				new BasicOutput("name", null)
			);
		}
		
		@Test @DisplayName("throws if the value is not handled by the type")
		void throws_if_the_value_is_not_handled_by_the_type(@Mock DataType<?> type) {
			doThrow (IllegalArgumentException.class) .when (type).assertHandles(any());
			
			assertThatIllegalArgumentException().isThrownBy(() -> 
				new BasicOutput("name", type, "")
			);
		}
		
	}
	
	@Nested @DisplayName("when setting its value")
	class WhenSettingItsValue {
		
		@BeforeEach
		void createOutput() {
			output = new BasicOutput("name", new DoubleType());
		}
		
		@Test @DisplayName("throws if its type does not handle the new value")
		void throws_if_its_type_does_not_handle_the_new_value() {
			assertThatIllegalArgumentException().isThrownBy(() ->
				output.set("not a double")
			);
		}
		
		@Test @DisplayName("change its value")
		void change_its_value() {
			output.set(42.0);
			assertThat(output.value()).isEqualTo(42.0);
		}
		
	}

}
