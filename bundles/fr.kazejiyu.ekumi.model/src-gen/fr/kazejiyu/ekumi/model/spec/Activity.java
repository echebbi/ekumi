/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Name()
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Id()
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getId <em>Id</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * Returns the value of the '<em><b>Nested Activity</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Activity#getParentActivity <em>Parent Activity</em>}'.
	 * @return the value of the '<em>Nested Activity</em>' containment reference.
	 * @see #setNestedActivity(Activity)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_NestedActivity()
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getParentActivity
	 * <!-- end-user-doc -->
	 * @model opposite="parentActivity" containment="true"
	 * @generated
	 */
	Activity getNestedActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getNestedActivity <em>Nested Activity</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Activity</em>' containment reference.
	 * @see #getNestedActivity()
	 * @generated
	 */
	void setNestedActivity(Activity value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.spec.Activity#getNestedActivity <em>Nested Activity</em>}'.
	 * @return the value of the '<em>Parent Activity</em>' container reference.
	 * @see #setParentActivity(Activity)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_ParentActivity()
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getNestedActivity
	 * <!-- end-user-doc -->
	 * @model opposite="nestedActivity" transient="false"
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

} // Activity
