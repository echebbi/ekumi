/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Context#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getContext_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getVariable();

} // Context
