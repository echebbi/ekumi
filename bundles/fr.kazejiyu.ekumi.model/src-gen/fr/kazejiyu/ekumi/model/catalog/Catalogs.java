/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCatalogs()
 * @model
 * @generated
 */
public interface Catalogs extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.catalog.Catalog}.
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCatalogs_Content()
	 * <!-- end-user-doc -->
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getContent();

} // Catalogs
