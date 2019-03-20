/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException;
import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.core.execution.events.Events;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {

	/**
	 * Returns the specified variable, if found.
	 * 
	 * @param name
	 * 			The name of the variable to look for.
	 * 
	 * @return the variable called {@code name}, if found
	 */
	default Optional<Variable> find(String name) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns all the variables contained by this context.
	 * @return all the variables of the context
	 * <!-- end-user-doc -->
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EList<Variable> getVariables();

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
	ExecutionStatus execution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	boolean contains(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.kazejiyu.ekumi.core.workflow.VariableNotFoundException" nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	Variable get(String name) throws VariableNotFoundException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void set(String name, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	void unset(String name);

} // Context
