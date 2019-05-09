 package fr.kazejiyu.ekumi.ide.history;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.assertj.core.util.Files;
import org.eclipse.collections.api.list.ImmutableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.core.execution.impl.JobsExecution;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.tests.common.fake.activities.DoNothing;

/**
 * Tests the behavior of a {@link PersistExecution} instance.<br>
 * <br>
 * This test class relies on a {@link PersistedHistory} instance.
 *
 * @author Emmanuel CHEBBI
 */
@DisplayName("A PersistExecution")
public class PersistExecutionTest implements WithAssertions {

	/** Instance under test */
	private PersistExecution serializer;
	
	private Execution expected;
	
	private PersistedHistory history;
	
	@BeforeEach
	void createInstance() throws InterruptedExecutionException {
		Path location = Paths.get("./rsc/PersistExecutionTest/");
		
		deleteContentOf(location.toFile(), false);
		
		serializer = new PersistExecution(location);
		history = new PersistedHistory(location);
		
		expected = new JobsExecution(new DoNothing());
		expected.start();
		expected.join();
	}
	
	@Test @DisplayName("persists an Execution on execution started")
	void persists_given_Execution_on_execution_started() {
		serializer.onExecutionStarted(expected);
		
		ImmutableList<FrozenExecution> executions = history.executions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).id()).isEqualTo(expected.id());
		softly.assertThat(executions.get(0).name()).isEqualTo(expected.name());
		softly.assertThat(executions.get(0).startDate()).hasSameTimeAs(expected.startDate().get());
		softly.assertAll();
	}
	
	@Test @DisplayName("persists an Execution on execution succeeded")
	void persists_given_Execution_on_execution_succeeded() {
		serializer.onExecutionSucceeded(expected);
		
		ImmutableList<FrozenExecution> executions = history.executions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).id()).isEqualTo(expected.id());
		softly.assertThat(executions.get(0).name()).isEqualTo(expected.name());
		softly.assertThat(executions.get(0).startDate()).hasSameTimeAs(expected.startDate().get());
		softly.assertAll();
	}
	
	@Test @DisplayName("persists an Execution on execution failed")
	void persists_given_Execution_on_execution_failed() {
		serializer.onExecutionFailed(expected);
		
		ImmutableList<FrozenExecution> executions = history.executions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).id()).isEqualTo(expected.id());
		softly.assertThat(executions.get(0).name()).isEqualTo(expected.name());
		softly.assertThat(executions.get(0).startDate()).hasSameTimeAs(expected.startDate().get());
		softly.assertAll();
	}
	
	@Disabled // activities are not serialized at the moment
	@Test @DisplayName("persists an Execution on activity succeeded")
	void persists_given_Execution_on_activity_succeeded() {
		// Required: expected to be called before any onActivity* method
		serializer.onExecutionStarted(expected);
		
//		Activity activity = WorkflowFactory.eINSTANCE.createSequence();
//		activity.setId("great-sequence");
//		activity.setName("Great Sequence");
//		activity.setStatus(State.CANCELLED);
//		expected.setActivity(activity);
//		
//		serializer.onActivitySucceeded(activity);
//		
//		List<Execution> executions = history.getExecutions();
//		
		SoftAssertions softly = new SoftAssertions();
//		softly.assertThat(executions).size().isEqualTo(1);
//		softly.assertThat(executions.get(0).id()).isEqualTo(expected.id());
//		softly.assertThat(executions.get(0).name()).isEqualTo(expected.name());
//		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
//		
//		softly.assertThat(EcoreUtil.equals(executions.get(0).getActivity(), activity))
//			  .as("Loaded activity is not equal to expected one")
//			  .isTrue();
		
		softly.assertAll();
	}
	
	@Disabled // activities are not serialized at the moment
	@Test @DisplayName("persists an Execution on activity failed")
	void persists_given_Execution_on_activity_failed() {
		// Required: expected to be called before any onActivity* method
		serializer.onExecutionStarted(expected);
		
//		Activity activity = WorkflowFactory.eINSTANCE.createSequence();
//		activity.setId("great-sequence");
//		activity.setName("Great Sequence");
//		activity.setStatus(State.CANCELLED);
//		expected.setActivity(activity);
//		
//		serializer.onActivityFailed(activity);
//		
//		List<Execution> executions = history.getExecutions();
//		
		SoftAssertions softly = new SoftAssertions();
//		softly.assertThat(executions).size().isEqualTo(1);
//		softly.assertThat(executions.get(0).id()).isEqualTo(expected.id());
//		softly.assertThat(executions.get(0).name()).isEqualTo(expected.name());
//		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
//		
//		softly.assertThat(EcoreUtil.equals(executions.get(0).getActivity(), activity))
//			  .as("Loaded activity is not equal to expected one")
//			  .isTrue();
		
		softly.assertAll();
	}
	
	@Nested @DisplayName("when instantiated with illegal arguments")
	class WhenInstanciatedWithIllegalArguments {

		@Test @DisplayName("throw a NullPointerException")
		void throws_a_NullPointerException() {
			assertThatNullPointerException().isThrownBy(() ->
				new PersistExecution(null)
			);
		}
		
	}
	
	/**
	 * Recursively delete the content of {@code location}.
	 * 
	 * @param location
	 * 			The folder which content must be deleted
	 * @param delete
	 * 			Whether the folder itself must be deleted
	 */
	private static void deleteContentOf(File location, boolean delete) {
		if (location.isFile() && delete) {
			Files.delete(location);
		} 
		else {
			if (location.listFiles() != null) {
				Arrays.stream(location.listFiles())
					  .forEach(file -> deleteContentOf(file, true));
			}
			if (delete) {
				Files.delete(location);
			}
		}
	}
	
}
