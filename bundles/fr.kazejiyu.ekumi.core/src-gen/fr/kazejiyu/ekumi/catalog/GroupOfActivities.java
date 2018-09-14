/**
 */
package fr.kazejiyu.ekumi.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Of Activities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getSubCategories <em>Sub Categories</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage#getGroupOfActivities()
 * @model abstract="true"
 * @generated
 */
public interface GroupOfActivities extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage#getGroupOfActivities_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getId <em>Id</em>}' attribute.
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
	 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage#getGroupOfActivities_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Sub Categories</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.catalog.GroupOfActivities}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getParent <em>Parent</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Categories</em>' reference list.
	 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage#getGroupOfActivities_SubCategories()
	 * @see fr.kazejiyu.ekumi.catalog.GroupOfActivities#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<GroupOfActivities> getSubCategories();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getSubCategories <em>Sub Categories</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(GroupOfActivities)
	 * @see fr.kazejiyu.ekumi.catalog.CatalogPackage#getGroupOfActivities_Parent()
	 * @see fr.kazejiyu.ekumi.catalog.GroupOfActivities#getSubCategories
	 * @model opposite="subCategories"
	 * @generated
	 */
	GroupOfActivities getParent();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.catalog.GroupOfActivities#getParent <em>Parent</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(GroupOfActivities value);

} // GroupOfActivities
