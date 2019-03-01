package fr.kazejiyu.ekumi.core.spec.impl;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.spec.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.core.spec.impl.fake.FakeSuccessor;
import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.SimpleMerge;

@DisplayName("A Basic SimpleMerge")
public class BasicSimpleMergeTest implements WithAssertions {
	
	/** The object to test */
	SimpleMerge merge;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createSimpleMerge() {
		merge = new BasicSimpleMerge();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(merge.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have many successors") 
	void can_have_many_successors() {
		merge.getSuccessors().add(successor);
		
		assertThat(merge.canPrecede(new FakeSuccessor())).isFalse();
	}
	
	@Test @DisplayName("can have a predecessor")
	void can_have_a_predecessor() {
		assertThat(merge.canPrecede()).isTrue();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(merge.canPrecede(merge)).isFalse();
	}
	
	@Test @DisplayName("can succeed a node")
	void can_succeed_a_node() {
		assertThat(merge.canSucceed()).isTrue();
	}
	
	@Test @DisplayName("can have a given predecessor")
	void can_have_a_given_predecessor() {
		assertThat(merge.canSucceed(predecessor)).isTrue();
	}
	
	@Test @DisplayName("can have many predecessors")
	void can_have_many_predecessors() {
		merge.getPredecessors().add(predecessor);
		
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 100 ; ++i)
			softly.assertThat(merge.canSucceed(new FakePredecessor())).isTrue();
		
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot succeed the same task multiple times")
	void cannot_succeed_the_same_task_multiple_times() {
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 10 ; ++i) {
			merge.getPredecessors().add(predecessor);
			softly.assertThat(merge.canSucceed(predecessor)).isFalse();
		}
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(merge.canSucceed(merge)).isFalse();
	}

}
