/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Group#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Group#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Group#getCategories <em>Categories</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Group#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Group#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.Group#getId <em>Id</em>}' attribute.
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
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.Group#getName <em>Name</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.catalog.Group}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.catalog.Group#getParent <em>Parent</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup_Categories()
	 * @see fr.kazejiyu.ekumi.model.catalog.Group#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Group> getCategories();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.catalog.Group#getCategories <em>Categories</em>}'.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Group)
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup_Parent()
	 * @see fr.kazejiyu.ekumi.model.catalog.Group#getCategories
	 * @model opposite="categories" transient="false"
	 * @generated
	 */
	Group getParent();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.Group#getParent <em>Parent</em>}' reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Group value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.model.catalog.Group#getDescription <em>Description</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Group
