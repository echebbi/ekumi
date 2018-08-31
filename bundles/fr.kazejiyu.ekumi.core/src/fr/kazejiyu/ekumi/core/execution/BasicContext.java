package fr.kazejiyu.ekumi.core.execution;

import fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl;
import fr.kazejiyu.ekumi.core.execution.events.Events;

public class BasicContext extends ContextImpl {
	
	private final Events events;
	
	private final ExecutionStatus status;
	
	public BasicContext(Events events, ExecutionStatus status) {
		super();
		this.events = events;
		this.status = status;
	}

	@Override
	public Events events() {
		return events;
	}

	@Override
	public ExecutionStatus execution() {
		return status;
	}
	
	

}
