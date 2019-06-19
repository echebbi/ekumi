/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.adapter;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Stream;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeUnserializationException;
import fr.kazejiyu.ekumi.core.exceptions.DataTypeNotFoundException;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.core.scripting.exceptions.ScriptingLanguageNotFoundException;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.core.workflow.ScriptedActivity;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.specs.eds.Divergence;
import fr.kazejiyu.ekumi.specs.eds.EdsFactory;
import fr.kazejiyu.ekumi.specs.eds.ExternalTask;
import fr.kazejiyu.ekumi.specs.eds.Synchronization;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A WorkflowAdapter")
public class BasicWorkflowAdapterTest implements WithAssertions {
	
	@Mock
	private DataTypeFactory datatypes;
	
	@Mock
	private ScriptingLanguage language;
	
	@Mock
	private ScriptingLanguageFactory languages;
	
	private BasicWorkflowAdapter adapter;
	
	@BeforeEach
	void instantiate() {
		adapter = new BasicWorkflowAdapter(datatypes, languages);
		
		when (languages.get(any(String.class))) .thenAnswer(invocation -> {
			if ("my-valid-language-id".equals(invocation.getArgument(0))) {
				return language;
			}
			throw new ScriptingLanguageNotFoundException(invocation.getArgument(0).toString());
		});
		when (languages.find("my-valid-language-id")) .thenReturn(Optional.of(language));
	}
	
	@Test @DisplayName("can adapt an Activity")
	void can_adapt_an_Activity() {
		assertThat(adapter.canAdapt(EdsFactory.eINSTANCE.createActivity())).isTrue();
	}
	
	@ParameterizedTest 
	@MethodSource("unadaptableValues")
	@DisplayName("cannot adapt something that is not an Activity")
	void cannot_adapt_something_that_is_not_an_Activity(Object value) {
		assertThat(adapter.canAdapt(value)).isFalse();
	}
	
	@ParameterizedTest
	@MethodSource("unadaptableValues")
	@DisplayName("returns nothing when adapting an illegal value")
	void returns_nothing_when_adapting_an_unadaptable_value(Object value) {
		assertThat(adapter.adapt(value, datatypes, languages)).isEmpty();
	}
	
	@SuppressWarnings("unused")
	private static Stream<Arguments> unadaptableValues() {
		return Stream.of(
			Arguments.of(new Object[] { null }),
			Arguments.of("a string"),
			Arguments.of(12)
		);
	}
	
