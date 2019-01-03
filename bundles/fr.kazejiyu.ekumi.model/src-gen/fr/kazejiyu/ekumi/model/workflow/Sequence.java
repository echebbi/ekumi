/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getSequence()
 * @model
 * @generated
 */
public interface Sequence extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getSequence_Root()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Activity getRoot();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Sequence#getRoot <em>Root</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Activity}.
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getSequence_Activities()
	 * <!-- end-user-doc -->
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Activity> getActivities();

} // Sequence
