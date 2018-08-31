package fr.kazejiyu.ekumi.tests.unit;

import static org.mockito.Mockito.when;

import org.assertj.core.api.WithAssertions;
import org.eclipse.core.runtime.IProgressMonitor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.core.execution.BasicExecutionStatus;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicExecutionStatus")
public class BasicExecutionStatusTest implements WithAssertions {
	
	private BasicExecutionStatus status;
	
	@Mock
	private BasicExecution execution;
	
	@Mock
	private IProgressMonitor monitor;
	
	@BeforeEach
	void setup() {
		status = new BasicExecutionStatus(execution, monitor);
	}
	
	@ParameterizedTest(name="when monitor is cancelled: {0} ; execution is cancelled: {1}")
	@CsvSource({"true, false", "false, true", "true, true"})
	@DisplayName("is cancelled") 
	void is_cancelled(boolean monitorIsCancelled, boolean executionIsCancelled) {
		when(monitor.isCanceled()).thenReturn(monitorIsCancelled);
		when(execution.isCancelled()).thenReturn(executionIsCancelled);
		
		assertThat(status.isCancelled()).isTrue();
	}
	
	@Test @DisplayName("is not cancelled when neither the monitor nor the execution is cancelled")
	void is_not_cancelled_when_neither_the_monitor_nor_the_execution_is_cancelled() {
		when(monitor.isCanceled()).thenReturn(false);
		when(execution.isCancelled()).thenReturn(false);
		
		assertThat(status.isCancelled()).isFalse();
	}

}
