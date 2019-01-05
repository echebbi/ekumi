/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node that can be executed.
 * <!-- end-model-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends StartingNode {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask_Id()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Task#getId <em>Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask_Name()
	 * <!-- end-user-doc -->
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Task#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Flows</b></em>' containment reference.
	 * @return the value of the '<em>Flows</em>' containment reference.
	 * @see #setFlows(DataFlows)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask_Flows()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	DataFlows getFlows();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Task#getFlows <em>Flows</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flows</em>' containment reference.
	 * @see #getFlows()
	 * @generated
	 */
	void setFlows(DataFlows value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Variable}.
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask_Inputs()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Variable}.
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getTask_Outputs()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOutputs();

} // Task
