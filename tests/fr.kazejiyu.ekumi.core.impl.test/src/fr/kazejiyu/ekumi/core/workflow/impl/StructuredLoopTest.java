package fr.kazejiyu.ekumi.core.workflow.impl;

import static fr.kazejiyu.ekumi.core.workflow.State.FAILED;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.workflow.Context;
import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.tests.common.fake.activities.BrokenActivity;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Count;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Until;

/**
 * Tests the behaviour of {@link StructuredLoop} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@DisplayName("A Structured Loop")
public class StructuredLoopTest implements WithAssertions {
	
	@Mock
	private Context context;
	
	@BeforeEach
	void createAContext() {
		context = new NullContext();
	}
	
	@Nested
	@DisplayName("when containing an activity that throws")
	class WhenContainingABrokenActivity {
		private StructuredLoop corrupted;
		
		@BeforeEach
		void initialize() {
			corrupted = new BasicStructuredLoop("id", "name", new BrokenActivity(), null, null);
		}
		
		// run()
		
		@Test @DisplayName("does not throw when run")
		void does_not_throw_when_run() {
			assertThatCode(() -> corrupted.run(context)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.state()).isEqualTo(FAILED);
		}
	}
	
	@Nested
	@DisplayName("when having a pre-condition")
	class WhenHavingAPreCondition {
		
		private StructuredLoop whileDo;
		private Count counter;
		
		private final int LIMIT = 5;
		
		@BeforeEach
		void initialize() {
			counter = new Count();
		}
		
		@Test @DisplayName("stops when the pre-condition is fulfilled")
		void stops_when_the_pre_condition_is_fulfilled() {
			Until preCondition = new Until(counter, LIMIT);
			whileDo = new BasicStructuredLoop("id", "name", counter, preCondition, null);

			whileDo.run(context);
			
			assertThat(counter.getValue()).isEqualTo(LIMIT);
		}
		
		@Test @DisplayName("does not execute its activity if the pre-condition is not fulfilled")
		void executes_its_activity_at_least_once() {
			Until preCondition = new Until(counter, -1);
			whileDo = new BasicStructuredLoop("id", "name", counter, preCondition, null);
			
			whileDo.run(context);
			
			assertThat(counter.getValue()).isZero();
		}
		
	}
	
	@Nested
	@DisplayName("when having a post-condition")
	class WhenHavingAPostCondition {
		private StructuredLoop doWhile;
		
		private Count counter;
		
		private final int LIMIT = 5;
		
		@BeforeEach
		void initialize() {
			counter = new Count();
		}
		
		@Test @DisplayName("stops when the post-condition is fulfilled")
		void stops_when_the_pre_condition_is_fulfilled() {
			Until postCondition = new Until(counter, LIMIT);
			doWhile = new BasicStructuredLoop("id", "name", counter, null, postCondition);
			
			doWhile.run(context);
			
			assertThat(counter.getValue()).isEqualTo(LIMIT);
		}
		
		@Test @DisplayName("executes its activity at least once")
		void executes_its_activity_at_least_once() {
			Until postCondition = new Until(counter, -1);
			doWhile = new BasicStructuredLoop("id", "name", counter, null, postCondition);
			
			doWhile.run(context);
			
			assertThat(counter.getValue()).isEqualTo(1);
		}
		
	}

}
