/**
 */
package fr.kazejiyu.ekumi.model.catalog;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.model.catalog.CatalogPackage
 * @generated
 */
public interface CatalogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatalogFactory eINSTANCE = fr.kazejiyu.ekumi.model.catalog.impl.CatalogFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Catalog</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Catalog</em>'.
	 * @generated
	 */
	Catalog createCatalog();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Category</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Catalogs</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Catalogs</em>'.
	 * @generated
	 */
	Catalogs createCatalogs();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Activity Template</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Activity Template</em>'.
	 * @generated
	 */
	ActivityTemplate createActivityTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the package supported by this factory.
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CatalogPackage getCatalogPackage();

} //CatalogFactory
