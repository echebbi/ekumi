package fr.kazejiyu.ekumi.core.execution.events.impl;

import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.model.execution.listeners.ExecutionListener;
import fr.kazejiyu.ekumi.model.execution.listeners.OnActivityFailed;
import fr.kazejiyu.ekumi.model.execution.listeners.OnActivityStarted;
import fr.kazejiyu.ekumi.model.execution.listeners.OnActivitySucceeded;
import fr.kazejiyu.ekumi.model.execution.listeners.OnExecutionStarted;
import fr.kazejiyu.ekumi.model.execution.listeners.OnExecutionSucceeded;
import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicEvents")
public class BasicEventsTest implements WithAssertions {
	
	// Software under test
	private BasicEvents events;
	
	@Mock private Activity activity;
	
	@Mock private Execution execution;
	
	@Mock private ActivityListener activityListener;
	
	@Mock private ExecutionListener executionListener;
	
	@BeforeEach
	void createEventsAndRegisterListeners() {
		events = new BasicEvents();
		events.onActivityEvent(activityListener);
		events.onExecutionEvent(executionListener);
	}
	
	@Nested @DisplayName("when registering new listeners")
	class WhenRegisteringNewListeners {
		
		@Test @DisplayName("throws if OnActivityStarted is null") 
		void throws_if_OnActivityStarted_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onActivityStarted(null)
			);
		}
		
		@Test @DisplayName("throws if OnActivityFailed is null")
		void throws_if_OnActivityFailed_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onActivityFailed(null)
			);
		}
		
		@Test @DisplayName("throws if OnActivitySucceeded is null")
		void throws_if_OnActivitySucceeded_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onActivitySucceeded(null)
			);
		}
		
		@Test @DisplayName("throws if OnActivityListener is null") 
		void throws_if_OnActivityListener_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onActivityEvent(null)
			);
		}
		
		@Test @DisplayName("throws if OnExecutionStarted is null")
		void throws_if_OnExecutionStarted_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onExecutionStarted(null)
			);
		}
		
		@Test @DisplayName("throws if OnExecutionSucceeded is null")
		void throws_if_OnExecutionSucceeded_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onExecutionSucceeded(null)
			);
		}
		
		@Test @DisplayName("throws if OnExecutionListener is null")
		void throws_if_OnExecutionListener_is_null() {
			assertThatNullPointerException().isThrownBy(() ->
				events.onExecutionEvent(null)
			);
		}
		
	}
	
	@Nested @DisplayName("when broadcasting new events")
	class WhenBroadcastingNewEvents {
		
		@Test @DisplayName("notifies all its listeners on activity started")
		void notifies_all_its_listeners_on_activity_started(@Mock OnActivityStarted onStarted) {
			// given a dedicated listener
			events.onActivityStarted(onStarted);
			
			// when the event is broadcasted
			events.hasStarted(activity);
			
			// then the listeners are notified
			verify(onStarted, only()).onActivityStarted(activity);
			verify(activityListener, only()).onActivityStarted(activity);
		}
		
		@Test @DisplayName("notifies all its listeners on activity failed")
		void notifies_all_its_listeners_on_activity_failed(@Mock OnActivityFailed onFailed) {
			// given a dedicated listener
			events.onActivityFailed(onFailed);
			
			// when the event is broadcasted
			events.hasFailed(activity);
			
			// then listeners are notified
			verify(onFailed, only()).onActivityFailed(activity);
			verify(activityListener, only()).onActivityFailed(activity);
		}
		
		@Test @DisplayName("notifies all its listeners on activity succeeded")
		void notifies_all_its_listeners_on_activity_succeeded(@Mock OnActivitySucceeded onSucceeded) {
			// given a dedicated listener
			events.onActivitySucceeded(onSucceeded);
			
			// when the event is broadcasted
			events.hasSucceeded(activity);
			
			// then the listeners are notified
			verify(onSucceeded, only()).onActivitySucceeded(activity);
			verify(activityListener, only()).onActivitySucceeded(activity);
		}
		
		@Test @DisplayName("notifies all its listeners on execution started")
		void notifies_all_its_listeners_on_execution_started(@Mock OnExecutionStarted onStarted) {
			// given a dedicated listener
			events.onExecutionStarted(onStarted);
			
			// when the event is broadcasted
			events.hasStarted(execution);
			
			// then listeners are notified
			verify(onStarted, only()).onExecutionStarted(execution);
			verify(executionListener, only()).onExecutionStarted(execution);
		}
		
		@Test @DisplayName("notifies all its listeners on execution succeeded")
		void notifies_all_its_listeners_on_execution_succeeded(@Mock OnExecutionSucceeded onSucceeded) {
			// given a dedicated listener
			events.onExecutionSucceeded(onSucceeded);
			
			// when the event is broadcasted
			events.hasSucceeded(execution);
			
			// then the listeners are notified
			verify(onSucceeded, only()).onExecutionSucceeded(execution);
			verify(executionListener, only()).onExecutionSucceeded(execution);
		}
		
	}

}
