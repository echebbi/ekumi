/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import fr.kazejiyu.ekumi.core.ekumi.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Category#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends Group {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activities</b></em>' reference.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCategory_Activities()
	 * @model changeable="false"
	 * @generated
	 */
	Activity getActivities();

} // Category
