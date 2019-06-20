/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;

import fr.kazejiyu.ekumi.core.workflow.impl.DelegatingCondition;

/**
 * A script that can be evaluated as a boolean.
 */
public interface Condition {
	
	/**
	 * Returns whether the condition is verified.
	 * 
	 * @param context
	 * 			The execution context.
	 * 
	 * @return {@code true} if the condition is verified,
	 * 		   {@code false} otherwise.
	 */
	boolean isVerified(Context context);
	
	/**
	 * Creates a new condition from the given supplier.
	 * <p>
	 * When tested, the returned condition will execute the supplier.
	 * 
	 * @param isVerified
	 * 			The supplier specifying the behavior of the condition.
	 * 
	 * @return a new condition which behavior corresponds to the given supplier.
	 */
	public static Condition of(BooleanSupplier isVerified) {
		return of(context -> isVerified.getAsBoolean());
	}
	
	/**
	 * Creates a new condition from the given predicate.
	 * <p>
	 * When tested, the returned condition will execute the predicate.
	 * 
	 * @param isVerified
	 * 			The predicate specifying the behavior of the activity.
	 * 
	 * @return a new condition which behavior corresponds to the given consumer.
	 */
	public static Condition of(Predicate<Context> isVerified) {
		return new DelegatingCondition(isVerified);
	}

}
