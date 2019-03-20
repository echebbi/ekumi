/**
 */
package fr.kazejiyu.ekumi.specs.eds;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A flow of data between two variables.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.specs.eds.EdsPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Variable)
	 * @see fr.kazejiyu.ekumi.specs.eds.SpecPackage#getDataFlow_Input()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable getInput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.specs.eds.DataFlow#getInput <em>Input</em>}' reference.
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
	 * @see fr.kazejiyu.ekumi.specs.eds.SpecPackage#getDataFlow_Output()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Variable getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.specs.eds.DataFlow#getOutput <em>Output</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Variable value);

} // DataFlow
