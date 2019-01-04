/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlows()
 * @model
 * @generated
 */
public interface DataFlows extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Incomings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.DataFlow}.
	 * @return the value of the '<em>Incomings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlows_Incomings()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getIncomings();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outgoings</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.DataFlow}.
	 * @return the value of the '<em>Outgoings</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlows_Outgoings()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<DataFlow> getOutgoings();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getFlows <em>Flows</em>}'.
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlows_Owner()
	 * @see fr.kazejiyu.ekumi.model.workflow.Activity#getFlows
	 * <!-- end-user-doc -->
	 * @model opposite="flows" transient="false"
	 * @generated
	 */
	Activity getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.DataFlows#getOwner <em>Owner</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void resolveInputs();

} // DataFlows
