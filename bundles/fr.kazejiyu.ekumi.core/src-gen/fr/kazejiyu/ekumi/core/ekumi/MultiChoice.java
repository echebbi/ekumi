/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a simple If / Else statement.
 * 
 * @see <a href="http://www.workflowpatterns.com/patterns/control/basic/wcp4.php">www.workflowpatterns.com</a>.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.MultiChoice#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getMultiChoice()
 * @model
 * @generated
 */
public interface MultiChoice extends Activity {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Branch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getMultiChoice_Branches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Branch> getBranches();

} // MultiChoice
