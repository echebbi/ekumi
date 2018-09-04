package fr.kazejiyu.ekumi.ide.history.internal;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IContextFunction;
import org.eclipse.e4.core.contexts.IEclipseContext;

import fr.kazejiyu.ekumi.ide.history.WorkspaceExecutionHistory;

public class WorkspaceExecutionHistoryCreationFunction implements IContextFunction {
	
	@Override
	public Object compute(IEclipseContext context, String contextKey) {
		return ContextInjectionFactory.make(WorkspaceExecutionHistory.class, context);
	}

}
