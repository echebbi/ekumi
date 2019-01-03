/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getParallelSplit()
 * @model
 * @generated
 */
public interface ParallelSplit extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Activity}.
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getParallelSplit_Branches()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getBranches();

} // ParallelSplit
