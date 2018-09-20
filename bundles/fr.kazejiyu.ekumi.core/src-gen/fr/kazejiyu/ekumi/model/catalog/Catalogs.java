/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Catalogs#getContent <em>Content</em>}</li>
 * </ul>
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCatalogs_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<Catalog> getContent();

} // Catalogs
