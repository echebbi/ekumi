/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import java.util.Optional;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.kazejiyu.ekumi.core.execution.events.Events;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Context#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getContext_Variables()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.Events"
	 * @generated
	 */
	Events events();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.ExecutionStatus"
	 * @generated
	 */
	ExecutionStatus execution();

	/**
	 * Returns whether a variables called {@code name} is defined.
	 * 
	 * @param name
	 * 			The name of the variable to look for.
	 * 			Must not be {@code null}.
	 * 
	 * @return {@code true} is a variable called {@code name} exists, 
	 * 		   {@code false} otherwise.
	 */
	boolean contains(String name);

	/**
	 * Returns the specified variable, if found.
	 * 
	 * @param name
	 * 			The name of the variable to look for.
	 * 
	 * @return the variable called {@code name}, if found
	 */
	Optional<Variable> get(String name);

	/**
	 * Creates a new variable.<br>
	 * <br>
	 * If a variable called {@code name} already exist, it is replaced.
	 * 
	 * @param name
	 * 			The name of the new variable.
	 * 			Must not be {@code null}.
	 * @param value
	 * 			The value of the new variable.
	 */
	void set(String name, Object value);

	/**
	 * Removes a variable from the context.
	 * 
	 * @param name
	 * 			The name of the variable to remove.
	 * 			Must not be {@code null}.
	 */
	void unset(String name);

} // Context
