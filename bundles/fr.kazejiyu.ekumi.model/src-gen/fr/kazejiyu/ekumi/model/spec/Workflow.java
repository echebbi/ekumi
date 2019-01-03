/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Activity}.
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getWorkflow_Activities()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StartJoin)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getWorkflow_Start()
	 * <!-- end-user-doc -->
	 * @model containment="true" volatile="true" derived="true"
	 * @generated
	 */
	StartJoin getStart();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getStart <em>Start</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StartJoin value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Sub Workflow</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getParentWorkflow <em>Parent Workflow</em>}'.
	 * @return the value of the '<em>Sub Workflow</em>' containment reference.
	 * @see #setSubWorkflow(Workflow)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getWorkflow_SubWorkflow()
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getParentWorkflow
	 * <!-- end-user-doc -->
	 * @model opposite="parentWorkflow" containment="true"
	 * @generated
	 */
	Workflow getSubWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getSubWorkflow <em>Sub Workflow</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Workflow</em>' containment reference.
	 * @see #getSubWorkflow()
	 * @generated
	 */
	void setSubWorkflow(Workflow value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent Workflow</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getSubWorkflow <em>Sub Workflow</em>}'.
	 * @return the value of the '<em>Parent Workflow</em>' container reference.
	 * @see #setParentWorkflow(Workflow)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getWorkflow_ParentWorkflow()
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getSubWorkflow
	 * <!-- end-user-doc -->
	 * @model opposite="subWorkflow" transient="false"
	 * @generated
	 */
	Workflow getParentWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getParentWorkflow <em>Parent Workflow</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Workflow</em>' container reference.
	 * @see #getParentWorkflow()
	 * @generated
	 */
	void setParentWorkflow(Workflow value);

} // Workflow
