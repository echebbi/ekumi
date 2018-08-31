/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Status</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getExecutionStatus()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ExecutionStatus extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void isStarted();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void isCancelled();

} // ExecutionStatus
