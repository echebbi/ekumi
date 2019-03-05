/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import java.util.Optional;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity()
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
	default Optional<Variable> findInput(String name) {
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
	default Optional<Variable> findOutput(String name) {
		return getOutputs().stream().filter(input -> input.getName().equals(name)).findAny();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Variable#getOwner <em>Owner</em>}'.
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity_Inputs()
	 * @see fr.kazejiyu.ekumi.model.workflow.Variable#getOwner
	 * <!-- end-user-doc -->
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity_Outputs()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getPredecessor <em>Predecessor</em>}'.
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity_Successor()
	 * @see fr.kazejiyu.ekumi.model.workflow.Activity#getPredecessor
	 * <!-- end-user-doc -->
	 * @model opposite="predecessor" containment="true"
	 * @generated
	 */
	Activity getSuccessor();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getSuccessor <em>Successor</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' containment reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getSuccessor <em>Successor</em>}'.
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(Activity)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity_Predecessor()
	 * @see fr.kazejiyu.ekumi.model.workflow.Activity#getSuccessor
	 * <!-- end-user-doc -->
	 * @model opposite="successor" transient="false"
	 * @generated
	 */
	Activity getPredecessor();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' container reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.workflow.DataFlows#getOwner <em>Owner</em>}'.
	 * @return the value of the '<em>Flows</em>' containment reference.
	 * @see #setFlows(DataFlows)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getActivity_Flows()
	 * @see fr.kazejiyu.ekumi.model.workflow.DataFlows#getOwner
	 * <!-- end-user-doc -->
	 * @model opposite="owner" containment="true" required="true"
	 * @generated
	 */
	DataFlows getFlows();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Activity#getFlows <em>Flows</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flows</em>' containment reference.
	 * @see #getFlows()
	 * @generated
	 */
	void setFlows(DataFlows value);

} // Activity
