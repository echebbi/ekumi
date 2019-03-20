package fr.kazejiyu.ekumi.core.listeners;

import static org.mockito.Mockito.verifyZeroInteractions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("An ActivityListener")
public class ActivityListenerTest {
	
	private ActivityListener listener;
	
	@Mock
	private Activity activity;
	
	@BeforeEach
	void setup() {
		listener = new ActivityListener() {};
	}
	
	@Test @DisplayName("does nothing on activity started")
	void does_nothing_on_activity_started() {
		listener.onActivityStarted(activity);
		verifyZeroInteractions(activity);
	}
	
	@Test @DisplayName("does nothing on activity failed")
	void does_nothing_on_activity_failed() {
		listener.onActivityFailed(activity);
		verifyZeroInteractions(activity);
	}
	
	@Test @DisplayName("does nothing on activity succeeded")
	void does_nothing_on_activity_succeded() {
		listener.onActivitySucceeded(activity);
		verifyZeroInteractions(activity);
	}

}
