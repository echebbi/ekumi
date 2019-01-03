package some.workspace.project;

import javax.inject.Inject;

import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.impl.ConditionImpl;
import fr.kazejiyu.ekumi.model.workflow.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.workflow.execution.events.Events;
import fr.kazejiyu.ekumi.tests.common.fake.activities.Injectable;

/**
 * A simple {@link Condition} that does nothing but waits for being injected.<br>
 * <br>
 * The only purpose of this class is to test the loading of 
 * injectable {@link Condition}s defined within a workspace project.
 * 
 * @see {@code fr.kazejiyu.ekumi.languages.java.tests} plug-in.
 * 
 * @author Emmanuel CHEBBI
 */
public class InjectableConditionDefinedInProject extends ConditionImpl implements Injectable {
	
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
