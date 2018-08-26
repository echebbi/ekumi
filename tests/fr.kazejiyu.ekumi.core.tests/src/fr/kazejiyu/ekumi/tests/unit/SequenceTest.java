package fr.kazejiyu.ekumi.tests.unit;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.Sequence;
import fr.kazejiyu.ekumi.tests.mocks.BrokenActivity;
import fr.kazejiyu.ekumi.tests.mocks.HopelessActivity;
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
		
		// getActivities()
		
		@Test @DisplayName("has no activity")
		void has_no_activity() {
			assertThat(empty.getActivities()).isEmpty();
		}
		
		// isSetActivities()
		
		@Test @DisplayName("has its activites set")
		void has_its_activities_set() {
			assertThat(empty.isSetActivities()).isTrue();
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
		private List<Activity> activities;
		
		@BeforeEach
		void initialize() {
			seq = EkumiFactory.eINSTANCE.createSequence();
			activities = new ArrayList<>();
			
			activities.add(new SetNameInContext("A"));
			activities.add(new SetNameInContext("B"));
			activities.add(new SetNameInContext("C"));
			
			seq.setRoot(activities.get(0));
			seq.getRoot().setSuccessor(activities.get(1));
			seq.getRoot().getSuccessor().setSuccessor(activities.get(2));
			
			context = EkumiFactory.eINSTANCE.createContext();
		}
		
		// isSetActivities()
		
		@Test @DisplayName("has its activites set")
		void has_its_activities_set() {
			assertThat(seq.isSetActivities()).isTrue();
		}
		
		// getActivities()
		
		@Test @DisplayName("provides its activities in order")
		void provides_its_activities_in_order() {
			assertThat(seq.getActivities()).containsExactlyElementsOf(activities);
		}
		
		// run()
		
		@Test @DisplayName("executes all its tasks")
		void execute_all_its_tasks() {
			seq.run(context);
			assertThat(seq.getActivities()).allMatch(activity -> ((SetNameInContext) activity).hasRun());
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("executes all its tasks in order")
		void execute_all_its_tasks_in_order() {
			seq.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactly("A", "B", "C");
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("provides the right context to its tasks")
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
	
		@Disabled
		@Test @DisplayName("updates the inputs of a task before running it") 
		void update_the_inputs_of_a_task_before_running_it() {
			seq.run(context);
		}
	}
	
	@Nested
	@DisplayName("when containing an activity that throws")
	class WhenContainingABrokenActivity {
		private Sequence corrupted;
		private Context context;
		
		@BeforeEach
		void initialize() {
			corrupted = EkumiFactory.eINSTANCE.createSequence();
			corrupted.setRoot(new SetNameInContext("A"));
			corrupted.getRoot().setSuccessor(new SetNameInContext("B"));
			corrupted.getRoot().getSuccessor().setSuccessor(new BrokenActivity());
			corrupted.getRoot().getSuccessor().getSuccessor().setSuccessor(new SetNameInContext("C"));
			context = EkumiFactory.eINSTANCE.createContext();
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("stops its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactly("A", "B");
		}
	}
	
	@Nested
	@DisplayName("when containing an activity that fails")
	class WhenContainingAnHopelessActivity {
		private Sequence corrupted;
		private Context context;
		
		@BeforeEach
		void initialize() {
			corrupted = EkumiFactory.eINSTANCE.createSequence();
			corrupted.setRoot(new SetNameInContext("A"));
			corrupted.getRoot().setSuccessor(new SetNameInContext("B"));
			corrupted.getRoot().getSuccessor().setSuccessor(new HopelessActivity());
			corrupted.getRoot().getSuccessor().getSuccessor().setSuccessor(new SetNameInContext("C"));
			context = EkumiFactory.eINSTANCE.createContext();
		}
		
		@Test @DisplayName("does not throw when run")
		void do_not_throw_when_run() {
			corrupted.run(context);
		}
		
		@Test @DisplayName("has 'failed' status after run")
		void has_failed_status_after_run() {
			corrupted.run(context);
			assertThat(corrupted.getStatus()).isEqualTo(FAILED);
		}
		
		@SuppressWarnings("unchecked")
		@Test @DisplayName("stops its execution when an activity fails")
		void stop_its_execution_when_an_activity_fails() {
			corrupted.run(context);
			List<String> activities = (List<String>) context.get(SetNameInContext.VARIABLE_IN_CONTEXT).get().getValueAs(List.class);
			assertThat(activities).containsExactly("A", "B");
		}
	}

}
