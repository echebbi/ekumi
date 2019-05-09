package fr.kazejiyu.ekumi.ide.history;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.core.execution.impl.JobsExecution;
import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.core.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicSequence;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicStructuredLoop;

@DisplayName("A PersistedHistory")
public class PersistedHistoryTest implements WithAssertions {

	private PersistedHistory history;
	
	@Nested @DisplayName("when the given directory does not exist")
	class WhenTheGivenDirectoryDoesNotExist {
		
		@BeforeEach
		void createHistory() {
			history = new PersistedHistory(new File("./rsc/non-existing-folder/").toPath());
		}
		
		@Test @DisplayName("does not have any Execution")
		void does_not_have_any_Execution() {
			assertThat(history.executions()).isEmpty();
		}
		
		@Test @DisplayName("has a length of 0")
		void has_a_length_of_0() {
			assertThat(history.size()).isEqualTo(0);
		}
		
	}
	
	@Nested @DisplayName("when the given directory contains Executions")
	class WhenTheGivenDirectoryContainsExecutions {
		
		@BeforeEach
		void createHistory() {
			history = new PersistedHistory(new File("./rsc/executions/").toPath());
		}
		
		@Test @DisplayName("has the expected number of Executions")
		void has_the_expected_number_of_Executions() {
			assertThat(history.executions()).size().isEqualTo(1);
		}
		
		@Test @DisplayName("has Executions with expected id")
		void has_Executions_with_expected_id() {
			Execution expected = createSequence13();
			FrozenExecution loaded = history.executions().get(0);
			
			assertThat(loaded.id()).isEqualTo(expected.id());
		}
		
		@Test @DisplayName("has Executions with expected UTF-8 name")
		void has_Executions_with_expected_UTF8_name() {
			Execution expected = createSequence13();
			FrozenExecution loaded = history.executions().get(0);
			
			assertThat(loaded.name()).isEqualTo(expected.name());
		}
		
		@Test @DisplayName("has Executions with expected status")
		void has_Executions_with_expected_status() {
			Execution expected = createSequence13();
			FrozenExecution loaded = history.executions().get(0);
			
			assertThat(loaded.state()).isEqualTo(expected.state());
		}
		
		@Disabled // activities can be loaded at the moment
		@Test @DisplayName("has Executions owning expected Activities")
		void has_Executions_owning_expected_Activites() {
//			Execution expected = createSequence13();
//			Execution loaded = history.executions().get(0);
//			
//			boolean activitesAreEqual = EcoreUtil.equals(expected.getActivity(), loaded.getActivity());
//			assertThat(activitesAreEqual).isTrue();
		}
	}
	
	@Nested @DisplayName("when the given directory contains malformed files")
	class WhenTheGivenDirectoryContainsMalformedFiles {
		
		private PrintStream originalErrorStream = null;
		
		@BeforeEach
		void createHistory() {
			history = new PersistedHistory(new File("./rsc/malformed-executions/").toPath());
			redirectErrToNull();
		}
		
		@AfterEach
		void fixErrorStream() {
			if (originalErrorStream != null) {
				System.setErr(originalErrorStream);
				originalErrorStream = null;
			}
		}
		
		@Test @DisplayName("ignores unreadable Executions")
		void ignoresUnreadableExecutions() {
			assertThat(history.executions()).isEmpty();
		}

		/** 
		 * The test prints an Exception to stderr but we don't want to pollute the console with it.
		 * This method allows to temporarily ignore any printed Exception.  
		 */
		private void redirectErrToNull() {
			originalErrorStream = System.err;
			System.setErr(new PrintStream(new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {
					// do nothing
				}
				
			}));
		}
		
	}
	
	/** @return an Execution equal to rsc/executions/2018.09.20.1120402040.sequence-13/Sequence n°13.ekumi */
	Execution createSequence13() {
		Sequence mySequence = new BasicSequence("my.sequence", "My Sequence");
//		mySequence.setStatus(State.SUCCEEDED);
		
		StructuredLoop myLoop = new BasicStructuredLoop("my.loop", "My Loop 風", mySequence, null, null);
//		myLoop.setStatus(State.FAILED);
		
		Execution sequence13 = new JobsExecution(myLoop);
		sequence13.start();
		try {
			sequence13.join();
		} catch (InterruptedExecutionException e) {
			e.printStackTrace();
		}
//		sequence13.setId("sequence-13");
//		sequence13.setName("Sequence n°13");
//		sequence13.setStatus(State.FAILED);
//		sequence13.setActivity(mySequence);
		
		return sequence13;
	}
	
}
