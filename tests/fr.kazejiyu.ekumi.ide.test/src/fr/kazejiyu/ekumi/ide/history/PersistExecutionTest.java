package fr.kazejiyu.ekumi.ide.history;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.WithAssertions;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;

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
	void createInstance() {
		File location = new File("./rsc/PersistExecutionTest/");
		URI locationURI = URI.createFileURI(location.getAbsolutePath());
		
		deleteContentOf(location, false);
		
		serializer = new PersistExecution(locationURI);
		
		history = new PersistedHistory(Paths.get(location.getAbsolutePath()));
		
		expected = WorkflowFactory.eINSTANCE.createExecution();
		expected.setId("first-execution");
		expected.setName("Execution n°1");
		expected.setStartDate(new Date());
	}
	
	@Test @DisplayName("persists an Execution on execution started")
	void persists_given_Execution_on_execution_started() {
		serializer.onExecutionStarted(expected);
		
		List<Execution> executions = history.getExecutions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).getId()).isEqualTo(expected.getId());
		softly.assertThat(executions.get(0).getName()).isEqualTo(expected.getName());
		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
		softly.assertThat(executions.get(0).getActivity()).isNull();
		softly.assertAll();
	}
	
	@Test @DisplayName("persists an Execution on execution succeeded")
	void persists_given_Execution_on_execution_succeeded() {
		serializer.onExecutionSucceeded(expected);
		
		List<Execution> executions = history.getExecutions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).getId()).isEqualTo(expected.getId());
		softly.assertThat(executions.get(0).getName()).isEqualTo(expected.getName());
		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
		softly.assertThat(executions.get(0).getActivity()).isNull();
		softly.assertAll();
	}
	
	@Test @DisplayName("persists an Execution on activity succeeded")
	void persists_given_Execution_on_activity_succeeded() {
		// Required: expected to be called before any onActivity* method
		serializer.onExecutionStarted(expected);
		
		Activity activity = WorkflowFactory.eINSTANCE.createSequence();
		activity.setId("great-sequence");
		activity.setName("Great Sequence");
		activity.setStatus(Status.CANCELLED);
		expected.setActivity(activity);
		
		serializer.onActivitySucceeded(activity);
		
		List<Execution> executions = history.getExecutions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).getId()).isEqualTo(expected.getId());
		softly.assertThat(executions.get(0).getName()).isEqualTo(expected.getName());
		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
		
		softly.assertThat(EcoreUtil.equals(executions.get(0).getActivity(), activity))
			  .as("Loaded activity is not equal to expected one")
			  .isTrue();
		
		softly.assertAll();
	}
	
	@Test @DisplayName("persists an Execution on activity failed")
	void persists_given_Execution_on_activity_failed() {
		// Required: expected to be called before any onActivity* method
		serializer.onExecutionStarted(expected);
		
		Activity activity = WorkflowFactory.eINSTANCE.createSequence();
		activity.setId("great-sequence");
		activity.setName("Great Sequence");
		activity.setStatus(Status.CANCELLED);
		expected.setActivity(activity);
		
		serializer.onActivityFailed(activity);
		
		List<Execution> executions = history.getExecutions();
		
		SoftAssertions softly = new SoftAssertions();
		softly.assertThat(executions).size().isEqualTo(1);
		softly.assertThat(executions.get(0).getId()).isEqualTo(expected.getId());
		softly.assertThat(executions.get(0).getName()).isEqualTo(expected.getName());
		softly.assertThat(executions.get(0).getStartDate()).hasSameTimeAs(expected.getStartDate());
		
		softly.assertThat(EcoreUtil.equals(executions.get(0).getActivity(), activity))
			  .as("Loaded activity is not equal to expected one")
			  .isTrue();
		
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
	
	@Nested @DisplayName("when instantiated with an illegal location")
	class WhenInstantiatedWithAnIllegalLocation {
		
		private PrintStream originalErrorStream = null;
		
		private File location;
		
		@BeforeEach
		void when_instantiated_with_an_illegal_location() {
			location = new File("<>?");
			URI locationURI = URI.createFileURI(location.getAbsolutePath());
			
			deleteContentOf(location, false);
			
			serializer = new PersistExecution(locationURI);
			redirectErrorStreamToNull();
		}
		
		@Test @DisplayName("does not throw on event")
		void does_not_throw_on_event() {
			assertThatCode(() -> serializer.onExecutionStarted(expected)).doesNotThrowAnyException();
		}
		
		@AfterEach
		void fixErrorStream() {
			if (originalErrorStream != null) {
				System.setErr(originalErrorStream);
				originalErrorStream = null;
			}
		}

		/** 
		 * The test prints an Exception to stderr but we don't want to pollute the console with it.
		 * This method allows to temporarily ignore any printed Exception.  
		 */
		private void redirectErrorStreamToNull() {
			originalErrorStream = System.err;
			System.setErr(new PrintStream(new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {
					// do nothing
				}
				
			}));
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
			location.delete();
		} else {
			if (location.listFiles() != null)
				Arrays.stream(location.listFiles())
					  .forEach(file -> deleteContentOf(file, true));
			
			if (delete)
				location.delete();
		}
	}
	
}
