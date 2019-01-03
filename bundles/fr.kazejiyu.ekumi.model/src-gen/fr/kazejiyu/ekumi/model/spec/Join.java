/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getJoin()
 * @model abstract="true"
 * @generated
 */
public interface Join extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Activity}.
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getJoin_Activities()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

} // Join
