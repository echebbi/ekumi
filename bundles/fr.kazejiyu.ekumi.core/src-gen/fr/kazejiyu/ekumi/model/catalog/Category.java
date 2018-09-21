/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.Category#getActivityTemplates <em>Activity Templates</em>}</li>
 * </ul>
 *
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends Group {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Activity Templates</b></em>' containment reference list.
	 * The list contents are of type {@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate}.
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Templates</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCategory_ActivityTemplates()
	 * @see fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getCategory
	 * @model opposite="category" containment="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivityTemplates();

} // Category
