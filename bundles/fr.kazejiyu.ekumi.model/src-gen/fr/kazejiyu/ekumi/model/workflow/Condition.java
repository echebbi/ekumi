/**
 */
package fr.kazejiyu.ekumi.model.workflow;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends Script {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isVerified(StructuredLoop loop, Context context);

} // Condition
