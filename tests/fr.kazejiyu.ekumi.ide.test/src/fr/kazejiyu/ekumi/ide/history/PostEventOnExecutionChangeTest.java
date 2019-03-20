package fr.kazejiyu.ekumi.ide.history;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

import java.io.File;

import org.assertj.core.api.WithAssertions;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.workflow.Execution;
import fr.kazejiyu.ekumi.ide.events.EKumiEvents;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A PostEventOnExecutionChange")
public class PostEventOnExecutionChangeTest implements WithAssertions {
	
	@Mock IEventBroker broker;
	
	Execution expectedExecution;
	
	PostEventOnExecutionChange listener;
	
	File expectedExecutionModel = new File("./rsc/executions/2018.09.20.1120402040.sequence-13/Sequence n°13.workflow");
	
	@BeforeEach
	void setup() {
		listener = new PostEventOnExecutionChange(broker);
		expectedExecution = PersistedHistory.loadExecutionFromFile(expectedExecutionModel);
	}
	
	@Nested @DisplayName("when instantiated")
	class WhenInstantiated {
		
		@Test @DisplayName("throws if the IEventBroker is null")
		void throws_if_the_IEventBroker_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				new PostEventOnExecutionChange(null)
			);
		}
		
	}
	
	@Nested @DisplayName("when a file is created")
	class WhenAFileIsCreated {
		
		@Test @DisplayName("does nothing if the file is '.lock'")
		void does_nothing_if_the_file_is_lock() {
			File lock = new File(".lock");
			assertThatCode(() -> listener.onFileCreate(lock)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("does not throw when the .ekumi file does not exist")
		void does_not_throw_when_the_ekumi_file_does_not_exist() {
			File model = new File("execution.ekumi");
			assertThatCode(() -> listener.onFileCreate(model)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("posts the appropriate event")
		void posts_the_appropriate_event() {
			listener.onFileCreate(expectedExecutionModel);
			verify(broker, only()).post(eq(EKumiEvents.HISTORY_EXECUTION_STARTED), any());
		}
		
		@Test @DisplayName("posts the appropriate execution")
		void posts_the_appropriate_execution() {
			listener.onFileCreate(expectedExecutionModel);
			verify(broker, only()).post(any(), argThat(new ExecutionMatcher(expectedExecution)));
		}
		
	}
	
	@Nested @DisplayName("when a file is deleted")
	class WhenAFileIsDeleted {
		
		@Test @DisplayName("does nothing")
		void does_nothing_if_the_file_is_lock() {
			File deleted = new File(".");
			assertThatCode(() -> listener.onFileDelete(deleted)).doesNotThrowAnyException();
		}
		
	}
	
	@Nested @DisplayName("when a file changes")
	class WhenAFileChanges {
		
		@Test @DisplayName("does nothing if the file is '.lock'")
		void does_nothing_if_the_file_is_lock() {
			File lock = new File(".lock");
			assertThatCode(() -> listener.onFileChange(lock)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("does not throw when the .ekumi file does not exist")
		void does_not_throw_when_the_ekumi_file_does_not_exist() {
			File model = new File("execution.ekumi");
			assertThatCode(() -> listener.onFileChange(model)).doesNotThrowAnyException();
		}
		
		@Test @DisplayName("posts the appropriate event")
		void posts_the_appropriate_event() {
			listener.onFileChange(expectedExecutionModel);
			verify(broker, only()).post(eq(EKumiEvents.HISTORY_EXECUTION_CHANGED), any());
		}
		
		@Test @DisplayName("posts the appropriate execution")
		void posts_the_appropriate_execution() {
			listener.onFileChange(expectedExecutionModel);
			verify(broker, only()).post(any(), argThat(new ExecutionMatcher(expectedExecution)));
		}
		
	}

}
