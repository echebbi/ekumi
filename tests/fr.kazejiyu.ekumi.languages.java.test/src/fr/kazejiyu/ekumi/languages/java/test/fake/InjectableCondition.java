package fr.kazejiyu.ekumi.languages.java.test.fake;

import javax.inject.Inject;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.impl.ConditionImpl;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;

public class InjectableCondition extends ConditionImpl implements Injectable {
	
	@Inject
	private Events events;
	
	@Inject
	private ExecutionStatus status;
	
	@Override
	public boolean isVerified(StructuredLoop loop, Context context) {
		return true;
	}

	@Override
	public boolean hasBeenInjected() {
		return events != null && status != null;
	}

}
