package fr.kazejiyu.ekumi.languages.java.test.fake;

import javax.inject.Inject;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.impl.RunnerImpl;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;

public class InjectableRunner extends RunnerImpl implements Injectable {
	
	@Inject
	private Events events;
	
	@Inject
	private ExecutionStatus status;

	@Override
	public void run(Context context) {
		// does nothing
	}

	@Override
	public boolean hasBeenInjected() {
		return events != null && status != null;
	}

}
