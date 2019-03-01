/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.model.catalog.CatalogPackage;

import fr.kazejiyu.ekumi.model.catalog.impl.CatalogPackageImpl;
import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.Condition;
import fr.kazejiyu.ekumi.model.spec.ConditionalDivergence;
import fr.kazejiyu.ekumi.model.spec.ConditionalRoot;
import fr.kazejiyu.ekumi.model.spec.Convergence;
import fr.kazejiyu.ekumi.model.spec.DataFlow;
import fr.kazejiyu.ekumi.model.spec.DataFlows;
import fr.kazejiyu.ekumi.model.spec.Divergence;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.LibraryTask;
import fr.kazejiyu.ekumi.model.spec.MultiChoice;
import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.ParallelSplit;
import fr.kazejiyu.ekumi.model.spec.SimpleMerge;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.Start;
import fr.kazejiyu.ekumi.model.spec.StartingNode;
import fr.kazejiyu.ekumi.model.spec.Synchronization;
import fr.kazejiyu.ekumi.model.spec.Task;
import fr.kazejiyu.ekumi.model.spec.Variable;

import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;

import fr.kazejiyu.ekumi.model.workflow.impl.WorkflowPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class SpecPackageImpl extends EPackageImpl implements SpecPackage {
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
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEClass = null;

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
	private EClass externalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationEClass = null;

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
	private EClass simpleMergeEClass = null;

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
	private EClass dataFlowsEClass = null;

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
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalDivergenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalRootEClass = null;

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
	private EClass startingNodeEClass = null;

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
	 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecPackageImpl() {
		super(eNS_URI, SpecFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpecPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecPackage init() {
		if (isInited)
			return (SpecPackage) EPackage.Registry.INSTANCE.getEPackage(SpecPackage.eNS_URI);

		// Obtain or create and register package
		SpecPackageImpl theSpecPackage = (SpecPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SpecPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SpecPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CatalogPackageImpl theCatalogPackage = (CatalogPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CatalogPackage.eNS_URI) instanceof CatalogPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CatalogPackage.eNS_URI)
						: CatalogPackage.eINSTANCE);
		WorkflowPackageImpl theWorkflowPackage = (WorkflowPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(WorkflowPackage.eNS_URI) instanceof WorkflowPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(WorkflowPackage.eNS_URI)
						: WorkflowPackage.eINSTANCE);

		// Create package meta-data objects
		theSpecPackage.createPackageContents();
		theCatalogPackage.createPackageContents();
		theWorkflowPackage.createPackageContents();

		// Initialize created meta-data
		theSpecPackage.initializePackageContents();
		theCatalogPackage.initializePackageContents();
		theWorkflowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpecPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecPackage.eNS_URI, theSpecPackage);
		return theSpecPackage;
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
	public EAttribute getTask_Id() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Flows() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Inputs() {
		return (EReference) taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Outputs() {
		return (EReference) taskEClass.getEStructuralFeatures().get(4);
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
	public EReference getActivity_Start() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_NestedActivities() {
		return (EReference) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ParentActivity() {
		return (EReference) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Tasks() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Divergences() {
		return (EReference) activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Convergences() {
		return (EReference) activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_ConditionalDivergences() {
		return (EReference) activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStart() {
		return startEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStart_Node() {
		return (EReference) startEClass.getEStructuralFeatures().get(0);
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
	public EClass getExternalTask() {
		return externalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalTask_LanguageId() {
		return (EAttribute) externalTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalTask_ScriptId() {
		return (EAttribute) externalTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryTask() {
		return libraryTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivergence() {
		return divergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivergence_Convergence() {
		return (EReference) divergenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDivergence_Roots() {
		return (EReference) divergenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvergence() {
		return convergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronization() {
		return synchronizationEClass;
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
	public EClass getSimpleMerge() {
		return simpleMergeEClass;
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
	public EAttribute getVariable_TypeId() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_IsRequired() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
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
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Successors() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Predecessors() {
		return (EReference) nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__CanPrecede__Node() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__CanSucceed__Node() {
		return nodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__Precedes__Node() {
		return nodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__Succeeds__Node() {
		return nodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__CanPrecede() {
		return nodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__CanSucceed() {
		return nodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasSuccessors() {
		return nodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__HasPredecessors() {
		return nodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalDivergence() {
		return conditionalDivergenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalRoot() {
		return conditionalRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalRoot_Task() {
		return (EReference) conditionalRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalRoot_Condition() {
		return (EReference) conditionalRootEClass.getEStructuralFeatures().get(1);
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
	public EClass getStartingNode() {
		return startingNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecFactory getSpecFactory() {
		return (SpecFactory) getEFactoryInstance();
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
		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ID);
		createEAttribute(taskEClass, TASK__NAME);
		createEReference(taskEClass, TASK__FLOWS);
		createEReference(taskEClass, TASK__INPUTS);
		createEReference(taskEClass, TASK__OUTPUTS);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__START);
		createEReference(activityEClass, ACTIVITY__NESTED_ACTIVITIES);
		createEReference(activityEClass, ACTIVITY__PARENT_ACTIVITY);
		createEReference(activityEClass, ACTIVITY__TASKS);
		createEReference(activityEClass, ACTIVITY__DIVERGENCES);
		createEReference(activityEClass, ACTIVITY__CONVERGENCES);
		createEReference(activityEClass, ACTIVITY__CONDITIONAL_DIVERGENCES);

		startEClass = createEClass(START);
		createEReference(startEClass, START__NODE);

		parallelSplitEClass = createEClass(PARALLEL_SPLIT);

		externalTaskEClass = createEClass(EXTERNAL_TASK);
		createEAttribute(externalTaskEClass, EXTERNAL_TASK__LANGUAGE_ID);
		createEAttribute(externalTaskEClass, EXTERNAL_TASK__SCRIPT_ID);

		libraryTaskEClass = createEClass(LIBRARY_TASK);

		divergenceEClass = createEClass(DIVERGENCE);
		createEReference(divergenceEClass, DIVERGENCE__CONVERGENCE);
		createEReference(divergenceEClass, DIVERGENCE__ROOTS);

		convergenceEClass = createEClass(CONVERGENCE);

		synchronizationEClass = createEClass(SYNCHRONIZATION);

		multiChoiceEClass = createEClass(MULTI_CHOICE);

		simpleMergeEClass = createEClass(SIMPLE_MERGE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE_ID);
		createEAttribute(variableEClass, VARIABLE__VALUE);
		createEAttribute(variableEClass, VARIABLE__IS_REQUIRED);

		dataFlowsEClass = createEClass(DATA_FLOWS);
		createEReference(dataFlowsEClass, DATA_FLOWS__INCOMINGS);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__INPUT);
		createEReference(dataFlowEClass, DATA_FLOW__OUTPUT);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__SUCCESSORS);
		createEReference(nodeEClass, NODE__PREDECESSORS);
		createEOperation(nodeEClass, NODE___CAN_PRECEDE__NODE);
		createEOperation(nodeEClass, NODE___CAN_SUCCEED__NODE);
		createEOperation(nodeEClass, NODE___PRECEDES__NODE);
		createEOperation(nodeEClass, NODE___SUCCEEDS__NODE);
		createEOperation(nodeEClass, NODE___CAN_PRECEDE);
		createEOperation(nodeEClass, NODE___CAN_SUCCEED);
		createEOperation(nodeEClass, NODE___HAS_SUCCESSORS);
		createEOperation(nodeEClass, NODE___HAS_PREDECESSORS);

		conditionalDivergenceEClass = createEClass(CONDITIONAL_DIVERGENCE);

		conditionalRootEClass = createEClass(CONDITIONAL_ROOT);
		createEReference(conditionalRootEClass, CONDITIONAL_ROOT__TASK);
		createEReference(conditionalRootEClass, CONDITIONAL_ROOT__CONDITION);

		conditionEClass = createEClass(CONDITION);

		startingNodeEClass = createEClass(STARTING_NODE);
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
		taskEClass.getESuperTypes().add(this.getStartingNode());
		activityEClass.getESuperTypes().add(this.getTask());
		startEClass.getESuperTypes().add(this.getNode());
		parallelSplitEClass.getESuperTypes().add(this.getDivergence());
		externalTaskEClass.getESuperTypes().add(this.getTask());
		libraryTaskEClass.getESuperTypes().add(this.getTask());
		divergenceEClass.getESuperTypes().add(this.getStartingNode());
		convergenceEClass.getESuperTypes().add(this.getNode());
		synchronizationEClass.getESuperTypes().add(this.getConvergence());
		multiChoiceEClass.getESuperTypes().add(this.getConditionalDivergence());
		simpleMergeEClass.getESuperTypes().add(this.getConvergence());
		conditionalDivergenceEClass.getESuperTypes().add(this.getStartingNode());
		conditionEClass.getESuperTypes().add(this.getTask());
		startingNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Id(), theXMLTypePackage.getString(), "id", "", 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Flows(), this.getDataFlows(), null, "flows", null, 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTask_Inputs(), this.getVariable(), null, "inputs", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTask_Outputs(), this.getVariable(), null, "outputs", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Start(), this.getStart(), null, "start", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActivity_NestedActivities(), this.getActivity(), this.getActivity_ParentActivity(),
				"nestedActivities", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_ParentActivity(), this.getActivity(), this.getActivity_NestedActivities(),
				"parentActivity", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Tasks(), this.getTask(), null, "tasks", null, 0, -1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getActivity_Divergences(), this.getDivergence(), null, "divergences", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Convergences(), this.getConvergence(), null, "convergences", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_ConditionalDivergences(), this.getConditionalDivergence(), null,
				"conditionalDivergences", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStart_Node(), this.getStartingNode(), null, "node", null, 0, 1, Start.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(parallelSplitEClass, ParallelSplit.class, "ParallelSplit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalTaskEClass, ExternalTask.class, "ExternalTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalTask_LanguageId(), theXMLTypePackage.getString(), "languageId", "", 0, 1,
				ExternalTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalTask_ScriptId(), ecorePackage.getEString(), "scriptId", "", 0, 1, ExternalTask.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryTaskEClass, LibraryTask.class, "LibraryTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(divergenceEClass, Divergence.class, "Divergence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDivergence_Convergence(), this.getConvergence(), null, "convergence", null, 0, 1,
				Divergence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDivergence_Roots(), this.getTask(), null, "roots", null, 0, -1, Divergence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convergenceEClass, Convergence.class, "Convergence", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationEClass, Synchronization.class, "Synchronization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiChoiceEClass, MultiChoice.class, "MultiChoice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleMergeEClass, SimpleMerge.class, "SimpleMerge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), theXMLTypePackage.getString(), "name", "", 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_TypeId(), theXMLTypePackage.getString(), "typeId", "", 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), theXMLTypePackage.getString(), "value", "", 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_IsRequired(), ecorePackage.getEBoolean(), "isRequired", "true", 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowsEClass, DataFlows.class, "DataFlows", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlows_Incomings(), this.getDataFlow(), null, "incomings", null, 0, -1, DataFlows.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Input(), this.getVariable(), null, "input", null, 0, 1, DataFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Output(), this.getVariable(), null, "output", null, 0, 1, DataFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Successors(), this.getNode(), this.getNode_Predecessors(), "successors", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Predecessors(), this.getNode(), this.getNode_Successors(), "predecessors", null, 0, -1,
				Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getNode__CanPrecede__Node(), theXMLTypePackage.getBoolean(), "canPrecede", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__CanSucceed__Node(), theXMLTypePackage.getBoolean(), "canSucceed", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getNode(), "node", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__Precedes__Node(), theXMLTypePackage.getBoolean(), "precedes", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getNode(), "successor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNode__Succeeds__Node(), theXMLTypePackage.getBoolean(), "succeeds", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getNode(), "predecessor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNode__CanPrecede(), theXMLTypePackage.getBoolean(), "canPrecede", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getNode__CanSucceed(), theXMLTypePackage.getBoolean(), "canSucceed", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getNode__HasSuccessors(), theXMLTypePackage.getBoolean(), "hasSuccessors", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getNode__HasPredecessors(), theXMLTypePackage.getBoolean(), "hasPredecessors", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(conditionalDivergenceEClass, ConditionalDivergence.class, "ConditionalDivergence", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalRootEClass, ConditionalRoot.class, "ConditionalRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalRoot_Task(), this.getTask(), null, "task", null, 0, 1, ConditionalRoot.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalRoot_Condition(), this.getCondition(), null, "condition", null, 0, 1,
				ConditionalRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(startingNodeEClass, StartingNode.class, "StartingNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation(taskEClass, source, new String[] { "documentation", "A node that can be executed." });
		addAnnotation(startEClass, source, new String[] { "documentation", "Represents the beginning of a workflow." });
		addAnnotation(externalTaskEClass, source,
				new String[] { "documentation", "A task which behavior is implemented by the user." });
		addAnnotation(libraryTaskEClass, source,
				new String[] { "documentation", "A task which behavior is defined in an installed bundle." });
		addAnnotation(divergenceEClass, source, new String[] { "documentation",
				"Splits the execution in two or more branches that should be executed concurrently." });
		addAnnotation(variableEClass, source, new String[] { "documentation", "Hold a typed value." });
		addAnnotation(dataFlowsEClass, source, new String[] { "documentation", "A collection of dataflow." });
		addAnnotation(dataFlowEClass, source,
				new String[] { "documentation", "A flow of data between two variables." });
		addAnnotation(nodeEClass, source, new String[] { "documentation", "An element that composes a workflow." });
		addAnnotation(conditionalDivergenceEClass, source, new String[] { "documentation",
				"Splits the workflow in two or more branches that should be executed concurrently, based on a predicate." });
	}

} //SpecPackageImpl
