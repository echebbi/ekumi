/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getConditionalRoot()
 * @model
 * @generated
 */
public interface ConditionalRoot extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getConditionalRoot_Task()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.ConditionalRoot#getTask <em>Task</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getConditionalRoot_Condition()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.ConditionalRoot#getCondition <em>Condition</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // ConditionalRoot
