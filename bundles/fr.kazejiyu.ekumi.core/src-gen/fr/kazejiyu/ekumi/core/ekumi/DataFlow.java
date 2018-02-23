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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput <em>Input</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Task#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Task)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Source()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Task#getOutgoingFlows
	 * @model opposite="outgoingFlows" transient="false"
	 * @generated
	 */
	Task getSource();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Task value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Task#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Task)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getDataFlow_Destination()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Task#getIncomingFlows
	 * @model opposite="incomingFlows" required="true"
	 * @generated
	 */
	Task getDestination();

	/**
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Task value);

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

} // DataFlow
