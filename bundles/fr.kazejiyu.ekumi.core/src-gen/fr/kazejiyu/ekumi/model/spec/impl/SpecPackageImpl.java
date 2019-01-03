/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;

import fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl;

import fr.kazejiyu.ekumi.model.catalog.CatalogPackage;

import fr.kazejiyu.ekumi.model.catalog.impl.CatalogPackageImpl;

import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.Join;
import fr.kazejiyu.ekumi.model.spec.JoinBehavior;
import fr.kazejiyu.ekumi.model.spec.RepeatJoin;
import fr.kazejiyu.ekumi.model.spec.SimpleJoin;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.SplitJoin;
import fr.kazejiyu.ekumi.model.spec.StartJoin;
import fr.kazejiyu.ekumi.model.spec.Workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatJoinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowEClass = null;

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
		EkumiPackageImpl theEkumiPackage = (EkumiPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EkumiPackage.eNS_URI) instanceof EkumiPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(EkumiPackage.eNS_URI)
						: EkumiPackage.eINSTANCE);

		// Create package meta-data objects
		theSpecPackage.createPackageContents();
		theCatalogPackage.createPackageContents();
		theEkumiPackage.createPackageContents();

		// Initialize created meta-data
		theSpecPackage.initializePackageContents();
		theCatalogPackage.initializePackageContents();
		theEkumiPackage.initializePackageContents();

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
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Successors() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Id() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_Name() {
		return (EAttribute) activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Join() {
		return (EReference) activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoin() {
		return joinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Behavior() {
		return (EReference) joinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoin_Activities() {
		return (EReference) joinEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinBehavior() {
		return joinBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartJoin() {
		return startJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitJoin() {
		return splitJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleJoin() {
		return simpleJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatJoin() {
		return repeatJoinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflow() {
		return workflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Activities() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_Start() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_SubWorkflow() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflow_ParentWorkflow() {
		return (EReference) workflowEClass.getEStructuralFeatures().get(3);
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
		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__SUCCESSORS);
		createEAttribute(activityEClass, ACTIVITY__ID);
		createEAttribute(activityEClass, ACTIVITY__NAME);
		createEReference(activityEClass, ACTIVITY__JOIN);

		joinEClass = createEClass(JOIN);
		createEReference(joinEClass, JOIN__BEHAVIOR);
		createEReference(joinEClass, JOIN__ACTIVITIES);

		joinBehaviorEClass = createEClass(JOIN_BEHAVIOR);

		startJoinEClass = createEClass(START_JOIN);

		splitJoinEClass = createEClass(SPLIT_JOIN);

		simpleJoinEClass = createEClass(SIMPLE_JOIN);

		repeatJoinEClass = createEClass(REPEAT_JOIN);

		workflowEClass = createEClass(WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__ACTIVITIES);
		createEReference(workflowEClass, WORKFLOW__START);
		createEReference(workflowEClass, WORKFLOW__SUB_WORKFLOW);
		createEReference(workflowEClass, WORKFLOW__PARENT_WORKFLOW);
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
		startJoinEClass.getESuperTypes().add(this.getJoinBehavior());
		splitJoinEClass.getESuperTypes().add(this.getJoinBehavior());
		simpleJoinEClass.getESuperTypes().add(this.getJoinBehavior());
		repeatJoinEClass.getESuperTypes().add(this.getJoinBehavior());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Successors(), this.getActivity(), null, "successors", null, 0, -1, Activity.class,
				!IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Activity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Join(), this.getJoin(), null, "join", null, 0, 1, Activity.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(joinEClass, Join.class, "Join", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoin_Behavior(), this.getJoinBehavior(), null, "behavior", null, 0, -1, Join.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJoin_Activities(), this.getActivity(), null, "activities", null, 0, -1, Join.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinBehaviorEClass, JoinBehavior.class, "JoinBehavior", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(startJoinEClass, StartJoin.class, "StartJoin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitJoinEClass, SplitJoin.class, "SplitJoin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleJoinEClass, SimpleJoin.class, "SimpleJoin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(repeatJoinEClass, RepeatJoin.class, "RepeatJoin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(workflowEClass, Workflow.class, "Workflow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkflow_Activities(), this.getActivity(), null, "activities", null, 0, -1, Workflow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_Start(), this.getStartJoin(), null, "start", null, 0, 1, Workflow.class,
				!IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_SubWorkflow(), this.getWorkflow(), this.getWorkflow_ParentWorkflow(), "subWorkflow",
				null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkflow_ParentWorkflow(), this.getWorkflow(), this.getWorkflow_SubWorkflow(),
				"parentWorkflow", null, 0, 1, Workflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpecPackageImpl
