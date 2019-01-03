/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getVariable_Name()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Variable#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(DataType)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getVariable_Type()
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.model.workflow.DataType"
	 * @generated
	 */
	DataType getType();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Variable#getType <em>Type</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getInputs <em>Inputs</em>}'.
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getVariable_Owner()
	 * @see fr.kazejiyu.ekumi.model.workflow.Activity#getInputs
	 * <!-- end-user-doc -->
	 * @model opposite="inputs" transient="false"
	 * @generated
	 */
	Activity getOwner();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Variable#getOwner <em>Owner</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getVariable_Value()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

} // Variable
