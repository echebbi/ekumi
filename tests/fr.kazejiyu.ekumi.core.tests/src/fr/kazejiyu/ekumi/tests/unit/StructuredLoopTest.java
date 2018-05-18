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
import fr.kazejiyu.ekumi.tests.mocks.BrokenActivity;
import fr.kazejiyu.ekumi.tests.mocks.SetNameInContext;

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
		
		// NEITHER PRE-CONDITION NOR POST-CONDITION: run() will lead to an infinite loop
	}
	
	@Nested
	@DisplayName("when containing a broken activity")
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
		
	}
	
	@Nested
	@DisplayName("when having a post-condition")
	class WhenHavingAPostCondition {
		
	}

}
