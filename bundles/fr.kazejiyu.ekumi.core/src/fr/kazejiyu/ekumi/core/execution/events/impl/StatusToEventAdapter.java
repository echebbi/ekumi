package fr.kazejiyu.ekumi.core.execution.events.impl;

import static fr.kazejiyu.ekumi.core.ekumi.Status.FAILED;
import static fr.kazejiyu.ekumi.core.ekumi.Status.RUNNING;
import static fr.kazejiyu.ekumi.core.ekumi.Status.SUCCEEDED;
import static java.util.Objects.requireNonNull;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Status;
import fr.kazejiyu.ekumi.core.execution.events.Events;

/**
 * Listens for the {@link Status status} of an {@link Activity} to change.<br>
 * <br>
 * If the attached Activity contains other objects they will be watched too.
 */
public class StatusToEventAdapter extends EContentAdapter {
	
	/** Event bus used to broadcast events */
	private final Events events;
	
	/**
	 * Creates a new adapter able to watch an {@link Activity}.
	 * 
	 * @param events
	 * 			The event bus used to broadcast events.
	 * 			Must not be {@code null}.
	 */
	public StatusToEventAdapter(Events events) {
		super();
		this.events = requireNonNull(events, "The event bus must not be null");
	}


	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		
		if (! relatedToAStatusChange(notification) || oldAndNewValueAreEqual(notification))
			return;
		
		Status newStatus = (Status) notification.getNewValue();
		Activity activity = (Activity) notification.getNotifier();
		
		if (newStatus == RUNNING)
			events.hasStarted(activity);
		else if (newStatus == SUCCEEDED)
			events.hasSucceeded(activity);
		else if (newStatus == FAILED)
			events.hasFailed(activity);
	}

	private boolean relatedToAStatusChange(Notification notification) {
		return notification.getFeature().equals(EkumiPackage.Literals.HAS_STATUS__STATUS);
	}
	
	private boolean oldAndNewValueAreEqual(Notification notification) {
		return Objects.equals(notification.getNewValue(), notification.getOldValue());
	}
	
}
