/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.kazejiyu.ekumi.core.activities.impl.BasicScriptedTask;
import fr.kazejiyu.ekumi.core.activities.impl.BasicSequence;
import fr.kazejiyu.ekumi.core.activities.impl.BasicStructuredLoop;
import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.ekumi.*;
import fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException;
import fr.kazejiyu.ekumi.core.execution.BasicExecution;
import fr.kazejiyu.ekumi.core.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.core.execution.events.Events;
import fr.kazejiyu.ekumi.core.languages.ScriptingLanguage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EkumiFactoryImpl extends EFactoryImpl implements EkumiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EkumiFactory init() {
		try {
			EkumiFactory theEkumiFactory = (EkumiFactory) EPackage.Registry.INSTANCE.getEFactory(EkumiPackage.eNS_URI);
			if (theEkumiFactory != null) {
				return theEkumiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EkumiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EkumiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EkumiPackage.SEQUENCE:
			return createSequence();
		case EkumiPackage.MULTIPLE_INSTANCES:
			return createMultipleInstances();
		case EkumiPackage.DATA_FLOW:
			return createDataFlow();
		case EkumiPackage.VARIABLE:
			return createVariable();
		case EkumiPackage.STRUCTURED_LOOP:
			return createStructuredLoop();
		case EkumiPackage.SCRIPTED_TASK:
			return createScriptedTask();
		case EkumiPackage.MULTI_CHOICE:
			return createMultiChoice();
		case EkumiPackage.BRANCH:
			return createBranch();
		case EkumiPackage.DATA_FLOWS:
			return createDataFlows();
		case EkumiPackage.EXECUTION:
			return createExecution();
		case EkumiPackage.LIST_OF_VARIABLES:
			return createListOfVariables();
		case EkumiPackage.MAP_OF_VARIABLES:
			return createMapOfVariables();
		case EkumiPackage.DRIVER:
			return createDriver();
		case EkumiPackage.PARALLEL_SPLIT:
			return createParallelSplit();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case EkumiPackage.STATUS:
			return createStatusFromString(eDataType, initialValue);
		case EkumiPackage.TEST_RESULT:
			return createTestResultFromString(eDataType, initialValue);
		case EkumiPackage.SCRIPTING_LANGUAGE:
			return createScriptingLanguageFromString(eDataType, initialValue);
		case EkumiPackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		case EkumiPackage.EVENTS:
			return createEventsFromString(eDataType, initialValue);
		case EkumiPackage.INTERRUPTED_EXECUTION_EXCEPTION:
			return createInterruptedExecutionExceptionFromString(eDataType, initialValue);
		case EkumiPackage.EXECUTION_STATUS:
			return createExecutionStatusFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case EkumiPackage.STATUS:
			return convertStatusToString(eDataType, instanceValue);
		case EkumiPackage.TEST_RESULT:
			return convertTestResultToString(eDataType, instanceValue);
		case EkumiPackage.SCRIPTING_LANGUAGE:
			return convertScriptingLanguageToString(eDataType, instanceValue);
		case EkumiPackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		case EkumiPackage.EVENTS:
			return convertEventsToString(eDataType, instanceValue);
		case EkumiPackage.INTERRUPTED_EXECUTION_EXCEPTION:
			return convertInterruptedExecutionExceptionToString(eDataType, instanceValue);
		case EkumiPackage.EXECUTION_STATUS:
			return convertExecutionStatusToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new BasicSequence();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleInstances createMultipleInstances() {
		MultipleInstancesImpl multipleInstances = new MultipleInstancesImpl();
		return multipleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelSplit createParallelSplit() {
		ParallelSplitImpl parallelSplit = new ParallelSplitImpl();
		return parallelSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StructuredLoop createStructuredLoop() {
		StructuredLoopImpl structuredLoop = new BasicStructuredLoop();
		return structuredLoop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ScriptedTask createScriptedTask() {
		ScriptedTaskImpl scriptedTask = new BasicScriptedTask();
		return scriptedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiChoice createMultiChoice() {
		MultiChoiceImpl multiChoice = new MultiChoiceImpl();
		return multiChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlows createDataFlows() {
		DataFlowsImpl dataFlows = new DataFlowsImpl();
		return dataFlows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Execution createExecution() {
		ExecutionImpl execution = new BasicExecution();
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfVariables createListOfVariables() {
		ListOfVariablesImpl listOfVariables = new ListOfVariablesImpl();
		return listOfVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapOfVariables createMapOfVariables() {
		MapOfVariablesImpl mapOfVariables = new MapOfVariablesImpl();
		return mapOfVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Driver createDriver() {
		DriverImpl driver = new DriverImpl();
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestResult createTestResultFromString(EDataType eDataType, String initialValue) {
		TestResult result = TestResult.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTestResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptingLanguage createScriptingLanguageFromString(EDataType eDataType, String initialValue) {
		return (ScriptingLanguage) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptingLanguageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		return (DataType) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Events createEventsFromString(EDataType eDataType, String initialValue) {
		return (Events) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptedExecutionException createInterruptedExecutionExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (InterruptedExecutionException) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterruptedExecutionExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionStatus createExecutionStatusFromString(EDataType eDataType, String initialValue) {
		return (ExecutionStatus) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionStatusToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EkumiPackage getEkumiPackage() {
		return (EkumiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EkumiPackage getPackage() {
		return EkumiPackage.eINSTANCE;
	}

} //EkumiFactoryImpl
