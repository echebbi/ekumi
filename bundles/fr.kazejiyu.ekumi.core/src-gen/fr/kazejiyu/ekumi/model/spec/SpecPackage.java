/**
 */
package fr.kazejiyu.ekumi.model.spec;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.kazejiyu.ekumi.model.spec.SpecFactory
 * @model kind="package"
 * @generated
 */
public interface SpecPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.kazejiyu.io/ekumi/spec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpecPackage eINSTANCE = fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSORS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Join</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__JOIN = 3;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.JoinImpl <em>Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.JoinImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getJoin()
	 * @generated
	 */
	int JOIN = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__BEHAVIOR = 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN__ACTIVITIES = 1;

	/**
	 * The number of structural features of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.JoinBehaviorImpl <em>Join Behavior</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.JoinBehaviorImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getJoinBehavior()
	 * @generated
	 */
	int JOIN_BEHAVIOR = 2;

	/**
	 * The number of structural features of the '<em>Join Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_BEHAVIOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Join Behavior</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_BEHAVIOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.StartJoinImpl <em>Start Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.StartJoinImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getStartJoin()
	 * @generated
	 */
	int START_JOIN = 3;

	/**
	 * The number of structural features of the '<em>Start Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOIN_FEATURE_COUNT = JOIN_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_JOIN_OPERATION_COUNT = JOIN_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.SplitJoinImpl <em>Split Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SplitJoinImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getSplitJoin()
	 * @generated
	 */
	int SPLIT_JOIN = 4;

	/**
	 * The number of structural features of the '<em>Split Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN_FEATURE_COUNT = JOIN_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Split Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_JOIN_OPERATION_COUNT = JOIN_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.SimpleJoinImpl <em>Simple Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SimpleJoinImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getSimpleJoin()
	 * @generated
	 */
	int SIMPLE_JOIN = 5;

	/**
	 * The number of structural features of the '<em>Simple Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_JOIN_FEATURE_COUNT = JOIN_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_JOIN_OPERATION_COUNT = JOIN_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.RepeatJoinImpl <em>Repeat Join</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.RepeatJoinImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getRepeatJoin()
	 * @generated
	 */
	int REPEAT_JOIN = 6;

	/**
	 * The number of structural features of the '<em>Repeat Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_JOIN_FEATURE_COUNT = JOIN_BEHAVIOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Repeat Join</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_JOIN_OPERATION_COUNT = JOIN_BEHAVIOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl
	 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 7;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ACTIVITIES = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__START = 1;

	/**
	 * The feature id for the '<em><b>Sub Workflow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SUB_WORKFLOW = 2;

	/**
	 * The feature id for the '<em><b>Parent Workflow</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PARENT_WORKFLOW = 3;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.model.spec.Activity#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getSuccessors()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Successors();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.model.spec.Activity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.model.spec.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.model.spec.Activity#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Activity#getJoin()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Join();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.Join <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Join
	 * @generated
	 */
	EClass getJoin();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.model.spec.Join#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behavior</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Join#getBehavior()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Behavior();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.model.spec.Join#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Join#getActivities()
	 * @see #getJoin()
	 * @generated
	 */
	EReference getJoin_Activities();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.JoinBehavior <em>Join Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Behavior</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.JoinBehavior
	 * @generated
	 */
	EClass getJoinBehavior();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.StartJoin <em>Start Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.StartJoin
	 * @generated
	 */
	EClass getStartJoin();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.SplitJoin <em>Split Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.SplitJoin
	 * @generated
	 */
	EClass getSplitJoin();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.SimpleJoin <em>Simple Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.SimpleJoin
	 * @generated
	 */
	EClass getSimpleJoin();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.RepeatJoin <em>Repeat Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat Join</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.RepeatJoin
	 * @generated
	 */
	EClass getRepeatJoin();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.model.spec.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getActivities()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Activities();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getStart()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Start();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getSubWorkflow <em>Sub Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Workflow</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getSubWorkflow()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_SubWorkflow();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.model.spec.Workflow#getParentWorkflow <em>Parent Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Workflow</em>'.
	 * @see fr.kazejiyu.ekumi.model.spec.Workflow#getParentWorkflow()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_ParentWorkflow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpecFactory getSpecFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SUCCESSORS = eINSTANCE.getActivity_Successors();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ID = eINSTANCE.getActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__NAME = eINSTANCE.getActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__JOIN = eINSTANCE.getActivity_Join();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.JoinImpl <em>Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.JoinImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getJoin()
		 * @generated
		 */
		EClass JOIN = eINSTANCE.getJoin();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__BEHAVIOR = eINSTANCE.getJoin_Behavior();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOIN__ACTIVITIES = eINSTANCE.getJoin_Activities();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.JoinBehaviorImpl <em>Join Behavior</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.JoinBehaviorImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getJoinBehavior()
		 * @generated
		 */
		EClass JOIN_BEHAVIOR = eINSTANCE.getJoinBehavior();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.StartJoinImpl <em>Start Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.StartJoinImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getStartJoin()
		 * @generated
		 */
		EClass START_JOIN = eINSTANCE.getStartJoin();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.SplitJoinImpl <em>Split Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SplitJoinImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getSplitJoin()
		 * @generated
		 */
		EClass SPLIT_JOIN = eINSTANCE.getSplitJoin();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.SimpleJoinImpl <em>Simple Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SimpleJoinImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getSimpleJoin()
		 * @generated
		 */
		EClass SIMPLE_JOIN = eINSTANCE.getSimpleJoin();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.RepeatJoinImpl <em>Repeat Join</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.RepeatJoinImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getRepeatJoin()
		 * @generated
		 */
		EClass REPEAT_JOIN = eINSTANCE.getRepeatJoin();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl
		 * @see fr.kazejiyu.ekumi.model.spec.impl.SpecPackageImpl#getWorkflow()
		 * @generated
		 */
		EClass WORKFLOW = eINSTANCE.getWorkflow();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__ACTIVITIES = eINSTANCE.getWorkflow_Activities();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__START = eINSTANCE.getWorkflow_Start();

		/**
		 * The meta object literal for the '<em><b>Sub Workflow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__SUB_WORKFLOW = eINSTANCE.getWorkflow_SubWorkflow();

		/**
		 * The meta object literal for the '<em><b>Parent Workflow</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW__PARENT_WORKFLOW = eINSTANCE.getWorkflow_ParentWorkflow();

	}

} //SpecPackage
