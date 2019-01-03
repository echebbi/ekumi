/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
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
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getCategory <em>Category</em>}'.
	 * @return the value of the '<em>Activity Templates</em>' containment reference list.
	 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage#getCategory_ActivityTemplates()
	 * @see fr.kazejiyu.ekumi.model.catalog.ActivityTemplate#getCategory
	 * <!-- end-user-doc -->
	 * @model opposite="category" containment="true"
	 * @generated
	 */
	EList<ActivityTemplate> getActivityTemplates();

} // Category
