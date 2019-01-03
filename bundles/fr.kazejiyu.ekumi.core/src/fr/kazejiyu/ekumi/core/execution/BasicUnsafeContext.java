package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.UnsafeContextImpl;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;

class BasicUnsafeContext extends UnsafeContextImpl {
	
	BasicUnsafeContext() {
		setEvents(new BasicEvents());
	}

	@Override
	public Context safe() {
		return new BasicContext(getEvents(), getExecutionStatus());
	}

}
