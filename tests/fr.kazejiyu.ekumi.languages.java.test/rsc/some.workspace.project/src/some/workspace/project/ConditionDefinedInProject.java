package some.workspace.project;

import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.impl.ConditionImpl;

/**
 * A simple {@link Condition} that is always verified.<br>
 * <br>
 * The only purpose of this class is to test the loading of 
 * {@link Condition}s defined within a workspace project.
 * 
 * @see {@code fr.kazejiyu.ekumi.languages.java.tests} plug-in.
 * 
 * @author Emmanuel CHEBBI
 */
public class ConditionDefinedInProject extends ConditionImpl {

	@Override
	public boolean isVerified(StructuredLoop loop, Context context) {
		return true;
	}

}
