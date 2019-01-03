/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(Condition)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getBranch_Availability()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Condition getAvailability();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Branch#getAvailability <em>Availability</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' containment reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Condition value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getBranch_Activity()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Branch#getActivity <em>Activity</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Branch
