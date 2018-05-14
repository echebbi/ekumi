package fr.kazejiyu.ekumi.tests.unit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import static fr.kazejiyu.ekumi.core.ekumi.Status.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.Sequence;
import fr.kazejiyu.ekumi.tests.mocks.BrokenActivity;
import fr.kazejiyu.ekumi.tests.mocks.SetNameInContext;

/**
 * Tests the behaviour of {@link Sequence} instances.
 * 
 * @author Emmanuel CHEBBI
 */
@DisplayName("A Sequence")
public class SequenceTest {
	
	@Nested
	@DisplayName("when empty")
	class Empty {
		private Sequence empty;
		private Context context;
		
		@BeforeEach
		void initialize() {
			context = EkumiFactory.eINSTANCE.createContext();
			empty = EkumiFactory.eINSTANCE.createSequence();
		}
		
		// isEmpty()
		
		@Test @DisplayName("is empty")
		void is_empty() {
			assertThat(empty.isEmpty()).isTrue();
		}
		
		// run()
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			empty.run(context);
			assertThat(empty.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested
	@DisplayName("when not empty")
	class NonEmpty {
		private Sequence seq;
		private Context context;
		
		@BeforeEach
		void initialize() {
			seq = EkumiFactory.eINSTANCE.createSequence();
			seq.getActivities().add(new SetNameInContext("A"));
			seq.getActivities().add(new SetNameInContext("B"));
			seq.getActivities().add(new SetNameInContext("C"));
			context = EkumiFactory.eINSTANCE.createContext();
		}
		
		// isEmpty()
		
		@Test @DisplayName("is not empty")
		void is_not_empty() {
			assertThat(seq.isEmpty()).isFalse();
		}
		
		@Test @DisplayName("is empty when all its activities have been removed")
		void is_empty_when_all_its_activites_have_been_removed() {
			seq.getActivities().clear();
			assertThat(seq.isEmpty()).isTrue();
		}
		
		// run()
		
		@Test @DisplayName("execute all its tasks")
		void execute_all_its_tasks() {
			seq.run(context);
			assertThat(seq.getActivities()).allMatch(activity -> ((SetNameInContext) activity).hasRun());
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("execute all its tasks in order")
		void execute_all_its_tasks_in_order() {
			seq.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactly("A", "B", "C");
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("provide the right context to its tasks")
		void provides_the_right_context_to_its_tasks() {
			seq.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactlyInAnyOrder("A", "B", "C");
		}
		
		@Test @DisplayName("has 'finished' status after run")
		void has_finished_status_after_run() {
			seq.run(context);
			assertThat(seq.getStatus()).isEqualTo(SUCCEEDED);
		}
	}
	
	@Nested
	@DisplayName("when containing a broken activity")
	class WhenContainingABrokenActivity {
		private Sequence corrupted;
		private Context context;
		
		@BeforeEach
		void initialize() {
			corrupted = EkumiFactory.eINSTANCE.createSequence();
			corrupted.getActivities().add(new SetNameInContext("A"));
			corrupted.getActivities().add(new SetNameInContext("B"));
			corrupted.getActivities().add(new BrokenActivity());
			corrupted.getActivities().add(new SetNameInContext("C"));
			context = EkumiFactory.eINSTANCE.createContext();
		}
		
		@Test @DisplayName("do not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("stop its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactly("A", "B");
		}
	}

}
