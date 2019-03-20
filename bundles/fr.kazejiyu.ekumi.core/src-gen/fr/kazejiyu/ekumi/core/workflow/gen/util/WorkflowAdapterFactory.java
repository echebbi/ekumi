/**
 */
package fr.kazejiyu.ekumi.core.workflow.gen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import fr.kazejiyu.ekumi.core.workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WorkflowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WorkflowPackage.eINSTANCE;
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
	protected WorkflowSwitch<Adapter> modelSwitch = new WorkflowSwitch<Adapter>() {
		@Override
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter caseMultipleInstances(MultipleInstances object) {
			return createMultipleInstancesAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseStructuredLoop(StructuredLoop object) {
			return createStructuredLoopAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseRunner(Runner object) {
			return createRunnerAdapter();
		}

		@Override
		public Adapter caseScriptedTask(ScriptedTask object) {
			return createScriptedTaskAdapter();
		}

		@Override
		public Adapter caseScript(Script object) {
			return createScriptAdapter();
		}

		@Override
		public Adapter caseMultiChoice(MultiChoice object) {
			return createMultiChoiceAdapter();
		}

		@Override
		public Adapter caseBranch(Branch object) {
			return createBranchAdapter();
		}

		@Override
		public Adapter caseUnsafeContext(UnsafeContext object) {
			return createUnsafeContextAdapter();
		}

		@Override
		public Adapter caseSerializable(Serializable object) {
			return createSerializableAdapter();
		}

		@Override
		public Adapter caseDataFlows(DataFlows object) {
			return createDataFlowsAdapter();
		}

		@Override
		public Adapter caseExecution(Execution object) {
			return createExecutionAdapter();
		}

		@Override
		public Adapter caseListOfVariables(ListOfVariables object) {
			return createListOfVariablesAdapter();
		}

		@Override
		public Adapter caseMapOfVariables(MapOfVariables object) {
			return createMapOfVariablesAdapter();
		}

		@Override
		public Adapter caseDriver(Driver object) {
			return createDriverAdapter();
		}

		@Override
		public Adapter caseDriverRunner(DriverRunner object) {
			return createDriverRunnerAdapter();
		}

		@Override
		public Adapter caseParallelSplit(ParallelSplit object) {
			return createParallelSplitAdapter();
		}

		@Override
		public Adapter caseContext(Context object) {
			return createContextAdapter();
		}

		@Override
		public Adapter caseHistory(History object) {
			return createHistoryAdapter();
		}

		@Override
		public Adapter caseIdentifiable(Identifiable object) {
			return createIdentifiableAdapter();
		}

		@Override
		public Adapter caseExecutable(Executable object) {
			return createExecutableAdapter();
		}

		@Override
		public Adapter caseHasStatus(HasStatus object) {
			return createHasStatusAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.MultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.MultipleInstances
	 * @generated
	 */
	public Adapter createMultipleInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop <em>Structured Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.StructuredLoop
	 * @generated
	 */
	public Adapter createStructuredLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Runner
	 * @generated
	 */
	public Adapter createRunnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.ScriptedTask <em>Scripted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.ScriptedTask
	 * @generated
	 */
	public Adapter createScriptedTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Script
	 * @generated
	 */
	public Adapter createScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.MultiChoice
	 * @generated
	 */
	public Adapter createMultiChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext <em>Unsafe Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext
	 * @generated
	 */
	public Adapter createUnsafeContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Serializable
	 * @generated
	 */
	public Adapter createSerializableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows
	 * @generated
	 */
	public Adapter createDataFlowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.ListOfVariables <em>List Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.ListOfVariables
	 * @generated
	 */
	public Adapter createListOfVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.MapOfVariables <em>Map Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.MapOfVariables
	 * @generated
	 */
	public Adapter createMapOfVariablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Driver
	 * @generated
	 */
	public Adapter createDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.DriverRunner <em>Driver Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.DriverRunner
	 * @generated
	 */
	public Adapter createDriverRunnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.ParallelSplit
	 * @generated
	 */
	public Adapter createParallelSplitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.History
	 * @generated
	 */
	public Adapter createHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.Executable
	 * @generated
	 */
	public Adapter createExecutableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.core.workflow.HasStatus <em>Has Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.core.workflow.HasStatus
	 * @generated
	 */
	public Adapter createHasStatusAdapter() {
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

} //WorkflowAdapterFactory
