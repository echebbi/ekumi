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
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Multiple Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Instances</em>'.
	 * @generated
	 */
	MultipleInstances createMultipleInstances();

	/**
	 * Returns a new object of class '<em>Parallel Split</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Split</em>'.
	 * @generated
	 */
	ParallelSplit createParallelSplit();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Structured Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structured Loop</em>'.
	 * @generated
	 */
	StructuredLoop createStructuredLoop();

	/**
	 * Returns a new object of class '<em>Scripted Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scripted Task</em>'.
	 * @generated
	 */
	ScriptedTask createScriptedTask();

	/**
	 * Returns a new object of class '<em>Multi Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Choice</em>'.
	 * @generated
	 */
	MultiChoice createMultiChoice();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Data Flows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flows</em>'.
	 * @generated
	 */
	DataFlows createDataFlows();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	Execution createExecution();

	/**
	 * Returns a new object of class '<em>List Of Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Of Variables</em>'.
	 * @generated
	 */
	ListOfVariables createListOfVariables();

	/**
	 * Returns a new object of class '<em>Map Of Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Of Variables</em>'.
	 * @generated
	 */
	MapOfVariables createMapOfVariables();

	/**
	 * Returns a new object of class '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Driver</em>'.
	 * @generated
	 */
	Driver createDriver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EkumiPackage getEkumiPackage();

} //EkumiFactory
