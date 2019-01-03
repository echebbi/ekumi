/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getHistory()
 * @model
 * @generated
 */
public interface History extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Execution}.
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getHistory_Executions()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

} // History
