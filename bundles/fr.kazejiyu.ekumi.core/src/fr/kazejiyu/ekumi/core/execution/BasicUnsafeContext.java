package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.impl.UnsafeContextImpl;
import fr.kazejiyu.ekumi.core.execution.events.impl.BasicEvents;

public class BasicUnsafeContext extends UnsafeContextImpl {
	
	BasicUnsafeContext() {
		setEvents(new BasicEvents());
	}

	@Override
	public Context safe() {
		return new BasicContext(getEvents(), getExecutionStatus());
	}

}
