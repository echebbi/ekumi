package fr.kazejiyu.ekumi.ide.history.internal;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

import fr.kazejiyu.ekumi.EKumiPlugin;
import fr.kazejiyu.ekumi.core.ekumi.History;
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
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		PersistedHistory history = new PersistedHistory(EKumiPlugin.getStateLocation().resolve("executions"));
		ContextInjectionFactory.inject(history, context);
		return history;
	}

}
