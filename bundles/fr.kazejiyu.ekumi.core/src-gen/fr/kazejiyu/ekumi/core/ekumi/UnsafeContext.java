/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;

import fr.kazejiyu.ekumi.core.execution.events.Events;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsafe Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getVariables <em>Variables</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getExecution <em>Execution</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getEvents <em>Events</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getExecutionStatus <em>Execution Status</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getUnsafeContext()
 * @model abstract="true"
 * @generated
 */
public interface UnsafeContext extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getUnsafeContext_Variables()
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Execution</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getContext <em>Context</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution</em>' reference.
	 * @see #setExecution(Execution)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getUnsafeContext_Execution()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Execution#getContext
	 * @model opposite="context"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getExecution <em>Execution</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Events</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' attribute.
	 * @see #setEvents(Events)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getUnsafeContext_Events()
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.Events"
	 * @generated
	 */
	Events getEvents();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getEvents <em>Events</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' attribute.
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(Events value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Status</em>' attribute.
	 * @see #setExecutionStatus(ExecutionStatus)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getUnsafeContext_ExecutionStatus()
	 * @model dataType="fr.kazejiyu.ekumi.core.ekumi.ExecutionStatus"
	 * @generated
	 */
	ExecutionStatus getExecutionStatus();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.UnsafeContext#getExecutionStatus <em>Execution Status</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Status</em>' attribute.
	 * @see #getExecutionStatus()
	 * @generated
	 */
	void setExecutionStatus(ExecutionStatus value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Context safe();

} // UnsafeContext
