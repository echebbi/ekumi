/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Variable)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getDataFlow_Input()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable getInput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.DataFlow#getInput <em>Input</em>}' reference.
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
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getDataFlow_Output()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.DataFlow#getOutput <em>Output</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Variable value);

} // DataFlow
