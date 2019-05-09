/**
 */
package fr.kazejiyu.ekumi.core.catalog;

import fr.kazejiyu.ekumi.core.workflow.Activity;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getActivityTemplate()
 * @model
 * @generated
 */
public interface ActivityTemplate extends Identifiable {
	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Model Path</b></em>' attribute.
	 * @return the value of the '<em>Model Path</em>' attribute.
	 * @see #setModelPath(String)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getActivityTemplate_ModelPath()
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getModelPath();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getModelPath <em>Model Path</em>}' attribute.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Path</em>' attribute.
	 * @see #getModelPath()
	 * @generated
	 */
	void setModelPath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * Returns the value of the '<em><b>Category</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.kazejiyu.ekumi.core.catalog.Category#getActivityTemplates <em>Activity Templates</em>}'.
	 * @return the value of the '<em>Category</em>' container reference.
	 * @see #setCategory(Category)
	 * @see fr.kazejiyu.ekumi.core.catalog.CatalogPackage#getActivityTemplate_Category()
	 * @see fr.kazejiyu.ekumi.core.catalog.Category#getActivityTemplates
	 * <!-- end-user-doc -->
	 * @model opposite="activityTemplates" transient="false"
	 * @generated
	 */
	Category getCategory();

	/**
	 * <!-- begin-user-doc -->
	 * Sets the value of the '{@link fr.kazejiyu.ekumi.core.catalog.ActivityTemplate#getCategory <em>Category</em>}' container reference.
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' container reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="fr.kazejiyu.ekumi.core.catalog.Activity"
	 * @generated
	 */
	Activity toActivity();

} // ActivityTemplate
