/**
 */
package fr.kazejiyu.ekumi.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScript()
 * @model abstract="true"
 * @generated
 */
public interface Script extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScript_Path()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.workflow.Script#getPath <em>Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScript_Inputs()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#getScript_Outputs()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Variable> getOutputs();

} // Script
