/**
 */
package fr.kazejiyu.ekumi.core.catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getGroup()
 * @model abstract="true"
 * @generated
 */
public interface Group extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.core.catalog.Group}.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.catalog.Group#getParent <em>Parent</em>}'.
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getGroup_Categories()
	 * @see fr.kazejiyu.ekumi.core.catalog.Group#getParent
	 * <!-- end-user-doc -->
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Group> getCategories();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.catalog.Group#getCategories <em>Categories</em>}'.
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Group)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getGroup_Parent()
	 * @see fr.kazejiyu.ekumi.core.catalog.Group#getCategories
	 * <!-- end-user-doc -->
	 * @model opposite="categories" transient="false"
	 * @generated
	 */
	Group getParent();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.Group#getParent <em>Parent</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Group value);

} // Group
