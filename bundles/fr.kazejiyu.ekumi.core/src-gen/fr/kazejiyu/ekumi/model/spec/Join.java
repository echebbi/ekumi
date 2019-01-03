/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Join#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Join#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.JoinBehavior}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getJoin_Behavior()
	 * @model containment="true"
	 * @generated
	 */
	EList<JoinBehavior> getBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Activity}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getJoin_Activities()
	 * @model
	 * @generated
	 */
	EList<Activity> getActivities();

} // Join
