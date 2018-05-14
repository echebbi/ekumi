/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getCondition()
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
