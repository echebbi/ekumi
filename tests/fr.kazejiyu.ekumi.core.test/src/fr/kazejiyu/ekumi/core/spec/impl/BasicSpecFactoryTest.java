package fr.kazejiyu.ekumi.core.spec.impl;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.model.spec.Node;

@DisplayName("A Basic SpecFactory")
public class BasicSpecFactoryTest implements WithAssertions {
	
	/** Object to test */
	BasicSpecFactory factory;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createTask() {
		factory = new BasicSpecFactory();
	}
	
	@Test @DisplayName("can create a Start")
	void can_create_a_start() {
		assertThat(factory.createStart()).isNotNull();
	}
	
	@Test @DisplayName("can create an ExternalTask")
	void can_create_an_external_task() {
		assertThat(factory.createExternalTask()).isNotNull();
	}
	
	@Test @DisplayName("can create a ParallelSplit")
	void can_create_an_parallel_split() {
		assertThat(factory.createParallelSplit()).isNotNull();
	}
	
	@Test @DisplayName("can create a Synchronization")
	void can_create_a_synchronization() {
		assertThat(factory.createSynchronization()).isNotNull();
	}
	
	@Test @DisplayName("can create a MultiChoice")
	void can_create_a_multi_choice() {
		assertThat(factory.createMultiChoice()).isNotNull();
	}
	
	@Test @DisplayName("can create a SimpleMerge")
	void can_create_a_simple_merge() {
		assertThat(factory.createSimpleMerge()).isNotNull();
	}
	
}
