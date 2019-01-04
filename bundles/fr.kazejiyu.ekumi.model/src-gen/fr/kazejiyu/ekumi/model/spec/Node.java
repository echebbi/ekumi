/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Task#getSuccessor <em>Successor</em>}'.
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Task)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getNode_Predecessor()
	 * @see fr.kazejiyu.ekumi.model.spec.Task#getSuccessor
	 * <!-- end-user-doc -->
	 * @model opposite="successor"
	 * @generated
	 */
	Task getPredecessor();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Node#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Task value);

} // Node
