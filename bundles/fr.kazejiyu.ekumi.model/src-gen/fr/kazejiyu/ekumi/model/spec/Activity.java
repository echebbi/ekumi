/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Task {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Start)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Start()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	Start getStart();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getStart <em>Start</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Start value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Nested Activities</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Activity}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Activity#getParentActivity <em>Parent Activity</em>}'.
	 * @return the value of the '<em>Nested Activities</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_NestedActivities()
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getParentActivity
	 * <!-- end-user-doc -->
	 * @model opposite="parentActivity" containment="true"
	 * @generated
	 */
	EList<Activity> getNestedActivities();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Activity#getNestedActivities <em>Nested Activities</em>}'.
	 * @return the value of the '<em>Parent Activity</em>' container reference.
	 * @see #setParentActivity(Activity)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_ParentActivity()
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getNestedActivities
	 * <!-- end-user-doc -->
	 * @model opposite="nestedActivities" transient="false"
	 * @generated
	 */
	Activity getParentActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getParentActivity <em>Parent Activity</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Activity</em>' container reference.
	 * @see #getParentActivity()
	 * @generated
	 */
	void setParentActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Task}.
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Tasks()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Divergences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Divergence}.
	 * @return the value of the '<em>Divergences</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Divergences()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Divergence> getDivergences();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Convergences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Convergence}.
	 * @return the value of the '<em>Convergences</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Convergences()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Convergence> getConvergences();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Conditional Divergences</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.ConditionalDivergence}.
	 * @return the value of the '<em>Conditional Divergences</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_ConditionalDivergences()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<ConditionalDivergence> getConditionalDivergences();

} // Activity
