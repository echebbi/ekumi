package fr.kazejiyu.ekumi.core.spec.impl;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.spec.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.core.spec.impl.fake.FakeSuccessor;
import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.ParallelSplit;

@DisplayName("A Basic ParallelSplit")
public class BasicParallelSplitTest implements WithAssertions {
	
	/** The object to test */
	ParallelSplit split;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createParallelSplit() {
		split = new BasicParallelSplit();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(split.canPrecede()).isTrue();
	}
	
	@Test @DisplayName("can have a given successor")
	void can_have_a_given_successor() {
		assertThat(split.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have many successors") 
	void can_have_many_successors() {
		split.getSuccessors().add(successor);
		
		SoftAssertions softly = new SoftAssertions();
		
		for (int i = 0 ; i < 100 ; ++i)
			softly.assertThat(split.canPrecede(new FakeSuccessor())).isTrue();
		
		softly.assertAll();
	}
	
	@Test @DisplayName("cannot precede the same task multiple times")
	void cannot_precede_the_same_task_multiple_times() {
		split.getSuccessors().add(successor);

		assertThat(split.canPrecede(successor)).isFalse();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(split.canPrecede(split)).isFalse();
	}
	
	@Test @DisplayName("can have a predecessor")
	void can_have_a_predecessor() {
		assertThat(split.canSucceed(predecessor)).isTrue();
	}
	
	@Test @DisplayName("can have at most one predecessor")
	void can_have_at_most_one_predecessor() {
		split.getPredecessors().add(predecessor);
		
		assertThat(split.canSucceed(new FakePredecessor())).isFalse();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(split.canSucceed(split)).isFalse();
	}

}
