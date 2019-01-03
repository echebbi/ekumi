/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Activity#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Activity#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Activity#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.Activity#getJoin <em>Join</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.spec.Activity}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Successors()
	 * @model volatile="true" derived="true"
	 * @generated
	 */
	EList<Activity> getSuccessors();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Id()
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Name()
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
	 * Returns the value of the '<em><b>Join</b></em>' containment reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' containment reference.
	 * @see #setJoin(Join)
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#getActivity_Join()
	 * @model containment="true"
	 * @generated
	 */
	Join getJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.spec.Activity#getJoin <em>Join</em>}' containment reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' containment reference.
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(Join value);

} // Activity
