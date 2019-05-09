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

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.workflow.exceptions.VariableAlreadyExistException;
import fr.kazejiyu.ekumi.datatypes.DoubleType;

@DisplayName("A BasicOutputs")
public class BasicOutputsTest implements WithAssertions {
	
	private DoubleType doubleType;
	
	private BasicOutputs outputs;
	
	@BeforeEach
	void createoutputs() {
		outputs = new BasicOutputs();
		doubleType = new DoubleType();
	}
	
	@Nested @DisplayName("when creating a new output")
	class WhenCreatingANewoutput {
		
		@Nested @DisplayName("that does not exist")
		class ThatDoesNotExist {
			
			@Test @DisplayName("can create the output")
			void can_create_the_output() {
				outputs.create("a", doubleType);
				assertThat(outputs.contains("a")).isTrue();
			}
			
			@Test @DisplayName("can initialize the output with its type default value")
			void can_initialize_the_output_with_its_type_default_value() {
				outputs.create("a", doubleType);
				assertThat(outputs.get("a").value()).isEqualTo(doubleType.defaultValue());
			}
			
			@Nested @DisplayName("when checking for existence")
			class WhenCheckingForExistence {
				
				@Test @DisplayName("can create the output")
				void does_not_throw() {
					outputs.createIfAbsent("a", new DoubleType());
					assertThat(outputs.contains("a")).isTrue();
				}
				
				@Test @DisplayName("can initialize the output with its type default value")
				void can_initialize_the_output_with_its_type_default_value() {
					outputs.createIfAbsent("a", doubleType);
					assertThat(outputs.get("a").value()).isEqualTo(doubleType.defaultValue());
				}
				
				@Test @DisplayName("can initialize the output with a specified value")
				void can_initialize_the_output_with_a_specified_value() {
					outputs.createIfAbsent("a", doubleType, 42.0);
					assertThat(outputs.get("a").value()).isEqualTo(42.0);
				}
				
			}
			
		}
		
		@Nested @DisplayName("that already exists")
		class ThatAlreadyExists {
			
			@Test @DisplayName("throws a VariableAlreadyExistException")
			void throws_a_VariableAlreadyExistException() {
				outputs.create("a", new DoubleType());

				assertThrows(
					VariableAlreadyExistException.class, 
					() -> outputs.create("a", new DoubleType())
				);
			}
			
			@Nested @DisplayName("when checking for existence")
			class WhenCheckingForExistence {
				
				@Test @DisplayName("does not throw")
				void does_not_throw() {
					outputs.create("a", new DoubleType());
					assertThatCode(() -> outputs.createIfAbsent("a", new DoubleType()))
						.doesNotThrowAnyException();
				}
				
				@Test @DisplayName("does not change existing output's value")
				void does_not_change_existing_output_value() {
					outputs.create("a", new DoubleType(), 53.0);
					outputs.createIfAbsent("a", new DoubleType(), 12.0);
					
					assertThat(outputs.get("a").value()).isEqualTo(53.0);
				}
				
			}
			
		}
		
	}

}
