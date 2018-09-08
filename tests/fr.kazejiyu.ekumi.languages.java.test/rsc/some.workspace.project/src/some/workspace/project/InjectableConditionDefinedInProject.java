package some.workspace.project;

import javax.inject.Inject;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl;
import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.core.execution.events.Events;
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
