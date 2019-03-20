package fr.kazejiyu.ekumi.specs.eds.impl;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.Synchronization;
import fr.kazejiyu.ekumi.specs.eds.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.specs.eds.impl.fake.FakeSuccessor;

@DisplayName("A Basic Synchronization")
public class BasicSynchronizationTest implements WithAssertions {
	
	/** The object to test */
	Synchronization sync;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createSimpleMerge() {
		sync = new BasicSynchronization();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(sync.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have at most one successor") 
	void can_have_many_successors() {
		sync.getSuccessors().add(successor);
		
		assertThat(sync.canPrecede(new FakeSuccessor())).isFalse();
	}
	
	@Test @DisplayName("can have a predecessor")
	void can_have_a_predecessor() {
		assertThat(sync.canPrecede()).isTrue();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(sync.canPrecede(sync)).isFalse();
	}
	
	@Test @DisplayName("can succeed a node")
	void can_succeed_a_node() {
		assertThat(sync.canSucceed()).isTrue();
	}
	
	@Test @DisplayName("can have a given predecessor")
	void can_have_a_given_predecessor() {
		assertThat(sync.canSucceed(predecessor)).isTrue();
	}
	
	@Test @DisplayName("can have many predecessors")
	void can_have_many_one_predecessors() {
		sync.getPredecessors().add(predecessor);
		
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 100 ; ++i)
			softly.assertThat(sync.canSucceed(new FakePredecessor())).isTrue();
		
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot succeed the same task multiple times")
	void cannot_succeed_the_same_task_multiple_times() {
		sync.getPredecessors().add(predecessor);

		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 10 ; ++i) {
			softly.assertThat(sync.canSucceed(predecessor)).isFalse();
		}
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(sync.canSucceed(sync)).isFalse();
	}

}
