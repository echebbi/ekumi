/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Join#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Join#getSuccessor <em>Successor</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getJoin()
 * @model
 * @generated
 */
public interface Join extends EObject {
	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Task#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Task)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getJoin_Predecessor()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Task#getJoin
	 * @model opposite="join" required="true"
	 * @generated
	 */
	Task getPredecessor();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Join#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Task value);

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Task)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getJoin_Successor()
	 * @model
	 * @generated
	 */
	Task getSuccessor();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Join#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Task value);

} // Join
