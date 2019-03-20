/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getExecutable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Executable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void run(Context context);

} // Executable
