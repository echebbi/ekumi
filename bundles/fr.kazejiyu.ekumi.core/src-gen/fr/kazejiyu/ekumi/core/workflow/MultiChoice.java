/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a simple If / Else statement.
 * 
 * @see <a href="http://www.workflowpatterns.com/patterns/control/basic/wcp4.php">www.workflowpatterns.com</a>.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getMultiChoice()
 * @model
 * @generated
 */
public interface MultiChoice extends Activity {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.workflow.Branch}.
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getMultiChoice_Branches()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // MultiChoice
