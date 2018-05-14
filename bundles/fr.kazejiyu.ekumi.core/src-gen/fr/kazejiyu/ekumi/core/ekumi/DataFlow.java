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
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(Data)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Input()
	 * @model required="true"
	 * @generated
	 */
	Data getInput();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(Data value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(Data)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Output()
	 * @model required="true"
	 * @generated
	 */
	Data getOutput();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Data value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * Returns whether the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destination</em>' reference is set.
	 * @see #getDestination()
	 * @generated
	 */
	boolean isSetDestination();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #isSetSource()
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Source()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='return input.getOwner();'"
	 * @generated
	 */
	Activity getSource();

	/**
	 * Returns whether the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' reference is set.
	 * @see #getSource()
	 * @generated
	 */
	boolean isSetSource();

} // DataFlow
