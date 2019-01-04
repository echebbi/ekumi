/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import fr.kazejiyu.ekumi.model.exceptions.InterruptedExecutionException;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getExecution()
 * @model
 * @generated
 */
public interface Execution extends Identifiable, HasStatus {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getExecution_Activity()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Execution#getActivity <em>Activity</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext#getExecution <em>Execution</em>}'.
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(UnsafeContext)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getExecution_Context()
	 * @see fr.kazejiyu.ekumi.model.workflow.UnsafeContext#getExecution
	 * <!-- end-user-doc -->
	 * @model opposite="execution" containment="true"
	 * @generated
	 */
	UnsafeContext getContext();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Execution#getContext <em>Context</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(UnsafeContext value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getExecution_StartDate()
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Execution#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="fr.kazejiyu.ekumi.model.workflow.InterruptedExecutionException"
	 * @generated
	 */
	void join() throws InterruptedExecutionException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isRunning();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isCancelled();

} // Execution
