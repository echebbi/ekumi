/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessor <em>Successor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows <em>Flows</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends Identifiable, Executable, HasStatus {

	/**
	 * Finds a specific input.
	 * 
	 * @param name
	 * 			The name of the input to look for.
	 * 			Must not be {@code null}.
	 * 
	 * @return the input called {@code name}, if found
	 */
	default Optional<Variable> getInput(String name) {
		return getInputs().stream().filter(input -> input.getName().equals(name)).findAny();
	}

	/**
	 * Finds a specific output.
	 * 
	 * @param name
	 * 			The name of the output to look for.
	 * 			Must not be {@code null}.
	 * 
	 * @return the output called {@code name}, if found
	 */
	default Optional<Variable> getOutput(String name) {
		return getOutputs().stream().filter(input -> input.getName().equals(name)).findAny();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Variable#getOwner <em>Owner</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Inputs()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Variable#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.ekumi.Variable}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Successor()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor
	 * @model opposite="predecessor"
	 * @generated
	 */
	Activity getSuccessor();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessor <em>Successor</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessor <em>Successor</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Activity)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Predecessor()
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessor
	 * @model opposite="successor"
	 * @generated
	 */
	Activity getPredecessor();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOwner <em>Owner</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flows</em>' containment reference.
	 * @see #setFlows(DataFlows)
	 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage#getActivity_Flows()
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	DataFlows getFlows();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows <em>Flows</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flows</em>' containment reference.
	 * @see #getFlows()
	 * @generated
	 */
	void setFlows(DataFlows value);

} // Activity
