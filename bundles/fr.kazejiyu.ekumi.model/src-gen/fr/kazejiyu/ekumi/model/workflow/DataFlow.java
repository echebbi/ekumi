/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Variable)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlow_Input()
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Variable getInput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.DataFlow#getInput <em>Input</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Variable)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlow_Output()
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Variable getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.DataFlow#getOutput <em>Output</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #isSetDestination()
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlow_Destination()
	 * <!-- end-user-doc -->
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return output.getOwner();'"
	 * @generated
	 */
	Activity getDestination();

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the value of the '{@link fr.kazejiyu.ekumi.model.workflow.DataFlow#getDestination <em>Destination</em>}' reference is set.
	 * @see #getDestination()
	 * @return whether the value of the '<em>Destination</em>' reference is set.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	boolean isSetDestination();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * @return the value of the '<em>Source</em>' reference.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getDataFlow_Source()
	 * <!-- end-user-doc -->
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return input.getOwner();'"
	 * @generated
	 */
	Activity getSource();

} // DataFlow
