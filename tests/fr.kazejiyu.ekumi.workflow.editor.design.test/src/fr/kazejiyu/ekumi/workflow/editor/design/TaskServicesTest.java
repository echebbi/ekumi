package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.EdgeTarget;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.MultiChoice;
import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.ParallelSplit;
import fr.kazejiyu.ekumi.model.spec.SimpleMerge;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.Start;
import fr.kazejiyu.ekumi.model.spec.Synchronization;
import fr.kazejiyu.ekumi.model.spec.Task;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A TaskServices")
public class TaskServicesTest implements WithAssertions {

	// Object to test
	TaskServices services;
	
	@BeforeEach
	void setup() {
		services = new TaskServices();
	}
	
	@ParameterizedTest
	@MethodSource("parallelNodes")
	@DisplayName("knows if a node is related to parallel processing")
	void knows_if_a_node_is_related_to_parallel_processing(Node node) {
		assertThat(services.isParallel(node)).isTrue();
	}
	
	@ParameterizedTest
	@MethodSource("nonParallelNodes")
	@DisplayName("knows if a node is not related to parallel processing")
	void knows_if_a_node_is_not_related_to_parallel_processing(Node node) {
		assertThat(services.isParallel(node)).isFalse();
	}
	
	@ParameterizedTest
	@MethodSource("conditionalNodes")
	@DisplayName("knows if a node is related to conditional processing")
	void knows_if_a_node_is_related_to_conditional_processing(Node node) {
		assertThat(services.isConditional(node)).isTrue();
	}
	
	@ParameterizedTest
	@MethodSource("nonConditionalNodes")
	@DisplayName("knows if a node is not related to conditional processing")
	void knows_if_a_node_is_not_related_to_conditional_processing(Node node) {
		assertThat(services.isConditional(node)).isFalse();
	}
	
	@Test @DisplayName("can delete a successor / predecessor relationship from an edge")
	void can_delete_a_successor_predecessor_relationship_from_an_edge() {
		// Create the mapping
		
		Node sourceNode = SpecFactory.eINSTANCE.createActivity();
		Node targetNode = SpecFactory.eINSTANCE.createActivity();
		Node anotherSuccessor = SpecFactory.eINSTANCE.createActivity();
		
		sourceNode.getSuccessors().add(targetNode);
		sourceNode.getSuccessors().add(anotherSuccessor);
		
		// Create the edge
		
		DEdge edge = Mockito.mock(DEdge.class);
		SemanticEdgeTarget source = Mockito.mock(SemanticEdgeTarget.class);
		SemanticEdgeTarget target = Mockito.mock(SemanticEdgeTarget.class);
		
		when (edge.getSourceNode()) .thenReturn (source);
		when (edge.getTargetNode()) .thenReturn (target);
		
		when (source.getTarget()) .thenReturn (sourceNode);
		when (target.getTarget()) .thenReturn (targetNode);
		
		// Test
		
		services.unsetSuccessor(edge);
		
		assertThat(sourceNode.getSuccessors()).containsExactly(anotherSuccessor);
	}
	
	@Test @DisplayName("can add an input to a task")
	void can_add_an_input_to_a_task() {
		Task task = SpecFactory.eINSTANCE.createExternalTask();
		
		services.createInput(task);
		
		assertThat(task.getInputs().size()).isEqualTo(1);
		assertThat(task.getInputs().get(0)).isNotNull();
	}
	
	@Test @DisplayName("can add an output to a task")
	void can_add_an_output_to_a_task() {
		Task task = SpecFactory.eINSTANCE.createExternalTask();
		
		services.createOutput(task);
		
		assertThat(task.getOutputs()).size().isEqualTo(1);
		assertThat(task.getOutputs().get(0)).isNotNull();
	}
	
	/** Ease mocking */
	public static interface SemanticEdgeTarget extends EdgeTarget, DSemanticDecorator {
		
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<Node> parallelNodes() {
		return Stream.of(
			Mockito.mock(ParallelSplit.class),
			Mockito.mock(Synchronization.class)
		);
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<Node> nonParallelNodes() {
		return Stream.of(
			Mockito.mock(Activity.class),
			Mockito.mock(Start.class)
		);
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<Node> conditionalNodes() {
		return Stream.of(
			Mockito.mock(MultiChoice.class),
			Mockito.mock(SimpleMerge.class)
		);
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<Node> nonConditionalNodes() {
		return Stream.of(
			Mockito.mock(Activity.class),
			Mockito.mock(Start.class)
		);
	}
	
}
