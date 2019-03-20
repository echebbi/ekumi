/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.events.impl;

import static fr.kazejiyu.ekumi.core.workflow.Status.FAILED;
import static fr.kazejiyu.ekumi.core.workflow.Status.RUNNING;
import static fr.kazejiyu.ekumi.core.workflow.Status.SUCCEEDED;
import static java.util.Objects.requireNonNull;

import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Status;
import fr.kazejiyu.ekumi.core.workflow.WorkflowPackage;

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

	private static boolean relatedToAStatusChange(Notification notification) {
		return notification.getFeature().equals(WorkflowPackage.Literals.HAS_STATUS__STATUS);
	}
	
	private static boolean oldAndNewValueAreEqual(Notification notification) {
		return Objects.equals(notification.getNewValue(), notification.getOldValue());
	}
	
}
