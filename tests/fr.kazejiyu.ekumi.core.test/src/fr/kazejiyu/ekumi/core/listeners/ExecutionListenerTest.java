package fr.kazejiyu.ekumi.core.listeners;

import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.execution.listeners.ExecutionListener;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An executionListener")
public class ExecutionListenerTest {
	
	private ExecutionListener listener;
	
	@Mock
	private Execution execution;
	
	@BeforeEach
	void setup() {
		listener = new ExecutionListener() {};
	}
	
	@Test @DisplayName("does nothing on execution started")
	void does_nothing_on_execution_started() {
		listener.onExecutionStarted(execution);
		verifyZeroInteractions(execution);
	}
	
	@Test @DisplayName("does nothing on execution paused")
	void does_nothing_on_execution_paused() {
		listener.onExecutionPaused(execution);
		verifyZeroInteractions(execution);
	}
	
	@Test @DisplayName("does nothing on execution resumed")
	void does_nothing_on_execution_resumed() {
		listener.onExecutionResumed(execution);
		verifyZeroInteractions(execution);
	}
	
	@Test @DisplayName("does nothing on execution terminated")
	void does_nothing_on_execution_terminated() {
		listener.onExecutionTerminated(execution);
		verifyZeroInteractions(execution);
	}
	
	@Test @DisplayName("does nothing on execution succeeded")
	void does_nothing_on_execution_succeded() {
		listener.onExecutionSucceeded(execution);
		verifyZeroInteractions(execution);
	}

}
