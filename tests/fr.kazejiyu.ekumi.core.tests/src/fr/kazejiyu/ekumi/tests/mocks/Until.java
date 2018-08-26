package fr.kazejiyu.ekumi.tests.mocks;

import fr.kazejiyu.ekumi.core.ekumi.Context;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.Variable;
import fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl;

public class Until extends ConditionImpl {
	
	private final String variable;
	
	private final int max;
	
	public Until(String variable, int max) {
		this.variable = variable;
		this.max = max;
	}

	@Override
	public boolean isVerified(StructuredLoop loop, Context context) {
		return context.get(variable).map(Variable::getValue)
									.filter(Number.class::isInstance)
									.map(Number.class::cast)
									.filter(value -> value.doubleValue() >= max)
									.isPresent();
	}
	
}
