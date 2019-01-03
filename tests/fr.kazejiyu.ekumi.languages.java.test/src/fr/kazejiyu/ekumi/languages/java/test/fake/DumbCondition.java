package fr.kazejiyu.ekumi.languages.java.test.fake;

import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.impl.ConditionImpl;

/**
 * A simple {@link Condition} that is always verified.
 * 
 * @author Emmanuel CHEBBI
 */
public class DumbCondition extends ConditionImpl {

	@Override
	public boolean isVerified(StructuredLoop loop, Context context) {
		return true;
	}

}