	@Nested @DisplayName("when instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("throws if DataTypeFactory is null")
		void throws_if_DataTypeFactory_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new BasicWorkflowAdapter(null, languages)
			);
		}
		
		@Test @DisplayName("throws if ScriptingLanguageFactory is null")
		void throws_if_ScriptingLanguageFactory_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new BasicWorkflowAdapter(datatypes, null)
			);
		}

	}
	
	@Nested @DisplayName("when adapting an Activity")
	class WhenAdaptingAnActivity {
		
		fr.kazejiyu.ekumi.specs.eds.Activity activity;
		
		@BeforeEach
		void instantiate() {			
			activity = EdsFactory.eINSTANCE.createActivity();
			activity.setStart(EdsFactory.eINSTANCE.createStart());
			activity.setName("My Activity");
			activity.setId("My Activity ID");
		}
		
		@Nested @DisplayName("that has no Start node")
		class ThatHasNoStartNode {
			
			@Test @DisplayName("returns null")
			void returns_null() {
				activity.setStart(null);
				assertThat(adapter.caseActivity(activity)).isNull();
			}
			
		}
		
		@Nested @DisplayName("that has no successors")
		class ThatHasNoSuccessors {
			
			@Test @DisplayName("creates an empty Sequence")
			void creates_an_empty_Sequence() {
				Activity adapted = adapter.caseActivity(activity);

				assertThat(adapted).isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				
				assertThat(seq.activities()).isEmpty();
			}
			
			@Test @DisplayName("returns a new Activity with the same ID and name")
			void returns_a_new_Activity_with_the_same_ID_and_name() {
				Activity adapted = adapter.caseActivity(activity);

				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(adapted.id()).as("has the same ID")
					  .isEqualTo(activity.getId());
				softly.assertThat(adapted.name()).as("has the same name")
					  .isEqualTo(activity.getName());
				
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that has successors")
		class ThatHasSuccessors {
			
			@BeforeEach
			void createSuccessors() {
				ExternalTask successor1 = EdsFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				successor1.setLanguageId("my-valid-language-id");
				ExternalTask successor2 = EdsFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				successor2.setLanguageId("my-valid-language-id");
				
				activity.getStart().getSuccessors().add(successor1);
				successor1.getSuccessors().add(successor2);
			}
			
			@Test @DisplayName("creates a sequence containing all these successors")
			void creates_a_sequence_containing_all_these_successors() {
				Activity adapted = adapter.caseActivity(activity);
				assertThat(adapted).isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				
				assertThat(seq.activities()).as("creates a sequence with the right length")
											   .size().isEqualTo(2);
				
				SoftAssertions softly = new SoftAssertions();
				
				Activity first = seq.activities().get(0);
				softly.assertThat(first).as("adapts the first successor")
					  .isInstanceOf(ScriptedActivity.class);
				
				Activity second = seq.activities().get(1);
				softly.assertThat(second).as("adapts the second successor")
					  .isInstanceOf(ScriptedActivity.class);
				
				softly.assertAll();
			}
			
			@Test @DisplayName("creates a sequence which activities are bound together")
			void creates_a_sequence_which_activities_are_bounded_together() {
				Activity adapted = adapter.adapt(activity, datatypes, languages).get();
				assertThat(adapted).isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				
				assertThat(seq.activities()).as("creates a sequence with the right length")
											   .size().isEqualTo(2);
				
				Activity first = seq.activities().get(0);
				Activity second = seq.activities().get(1);
				
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(first.predecessor()).as("sequence root has no predecessor").isEmpty();
				softly.assertThat(first.successor()).as("sequence root has second successor as successor").contains(second);
				softly.assertThat(second.predecessor()).as("second successor has sequence root as predecessor").contains(first);
				softly.assertThat(second.successor()).as("last element has no successor").isEmpty();
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that is bound to a divergence node")
		class ThatIsBoundToADivergenceNode {
			
			@BeforeEach
			void addDivergenceNode() {
				Divergence split = EdsFactory.eINSTANCE.createParallelSplit();
				activity.getStart().getSuccessors().add(split);
			}
			
			@Test @DisplayName("adapts the divergence as a sequence's successor")
			void adapts_the_divergence_as_a_sequence_successor() {
				Activity adapted = adapter.caseActivity(activity);
				assertThat(adapted).as("is a sequence").isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				assertThat(seq.successor()).containsInstanceOf(ParallelSplit.class);
			}
		}
		
	}
	
	@Nested @DisplayName("when adapting an ExternalTask")
	class WhenAdaptingAnExternalTask {
		
		private ExternalTask task;
		
		@BeforeEach
		void instantiate() {
			task = EdsFactory.eINSTANCE.createExternalTask();
			task.setId("My ExternalTask ID");
			task.setName("My ExternalTask Name");
			task.setScriptId("My script ID");
			task.setLanguageId("my-valid-language-id");
		}
		
		@Test @DisplayName("creates a similar ScriptedTask")
		void creates_a_similar_ScriptedTask() {
			Activity adapted = adapter.caseExternalTask(task);
			
			assertThat(adapted).isInstanceOf(ScriptedActivity.class);
			ScriptedActivity script = (ScriptedActivity) adapted;
			
			SoftAssertions softly = new SoftAssertions();
			softly.assertThat(script.id()).as("has the same ID")
				  .isEqualTo(task.getId());
			softly.assertThat(script.name()).as("has the same name")
				  .isEqualTo(task.getName());
//			softly.assertThat(script.getScriptPath()).as("has the same script ID")
//				  .isEqualTo(task.getScriptId());
			
			softly.assertAll();
		}
		
		@Nested @DisplayName("that has a valid ScriptingLanguage ID")
		class ThatHasAValidScriptingLanguageID {
			
			@BeforeEach
			void setup() {
				task.setLanguageId("my-valid-language-id");
			}
			
			@Test @DisplayName("creates a ScriptedTask with the corresponding ScriptingLanguage")
			void creates_a_ScriptedTask_with_the_corresponding_ScriptingLanguage() {
				Activity adapted = adapter.caseExternalTask(task);
				ScriptedActivity script = (ScriptedActivity) adapted;
				
				assertThat(script.language()).isEqualTo(language);
			}
		}
		
		@Nested @DisplayName("that does not have a valid ScriptingLanguage ID")
		class ThatDoesNotHaveAValidScriptingLanguageID {
			
			@Test @DisplayName("throws a ScriptingLanguageNotFoundException")
			void throws_a_ScriptingLanguageNotFoundException() {
				task.setLanguageId("not-a-valid-language-id");
				assertThrows(ScriptingLanguageNotFoundException.class, () -> adapter.caseExternalTask(task));
			}
		}
		
		@Nested @DisplayName("that has inputs")
		class ThatHasInputs {
			
			private fr.kazejiyu.ekumi.specs.eds.Variable input;
			private DataType<Double> datatype;

			@SuppressWarnings("unchecked")
			@BeforeEach
			void createInputs() {
				input = EdsFactory.eINSTANCE.createVariable();
				input.setName("Input 1");
				input.setTypeId("mocked-datatype");
				input.setValue("mocked-value");
				task.getInputs().add(input);
				
				datatype = Mockito.mock(DataType.class);
				when (datatypes.<Double>find("mocked-datatype")) .thenReturn(Optional.of(datatype));
				when (datatype.unserialize("mocked-value")) .thenReturn(5.0);
			}
			
			@Test @DisplayName("adapts the inputs")
			void adapts_the_inputs() {
				Activity adapted = adapter.caseExternalTask(task);
				
				assertThat(adapted.inputs()).size().isEqualTo(1);
				
				Input adaptedInput = adapted.input(input.getName());
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(adaptedInput.name()).isEqualTo(input.getName());
//				softly.assertThat(input.getOwner()).isEqualTo(adapted);
				softly.assertThat(adaptedInput.type()).isEqualTo(datatype);
				softly.assertThat(adaptedInput.value()).isEqualTo(5.0);
				softly.assertAll();
			}
			
			@Nested @DisplayName("which datatype is unknown")
			class WhichDatatypeIsUnknown {
				
				@BeforeEach
				void setInputDatatype() {
					input.setTypeId("idonotexist");
				}
				
				@Test @DisplayName("throws a DataTypeNotFoundException")
				void throws_a_DataTypeNotFoundException() {
					assertThrows(DataTypeNotFoundException.class, () -> adapter.caseExternalTask(task));
				}
				
			}
			
			@Nested @DisplayName("which value cannot be unserialize")
			class WhichValueCannotBeUnserialize {
				
				private final static double DEFAULT_VAL = 0d;
				
				@BeforeEach
				void makeValueUnserializable() {
					input.setValue("unserializable");
					when (datatype.unserialize("unserializable")) .thenThrow(DataTypeUnserializationException.class);
					when (datatype.defaultValue()) .thenReturn(DEFAULT_VAL);
				}
				
				@Test @DisplayName("adapt the input with datatype's default value")
				void adapt_the_input_with_datatype_default_value() {
					Activity adapted = adapter.caseExternalTask(task);
					Input adaptedInput = adapted.input(input.getName());
					
					assertThat(adaptedInput.value()).isEqualTo(DEFAULT_VAL);
				}
				
			}
			
		}
		
		@Nested @DisplayName("that has outputs")
		class ThatHasOutputs {
			
			private fr.kazejiyu.ekumi.specs.eds.Variable output;
			
			@Mock 
			private DataType<Double> datatype;

			@BeforeEach
			void createOutputs() {
				output = EdsFactory.eINSTANCE.createVariable();
				output.setName("Output 1");
				output.setTypeId("mocked-datatype");
				output.setValue("5.0");
				task.getOutputs().add(output);
				
				when (datatypes.<Double>find("mocked-datatype")) .thenReturn(Optional.of(datatype));
				
				when (datatype.unserialize(any())) .thenAnswer(invocation -> {
					try {
						if (invocation.getArgument(0) instanceof String) {
							return Double.parseDouble(invocation.getArgument(0));
						}
					} catch (Exception e) {
						// throws an unserialization exception
					}
					throw new DataTypeUnserializationException("" + invocation.getArgument(0));
				});
			}
			
			@Test @DisplayName("adapts the outputs")
			void adapts_the_outputs() {
				Activity adapted = adapter.caseExternalTask(task);
				
				assertThat(adapted.outputs()).size().isEqualTo(1);
				
				Output adaptedOutput = adapted.output(output.getName());
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(adaptedOutput.name()).isEqualTo(output.getName());
//				softly.assertThat(adaptedInput.getOwner()).isEqualTo(adapted);
				softly.assertThat(adaptedOutput.type()).isEqualTo(datatype);
				softly.assertThat(adaptedOutput.value()).isEqualTo(5.0);
				softly.assertAll();
			}
			
			@Nested @DisplayName("which datatype is unknown")
			class WhichDatatypeIsUnknown {
				
				@BeforeEach
				void setOutputDatatype() {
					output.setTypeId("idonotexist");
				}
				
				@Test @DisplayName("throws a DataTypeNotFoundException")
				void throws_a_DataTypeNotFoundException() {
					assertThrows(DataTypeNotFoundException.class, () -> adapter.caseExternalTask(task));
				}
				
			}
			
			@Nested @DisplayName("which value cannot be unserialize")
			class WhichValueCannotBeUnserialize {
				
				private final static double DEFAULT_VAL = 0d;
				
				@BeforeEach
				void makeValueUnserializable() {
					output.setValue("unserializable");
					when (datatype.defaultValue()) .thenReturn(DEFAULT_VAL);
				}
				
				@Test @DisplayName("throws a DataNotFoundException")
				void throws_a_DataNotFoundException() {
					Activity adapted = adapter.caseExternalTask(task);
					Output adaptedOutput = adapted.output(output.getName());
					
					assertThat(adaptedOutput.value()).isEqualTo(DEFAULT_VAL);
				}
				
			}
			
		}
		
	}
	
	@Nested @DisplayName("when adapting a Synchronization")
	class WhenAdaptingASynchronization {
		
		Synchronization sync;
		
		@BeforeEach
		void createSynchronization() {
			sync = EdsFactory.eINSTANCE.createSynchronization();
		}
		
		@Nested @DisplayName("that has no successor")
		class ThatHasNoSuccessor {

			@Test @DisplayName("returns null")
			void returns_null() {
				assertThat(adapter.caseSynchronization(sync)).isNull();
			}
			
		}
		
		@Nested @DisplayName("that has a successor")
		class ThatHasASuccessor {
			
			@BeforeEach
			void addSuccessor() {
				fr.kazejiyu.ekumi.specs.eds.Activity successor = EdsFactory.eINSTANCE.createActivity();
				successor.setStart(EdsFactory.eINSTANCE.createStart());
				
				sync.getSuccessors().add(successor);
			}
			
			@Test @DisplayName("adapts the successor")
			void adapts_the_successor() {
				Activity adapted = adapter.caseSynchronization(sync);
				assertThat(adapted).isInstanceOf(Sequence.class);
			}
			
		}
		
	}

	@Nested @DisplayName("when adapting a ParallelSplit")
	class WhenAdaptingAParallelSplit {
		
		fr.kazejiyu.ekumi.specs.eds.ParallelSplit splitSpec;
		
		@BeforeEach
		void instantiate() {			
			splitSpec = EdsFactory.eINSTANCE.createParallelSplit();
		}
		
		@Nested @DisplayName("that has no successors")
		class ThatHasNoSuccessors {
			
			@Test @DisplayName("creates an empty ParallelSplit")
			void creates_an_empty_ParallelSplit() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.branches()).isEmpty();
			}
		}
		
		@Nested @DisplayName("that has successors")
		class ThatHasSuccessors {
			
			@BeforeEach
			void createSuccessors() {
				ExternalTask successor1 = EdsFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				successor1.setLanguageId("my-valid-language-id");
				ExternalTask successor2 = EdsFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				successor2.setLanguageId("my-valid-language-id");
				
				splitSpec.getSuccessors().add(successor1);
				splitSpec.getSuccessors().add(successor2);
			}
			
			@Test @DisplayName("creates a split with one branch per successor")
			void creates_a_split_with_one_branch_per_successor() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.branches()).as("creates a split with the right amount of branches")
											   .size().isEqualTo(2);
			}
			
			@Test @DisplayName("creates a split using sequences as branches")
			void creates_a_split_using_sequences_as_branches() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.branches()).allMatch(Sequence.class::isInstance);
			}
			
			@Test @DisplayName("creates a split using sequences containing successors")
			void creates_a_split_using_sequences_containing_successors() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				SoftAssertions softly = new SoftAssertions();
				for (Activity branch : split.branches()) {
					Activity activity = ((Sequence) branch).activities().get(0);
					softly.assertThat(activity).isInstanceOf(ScriptedActivity.class);
				}
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that is bound to a Synchronization node")
		class ThatIsBoundToASynchronizationNode {
			
			private ExternalTask syncSuccessor;

			@BeforeEach
			void addSynchronizationNode() {
				ExternalTask successor1 = EdsFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				successor1.setLanguageId("my-valid-language-id");
				ExternalTask successor2 = EdsFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				successor2.setLanguageId("my-valid-language-id");
				
				splitSpec.getSuccessors().add(successor1);
				splitSpec.getSuccessors().add(successor2);
				
				Synchronization sync = EdsFactory.eINSTANCE.createSynchronization();
				successor1.getSuccessors().add(sync);
				successor2.getSuccessors().add(EdsFactory.eINSTANCE.createExternalTask());
				((ExternalTask) successor2.getSuccessors().get(0)).setLanguageId("my-valid-language-id");
				successor2.getSuccessors().get(0).getSuccessors().add(sync);
				
				syncSuccessor = EdsFactory.eINSTANCE.createExternalTask();
				syncSuccessor.setId("Sync Successor");
				syncSuccessor.setLanguageId("my-valid-language-id");
				sync.getSuccessors().add(syncSuccessor);
			}
			
			@Test @DisplayName("adapts the synchronization as a split's successor")
			void adapts_the_synchronization_as_a_split_successor() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).as("is a ParallelSplit").isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				assertThat(split.successor()).containsInstanceOf(ScriptedActivity.class);
				assertThat(split.successor().get().id()).isEqualTo(syncSuccessor.getId());
			}
		}
	
	}
}
