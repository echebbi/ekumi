/**
 */
package fr.kazejiyu.ekumi.specs.eds;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.specs.eds.EdsPackage
 * @generated
 */
public interface EdsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdsFactory eINSTANCE = fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Activity</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Start</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Parallel Split</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Parallel Split</em>'.
	 * @generated
	 */
	ParallelSplit createParallelSplit();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>External Task</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>External Task</em>'.
	 * @generated
	 */
	ExternalTask createExternalTask();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Library Task</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Library Task</em>'.
	 * @generated
	 */
	LibraryTask createLibraryTask();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Synchronization</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Synchronization</em>'.
	 * @generated
	 */
	Synchronization createSynchronization();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Multi Choice</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Multi Choice</em>'.
	 * @generated
	 */
	MultiChoice createMultiChoice();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Simple Merge</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Simple Merge</em>'.
	 * @generated
	 */
	SimpleMerge createSimpleMerge();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Variable</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Data Flows</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Data Flows</em>'.
	 * @generated
	 */
	DataFlows createDataFlows();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Data Flow</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Conditional Root</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Conditional Root</em>'.
	 * @generated
	 */
	ConditionalRoot createConditionalRoot();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Condition</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the package supported by this factory.
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EdsPackage getEdsPackage();

} //EdsFactory
