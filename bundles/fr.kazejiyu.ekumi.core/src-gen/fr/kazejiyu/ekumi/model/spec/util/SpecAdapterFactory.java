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
		public Adapter caseActivity(Activity object) {
			return createActivityAdapter();
		}

		@Override
		public Adapter caseJoin(Join object) {
			return createJoinAdapter();
		}

		@Override
		public Adapter caseJoinBehavior(JoinBehavior object) {
			return createJoinBehaviorAdapter();
		}

		@Override
		public Adapter caseStartJoin(StartJoin object) {
			return createStartJoinAdapter();
		}

		@Override
		public Adapter caseSplitJoin(SplitJoin object) {
			return createSplitJoinAdapter();
		}

		@Override
		public Adapter caseSimpleJoin(SimpleJoin object) {
			return createSimpleJoinAdapter();
		}

		@Override
		public Adapter caseRepeatJoin(RepeatJoin object) {
			return createRepeatJoinAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
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
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Join
	 * @generated
	 */
	public Adapter createJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.JoinBehavior <em>Join Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.JoinBehavior
	 * @generated
	 */
	public Adapter createJoinBehaviorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.StartJoin <em>Start Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.StartJoin
	 * @generated
	 */
	public Adapter createStartJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.SplitJoin
	 * @generated
	 */
	public Adapter createSplitJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.SimpleJoin <em>Simple Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.SimpleJoin
	 * @generated
	 */
	public Adapter createSimpleJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.RepeatJoin <em>Repeat Join</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.RepeatJoin
	 * @generated
	 */
	public Adapter createRepeatJoinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.kazejiyu.ekumi.model.spec.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
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
