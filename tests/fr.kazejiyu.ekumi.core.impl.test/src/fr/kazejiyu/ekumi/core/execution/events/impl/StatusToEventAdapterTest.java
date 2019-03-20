package fr.kazejiyu.ekumi.core.execution.events.impl;

import static org.mockito.Mockito.only;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Status;
import fr.kazejiyu.ekumi.core.workflow.WorkflowPackage;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A StatusToEventAdapter")
public class StatusToEventAdapterTest {

	private StatusToEventAdapter adapter;
	
	@Mock private Events events;
	
	@Mock private Activity activity;
	
	@Mock private Notification notification;
	
	@BeforeEach
	void createAdapter() {
		adapter = new StatusToEventAdapter(events);
		
		// when the notification comes from a change in activity
		when(notification.getNotifier()).thenReturn(activity);
		
		// when the notification is related to a change in the status feature
		when(notification.getFeature()).thenReturn(WorkflowPackage.Literals.HAS_STATUS__STATUS);
		when(notification.getFeatureID(Activity.class)).thenReturn(WorkflowPackage.HAS_STATUS__STATUS);
	}
	
	@Test @DisplayName("calls events.hasStarted when an activity's status becomes RUNNING")
	void calls_events_hasStarted_when_an_activity_status_becomes_RUNNING() {
		when(activity.getStatus()).thenReturn(Status.RUNNING);
		when(notification.getNewValue()).thenReturn(Status.RUNNING);
		
		adapter.notifyChanged(notification);
		
		verify(events, only()).hasStarted(activity);
	}
	
	@Test @DisplayName("calls events.hasSucceeeded when an activity's status becomes SUCCEEDED")
	void calls_events_hasSucceeded_when_an_activity_status_becomes_SUCCEEDED() {
		when(activity.getStatus()).thenReturn(Status.SUCCEEDED);
		when(notification.getNewValue()).thenReturn(Status.SUCCEEDED);
		
		adapter.notifyChanged(notification);
		
		verify(events, only()).hasSucceeded(activity);
	}
	
	@Test @DisplayName("calls events.hasFailed when an activity's status becomes FAILED")
	void calls_events_hasFailed_when_an_activity_status_becomes_FAILED() {
		when(activity.getStatus()).thenReturn(Status.FAILED);
		when(notification.getNewValue()).thenReturn(Status.FAILED);
		
		adapter.notifyChanged(notification);
		
		verify(events, only()).hasFailed(activity);
	}
	
	@ParameterizedTest(name="when status is {0}")
	@MethodSource("unusedStatus")
	@DisplayName("does nothing when an activity's status is irrelevant")
	void does_nothing_when_an_activity_status_is_irrelevant(Status irrelevantStatus) {
		when(activity.getStatus()).thenReturn(irrelevantStatus);
		when(notification.getNewValue()).thenReturn(irrelevantStatus);
		
		adapter.notifyChanged(notification);
		
		verifyZeroInteractions(events);
	}
	
	static Stream<Arguments> unusedStatus() {
		return Stream.of(
			Arguments.of(Status.IDLE)
		);
	}
	
	@ParameterizedTest(name="when status is {0}")
	@EnumSource(Status.class)
	@DisplayName("does nothing when the old and the new status are equal")
	void does_nothing_when_the_old_and_the_new_status_are_equal(Status status) {
		when(activity.getStatus()).thenReturn(status);
		when(notification.getNewValue()).thenReturn(status);
		when(notification.getOldValue()).thenReturn(status);
		
		adapter.notifyChanged(notification);
		
		verifyZeroInteractions(events);
	}
	
	@ParameterizedTest
	@MethodSource("irrelevantFeatures")
	@DisplayName("does nothing when notified for a change in a feature that is not status")
	void does_nothing_for_a_change_in_a_feature_that_is_not_status(int featureId, Object feature) {
		when(notification.getFeature()).thenReturn(feature);
		when(notification.getFeatureID(Activity.class)).thenReturn(featureId);
		
		adapter.notifyChanged(notification);
		
		verifyZeroInteractions(events);
	}
	
	static Stream<Arguments> irrelevantFeatures() {
		return Stream.of(
			Arguments.of(WorkflowPackage.ACTIVITY__INPUTS, WorkflowPackage.Literals.IDENTIFIABLE__NAME),
			Arguments.of(WorkflowPackage.DRIVER_RUNNER__DRIVEN, WorkflowPackage.Literals.DRIVER_RUNNER__DRIVEN)
		);
	}
}
