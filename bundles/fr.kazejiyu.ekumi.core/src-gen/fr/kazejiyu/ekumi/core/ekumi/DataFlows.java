/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flows</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlows()
 * @model
 * @generated
 */
public interface DataFlows extends EObject {
	/**
	 * Returns the value of the '<em><b>Incomings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlows_Incomings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getIncomings();

	/**
	 * Returns the value of the '<em><b>Outgoings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlows_Outgoings()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getOutgoings();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlows_Owner()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows
	 * @model opposite="flows" transient="false"
	 * @generated
	 */
	Activity getOwner();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Resolves {@link #getIncoming() inputs} value.
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resolveInputs();

} // DataFlows
