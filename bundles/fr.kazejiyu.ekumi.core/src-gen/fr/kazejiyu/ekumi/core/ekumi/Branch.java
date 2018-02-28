/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getAvailability <em>Availability</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference.
	 * @see #setAvailability(TestableScript)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getBranch_Availability()
	 * @model containment="true"
	 * @generated
	 */
	TestableScript getAvailability();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getAvailability <em>Availability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' containment reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(TestableScript value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getBranch_Activity()
	 * @model
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // Branch
