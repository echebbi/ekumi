/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getHasStatus()
 * @model
 * @generated
 */
public interface HasStatus extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.kazejiyu.ekumi.model.workflow.Status}.
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.model.workflow.Status
	 * @see #setStatus(Status)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getHasStatus_Status()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.HasStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.model.workflow.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // HasStatus
