/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Optional;

import org.eclipse.collections.api.map.ImmutableMap;
import org.eclipse.collections.api.tuple.Pair;

import fr.kazejiyu.ekumi.core.exceptions.DataNotFoundException;
import fr.kazejiyu.ekumi.core.execution.ExecutionState;
import fr.kazejiyu.ekumi.core.execution.events.Events;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getContext()
 * @model
 * @generated
 */
public interface Context {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.core.workflow.Events"
	 * @generated
	 */
	Events events();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.core.workflow.ExecutionStatus"
	 * @generated
	 */
	ExecutionState execution();
	
	
	ImmutableMap<String, Object> env();

	/**
	 * Returns whether a specific variable exists in the environment.
	 * 
	 * @param name
	 * 			The name of the variable to look for.
	 */
	default boolean contains(String name) {
		return env().containsKey(name);
	}

	/**
	 * Returns a specific environment variable.
	 * 
	 * @param variable
	 * 			The name of the variable to look for.
	 * 
	 * @return the value of an environment variable
	 * 
	 * @throws DataNotFoundException if not variable with the given name can be found
	 * 
	 * @see #find(String)
	 * @see #contains(String)
	 */
	default Object get(String variable) {
		return env().detectOptional((name, value) -> name.equals(variable))
					.map(Pair::getTwo)
					.orElseThrow(() -> new DataNotFoundException(variable));
	}

	/**
	 * Returns the specified variable, if found.
	 * 
	 * @param name
	 * 			The name of the variable to look for.
	 * 
	 * @return the variable called {@code name}, if found
	 */
	default Optional<Object> find(String variable) {
		return env().detectOptional((name, value) -> name.equals(variable))
					.map(Pair::getTwo);
	}

	/**
	 * <p>
	 * Creates a new variable in the environment.
	 * <p>
	 * If the variable already exists then its value is updated.
	 * <p>
	 * If the value is null, then the variable is {@link #unset(String) unset}.
	 * 
	 * @param name
	 * 			The name of the variable to create.
	 * @param value
	 * 			The value of the new variable.
	 * 
	 * @throws NullPointerException if name is null
	 */
	void set(String name, Object value);

	/**
	 * Removes a variable from the environment.
	 */
	void unset(String name);

}
