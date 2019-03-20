/**
 */
package fr.kazejiyu.ekumi.specs.eds;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see fr.kazejiyu.ekumi.specs.eds.EdsFactory
 * @model kind="package"
 * @generated
 */
public interface EdsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eds";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ekumi.kazejiyu.fr/specs/eds";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eds";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdsPackage eINSTANCE = fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 14;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUCCESSORS = 0;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PREDECESSORS = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CAN_PRECEDE__NODE = 0;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CAN_SUCCEED__NODE = 1;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___PRECEDES__NODE = 2;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___SUCCEEDS__NODE = 3;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CAN_PRECEDE = 4;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CAN_SUCCEED = 5;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_SUCCESSORS = 6;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___HAS_PREDECESSORS = 7;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.StartingNodeImpl <em>Starting Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.StartingNodeImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getStartingNode()
	 * @generated
	 */
	int STARTING_NODE = 18;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE__SUCCESSORS = NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE__PREDECESSORS = NODE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Starting Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___CAN_PRECEDE__NODE = NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___CAN_SUCCEED__NODE = NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___PRECEDES__NODE = NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___SUCCEEDS__NODE = NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___CAN_PRECEDE = NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___CAN_SUCCEED = NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___HAS_SUCCESSORS = NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE___HAS_PREDECESSORS = NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Starting Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTING_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.TaskImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUCCESSORS = STARTING_NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREDECESSORS = STARTING_NODE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = STARTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = STARTING_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FLOWS = STARTING_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = STARTING_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = STARTING_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = STARTING_NODE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PRECEDE__NODE = STARTING_NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_SUCCEED__NODE = STARTING_NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___PRECEDES__NODE = STARTING_NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___SUCCEEDS__NODE = STARTING_NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_PRECEDE = STARTING_NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___CAN_SUCCEED = STARTING_NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___HAS_SUCCESSORS = STARTING_NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___HAS_PREDECESSORS = STARTING_NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = STARTING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSORS = TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREDECESSORS = TASK__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__START = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NESTED_ACTIVITIES = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Activity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PARENT_ACTIVITY = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TASKS = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Divergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DIVERGENCES = TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Convergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONVERGENCES = TASK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conditional Divergences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONDITIONAL_DIVERGENCES = TASK_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = TASK_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CAN_PRECEDE__NODE = TASK___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CAN_SUCCEED__NODE = TASK___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___PRECEDES__NODE = TASK___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___SUCCEEDS__NODE = TASK___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CAN_PRECEDE = TASK___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___CAN_SUCCEED = TASK___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___HAS_SUCCESSORS = TASK___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___HAS_PREDECESSORS = TASK___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.StartImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getStart()
	 * @generated
	 */
	int START = 2;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SUCCESSORS = NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__PREDECESSORS = NODE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__NODE = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___CAN_PRECEDE__NODE = NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___CAN_SUCCEED__NODE = NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___PRECEDES__NODE = NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___SUCCEEDS__NODE = NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___CAN_PRECEDE = NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___CAN_SUCCEED = NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___HAS_SUCCESSORS = NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START___HAS_PREDECESSORS = NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl <em>Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDivergence()
	 * @generated
	 */
	int DIVERGENCE = 6;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE__SUCCESSORS = STARTING_NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE__PREDECESSORS = STARTING_NODE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE__CONVERGENCE = STARTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE__ROOTS = STARTING_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE_FEATURE_COUNT = STARTING_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___CAN_PRECEDE__NODE = STARTING_NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___CAN_SUCCEED__NODE = STARTING_NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___PRECEDES__NODE = STARTING_NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___SUCCEEDS__NODE = STARTING_NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___CAN_PRECEDE = STARTING_NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___CAN_SUCCEED = STARTING_NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___HAS_SUCCESSORS = STARTING_NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE___HAS_PREDECESSORS = STARTING_NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVERGENCE_OPERATION_COUNT = STARTING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ParallelSplitImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getParallelSplit()
	 * @generated
	 */
	int PARALLEL_SPLIT = 3;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__SUCCESSORS = DIVERGENCE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__PREDECESSORS = DIVERGENCE__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Convergence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__CONVERGENCE = DIVERGENCE__CONVERGENCE;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__ROOTS = DIVERGENCE__ROOTS;

	/**
	 * The number of structural features of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_FEATURE_COUNT = DIVERGENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___CAN_PRECEDE__NODE = DIVERGENCE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___CAN_SUCCEED__NODE = DIVERGENCE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___PRECEDES__NODE = DIVERGENCE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___SUCCEEDS__NODE = DIVERGENCE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___CAN_PRECEDE = DIVERGENCE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___CAN_SUCCEED = DIVERGENCE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___HAS_SUCCESSORS = DIVERGENCE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___HAS_PREDECESSORS = DIVERGENCE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_OPERATION_COUNT = DIVERGENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl <em>External Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getExternalTask()
	 * @generated
	 */
	int EXTERNAL_TASK = 4;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__SUCCESSORS = TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__PREDECESSORS = TASK__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Language Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__LANGUAGE_ID = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK__SCRIPT_ID = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___CAN_PRECEDE__NODE = TASK___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___CAN_SUCCEED__NODE = TASK___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___PRECEDES__NODE = TASK___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___SUCCEEDS__NODE = TASK___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___CAN_PRECEDE = TASK___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___CAN_SUCCEED = TASK___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___HAS_SUCCESSORS = TASK___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK___HAS_PREDECESSORS = TASK___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>External Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.LibraryTaskImpl <em>Library Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.LibraryTaskImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getLibraryTask()
	 * @generated
	 */
	int LIBRARY_TASK = 5;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__SUCCESSORS = TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__PREDECESSORS = TASK__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Library Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___CAN_PRECEDE__NODE = TASK___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___CAN_SUCCEED__NODE = TASK___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___PRECEDES__NODE = TASK___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___SUCCEEDS__NODE = TASK___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___CAN_PRECEDE = TASK___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___CAN_SUCCEED = TASK___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___HAS_SUCCESSORS = TASK___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK___HAS_PREDECESSORS = TASK___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Library Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConvergenceImpl <em>Convergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConvergenceImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConvergence()
	 * @generated
	 */
	int CONVERGENCE = 7;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE__SUCCESSORS = NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE__PREDECESSORS = NODE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___CAN_PRECEDE__NODE = NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___CAN_SUCCEED__NODE = NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___PRECEDES__NODE = NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___SUCCEEDS__NODE = NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___CAN_PRECEDE = NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___CAN_SUCCEED = NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___HAS_SUCCESSORS = NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE___HAS_PREDECESSORS = NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Convergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERGENCE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.SynchronizationImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 8;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__SUCCESSORS = CONVERGENCE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__PREDECESSORS = CONVERGENCE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = CONVERGENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___CAN_PRECEDE__NODE = CONVERGENCE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___CAN_SUCCEED__NODE = CONVERGENCE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___PRECEDES__NODE = CONVERGENCE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___SUCCEEDS__NODE = CONVERGENCE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___CAN_PRECEDE = CONVERGENCE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___CAN_SUCCEED = CONVERGENCE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___HAS_SUCCESSORS = CONVERGENCE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION___HAS_PREDECESSORS = CONVERGENCE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_OPERATION_COUNT = CONVERGENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalDivergenceImpl <em>Conditional Divergence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalDivergenceImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConditionalDivergence()
	 * @generated
	 */
	int CONDITIONAL_DIVERGENCE = 15;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE__SUCCESSORS = STARTING_NODE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE__PREDECESSORS = STARTING_NODE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Conditional Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE_FEATURE_COUNT = STARTING_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___CAN_PRECEDE__NODE = STARTING_NODE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___CAN_SUCCEED__NODE = STARTING_NODE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___PRECEDES__NODE = STARTING_NODE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___SUCCEEDS__NODE = STARTING_NODE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___CAN_PRECEDE = STARTING_NODE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___CAN_SUCCEED = STARTING_NODE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___HAS_SUCCESSORS = STARTING_NODE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE___HAS_PREDECESSORS = STARTING_NODE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Conditional Divergence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_DIVERGENCE_OPERATION_COUNT = STARTING_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.MultiChoiceImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getMultiChoice()
	 * @generated
	 */
	int MULTI_CHOICE = 9;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__SUCCESSORS = CONDITIONAL_DIVERGENCE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__PREDECESSORS = CONDITIONAL_DIVERGENCE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_FEATURE_COUNT = CONDITIONAL_DIVERGENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___CAN_PRECEDE__NODE = CONDITIONAL_DIVERGENCE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___CAN_SUCCEED__NODE = CONDITIONAL_DIVERGENCE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___PRECEDES__NODE = CONDITIONAL_DIVERGENCE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___SUCCEEDS__NODE = CONDITIONAL_DIVERGENCE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___CAN_PRECEDE = CONDITIONAL_DIVERGENCE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___CAN_SUCCEED = CONDITIONAL_DIVERGENCE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___HAS_SUCCESSORS = CONDITIONAL_DIVERGENCE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___HAS_PREDECESSORS = CONDITIONAL_DIVERGENCE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_OPERATION_COUNT = CONDITIONAL_DIVERGENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.SimpleMergeImpl <em>Simple Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.SimpleMergeImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getSimpleMerge()
	 * @generated
	 */
	int SIMPLE_MERGE = 10;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE__SUCCESSORS = CONVERGENCE__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE__PREDECESSORS = CONVERGENCE__PREDECESSORS;

	/**
	 * The number of structural features of the '<em>Simple Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE_FEATURE_COUNT = CONVERGENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___CAN_PRECEDE__NODE = CONVERGENCE___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___CAN_SUCCEED__NODE = CONVERGENCE___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___PRECEDES__NODE = CONVERGENCE___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___SUCCEEDS__NODE = CONVERGENCE___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___CAN_PRECEDE = CONVERGENCE___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___CAN_SUCCEED = CONVERGENCE___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___HAS_SUCCESSORS = CONVERGENCE___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE___HAS_PREDECESSORS = CONVERGENCE___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Simple Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MERGE_OPERATION_COUNT = CONVERGENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.VariableImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IS_REQUIRED = 3;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowsImpl <em>Data Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowsImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDataFlows()
	 * @generated
	 */
	int DATA_FLOWS = 12;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__INCOMINGS = 0;

	/**
	 * The number of structural features of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 13;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__OUTPUT = 1;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalRootImpl <em>Conditional Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalRootImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConditionalRoot()
	 * @generated
	 */
	int CONDITIONAL_ROOT = 16;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROOT__TASK = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROOT__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Conditional Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Conditional Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionImpl
	 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SUCCESSORS = TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PREDECESSORS = TASK__PREDECESSORS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = TASK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CAN_PRECEDE__NODE = TASK___CAN_PRECEDE__NODE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CAN_SUCCEED__NODE = TASK___CAN_SUCCEED__NODE;

	/**
	 * The operation id for the '<em>Precedes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___PRECEDES__NODE = TASK___PRECEDES__NODE;

	/**
	 * The operation id for the '<em>Succeeds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___SUCCEEDS__NODE = TASK___SUCCEEDS__NODE;

	/**
	 * The operation id for the '<em>Can Precede</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CAN_PRECEDE = TASK___CAN_PRECEDE;

	/**
	 * The operation id for the '<em>Can Succeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___CAN_SUCCEED = TASK___CAN_SUCCEED;

	/**
	 * The operation id for the '<em>Has Successors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___HAS_SUCCESSORS = TASK___HAS_SUCCESSORS;

	/**
	 * The operation id for the '<em>Has Predecessors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___HAS_PREDECESSORS = TASK___HAS_PREDECESSORS;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Task#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task#getId()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.specs.eds.Task#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flows</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task#getFlows()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Flows();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Task#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task#getInputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Task#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Task#getOutputs()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Outputs();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getStart()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getNestedActivities <em>Nested Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Activities</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getNestedActivities()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_NestedActivities();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getParentActivity <em>Parent Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Activity</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getParentActivity()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ParentActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getTasks()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getDivergences <em>Divergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Divergences</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getDivergences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Divergences();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getConvergences <em>Convergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Convergences</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getConvergences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Convergences();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.Activity#getConditionalDivergences <em>Conditional Divergences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditional Divergences</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Activity#getConditionalDivergences()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_ConditionalDivergences();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.specs.eds.Start#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Start#getNode()
	 * @see #getStart()
	 * @generated
	 */
	EReference getStart_Node();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Split</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ParallelSplit
	 * @generated
	 */
	EClass getParallelSplit();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.ExternalTask <em>External Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Task</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ExternalTask
	 * @generated
	 */
	EClass getExternalTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.ExternalTask#getLanguageId <em>Language Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Id</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ExternalTask#getLanguageId()
	 * @see #getExternalTask()
	 * @generated
	 */
	EAttribute getExternalTask_LanguageId();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.ExternalTask#getScriptId <em>Script Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Id</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ExternalTask#getScriptId()
	 * @see #getExternalTask()
	 * @generated
	 */
	EAttribute getExternalTask_ScriptId();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.LibraryTask <em>Library Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library Task</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.LibraryTask
	 * @generated
	 */
	EClass getLibraryTask();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Divergence <em>Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divergence</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Divergence
	 * @generated
	 */
	EClass getDivergence();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.specs.eds.Divergence#getConvergence <em>Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Convergence</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Divergence#getConvergence()
	 * @see #getDivergence()
	 * @generated
	 */
	EReference getDivergence_Convergence();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.specs.eds.Divergence#getRoots <em>Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Divergence#getRoots()
	 * @see #getDivergence()
	 * @generated
	 */
	EReference getDivergence_Roots();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Convergence <em>Convergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convergence</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Convergence
	 * @generated
	 */
	EClass getConvergence();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.MultiChoice
	 * @generated
	 */
	EClass getMultiChoice();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.SimpleMerge <em>Simple Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Merge</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.SimpleMerge
	 * @generated
	 */
	EClass getSimpleMerge();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Variable#getTypeId <em>Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Id</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Variable#getTypeId()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_TypeId();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.specs.eds.Variable#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Variable#isIsRequired()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IsRequired();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.DataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flows</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.DataFlows
	 * @generated
	 */
	EClass getDataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.specs.eds.DataFlows#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incomings</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.DataFlows#getIncomings()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Incomings();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.specs.eds.DataFlow#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.DataFlow#getInput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Input();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.specs.eds.DataFlow#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.DataFlow#getOutput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Output();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.specs.eds.Node#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#getSuccessors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Successors();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.specs.eds.Node#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Predecessors</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#getPredecessors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Predecessors();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#canPrecede(fr.kazejiyu.ekumi.specs.eds.Node) <em>Can Precede</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Precede</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#canPrecede(fr.kazejiyu.ekumi.specs.eds.Node)
	 * @generated
	 */
	EOperation getNode__CanPrecede__Node();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#canSucceed(fr.kazejiyu.ekumi.specs.eds.Node) <em>Can Succeed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Succeed</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#canSucceed(fr.kazejiyu.ekumi.specs.eds.Node)
	 * @generated
	 */
	EOperation getNode__CanSucceed__Node();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#precedes(fr.kazejiyu.ekumi.specs.eds.Node) <em>Precedes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Precedes</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#precedes(fr.kazejiyu.ekumi.specs.eds.Node)
	 * @generated
	 */
	EOperation getNode__Precedes__Node();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#succeeds(fr.kazejiyu.ekumi.specs.eds.Node) <em>Succeeds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Succeeds</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#succeeds(fr.kazejiyu.ekumi.specs.eds.Node)
	 * @generated
	 */
	EOperation getNode__Succeeds__Node();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#canPrecede() <em>Can Precede</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Precede</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#canPrecede()
	 * @generated
	 */
	EOperation getNode__CanPrecede();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#canSucceed() <em>Can Succeed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Succeed</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#canSucceed()
	 * @generated
	 */
	EOperation getNode__CanSucceed();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#hasSuccessors() <em>Has Successors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Successors</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#hasSuccessors()
	 * @generated
	 */
	EOperation getNode__HasSuccessors();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.specs.eds.Node#hasPredecessors() <em>Has Predecessors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Predecessors</em>' operation.
	 * @see fr.kazejiyu.ekumi.specs.eds.Node#hasPredecessors()
	 * @generated
	 */
	EOperation getNode__HasPredecessors();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.ConditionalDivergence <em>Conditional Divergence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Divergence</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ConditionalDivergence
	 * @generated
	 */
	EClass getConditionalDivergence();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.ConditionalRoot <em>Conditional Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Root</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ConditionalRoot
	 * @generated
	 */
	EClass getConditionalRoot();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.specs.eds.ConditionalRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ConditionalRoot#getTask()
	 * @see #getConditionalRoot()
	 * @generated
	 */
	EReference getConditionalRoot_Task();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.specs.eds.ConditionalRoot#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.ConditionalRoot#getCondition()
	 * @see #getConditionalRoot()
	 * @generated
	 */
	EReference getConditionalRoot_Condition();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.specs.eds.StartingNode <em>Starting Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Starting Node</em>'.
	 * @see fr.kazejiyu.ekumi.specs.eds.StartingNode
	 * @generated
	 */
	EClass getStartingNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdsFactory getEdsFactory();

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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.TaskImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID = eINSTANCE.getTask_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__FLOWS = eINSTANCE.getTask_Flows();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__INPUTS = eINSTANCE.getTask_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OUTPUTS = eINSTANCE.getTask_Outputs();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__START = eINSTANCE.getActivity_Start();

		/**
		 * The meta object literal for the '<em><b>Nested Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__NESTED_ACTIVITIES = eINSTANCE.getActivity_NestedActivities();

		/**
		 * The meta object literal for the '<em><b>Parent Activity</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PARENT_ACTIVITY = eINSTANCE.getActivity_ParentActivity();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TASKS = eINSTANCE.getActivity_Tasks();

		/**
		 * The meta object literal for the '<em><b>Divergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__DIVERGENCES = eINSTANCE.getActivity_Divergences();

		/**
		 * The meta object literal for the '<em><b>Convergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CONVERGENCES = eINSTANCE.getActivity_Convergences();

		/**
		 * The meta object literal for the '<em><b>Conditional Divergences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__CONDITIONAL_DIVERGENCES = eINSTANCE.getActivity_ConditionalDivergences();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.StartImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START__NODE = eINSTANCE.getStart_Node();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ParallelSplitImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getParallelSplit()
		 * @generated
		 */
		EClass PARALLEL_SPLIT = eINSTANCE.getParallelSplit();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl <em>External Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ExternalTaskImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getExternalTask()
		 * @generated
		 */
		EClass EXTERNAL_TASK = eINSTANCE.getExternalTask();

		/**
		 * The meta object literal for the '<em><b>Language Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TASK__LANGUAGE_ID = eINSTANCE.getExternalTask_LanguageId();

		/**
		 * The meta object literal for the '<em><b>Script Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TASK__SCRIPT_ID = eINSTANCE.getExternalTask_ScriptId();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.LibraryTaskImpl <em>Library Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.LibraryTaskImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getLibraryTask()
		 * @generated
		 */
		EClass LIBRARY_TASK = eINSTANCE.getLibraryTask();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl <em>Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DivergenceImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDivergence()
		 * @generated
		 */
		EClass DIVERGENCE = eINSTANCE.getDivergence();

		/**
		 * The meta object literal for the '<em><b>Convergence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVERGENCE__CONVERGENCE = eINSTANCE.getDivergence_Convergence();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVERGENCE__ROOTS = eINSTANCE.getDivergence_Roots();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConvergenceImpl <em>Convergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConvergenceImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConvergence()
		 * @generated
		 */
		EClass CONVERGENCE = eINSTANCE.getConvergence();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.SynchronizationImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.MultiChoiceImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getMultiChoice()
		 * @generated
		 */
		EClass MULTI_CHOICE = eINSTANCE.getMultiChoice();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.SimpleMergeImpl <em>Simple Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.SimpleMergeImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getSimpleMerge()
		 * @generated
		 */
		EClass SIMPLE_MERGE = eINSTANCE.getSimpleMerge();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.VariableImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE_ID = eINSTANCE.getVariable_TypeId();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IS_REQUIRED = eINSTANCE.getVariable_IsRequired();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowsImpl <em>Data Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowsImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDataFlows()
		 * @generated
		 */
		EClass DATA_FLOWS = eINSTANCE.getDataFlows();

		/**
		 * The meta object literal for the '<em><b>Incomings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOWS__INCOMINGS = eINSTANCE.getDataFlows_Incomings();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__INPUT = eINSTANCE.getDataFlow_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__OUTPUT = eINSTANCE.getDataFlow_Output();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.NodeImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUCCESSORS = eINSTANCE.getNode_Successors();

		/**
		 * The meta object literal for the '<em><b>Predecessors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PREDECESSORS = eINSTANCE.getNode_Predecessors();

		/**
		 * The meta object literal for the '<em><b>Can Precede</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CAN_PRECEDE__NODE = eINSTANCE.getNode__CanPrecede__Node();

		/**
		 * The meta object literal for the '<em><b>Can Succeed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CAN_SUCCEED__NODE = eINSTANCE.getNode__CanSucceed__Node();

		/**
		 * The meta object literal for the '<em><b>Precedes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___PRECEDES__NODE = eINSTANCE.getNode__Precedes__Node();

		/**
		 * The meta object literal for the '<em><b>Succeeds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___SUCCEEDS__NODE = eINSTANCE.getNode__Succeeds__Node();

		/**
		 * The meta object literal for the '<em><b>Can Precede</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CAN_PRECEDE = eINSTANCE.getNode__CanPrecede();

		/**
		 * The meta object literal for the '<em><b>Can Succeed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CAN_SUCCEED = eINSTANCE.getNode__CanSucceed();

		/**
		 * The meta object literal for the '<em><b>Has Successors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_SUCCESSORS = eINSTANCE.getNode__HasSuccessors();

		/**
		 * The meta object literal for the '<em><b>Has Predecessors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___HAS_PREDECESSORS = eINSTANCE.getNode__HasPredecessors();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalDivergenceImpl <em>Conditional Divergence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalDivergenceImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConditionalDivergence()
		 * @generated
		 */
		EClass CONDITIONAL_DIVERGENCE = eINSTANCE.getConditionalDivergence();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalRootImpl <em>Conditional Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionalRootImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getConditionalRoot()
		 * @generated
		 */
		EClass CONDITIONAL_ROOT = eINSTANCE.getConditionalRoot();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ROOT__TASK = eINSTANCE.getConditionalRoot_Task();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_ROOT__CONDITION = eINSTANCE.getConditionalRoot_Condition();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.ConditionImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.StartingNodeImpl <em>Starting Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.StartingNodeImpl
		 * @see fr.kazejiyu.ekumi.specs.eds.gen.impl.EdsPackageImpl#getStartingNode()
		 * @generated
		 */
		EClass STARTING_NODE = eINSTANCE.getStartingNode();

	}

} //EdsPackage
