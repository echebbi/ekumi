package fr.kazejiyu.ekumi.tests.common.fake.activities;

import java.util.function.Predicate;

import fr.kazejiyu.ekumi.core.workflow.Condition;
import fr.kazejiyu.ekumi.core.workflow.Context;

/**
 * A condition that is verified upon a given predicate.
 */
public class VerifiedWhenContext implements Condition {
	
	private final Predicate<Context> verified;
	
	public VerifiedWhenContext(Predicate<Context> verified) {
		this.verified = verified;
	}

	@Override
	public boolean isVerified(Context context) {
		return verified.test(context);
	}
	
}
