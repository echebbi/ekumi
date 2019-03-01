/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element that composes a workflow.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Node}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Node#getPredecessors <em>Predecessors</em>}'.
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getNode_Successors()
	 * @see fr.kazejiyu.ekumi.model.spec.Node#getPredecessors
	 * <!-- end-user-doc -->
	 * @model opposite="predecessors"
	 * @generated
	 */
	EList<Node> getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Node}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Node#getSuccessors <em>Successors</em>}'.
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getNode_Predecessors()
	 * @see fr.kazejiyu.ekumi.model.spec.Node#getSuccessors
	 * <!-- end-user-doc -->
	 * @model opposite="successors"
	 * @generated
	 */
	EList<Node> getPredecessors();

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the given node can be a successor of this.
	 * 
	 * @param node
	 * 			The node to check.
	 * 
	 * @return whether the given node can be a successor of this
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean canPrecede(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the given node can be a predecessor of this.
	 * 
	 * @param node
	 * 			The node to check.
	 * 
	 * @return whether the given node can be a predecessor of this
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean canSucceed(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the given node is a successor of this.
	 * 
	 * @param successor
	 * 			The potential successor of this.
	 * 
	 * @return whether the given node is a successor of this 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean precedes(Node successor);

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the given node is a predecessor of this.
	 * 
	 * @param predecessor
	 * 			The potential predecessor of this.
	 * 
	 * @return whether the given node is a predecessor of this
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean succeeds(Node predecessor);

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether this node can have a new successor.
	 * @return whether this node can have a new successor
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean canPrecede();

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether this node can have a new predecessor.
	 * @return whether this node can have a new predecessor
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean canSucceed();

} // Node
