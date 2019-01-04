package fr.kazejiyu.ekumi.core.execution;

import java.util.Objects;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.exceptions.VariableNotFoundException;
import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

/**
 * Test the behaviour of {@link BasicContext} instances.
 */
@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicContext")
public class BasicContextTest implements WithAssertions {
	
	/** The instance under test */
	private BasicContext context;
	
	@Mock Events events;
	@Mock ExecutionStatus status;
	
	@BeforeEach
	void setup() {
		context = new BasicContext(events, status);
	}
	
	@Nested @DisplayName("when instantiated with illegal arguments")
	class WhenInstanciatedWithIllegalArguments {

		@Test @DisplayName("throw a NullPointerException when status is null")
		void throws_a_NullPointerException_when_status_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new BasicContext(events, null)
			);
		}

		@Test @DisplayName("throw a NullPointerException when events is null")
		void throws_a_NullPointerException_when_events_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new BasicContext(null, status)
			);
		}

		@Test @DisplayName("throw a NullPointerException when events and status are null")
		void throws_a_NullPointerException_when_events_and_status_are_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new BasicContext(null, null)
			);
		}
		
	}
	
	@Nested @DisplayName("just after instantiation")
	class JustAfterInstantiation {
	
		@Test @DisplayName("knows its events")
		void knows_its_events() {
			assertThat(context.events()).isSameAs(events);
		}
		
		@Test @DisplayName("knows its execution status")
		void knows_its_execution_status() {
			assertThat(context.execution()).isSameAs(status);
		}
		
		@Test @DisplayName("does not have any variable") 
		void does_not_have_any_variable() {
			assertThat(context.getVariables()).isEmpty();
		}
		
	}
	
	@Nested @DisplayName("when asked for an absent variable") 
	class WhenAskedForAnAbsentVariable {
		
		@ParameterizedTest
		@ValueSource(strings = {"", "name", "name with space", "0"})
		@DisplayName("does not contain it")
		void does_not_contain_it(String name) {
			assertThat(context.contains(name)).isFalse();
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"", "name", "name with space", "0"})
		@DisplayName("cannot find it")
		void cannot_find_it(String name) {
			assertThat(context.find(name)).isEmpty();
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"", "name", "name with space", "0"})
		@DisplayName("throws when forced to get it")
		void throws_when_forced_to_get_it(String name) {
			assertThatExceptionOfType(VariableNotFoundException.class).isThrownBy(() -> 
				context.get(name)
			);
		}
		
	}
	
	@Nested @DisplayName("when setting a variable")
	class WhenSettingAVariable {
		
		@Test @DisplayName("throws if name is null")
		void throws_if_name_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				context.set(null, "value")
			);
		}
		
		@Nested @DisplayName("that does not exist yet")
		class ThatDoesNotExistYet {
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("creates a new variable")
			void creates_a_new_variable(String name, Object value) {
				context.set(name, value);
				assertThat(context.getVariables()).hasSize(1);
			}
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("creates a new variable with expected name")
			void creates_a_new_variable_with_expected_name(String name, Object value) {
				context.set(name, value);
				assertThat(context.getVariables().get(0))
					.matches(var -> Objects.equals(name, var.getName()));
			}
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("creates a new variable with expected value")
			void creates_a_new_variable_with_expected_value(String name, Object value) {
				context.set(name, value);
				assertThat(context.getVariables().get(0))
					.matches(var -> Objects.equals(value, var.getValue()));
			}
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("contains the variable")
			void contains_the_variable(String name, Object value) {
				context.set(name, value);
				assertThat(context.contains(name)).isTrue();
			}
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("can get the variable")
			void can_get_the_variable(String name, Object value) {
				context.set(name, value);
				assertThat(context.get(name)).isNotNull();
			}
			
			@ParameterizedTest
			@CsvSource({"'', 12", "name, value"})
			@DisplayName("can find the variable")
			void can_find_the_variable(String name, Object value) {
				context.set(name, value);
				assertThat(context.find(name)).isNotEmpty();
			}
			
		}
		
		@Nested @DisplayName("that already exists")
		class ThatAlreadyExists {
			
			private String name;
			private Object value;
			private Variable variable;
			
			@BeforeEach
			void initWithVariable() {
				context = new BasicContext(events, status);
				
				name = "name";
				value = 42.0;
				
				context.set(name, value);
				variable = context.get(name);
			}
			
			@Test @DisplayName("changes the value of the variable")
			void changes_the_value_of_the_variable() {
				Object newValue = "newValue";
				context.set(name, newValue);
				
				assertThat(variable.getValue()).isEqualTo(newValue);
			}
			
			@Test @DisplayName("does not create a new variable") 
			void does_not_create_a_new_variable() {
				Object newValue = "newValue";
				context.set(name, newValue);
				
				assertThat(context.getVariables()).containsExactly(variable);
			}
			
		}
		
	}
	
	@Nested @DisplayName("when unsetting a variable")
	class WhenUnsettingAVariable {
	
		@Test @DisplayName("does nothing if the variable does not exist")
		void does_nothing_when_unsetting_a_non_existing_variable() {
			context.unset("name");
		}
	
		@Test @DisplayName("removes it from its variables")
		void removes_it_from_its_variables() {
			context.set("name", "value");
			context.unset("name");
			assertThat(context.getVariables()).isEmpty();
		}
	
	}

}
