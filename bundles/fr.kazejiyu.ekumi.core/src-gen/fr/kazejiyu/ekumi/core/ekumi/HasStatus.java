/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.HasStatus#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getHasStatus()
 * @model
 * @generated
 */
public interface HasStatus extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.kazejiyu.ekumi.core.ekumi.Status}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @see #setStatus(Status)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getHasStatus_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.HasStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

} // HasStatus
