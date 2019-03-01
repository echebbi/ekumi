package fr.kazejiyu.ekumi.core.spec.impl;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.spec.impl.fake.FakePredecessor;
import fr.kazejiyu.ekumi.core.spec.impl.fake.FakeSuccessor;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.Node;

@DisplayName("A Basic ExternalTask")
public class BasicExternalTaskTest implements WithAssertions {
	
	ExternalTask task;
	
	Node successor;
	Node predecessor;
	
	@BeforeEach
	void createTask() {
		task = new BasicExternalTask();
		
		successor = new FakeSuccessor();
		predecessor = new FakePredecessor();
	}
	
	@Test @DisplayName("can have a successor")
	void can_have_a_successor() {
		assertThat(task.canPrecede(successor)).isTrue();
	}
	
	@Test @DisplayName("can have at most one successor") 
	void can_have_at_most_one_successor() {
		task.getSuccessors().add(successor);
		
		assertThat(task.canPrecede(new FakeSuccessor())).isFalse();
	}
	
	@Test @DisplayName("cannot be its own successor")
	void cannot_be_its_own_successor() {
		assertThat(task.canPrecede(task)).isFalse();
	}
	
	@Test @DisplayName("can have a predecessor")
	void can_have_a_predecessor() {
		assertThat(task.canSucceed(predecessor)).isTrue();
	}
	
	@Test @DisplayName("can have at most one predecessor")
	void can_have_at_most_one_predecessor() {
		task.getPredecessors().add(predecessor);
		
		assertThat(task.canSucceed(new FakePredecessor())).isFalse();
	}
	
	@Test @DisplayName("cannot be its own predecessor")
	void cannot_be_its_own_predecessor() {
		assertThat(task.canSucceed(task)).isFalse();
	}

}
