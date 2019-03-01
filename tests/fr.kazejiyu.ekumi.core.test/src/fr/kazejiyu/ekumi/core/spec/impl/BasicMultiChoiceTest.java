package fr.kazejiyu.ekumi.core.spec.impl;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.spec.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.core.spec.impl.fake.FakeSuccessor;
import fr.kazejiyu.ekumi.model.spec.MultiChoice;
import fr.kazejiyu.ekumi.model.spec.Node;

@DisplayName("A Basic MultiChoice")
public class BasicMultiChoiceTest implements WithAssertions {
	
	/** The object to test */
	MultiChoice choice;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createMultiChoice() {
		choice = new BasicMultiChoice();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can precede a node")
	void can_precede_a_node() {
		assertThat(choice.canPrecede()).isTrue();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(choice.canPrecede()).isTrue();
	}
	
	@Test @DisplayName("can have a given successor")
	void can_have_a_given_successor() {
		assertThat(choice.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have many successors") 
	void can_have_many_successors() {
		choice.getSuccessors().add(successor);
		
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 100 ; ++i)
			softly.assertThat(choice.canPrecede(new FakeSuccessor())).isTrue();
		
		softly.assertAll();
	}
	
	@Test @DisplayName("can precede the same task multiple times")
	void can_precede_the_same_task_multiple_times() {
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 10 ; ++i) {
			choice.getSuccessors().add(successor);
			softly.assertThat(choice.canPrecede(successor)).isTrue();
		}
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(choice.canPrecede(choice)).isFalse();
	}
	
	@Test @DisplayName("can have a predecessor")
	void can_have_a_predecessor() {
		assertThat(choice.canSucceed(predecessor)).isTrue();
	}
	
	@Test @DisplayName("can have at most one predecessor")
	void can_have_at_most_one_predecessor() {
		choice.getPredecessors().add(predecessor);
		
		assertThat(choice.canSucceed(new FakePredecessor())).isFalse();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(choice.canSucceed(choice)).isFalse();
	}

}
