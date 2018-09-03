package fr.kazejiyu.ekumi.ide.history.internal;

import org.eclipse.e4.core.contexts.ContextFunction;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

import fr.kazejiyu.ekumi.ide.history.WorkspaceExecutionHistory;

public class WorkspaceExecutionHistoryCreationFunction extends ContextFunction {
	
	public WorkspaceExecutionHistoryCreationFunction() {
		System.out.println("WorkspaceExecutionHistoryCreationFunction.WorkspaceExecutionHistory()");
	}
	
	@Override
	public Object compute(IEclipseContext context) {
		System.out.println("WorkspaceExecutionHistoryCreationFunction.compute()");
		return ContextInjectionFactory.make(WorkspaceExecutionHistory.class, context);
	}

}
