/**
 */
package fr.kazejiyu.ekumi.model.spec;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the beginning of a workflow.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends Node {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(StartingNode)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getStart_Node()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StartingNode getNode();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Start#getNode <em>Node</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(StartingNode value);

} // Start
