/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Date;
import java.util.Optional;

import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;

/**
 * The execution of an {@link Activity}.
 */
public interface Execution extends Identifiable, HasState {

	/**
	 * Returns the context in which the activity is executed.
	 * @return the context of the execution
	 */
	Context context();

	/**
	 * <p>
	 * Returns the date at which the execution has {@link #start() started}
	 * <p>
	 * An empty Optional is returned if the execution has not started yet.
	 * 
	 * @return the date at which the execution has started
	 */
	Optional<Date> startDate();

	/**
	 * <p>
	 * Returns the date at which the execution has ended.
	 * <p>
	 * An empty Optional is returned if the execution is not over yet.
	 * 
	 * @return the date at which the execution has started
	 */
	Optional<Date> endDate();

	/**
	 * Starts the execution.
	 */
	void start();

	/**
	 * <p>
	 * Waits for the execution to end.
	 * <p>
	 * Has no effect if the execution is already over.
	 * 
	 * @throws InterruptedExecutionException if the process is interrupted while waiting
	 */
	void join() throws InterruptedExecutionException;

	/**
	 * <p>
	 * Cancels the execution.
	 * <p>
	 * Should return immediately even if the execution takes some time
	 * to be actually cancelled. Hence, users may call {@link #join()}
	 * afterwards to ensure that the execution is over.
	 * <p>
	 * Has no effect if the execution has not started 
	 * yet or if it has already ended.
	 */
	void cancel();

	/**
	 * Returns whether the execution is on going.
	 * @return whether the execution is on going
	 */
	boolean isRunning();

	/**
	 * Returns whether the execution has been cancelled.
	 * @return whether the execution has been cancelled
	 */
	boolean isCancelled();

}
