package fr.kazejiyu.ekumi.languages.java.test.fake;

import javax.inject.Inject;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl;
import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.core.execution.events.Events;
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
