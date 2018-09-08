package some.workspace.project;

import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl;

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
