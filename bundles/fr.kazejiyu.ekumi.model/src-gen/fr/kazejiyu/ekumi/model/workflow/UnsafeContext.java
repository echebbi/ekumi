/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getUnsafeContext()
 * @model
 * @generated
 */
public interface UnsafeContext extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getUnsafeContext_Variables()
	 * <!-- end-user-doc -->
	 * @model containment="true" derived="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Execution</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Execution#getContext <em>Context</em>}'.
	 * @return the value of the '<em>Execution</em>' container reference.
	 * @see #setExecution(Execution)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getUnsafeContext_Execution()
	 * @see fr.kazejiyu.ekumi.model.workflow.Execution#getContext
	 * <!-- end-user-doc -->
	 * @model opposite="context" transient="false"
	 * @generated
	 */
	Execution getExecution();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext#getExecution <em>Execution</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution</em>' container reference.
	 * @see #getExecution()
	 * @generated
	 */
	void setExecution(Execution value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Events</b></em>' attribute.
	 * @return the value of the '<em>Events</em>' attribute.
	 * @see #setEvents(Events)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getUnsafeContext_Events()
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.model.workflow.Events" transient="true"
	 * @generated
	 */
	Events getEvents();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext#getEvents <em>Events</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events</em>' attribute.
	 * @see #getEvents()
	 * @generated
	 */
	void setEvents(Events value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Execution Status</b></em>' attribute.
	 * @return the value of the '<em>Execution Status</em>' attribute.
	 * @see #setExecutionStatus(ExecutionStatus)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getUnsafeContext_ExecutionStatus()
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.model.workflow.ExecutionStatus" transient="true"
	 * @generated
	 */
	ExecutionStatus getExecutionStatus();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext#getExecutionStatus <em>Execution Status</em>}' attribute.
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
