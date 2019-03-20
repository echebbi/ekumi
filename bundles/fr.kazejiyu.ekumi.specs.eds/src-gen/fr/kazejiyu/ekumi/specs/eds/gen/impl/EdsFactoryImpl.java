/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.impl;

import fr.kazejiyu.ekumi.specs.eds.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdsFactoryImpl extends EFactoryImpl implements EdsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdsFactory init() {
		try {
			EdsFactory theEdsFactory = (EdsFactory) EPackage.Registry.INSTANCE.getEFactory(EdsPackage.eNS_URI);
			if (theEdsFactory != null) {
				return theEdsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EdsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdsFactoryImpl() {
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
		case EdsPackage.ACTIVITY:
			return createActivity();
		case EdsPackage.START:
			return createStart();
		case EdsPackage.PARALLEL_SPLIT:
			return createParallelSplit();
		case EdsPackage.EXTERNAL_TASK:
			return createExternalTask();
		case EdsPackage.LIBRARY_TASK:
			return createLibraryTask();
		case EdsPackage.SYNCHRONIZATION:
			return createSynchronization();
		case EdsPackage.MULTI_CHOICE:
			return createMultiChoice();
		case EdsPackage.SIMPLE_MERGE:
			return createSimpleMerge();
		case EdsPackage.VARIABLE:
			return createVariable();
		case EdsPackage.DATA_FLOWS:
			return createDataFlows();
		case EdsPackage.DATA_FLOW:
			return createDataFlow();
		case EdsPackage.CONDITIONAL_ROOT:
			return createConditionalRoot();
		case EdsPackage.CONDITION:
			return createCondition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
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
	public ExternalTask createExternalTask() {
		ExternalTaskImpl externalTask = new ExternalTaskImpl();
		return externalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryTask createLibraryTask() {
		LibraryTaskImpl libraryTask = new LibraryTaskImpl();
		return libraryTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Synchronization createSynchronization() {
		SynchronizationImpl synchronization = new SynchronizationImpl();
		return synchronization;
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
	public SimpleMerge createSimpleMerge() {
		SimpleMergeImpl simpleMerge = new SimpleMergeImpl();
		return simpleMerge;
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
	 * @generated
	 */
	public DataFlows createDataFlows() {
		DataFlowsImpl dataFlows = new DataFlowsImpl();
		return dataFlows;
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
	public ConditionalRoot createConditionalRoot() {
		ConditionalRootImpl conditionalRoot = new ConditionalRootImpl();
		return conditionalRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdsPackage getEdsPackage() {
		return (EdsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EdsPackage getPackage() {
		return EdsPackage.eINSTANCE;
	}

} //EdsFactoryImpl
