package fr.kazejiyu.ekumi.tests.unit;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.Variable;
import fr.kazejiyu.ekumi.tests.mocks.BrokenActivity;
import fr.kazejiyu.ekumi.tests.mocks.IncrementVarActivity;
import fr.kazejiyu.ekumi.tests.mocks.SetNameInContext;
import fr.kazejiyu.ekumi.tests.mocks.Until;

/**
 * Tests the behaviour of {@link StructuredLoop} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@DisplayName("A Structured Loop")
public class StructuredLoopTest {
	
	@Nested
	@DisplayName("when empty")
	class Empty {
		private StructuredLoop empty;
		private Context context;
		
		@BeforeEach
		void initialize() {
			context = EkumiFactory.eINSTANCE.createContext();
			empty = EkumiFactory.eINSTANCE.createStructuredLoop();
		}
		
		// isEmpty()
		
		@Test @DisplayName("has no activity")
		void is_empty() {
			assertThat(empty.getActivity()).isNull();
		}
		
		// run()
		
		@Test @DisplayName("has 'succeeded' status after run")
		void has_finished_status_after_run() {
			empty.run(context);
			assertThat(empty.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested
	@DisplayName("when not empty")
	class NonEmpty {
		private StructuredLoop loop;
		
		@BeforeEach
		void initialize() {
			loop = EkumiFactory.eINSTANCE.createStructuredLoop();
			loop.setActivity(new SetNameInContext("A"));
		}
		
		// isEmpty()
		
		@Test @DisplayName("has an activity")
		void is_not_empty() {
			assertThat(loop.getActivity()).isNotNull();
		}
		
		// NEITHER PRE-CONDITION NOR POST-CONDITION => run() would lead to an infinite loop
	}
	
	@Nested
	@DisplayName("when containing an activity that throws")
	class WhenContainingABrokenActivity {
		private StructuredLoop corrupted;
		private Context context;
		
		@BeforeEach
		void initialize() {
			corrupted = EkumiFactory.eINSTANCE.createStructuredLoop();
			context = EkumiFactory.eINSTANCE.createContext();
			corrupted.setActivity(new BrokenActivity());
		}
		
		// run()
		
		@Test @DisplayName("do not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
	}
	
	@Nested
	@DisplayName("when having a pre-condition")
	class WhenHavingAPreCondition {
		private StructuredLoop whileDo;
		private Context context;
		
		private final int LIMIT = 5;
		
		@BeforeEach
		void initialize() {
			whileDo = EkumiFactory.eINSTANCE.createStructuredLoop();
			context = EkumiFactory.eINSTANCE.createContext();
			whileDo.setActivity(new IncrementVarActivity("counter"));
			whileDo.setPreCondition(new Until("counter", LIMIT));
		}
		
		@Test @DisplayName("stops when the pre-condition is fulfilled")
		void stops_when_the_pre_condition_is_fulfilled() {
			whileDo.run(context);
			assertThat(context.get("counter")).map(Variable::getValue).contains(LIMIT);
		}
		
		@Test @DisplayName("does not execute its activity if the pre-condition is not fulfilled")
		void executes_its_activity_at_least_once() {
			whileDo.setPreCondition(new Until("counter", -1));
			assertThat(context.get("counter")).isEmpty();
		}
		
	}
	
	@Nested
	@DisplayName("when having a post-condition")
	class WhenHavingAPostCondition {
		private StructuredLoop doWhile;
		private Context context;
		
		private final int LIMIT = 5;
		
		@BeforeEach
		void initialize() {
			doWhile = EkumiFactory.eINSTANCE.createStructuredLoop();
			context = EkumiFactory.eINSTANCE.createContext();
			doWhile.setActivity(new IncrementVarActivity("counter"));
			doWhile.setPostCondition(new Until("counter", LIMIT));
		}
		
		@Test @DisplayName("stops when the post-condition is fulfilled")
		void stops_when_the_pre_condition_is_fulfilled() {
			doWhile.run(context);
			assertThat(context.get("counter")).map(Variable::getValue).contains(LIMIT);
		}
		
		@Test @DisplayName("executes its activity at least once")
		void executes_its_activity_at_least_once() {
			doWhile.setPostCondition(new Until("counter", -1));
			doWhile.run(context);
			assertThat(context.get("counter")).map(Variable::getValue).contains(0);
		}
		
	}

}
