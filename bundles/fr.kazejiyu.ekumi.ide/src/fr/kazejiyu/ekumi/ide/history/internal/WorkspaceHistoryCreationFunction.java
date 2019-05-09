/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.ide.history.internal;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.services.events.IEventBroker;

import fr.kazejiyu.ekumi.core.EKumiPlugin;
import fr.kazejiyu.ekumi.core.execution.History;
import fr.kazejiyu.ekumi.ide.history.PersistExecution;
import fr.kazejiyu.ekumi.ide.history.PersistedHistory;

/**
 * An OSGI Declarative Service making an {@link History} instance available for injection.<br>
 * <br>
 * This history is an instance of {@link PersistedHistory} that points to the following folder:
 * <ul>
 * 	<li> {@link EKumiPlugin#getStateLocation()}/executions
 * </ul>
 * which is the default location for {@link PersistExecution persisted} executions.
 * 
 * @author Emmanuel CHEBBI
 */
public class WorkspaceHistoryCreationFunction implements IContextFunction {
	
	@Inject
	IEventBroker broker;
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		PersistedHistory history = new PersistedHistory(EKumiPlugin.getStateLocationPath().resolve("executions"));
		try {
			history.notifyOnChange(context.get(IEventBroker.class));
			
		} catch (Exception e) {
			EKumiPlugin.error(e, "An error occurred while computing the history of executions. Won't be able to listen for changes in real time.");
		}
		ContextInjectionFactory.inject(history, context);
		return history;
	}

}
