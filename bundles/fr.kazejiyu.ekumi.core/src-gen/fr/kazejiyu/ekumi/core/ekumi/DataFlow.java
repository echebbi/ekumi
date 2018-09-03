/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput <em>Input</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Variable)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Input()
	 * @model required="true"
	 * @generated
	 */
	Variable getInput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput <em>Input</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Variable)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Output()
	 * @model required="true"
	 * @generated
	 */
	Variable getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput <em>Output</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Variable value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #isSetDestination()
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Destination()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return output.getOwner();'"
	 * @generated
	 */
	Activity getDestination();

	/**
	 * <!-- begin-user-doc -->
	 * Returns whether the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}' reference is set.
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destination</em>' reference is set.
	 * @see #getDestination()
	 * @generated
	 */
	boolean isSetDestination();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Source()
	 * @model changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return input.getOwner();'"
	 * @generated
	 */
	Activity getSource();

} // DataFlow
