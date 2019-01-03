/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage
 * @generated
 */
public interface SpecFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecFactory eINSTANCE = fr.kazejiyu.ekumi.model.spec.impl.SpecFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Join</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Join</em>'.
	 * @generated
	 */
	Join createJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Start Join</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Start Join</em>'.
	 * @generated
	 */
	StartJoin createStartJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Split Join</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Split Join</em>'.
	 * @generated
	 */
	SplitJoin createSplitJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Simple Join</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Simple Join</em>'.
	 * @generated
	 */
	SimpleJoin createSimpleJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Repeat Join</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Repeat Join</em>'.
	 * @generated
	 */
	RepeatJoin createRepeatJoin();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Workflow</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Workflow</em>'.
	 * @generated
	 */
	Workflow createWorkflow();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the package supported by this factory.
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpecPackage getSpecPackage();

} //SpecFactory
