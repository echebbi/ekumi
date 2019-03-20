package fr.kazejiyu.ekumi.specs.eds.impl;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.Start;
import fr.kazejiyu.ekumi.specs.eds.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.specs.eds.impl.fake.FakeSuccessor;

@DisplayName("A Basic Start")
public class BasicStartTest implements WithAssertions {
	
	/** Object to test */
	Start start;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createTask() {
		start = new BasicStart();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(start.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have only one successor")
	void can_have_only_one_successor() {
		start.getSuccessors().add(successor);
		
		assertThat(start.canPrecede(new FakeSuccessor())).isFalse();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(start.canPrecede(start)).isFalse();
	}
	
	@Test @DisplayName("cannot succeed a node")
	void cannot_succeed_a_node() {
		assertThat(start.canSucceed()).isFalse();
	}
	
	@Test @DisplayName("cannot have any predecessor") 
	void cannot_have_any_predecessor() {
		assertThat(start.canSucceed(predecessor)).isFalse();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(start.canSucceed(start)).isFalse();
	}
	
}
