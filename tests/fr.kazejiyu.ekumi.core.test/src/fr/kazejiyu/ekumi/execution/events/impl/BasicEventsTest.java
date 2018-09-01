package fr.kazejiyu.ekumi.execution.events.impl;

import static org.mockito.Mockito.*;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;
import fr.kazejiyu.ekumi.core.execution.listeners.ActivityListener;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A BasicEvents")
public class BasicEventsTest implements WithAssertions {
	
	@Mock
	private Activity activity;
	
	@Mock
	private ActivityListener listener;
	
	private BasicEvents events;
	
	@BeforeEach
	void setupSUT() {
		events = new BasicEvents();
		events.onActivityFailed(listener);
		events.onActivityStarted(listener);
		events.onActivitySucceeded(listener);
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
		
	}
	
	@Nested @DisplayName("when broadcasting new events")
	class WhenBroadcastingNewEvents {
		
		@Test @DisplayName("notifies all its listeners on activity started")
		void notifiies_all_its_listeners_on_activity_started() {
			events.hasStarted(activity);
			
			verify(listener, only()).onActivityStarted(activity);
		}
		
		@Test @DisplayName("notifies all its listeners on activity failed")
		void notifiies_all_its_listeners_on_activity_failed() {
			events.hasFailed(activity);
			
			verify(listener, only()).onActivityFailed(activity);
		}
		
		@Test @DisplayName("notifies all its listeners on activity succeeded")
		void notifiies_all_its_listeners_on_activity_succeeded() {
			events.hasSucceeded(activity);
			
			verify(listener, only()).onActivitySucceeded(activity);
		}
		
	}

}
