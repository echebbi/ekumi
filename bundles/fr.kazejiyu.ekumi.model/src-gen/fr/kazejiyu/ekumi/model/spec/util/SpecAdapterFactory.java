/**
 */
package fr.kazejiyu.ekumi.model.spec.util;

import fr.kazejiyu.ekumi.model.spec.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.model.spec.SpecPackage
 * @generated
 */
public class SpecAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpecPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpecPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecSwitch<Adapter> modelSwitch = new SpecSwitch<Adapter>() {
		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseStart(Start object) {
			return createStartAdapter();
		}

		@Override
		public Adapter caseParallelSplit(ParallelSplit object) {
			return createParallelSplitAdapter();
		}

		@Override
		public Adapter caseExternalTask(ExternalTask object) {
			return createExternalTaskAdapter();
		}

		@Override
		public Adapter caseLibraryTask(LibraryTask object) {
			return createLibraryTaskAdapter();
		}

		@Override
		public Adapter caseDivergence(Divergence object) {
			return createDivergenceAdapter();
		}

		@Override
		public Adapter caseConvergence(Convergence object) {
			return createConvergenceAdapter();
		}

		@Override
		public Adapter caseSynchronization(Synchronization object) {
			return createSynchronizationAdapter();
		}

		@Override
		public Adapter caseMultiChoice(MultiChoice object) {
			return createMultiChoiceAdapter();
		}

		@Override
		public Adapter caseSimpleMerge(SimpleMerge object) {
			return createSimpleMergeAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseDataFlows(DataFlows object) {
			return createDataFlowsAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseNode(Node object) {
			return createNodeAdapter();
		}

		@Override
		public Adapter caseConditionalDivergence(ConditionalDivergence object) {
			return createConditionalDivergenceAdapter();
		}

		@Override
		public Adapter caseConditionalRoot(ConditionalRoot object) {
			return createConditionalRootAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseStartingNode(StartingNode object) {
			return createStartingNodeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.ParallelSplit
	 * @generated
	 */
	public Adapter createParallelSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.ExternalTask <em>External Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.ExternalTask
	 * @generated
	 */
	public Adapter createExternalTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.LibraryTask <em>Library Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.LibraryTask
	 * @generated
	 */
	public Adapter createLibraryTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Divergence <em>Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Divergence
	 * @generated
	 */
	public Adapter createDivergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Convergence <em>Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Convergence
	 * @generated
	 */
	public Adapter createConvergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Synchronization
	 * @generated
	 */
	public Adapter createSynchronizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.MultiChoice
	 * @generated
	 */
	public Adapter createMultiChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.SimpleMerge <em>Simple Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.SimpleMerge
	 * @generated
	 */
	public Adapter createSimpleMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.DataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.DataFlows
	 * @generated
	 */
	public Adapter createDataFlowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.ConditionalDivergence <em>Conditional Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.ConditionalDivergence
	 * @generated
	 */
	public Adapter createConditionalDivergenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.ConditionalRoot <em>Conditional Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.ConditionalRoot
	 * @generated
	 */
	public Adapter createConditionalRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.StartingNode <em>Starting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.StartingNode
	 * @generated
	 */
	public Adapter createStartingNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpecAdapterFactory
