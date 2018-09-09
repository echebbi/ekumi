/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiPackage
 * @generated
 */
public interface EkumiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EkumiFactory eINSTANCE = fr.kazejiyu.ekumi.core.ekumi.impl.EkumiFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Sequence</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Multiple Instances</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Multiple Instances</em>'.
	 * @generated
	 */
	MultipleInstances createMultipleInstances();

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
	 * Returns a new instance of class '<em>Variable</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Structured Loop</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Structured Loop</em>'.
	 * @generated
	 */
	StructuredLoop createStructuredLoop();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Scripted Task</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Scripted Task</em>'.
	 * @generated
	 */
	ScriptedTask createScriptedTask();

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
	 * Returns a new instance of class '<em>Branch</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Unsafe Context</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Unsafe Context</em>'.
	 * @generated
	 */
	UnsafeContext createUnsafeContext();

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
	 * Returns a new instance of class '<em>Execution</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>List Of Variables</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>List Of Variables</em>'.
	 * @generated
	 */
	ListOfVariables createListOfVariables();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Map Of Variables</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Map Of Variables</em>'.
	 * @generated
	 */
	MapOfVariables createMapOfVariables();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Driver</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

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
	 * Returns a new instance of class '<em>Context</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>History</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>History</em>'.
	 * @generated
	 */
	History createHistory();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Identifiable</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Identifiable</em>'.
	 * @generated
	 */
	Identifiable createIdentifiable();

	/**
	 * <!-- begin-user-doc -->
	 * Returns a new instance of class '<em>Has Status</em>'.
	 * <!-- end-user-doc -->
	 * @return a new instance of class '<em>Has Status</em>'.
	 * @generated
	 */
	HasStatus createHasStatus();

	/**
	 * <!-- begin-user-doc -->
	 * Returns the package supported by this factory.
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EkumiPackage getEkumiPackage();

} //EkumiFactory
