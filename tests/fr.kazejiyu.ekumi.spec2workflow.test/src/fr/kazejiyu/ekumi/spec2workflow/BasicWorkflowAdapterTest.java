/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.spec2workflow;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.model.datatypes.exceptions.DataTypeUnserializationException;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.model.spec.Divergence;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.Synchronization;
import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A WorkflowAdapter")
public class BasicWorkflowAdapterTest implements WithAssertions {
	
	@Mock
	private DataTypeFactory datatypes;
	
	@Mock
	private ScriptingLanguageFactory languages;
	
	private BasicWorkflowAdapter adapter;
	
	@BeforeEach
	void instantiate() {
		adapter = new BasicWorkflowAdapter(datatypes, languages);
	}
	
	@Test @DisplayName("can adapt an Activity")
	void can_adapt_an_Activity() {
		assertThat(adapter.canAdapt(SpecFactory.eINSTANCE.createActivity())).isTrue();
	}
	
	@Test @DisplayName("cannot adapt something that is not an Activity")
	void cannot_adapt_something_that_is_not_an_Activity() {
		assertThat(adapter.canAdapt("not an activity")).isFalse();
	}
	
	@Test @DisplayName("cannot adapt a null object")
	void cannot_adapt_a_null_object() {
		assertThat(adapter.adapt(null, datatypes, languages)).isEmpty();
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
		
		fr.kazejiyu.ekumi.model.spec.Activity activity;
		
		@BeforeEach
		void instantiate() {			
			activity = SpecFactory.eINSTANCE.createActivity();
			activity.setStart(SpecFactory.eINSTANCE.createStart());
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
				
				assertThat(seq.getActivities()).isEmpty();
			}
			
			@Test @DisplayName("returns a new Activity with the same ID and name")
			void returns_a_new_Activity_with_the_same_ID_and_name() {
				Activity adapted = adapter.caseActivity(activity);

				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(adapted.getId()).as("has the same ID")
					  .isEqualTo(activity.getId());
				softly.assertThat(adapted.getName()).as("has the same name")
					  .isEqualTo(activity.getName());
				
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that has successors")
		class ThatHasSuccessors {
			
			@BeforeEach
			void createSuccessors() {
				ExternalTask successor1 = SpecFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				ExternalTask successor2 = SpecFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				
				activity.getStart().getSuccessors().add(successor1);
				successor1.getSuccessors().add(successor2);
			}
			
			@Test @DisplayName("creates a sequence containing all these successors")
			void creates_a_sequence_containing_all_these_successors() {
				Activity adapted = adapter.caseActivity(activity);
				assertThat(adapted).isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				
				assertThat(seq.getActivities()).as("creates a sequence with the right length")
											   .size().isEqualTo(2);
				
				SoftAssertions softly = new SoftAssertions();
				
				Activity first = seq.getActivities().get(0);
				softly.assertThat(first).as("adapts the first successor")
					  .isInstanceOf(ScriptedTask.class);
				
				Activity second = seq.getActivities().get(1);
				softly.assertThat(second).as("adapts the second successor")
					  .isInstanceOf(ScriptedTask.class);
				
				softly.assertAll();
			}
			
			@Test @DisplayName("creates a sequence which activities are bounded together")
			void creates_a_sequence_which_activities_are_bounded_together() {
				Activity adapted = adapter.adapt(activity, datatypes, languages).get();
				assertThat(adapted).isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				
				assertThat(seq.getActivities()).as("creates a sequence with the right length")
											   .size().isEqualTo(2);
				
				Activity first = seq.getActivities().get(0);
				Activity second = seq.getActivities().get(1);
				
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(first.getPredecessor()).as("sequence root has no predecessor")
					  .isNull();
				softly.assertThat(first.getSuccessor()).as("sequence root has second successor as successor")
					  .isEqualTo(second);
				softly.assertThat(second.getPredecessor()).as("second successor has sequence root as predecessor")
					  .isEqualTo(first);
				softly.assertThat(second.getSuccessor()).as("last element has no successor")
					  .isNull();
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that is bound to a divergence node")
		class ThatIsBoundToADivergenceNode {
			
			@BeforeEach
			void addDivergenceNode() {
				Divergence split = SpecFactory.eINSTANCE.createParallelSplit();
				activity.getStart().getSuccessors().add(split);
			}
			
			@Test @DisplayName("adapts the divergence as a sequence's successor")
			void adapts_the_divergence_as_a_sequence_successor() {
				Activity adapted = adapter.caseActivity(activity);
				assertThat(adapted).as("is a sequence").isInstanceOf(Sequence.class);
				
				Sequence seq = (Sequence) adapted;
				assertThat(seq.getSuccessor()).isInstanceOf(ParallelSplit.class);
			}
		}
		
	}
	
	@Nested @DisplayName("when adapting an ExternalTask")
	class WhenAdaptingAnExternalTask {
		
		private ExternalTask task;
		
		@BeforeEach
		void instantiate() {
			task = SpecFactory.eINSTANCE.createExternalTask();
			task.setId("My ExternalTask ID");
			task.setName("My ExternalTask Name");
			task.setScriptId("My script ID");
		}
		
		@Test @DisplayName("creates a similar ScriptedTask")
		void creates_a_similar_ScriptedTask() {
			Activity adapted = adapter.caseExternalTask(task);
			
			assertThat(adapted).isInstanceOf(ScriptedTask.class);
			ScriptedTask script = (ScriptedTask) adapted;
			
			SoftAssertions softly = new SoftAssertions();
			softly.assertThat(script.getId()).as("has the same ID")
				  .isEqualTo(task.getId());
			softly.assertThat(script.getName()).as("has the same name")
				  .isEqualTo(task.getName());
			softly.assertThat(script.getScriptPath()).as("has the same script ID")
				  .isEqualTo(task.getScriptId());
			
			softly.assertAll();
		}
		
		@Nested @DisplayName("that has a valid ScriptingLanguage ID")
		class ThatHasAValidScriptingLanguageID {
			
			@Mock ScriptingLanguage language;
			
			@BeforeEach
			void setup() {
				task.setLanguageId("my-valid-language-id");
				when(languages.find("my-valid-language-id")).thenReturn(Optional.of(language));
			}
			
			@Test @DisplayName("creates a ScriptedTask with the corresponding ScriptingLanguage")
			void creates_a_ScriptedTask_with_the_corresponding_ScriptingLanguage() {
				Activity adapted = adapter.caseExternalTask(task);
				ScriptedTask script = (ScriptedTask) adapted;
				
				assertThat(script.getLanguage()).isEqualTo(language);
			}
		}
		
		@Nested @DisplayName("that does not have a valid ScriptingLanguage ID")
		class ThatDoesNotHaveAValidScriptingLanguageID {
			
			@Test @DisplayName("creates a ScriptedTask without any ScriptingLanguage")
			void creates_a_ScriptedTask_without_any__ScriptingLanguage() {
				Activity adapted = adapter.caseExternalTask(task);
				ScriptedTask script = (ScriptedTask) adapted;
				
				assertThat(script.getLanguage()).isNull();
			}
		}
		
		@Nested @DisplayName("that has inputs")
		class ThatHasInputs {
			
			private fr.kazejiyu.ekumi.model.spec.Variable input;
			private DataType<Double> datatype;

			@SuppressWarnings("unchecked")
			@BeforeEach
			void createInputs() {
				input = SpecFactory.eINSTANCE.createVariable();
				input.setName("Input 1");
				input.setTypeId("mocked-datatype");
				input.setValue("mocked-value");
				task.getInputs().add(input); 
				
				datatype = Mockito.mock(DataType.class);
				when (datatypes.find("mocked-datatype")) .thenReturn(Optional.of(datatype));
				when (datatype.unserialize("mocked-value")) .thenReturn(5.0);
			}
			
			@Test @DisplayName("adapts the inputs")
			void adapts_the_inputs() {
				Activity adapted = adapter.caseExternalTask(task);
				
				assertThat(adapted.getInputs()).size().isEqualTo(1);
				
				Variable variable = adapted.getInputs().get(0);
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(variable.getName()).isEqualTo(input.getName());
				softly.assertThat(variable.getOwner()).isEqualTo(adapted);
				softly.assertThat(variable.getType()).isEqualTo(datatype);
				softly.assertThat(variable.getValue()).isEqualTo(5.0);
				softly.assertAll();
			}
			
			@Nested @DisplayName("which datatype is unknown")
			class WhichDatatypeIsUnknown {
				
				@BeforeEach
				void setInputDatatype() {
					input.setTypeId("idonotexist");
				}
				
				@Test @DisplayName("adapt the input with a null value")
				void adapt_the_input_with_a_null_value() {
					Activity adapted = adapter.caseExternalTask(task);
					Variable adaptedInput = adapted.getInputs().get(0);
					
					assertThat(adaptedInput.getValue()).isNull();
				}
				
			}
			
			@Nested @DisplayName("which value cannot be unserialize")
			class WhichValueCannotBeUnserialize {
				
				private final static double DEFAULT_VAL = 0d;
				
				@BeforeEach
				void makeValueUnserializable() {
					input.setValue("unserializable");
					when (datatype.unserialize("unserializable")) .thenThrow(DataTypeUnserializationException.class);
					when (datatype.getDefaultValue()) .thenReturn(DEFAULT_VAL);
				}
				
				@Test @DisplayName("adapt the input with datatype's default value")
				void adapt_the_input_with_datatype_default_value() {
					Activity adapted = adapter.caseExternalTask(task);
					Variable adaptedInput = adapted.getInputs().get(0);
					
					assertThat(adaptedInput.getValue()).isEqualTo(DEFAULT_VAL);
				}
				
			}
			
		}
		
		@Nested @DisplayName("that has outputs")
		class ThatHasOutputs {
			
			private fr.kazejiyu.ekumi.model.spec.Variable output;
			
			@Mock 
			private DataType<Double> datatype;

			@BeforeEach
			void createOutputs() {
				output = SpecFactory.eINSTANCE.createVariable();
				output.setName("Output 1");
				output.setTypeId("mocked-datatype");
				output.setValue("mocked-value");
				task.getOutputs().add(output);
				
				when (datatypes.find("mocked-datatype")) .thenReturn(Optional.of(datatype));
				when (datatype.unserialize("mocked-value")) .thenReturn(5.0);
			}
			
			@Test @DisplayName("adapts the outputs")
			void adapts_the_outputs() {
				Activity adapted = adapter.caseExternalTask(task);
				
				assertThat(adapted.getOutputs()).size().isEqualTo(1);
				
				Variable variable = adapted.getOutputs().get(0);
				
				SoftAssertions softly = new SoftAssertions();
				softly.assertThat(variable.getName()).isEqualTo(output.getName());
				softly.assertThat(variable.getOwner()).isEqualTo(adapted);
				softly.assertThat(variable.getType()).isEqualTo(datatype);
				softly.assertThat(variable.getValue()).isEqualTo(5.0);
				softly.assertAll();
			}
			
			@Nested @DisplayName("which datatype is unknown")
			class WhichDatatypeIsUnknown {
				
				@BeforeEach
				void setOutputDatatype() {
					output.setTypeId("idonotexist");
				}
				
				@Test @DisplayName("adapt the output with a null value")
				void adapt_the_output_with_a_null_value() {
					Activity adapted = adapter.caseExternalTask(task);
					Variable adaptedOutput = adapted.getOutputs().get(0);
					
					assertThat(adaptedOutput.getValue()).isNull();
				}
				
			}
			
			@Nested @DisplayName("which value cannot be unserialize")
			class WhichValueCannotBeUnserialize {
				
				private final static double DEFAULT_VAL = 0d;
				
				@BeforeEach
				void makeValueUnserializable() {
					output.setValue("unserializable");
					when (datatype.unserialize("unserializable")) .thenThrow(DataTypeUnserializationException.class);
					when (datatype.getDefaultValue()) .thenReturn(DEFAULT_VAL);
				}
				
				@Test @DisplayName("adapt the outputs with datatype's default value")
				void adapt_the_outputs_with_datatype_default_value() {
					Activity adapted = adapter.caseExternalTask(task);
					Variable adaptedOutput = adapted.getOutputs().get(0);
					
					assertThat(adaptedOutput.getValue()).isEqualTo(DEFAULT_VAL);
				}
				
			}
			
		}
		
	}
	
	@Nested @DisplayName("when adapting a Synchronization")
	class WhenAdaptingASynchronization {
		
		Synchronization sync;
		
		@BeforeEach
		void createSynchronization() {
			sync = SpecFactory.eINSTANCE.createSynchronization();
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
				fr.kazejiyu.ekumi.model.spec.Activity successor = SpecFactory.eINSTANCE.createActivity();
				successor.setStart(SpecFactory.eINSTANCE.createStart());
				
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
		
		fr.kazejiyu.ekumi.model.spec.ParallelSplit splitSpec;
		
		@BeforeEach
		void instantiate() {			
			splitSpec = SpecFactory.eINSTANCE.createParallelSplit();
		}
		
		@Nested @DisplayName("that has no successors")
		class ThatHasNoSuccessors {
			
			@Test @DisplayName("creates an empty ParallelSplit")
			void creates_an_empty_ParallelSplit() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.getBranches()).isEmpty();
			}
		}
		
		@Nested @DisplayName("that has successors")
		class ThatHasSuccessors {
			
			@BeforeEach
			void createSuccessors() {
				ExternalTask successor1 = SpecFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				ExternalTask successor2 = SpecFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				
				splitSpec.getSuccessors().add(successor1);
				splitSpec.getSuccessors().add(successor2);
			}
			
			@Test @DisplayName("creates a split with one branch per successor")
			void creates_a_split_with_one_branch_per_successor() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.getBranches()).as("creates a split with the right amount of branches")
											   .size().isEqualTo(2);
			}
			
			@Test @DisplayName("creates a split using sequences as branches")
			void creates_a_split_using_sequences_as_branches() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				assertThat(split.getBranches()).allMatch(Sequence.class::isInstance);
			}
			
			@Test @DisplayName("creates a split using sequences containing successors")
			void creates_a_split_using_sequences_containing_successors() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				
				SoftAssertions softly = new SoftAssertions();
				for (Activity branch : split.getBranches()) {
					Activity activity = ((Sequence) branch).getActivities().get(0);
					softly.assertThat(activity).isInstanceOf(ScriptedTask.class);
				}
				softly.assertAll();
			}
		}
		
		@Nested @DisplayName("that is bound to a Synchronization node")
		class ThatIsBoundToASynchronizationNode {
			
			private ExternalTask syncSuccessor;

			@BeforeEach
			void addSynchronizationNode() {
				ExternalTask successor1 = SpecFactory.eINSTANCE.createExternalTask();
				successor1.setId("Successor 1");
				ExternalTask successor2 = SpecFactory.eINSTANCE.createExternalTask();
				successor2.setId("Successor 2");
				
				splitSpec.getSuccessors().add(successor1);
				splitSpec.getSuccessors().add(successor2);
				
				Synchronization sync = SpecFactory.eINSTANCE.createSynchronization();
				successor1.getSuccessors().add(sync);
				successor2.getSuccessors().add(SpecFactory.eINSTANCE.createExternalTask());
				successor2.getSuccessors().get(0).getSuccessors().add(sync);
				
				syncSuccessor = SpecFactory.eINSTANCE.createExternalTask();
				syncSuccessor.setId("Sync Successor");
				sync.getSuccessors().add(syncSuccessor);
			}
			
			@Test @DisplayName("adapts the synchronization as a split's successor")
			void adapts_the_synchronization_as_a_split_successor() {
				Activity adapted = adapter.caseParallelSplit(splitSpec);
				assertThat(adapted).as("is a ParallelSplit").isInstanceOf(ParallelSplit.class);
				
				ParallelSplit split = (ParallelSplit) adapted;
				assertThat(split.getSuccessor()).isInstanceOf(ScriptedTask.class);
				assertThat(split.getSuccessor().getId()).isEqualTo(syncSuccessor.getId());
			}
		}
	
	}
}
