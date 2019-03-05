/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import fr.kazejiyu.ekumi.model.catalog.CatalogPackage;

import fr.kazejiyu.ekumi.model.catalog.impl.CatalogPackageImpl;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.exceptions.InterruptedExecutionException;

import fr.kazejiyu.ekumi.model.exceptions.VariableNotFoundException;
import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;

import fr.kazejiyu.ekumi.model.execution.events.Events;

import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;

import fr.kazejiyu.ekumi.model.spec.SpecPackage;

import fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.Branch;
import fr.kazejiyu.ekumi.model.workflow.Condition;
import fr.kazejiyu.ekumi.model.workflow.Context;
import fr.kazejiyu.ekumi.model.workflow.DataFlow;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.Driver;
import fr.kazejiyu.ekumi.model.workflow.DriverRunner;
import fr.kazejiyu.ekumi.model.workflow.Executable;
import fr.kazejiyu.ekumi.model.workflow.Execution;
import fr.kazejiyu.ekumi.model.workflow.HasStatus;
import fr.kazejiyu.ekumi.model.workflow.History;
import fr.kazejiyu.ekumi.model.workflow.Identifiable;
import fr.kazejiyu.ekumi.model.workflow.ListOfVariables;
import fr.kazejiyu.ekumi.model.workflow.MapOfVariables;
import fr.kazejiyu.ekumi.model.workflow.MultiChoice;
import fr.kazejiyu.ekumi.model.workflow.MultipleInstances;
import fr.kazejiyu.ekumi.model.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.model.workflow.Runner;
import fr.kazejiyu.ekumi.model.workflow.Script;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.Serializable;
import fr.kazejiyu.ekumi.model.workflow.Status;
import fr.kazejiyu.ekumi.model.workflow.StructuredLoop;
import fr.kazejiyu.ekumi.model.workflow.Task;
import fr.kazejiyu.ekumi.model.workflow.TestResult;
import fr.kazejiyu.ekumi.model.workflow.UnsafeContext;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowPackageImpl extends EPackageImpl implements WorkflowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptedTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiChoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsafeContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOfVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapOfVariablesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass driverRunnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelSplitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum testResultEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scriptingLanguageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interruptedExecutionExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executionStatusEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variableNotFoundExceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.kazejiyu.ekumi.model.workflow.WorkflowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkflowPackageImpl() {
		super(eNS_URI, WorkflowFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WorkflowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkflowPackage init() {
		if (isInited)
			return (WorkflowPackage) EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI);

		// Obtain or create and register package
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof WorkflowPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new WorkflowPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CatalogPackage.eNS_URI) instanceof CatalogPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI)
						: CatalogPackage.eINSTANCE);
		SpecPackageImpl theSpecPackage = (SpecPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SpecPackage.eNS_URI) instanceof SpecPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(SpecPackage.eNS_URI)
						: SpecPackage.eINSTANCE);

		// Create package meta-data objects
		theWorkflowPackage.createPackageContents();
		theCatalogPackage.createPackageContents();
		theSpecPackage.createPackageContents();

		// Initialize created meta-data
		theWorkflowPackage.initializePackageContents();
		theCatalogPackage.initializePackageContents();
		theSpecPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkflowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkflowPackage.eNS_URI, theWorkflowPackage);
		return theWorkflowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Inputs() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Outputs() {
		return (EReference) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Successor() {
		return (EReference) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Predecessor() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Flows() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Root() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequence_Activities() {
		return (EReference) sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleInstances() {
		return multipleInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Input() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Output() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Destination() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Source() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Owner() {
		return (EReference) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredLoop() {
		return structuredLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredLoop_PreCondition() {
		return (EReference) structuredLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredLoop_PostCondition() {
		return (EReference) structuredLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredLoop_Activity() {
		return (EReference) structuredLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCondition__IsVerified__StructuredLoop_Context() {
		return conditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRunner() {
		return runnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRunner__Run__Context() {
		return runnerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptedTask() {
		return scriptedTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptedTask_ScriptPath() {
		return (EAttribute) scriptedTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptedTask_Script() {
		return (EReference) scriptedTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptedTask_Language() {
		return (EAttribute) scriptedTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScript_Path() {
		return (EAttribute) scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Inputs() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Outputs() {
		return (EReference) scriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiChoice() {
		return multiChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiChoice_Branches() {
		return (EReference) multiChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Availability() {
		return (EReference) branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Activity() {
		return (EReference) branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsafeContext() {
		return unsafeContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsafeContext_Variables() {
		return (EReference) unsafeContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnsafeContext_Execution() {
		return (EReference) unsafeContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsafeContext_Events() {
		return (EAttribute) unsafeContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsafeContext_ExecutionStatus() {
		return (EAttribute) unsafeContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnsafeContext__Safe() {
		return unsafeContextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSerializable() {
		return serializableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlows() {
		return dataFlowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlows_Incomings() {
		return (EReference) dataFlowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlows_Outgoings() {
		return (EReference) dataFlowsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlows_Owner() {
		return (EReference) dataFlowsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataFlows__ResolveInputs() {
		return dataFlowsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecution() {
		return executionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Activity() {
		return (EReference) executionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecution_Context() {
		return (EReference) executionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExecution_StartDate() {
		return (EAttribute) executionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution__Start() {
		return executionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution__Join() {
		return executionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution__Cancel() {
		return executionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution__IsRunning() {
		return executionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecution__IsCancelled() {
		return executionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOfVariables() {
		return listOfVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListOfVariables_Size() {
		return (EAttribute) listOfVariablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapOfVariables() {
		return mapOfVariablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriver() {
		return driverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_Driven() {
		return (EReference) driverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriver_Script() {
		return (EReference) driverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDriverRunner() {
		return driverRunnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDriverRunner_Driven() {
		return (EReference) driverRunnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelSplit() {
		return parallelSplitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelSplit_Branches() {
		return (EReference) parallelSplitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_Variables() {
		return (EReference) contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Events() {
		return contextEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Execution() {
		return contextEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Contains__String() {
		return contextEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Get__String() {
		return contextEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Set__String_Object() {
		return contextEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContext__Unset__String() {
		return contextEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistory() {
		return historyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistory_Executions() {
		return (EReference) historyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Id() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Name() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutable() {
		return executableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutable__Run__Context() {
		return executableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHasStatus() {
		return hasStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHasStatus_Status() {
		return (EAttribute) hasStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTestResult() {
		return testResultEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScriptingLanguage() {
		return scriptingLanguageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDataType() {
		return dataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEvents() {
		return eventsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterruptedExecutionException() {
		return interruptedExecutionExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExecutionStatus() {
		return executionStatusEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariableNotFoundException() {
		return variableNotFoundExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactory getWorkflowFactory() {
		return (WorkflowFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__INPUTS);
		createEReference(activityEClass, ACTIVITY__OUTPUTS);
		createEReference(activityEClass, ACTIVITY__SUCCESSOR);
		createEReference(activityEClass, ACTIVITY__PREDECESSOR);
		createEReference(activityEClass, ACTIVITY__FLOWS);

		sequenceEClass = createEClass(SEQUENCE);
		createEReference(sequenceEClass, SEQUENCE__ROOT);
		createEReference(sequenceEClass, SEQUENCE__ACTIVITIES);

		multipleInstancesEClass = createEClass(MULTIPLE_INSTANCES);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__INPUT);
		createEReference(dataFlowEClass, DATA_FLOW__OUTPUT);
		createEReference(dataFlowEClass, DATA_FLOW__DESTINATION);
		createEReference(dataFlowEClass, DATA_FLOW__SOURCE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEReference(variableEClass, VARIABLE__OWNER);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		structuredLoopEClass = createEClass(STRUCTURED_LOOP);
		createEReference(structuredLoopEClass, STRUCTURED_LOOP__PRE_CONDITION);
		createEReference(structuredLoopEClass, STRUCTURED_LOOP__POST_CONDITION);
		createEReference(structuredLoopEClass, STRUCTURED_LOOP__ACTIVITY);

		conditionEClass = createEClass(CONDITION);
		createEOperation(conditionEClass, CONDITION___IS_VERIFIED__STRUCTUREDLOOP_CONTEXT);

		taskEClass = createEClass(TASK);

		runnerEClass = createEClass(RUNNER);
		createEOperation(runnerEClass, RUNNER___RUN__CONTEXT);

		scriptedTaskEClass = createEClass(SCRIPTED_TASK);
		createEAttribute(scriptedTaskEClass, SCRIPTED_TASK__SCRIPT_PATH);
		createEReference(scriptedTaskEClass, SCRIPTED_TASK__SCRIPT);
		createEAttribute(scriptedTaskEClass, SCRIPTED_TASK__LANGUAGE);

		scriptEClass = createEClass(SCRIPT);
		createEAttribute(scriptEClass, SCRIPT__PATH);
		createEReference(scriptEClass, SCRIPT__INPUTS);
		createEReference(scriptEClass, SCRIPT__OUTPUTS);

		multiChoiceEClass = createEClass(MULTI_CHOICE);
		createEReference(multiChoiceEClass, MULTI_CHOICE__BRANCHES);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__AVAILABILITY);
		createEReference(branchEClass, BRANCH__ACTIVITY);

		unsafeContextEClass = createEClass(UNSAFE_CONTEXT);
		createEReference(unsafeContextEClass, UNSAFE_CONTEXT__VARIABLES);
		createEReference(unsafeContextEClass, UNSAFE_CONTEXT__EXECUTION);
		createEAttribute(unsafeContextEClass, UNSAFE_CONTEXT__EVENTS);
		createEAttribute(unsafeContextEClass, UNSAFE_CONTEXT__EXECUTION_STATUS);
		createEOperation(unsafeContextEClass, UNSAFE_CONTEXT___SAFE);

		serializableEClass = createEClass(SERIALIZABLE);

		dataFlowsEClass = createEClass(DATA_FLOWS);
		createEReference(dataFlowsEClass, DATA_FLOWS__INCOMINGS);
		createEReference(dataFlowsEClass, DATA_FLOWS__OUTGOINGS);
		createEReference(dataFlowsEClass, DATA_FLOWS__OWNER);
		createEOperation(dataFlowsEClass, DATA_FLOWS___RESOLVE_INPUTS);

		executionEClass = createEClass(EXECUTION);
		createEReference(executionEClass, EXECUTION__ACTIVITY);
		createEReference(executionEClass, EXECUTION__CONTEXT);
		createEAttribute(executionEClass, EXECUTION__START_DATE);
		createEOperation(executionEClass, EXECUTION___START);
		createEOperation(executionEClass, EXECUTION___JOIN);
		createEOperation(executionEClass, EXECUTION___CANCEL);
		createEOperation(executionEClass, EXECUTION___IS_RUNNING);
		createEOperation(executionEClass, EXECUTION___IS_CANCELLED);

		listOfVariablesEClass = createEClass(LIST_OF_VARIABLES);
		createEAttribute(listOfVariablesEClass, LIST_OF_VARIABLES__SIZE);

		mapOfVariablesEClass = createEClass(MAP_OF_VARIABLES);

		driverEClass = createEClass(DRIVER);
		createEReference(driverEClass, DRIVER__DRIVEN);
		createEReference(driverEClass, DRIVER__SCRIPT);

		driverRunnerEClass = createEClass(DRIVER_RUNNER);
		createEReference(driverRunnerEClass, DRIVER_RUNNER__DRIVEN);

		parallelSplitEClass = createEClass(PARALLEL_SPLIT);
		createEReference(parallelSplitEClass, PARALLEL_SPLIT__BRANCHES);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__VARIABLES);
		createEOperation(contextEClass, CONTEXT___EVENTS);
		createEOperation(contextEClass, CONTEXT___EXECUTION);
		createEOperation(contextEClass, CONTEXT___CONTAINS__STRING);
		createEOperation(contextEClass, CONTEXT___GET__STRING);
		createEOperation(contextEClass, CONTEXT___SET__STRING_OBJECT);
		createEOperation(contextEClass, CONTEXT___UNSET__STRING);

		historyEClass = createEClass(HISTORY);
		createEReference(historyEClass, HISTORY__EXECUTIONS);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__ID);
		createEAttribute(identifiableEClass, IDENTIFIABLE__NAME);

		executableEClass = createEClass(EXECUTABLE);
		createEOperation(executableEClass, EXECUTABLE___RUN__CONTEXT);

		hasStatusEClass = createEClass(HAS_STATUS);
		createEAttribute(hasStatusEClass, HAS_STATUS__STATUS);

		// Create enums
		statusEEnum = createEEnum(STATUS);
		testResultEEnum = createEEnum(TEST_RESULT);

		// Create data types
		scriptingLanguageEDataType = createEDataType(SCRIPTING_LANGUAGE);
		dataTypeEDataType = createEDataType(DATA_TYPE);
		eventsEDataType = createEDataType(EVENTS);
		interruptedExecutionExceptionEDataType = createEDataType(INTERRUPTED_EXECUTION_EXCEPTION);
		executionStatusEDataType = createEDataType(EXECUTION_STATUS);
		variableNotFoundExceptionEDataType = createEDataType(VARIABLE_NOT_FOUND_EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(this.getIdentifiable());
		activityEClass.getESuperTypes().add(this.getExecutable());
		activityEClass.getESuperTypes().add(this.getHasStatus());
		sequenceEClass.getESuperTypes().add(this.getActivity());
		multipleInstancesEClass.getESuperTypes().add(this.getActivity());
		structuredLoopEClass.getESuperTypes().add(this.getActivity());
		conditionEClass.getESuperTypes().add(this.getScript());
		taskEClass.getESuperTypes().add(this.getActivity());
		runnerEClass.getESuperTypes().add(this.getScript());
		scriptedTaskEClass.getESuperTypes().add(this.getTask());
		multiChoiceEClass.getESuperTypes().add(this.getActivity());
		executionEClass.getESuperTypes().add(this.getIdentifiable());
		executionEClass.getESuperTypes().add(this.getHasStatus());
		listOfVariablesEClass.getESuperTypes().add(this.getVariable());
		mapOfVariablesEClass.getESuperTypes().add(this.getVariable());
		driverEClass.getESuperTypes().add(this.getActivity());
		driverRunnerEClass.getESuperTypes().add(this.getRunner());
		parallelSplitEClass.getESuperTypes().add(this.getActivity());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Inputs(), this.getVariable(), this.getVariable_Owner(), "inputs", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Outputs(), this.getVariable(), null, "outputs", null, 0, -1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Successor(), this.getActivity(), this.getActivity_Predecessor(), "successor", null,
				0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Predecessor(), this.getActivity(), this.getActivity_Successor(), "predecessor", null,
				0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Flows(), this.getDataFlows(), this.getDataFlows_Owner(), "flows", null, 1, 1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequence_Root(), this.getActivity(), null, "root", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSequence_Activities(), this.getActivity(), null, "activities", null, 0, -1, Sequence.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(multipleInstancesEClass, MultipleInstances.class, "MultipleInstances", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Input(), this.getVariable(), null, "input", null, 1, 1, DataFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Output(), this.getVariable(), null, "output", null, 1, 1, DataFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Destination(), this.getActivity(), null, "destination", null, 0, 1, DataFlow.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Source(), this.getActivity(), null, "source", null, 0, 1, DataFlow.class,
				!IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getDataType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Owner(), this.getActivity(), this.getActivity_Inputs(), "owner", null, 0, 1,
				Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuredLoopEClass, StructuredLoop.class, "StructuredLoop", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredLoop_PreCondition(), this.getCondition(), null, "preCondition", null, 0, 1,
				StructuredLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredLoop_PostCondition(), this.getCondition(), null, "postCondition", null, 0, 1,
				StructuredLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredLoop_Activity(), this.getActivity(), null, "activity", null, 0, 1,
				StructuredLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCondition__IsVerified__StructuredLoop_Context(), ecorePackage.getEBoolean(),
				"isVerified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStructuredLoop(), "loop", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runnerEClass, Runner.class, "Runner", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRunner__Run__Context(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(scriptedTaskEClass, ScriptedTask.class, "ScriptedTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScriptedTask_ScriptPath(), ecorePackage.getEString(), "scriptPath", null, 0, 1,
				ScriptedTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getScriptedTask_Script(), this.getRunner(), null, "script", null, 0, 1, ScriptedTask.class,
				IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEAttribute(getScriptedTask_Language(), this.getScriptingLanguage(), "language", null, 0, 1,
				ScriptedTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScript_Path(), ecorePackage.getEString(), "path", null, 0, 1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScript_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Script.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getScript_Outputs(), this.getVariable(), null, "outputs", null, 0, -1, Script.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiChoiceEClass, MultiChoice.class, "MultiChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiChoice_Branches(), this.getBranch(), null, "branches", null, 0, -1, MultiChoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Availability(), this.getCondition(), null, "availability", null, 0, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Activity(), this.getActivity(), null, "activity", null, 0, 1, Branch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsafeContextEClass, UnsafeContext.class, "UnsafeContext", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnsafeContext_Variables(), this.getVariable(), null, "variables", null, 0, -1,
				UnsafeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUnsafeContext_Execution(), this.getExecution(), this.getExecution_Context(), "execution",
				null, 0, 1, UnsafeContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsafeContext_Events(), this.getEvents(), "events", null, 0, 1, UnsafeContext.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnsafeContext_ExecutionStatus(), this.getExecutionStatus(), "executionStatus", null, 0, 1,
				UnsafeContext.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getUnsafeContext__Safe(), this.getContext(), "safe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serializableEClass, Serializable.class, "Serializable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowsEClass, DataFlows.class, "DataFlows", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlows_Incomings(), this.getDataFlow(), null, "incomings", null, 0, -1, DataFlows.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlows_Outgoings(), this.getDataFlow(), null, "outgoings", null, 0, -1, DataFlows.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlows_Owner(), this.getActivity(), this.getActivity_Flows(), "owner", null, 0, 1,
				DataFlows.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDataFlows__ResolveInputs(), null, "resolveInputs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionEClass, Execution.class, "Execution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecution_Activity(), this.getActivity(), null, "activity", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecution_Context(), this.getUnsafeContext(), this.getUnsafeContext_Execution(), "context",
				null, 0, 1, Execution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecution_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Execution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getExecution__Start(), null, "start", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExecution__Join(), null, "join", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getInterruptedExecutionException());

		initEOperation(getExecution__Cancel(), null, "cancel", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecution__IsRunning(), ecorePackage.getEBoolean(), "isRunning", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExecution__IsCancelled(), ecorePackage.getEBoolean(), "isCancelled", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(listOfVariablesEClass, ListOfVariables.class, "ListOfVariables", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListOfVariables_Size(), ecorePackage.getEInt(), "size", null, 0, 1, ListOfVariables.class,
				!IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapOfVariablesEClass, MapOfVariables.class, "MapOfVariables", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(driverEClass, Driver.class, "Driver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriver_Driven(), this.getActivity(), null, "driven", null, 0, 1, Driver.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDriver_Script(), this.getDriverRunner(), null, "script", null, 0, 1, Driver.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(driverRunnerEClass, DriverRunner.class, "DriverRunner", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDriverRunner_Driven(), this.getActivity(), null, "driven", null, 0, 1, DriverRunner.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelSplitEClass, ParallelSplit.class, "ParallelSplit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelSplit_Branches(), this.getActivity(), null, "branches", null, 0, -1,
				ParallelSplit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContext_Variables(), this.getVariable(), null, "variables", null, 0, -1, Context.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEOperation(getContext__Events(), this.getEvents(), "events", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getContext__Execution(), this.getExecutionStatus(), "execution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Contains__String(), theXMLTypePackage.getBoolean(), "contains", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Get__String(), this.getVariable(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getVariableNotFoundException());

		op = initEOperation(getContext__Set__String_Object(), null, "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContext__Unset__String(), null, "unset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theXMLTypePackage.getString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historyEClass, History.class, "History", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistory_Executions(), this.getExecution(), null, "executions", null, 0, -1, History.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Id(), ecorePackage.getEString(), "id", null, 0, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Identifiable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executableEClass, Executable.class, "Executable", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExecutable__Run__Context(), null, "run", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(hasStatusEClass, HasStatus.class, "HasStatus", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHasStatus_Status(), this.getStatus(), "status", null, 0, 1, HasStatus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.IDLE);
		addEEnumLiteral(statusEEnum, Status.RUNNING);
		addEEnumLiteral(statusEEnum, Status.SUCCEEDED);
		addEEnumLiteral(statusEEnum, Status.FAILED);
		addEEnumLiteral(statusEEnum, Status.CANCELLED);
		addEEnumLiteral(statusEEnum, Status.PAUSED);

		initEEnum(testResultEEnum, TestResult.class, "TestResult");
		addEEnumLiteral(testResultEEnum, TestResult.FULFILLED);
		addEEnumLiteral(testResultEEnum, TestResult.UNSATISFIED);

		// Initialize data types
		initEDataType(scriptingLanguageEDataType, ScriptingLanguage.class, "ScriptingLanguage", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataTypeEDataType, DataType.class, "DataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eventsEDataType, Events.class, "Events", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(interruptedExecutionExceptionEDataType, InterruptedExecutionException.class,
				"InterruptedExecutionException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(executionStatusEDataType, ExecutionStatus.class, "ExecutionStatus", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(variableNotFoundExceptionEDataType, VariableNotFoundException.class, "VariableNotFoundException",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(sequenceEClass, source, new String[] { "documentation", "" });
		addAnnotation(getDataFlow_Destination(), source, new String[] { "get", "return output.getOwner();" });
		addAnnotation(getDataFlow_Source(), source, new String[] { "get", "return input.getOwner();" });
		addAnnotation(structuredLoopEClass, source, new String[] { "documentation", "" });
		addAnnotation(multiChoiceEClass, source, new String[] { "documentation",
				"Represents a simple If / Else statement.\r\n\r\n@see <a href=\"http://www.workflowpatterns.com/patterns/control/basic/wcp4.php\">www.workflowpatterns.com</a>." });
		addAnnotation(branchEClass, source, new String[] { "documentation", "" });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation(getExecution_StartDate(), source, new String[] {});
	}

} //WorkflowPackageImpl
