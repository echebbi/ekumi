/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowFactory
 * @model kind="package"
 * @generated
 */
public interface WorkflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ekumi.kazejiyu.fr/workflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkflowPackage eINSTANCE = fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.IdentifiableImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATUS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSOR = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREDECESSOR = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FLOWS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___RUN__CONTEXT = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.SequenceImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ROOT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MultipleInstancesImpl <em>Multiple Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MultipleInstancesImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMultipleInstances()
	 * @generated
	 */
	int MULTIPLE_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The number of structural features of the '<em>Multiple Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Multiple Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 3;

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
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DESTINATION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.VariableImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNER = 3;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.StructuredLoopImpl <em>Structured Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.StructuredLoopImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getStructuredLoop()
	 * @generated
	 */
	int STRUCTURED_LOOP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__PRE_CONDITION = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__POST_CONDITION = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__ACTIVITY = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structured Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Structured Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__PATH = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__OUTPUTS = 2;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ConditionImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__PATH = SCRIPT__PATH;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__INPUTS = SCRIPT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OUTPUTS = SCRIPT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Verified</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION___IS_VERIFIED__STRUCTUREDLOOP_CONTEXT = SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = SCRIPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.TaskImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__PATH = SCRIPT__PATH;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__INPUTS = SCRIPT__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER__OUTPUTS = SCRIPT__OUTPUTS;

	/**
	 * The number of structural features of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_FEATURE_COUNT = SCRIPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER___RUN__CONTEXT = SCRIPT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_OPERATION_COUNT = SCRIPT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptedTaskImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScriptedTask()
	 * @generated
	 */
	int SCRIPTED_TASK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__ID = TASK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__STATUS = TASK__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SUCCESSOR = TASK__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__PREDECESSOR = TASK__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT_PATH = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__LANGUAGE = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scripted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK___RUN__CONTEXT = TASK___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Scripted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MultiChoiceImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMultiChoice()
	 * @generated
	 */
	int MULTI_CHOICE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__BRANCHES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Multi Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.BranchImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 12;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__AVAILABILITY = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.UnsafeContextImpl <em>Unsafe Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.UnsafeContextImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getUnsafeContext()
	 * @generated
	 */
	int UNSAFE_CONTEXT = 13;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Execution</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT__EXECUTION = 1;

	/**
	 * The feature id for the '<em><b>Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT__EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Execution Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT__EXECUTION_STATUS = 3;

	/**
	 * The number of structural features of the '<em>Unsafe Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Safe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT___SAFE = 0;

	/**
	 * The number of operations of the '<em>Unsafe Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSAFE_CONTEXT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.Serializable
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 14;

	/**
	 * The number of structural features of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Serializable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIALIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowsImpl <em>Data Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowsImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataFlows()
	 * @generated
	 */
	int DATA_FLOWS = 15;

	/**
	 * The feature id for the '<em><b>Incomings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__INCOMINGS = 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__OUTGOINGS = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Resolve Inputs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS___RESOLVE_INPUTS = 0;

	/**
	 * The number of operations of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ExecutionImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ID = IDENTIFIABLE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__NAME = IDENTIFIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__STATUS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ACTIVITY = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CONTEXT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__START_DATE = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___START = IDENTIFIABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Join</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___JOIN = IDENTIFIABLE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Cancel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___CANCEL = IDENTIFIABLE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Running</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___IS_RUNNING = IDENTIFIABLE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Cancelled</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION___IS_CANCELLED = IDENTIFIABLE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = IDENTIFIABLE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ListOfVariablesImpl <em>List Of Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ListOfVariablesImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getListOfVariables()
	 * @generated
	 */
	int LIST_OF_VARIABLES = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__OWNER = VARIABLE__OWNER;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES__SIZE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OF_VARIABLES_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MapOfVariablesImpl <em>Map Of Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MapOfVariablesImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMapOfVariables()
	 * @generated
	 */
	int MAP_OF_VARIABLES = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES__TYPE = VARIABLE__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES__VALUE = VARIABLE__VALUE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES__OWNER = VARIABLE__OWNER;

	/**
	 * The number of structural features of the '<em>Map Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Map Of Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OF_VARIABLES_OPERATION_COUNT = VARIABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Driven</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__DRIVEN = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SCRIPT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Driver</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverRunnerImpl <em>Driver Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverRunnerImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDriverRunner()
	 * @generated
	 */
	int DRIVER_RUNNER = 20;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER__PATH = RUNNER__PATH;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER__INPUTS = RUNNER__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER__OUTPUTS = RUNNER__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Driven</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER__DRIVEN = RUNNER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Driver Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER_FEATURE_COUNT = RUNNER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER___RUN__CONTEXT = RUNNER___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Driver Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER_RUNNER_OPERATION_COUNT = RUNNER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ParallelSplitImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getParallelSplit()
	 * @generated
	 */
	int PARALLEL_SPLIT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__SUCCESSOR = ACTIVITY__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__BRANCHES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ContextImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 22;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___EVENTS = 0;

	/**
	 * The operation id for the '<em>Execution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___EXECUTION = 1;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___CONTAINS__STRING = 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___GET__STRING = 3;

	/**
	 * The operation id for the '<em>Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___SET__STRING_OBJECT = 4;

	/**
	 * The operation id for the '<em>Unset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT___UNSET__STRING = 5;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.HistoryImpl <em>History</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.HistoryImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getHistory()
	 * @generated
	 */
	int HISTORY = 23;

	/**
	 * The feature id for the '<em><b>Executions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY__EXECUTIONS = 0;

	/**
	 * The number of structural features of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>History</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.Executable <em>Executable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.Executable
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecutable()
	 * @generated
	 */
	int EXECUTABLE = 25;

	/**
	 * The number of structural features of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE___RUN__CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Executable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.HasStatusImpl <em>Has Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.HasStatusImpl
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getHasStatus()
	 * @generated
	 */
	int HAS_STATUS = 26;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATUS__STATUS = 0;

	/**
	 * The number of structural features of the '<em>Has Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATUS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Has Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.Status
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 27;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.workflow.TestResult <em>Test Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.workflow.TestResult
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 28;

	/**
	 * The meta object id for the '<em>Scripting Language</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScriptingLanguage()
	 * @generated
	 */
	int SCRIPTING_LANGUAGE = 29;

	/**
	 * The meta object id for the '<em>Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.datatypes.DataType
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 30;

	/**
	 * The meta object id for the '<em>Events</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.execution.events.Events
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getEvents()
	 * @generated
	 */
	int EVENTS = 31;

	/**
	 * The meta object id for the '<em>Interrupted Execution Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getInterruptedExecutionException()
	 * @generated
	 */
	int INTERRUPTED_EXECUTION_EXCEPTION = 32;

	/**
	 * The meta object id for the '<em>Execution Status</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.execution.ExecutionStatus
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecutionStatus()
	 * @generated
	 */
	int EXECUTION_STATUS = 33;

	/**
	 * The meta object id for the '<em>Variable Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException
	 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getVariableNotFoundException()
	 * @generated
	 */
	int VARIABLE_NOT_FOUND_EXCEPTION = 34;

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.Activity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity#getOutputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Outputs();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Activity#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Successor</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity#getSuccessor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Successor();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.workflow.Activity#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Predecessor</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity#getPredecessor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Predecessor();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Activity#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flows</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Activity#getFlows()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Flows();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Sequence#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Sequence#getRoot()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Root();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.workflow.Sequence#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activities</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Sequence#getActivities()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Activities();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.MultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Instances</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.MultipleInstances
	 * @generated
	 */
	EClass getMultipleInstances();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow#getInput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Input();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow#getOutput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Output();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow#getDestination()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Destination();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.Variable#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable#getOwner()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Owner();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop <em>Structured Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Loop</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.StructuredLoop
	 * @generated
	 */
	EClass getStructuredLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPreCondition()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_PreCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getPostCondition()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_PostCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.StructuredLoop#getActivity()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_Activity();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Condition#isVerified(fr.kazejiyu.ekumi.core.workflow.StructuredLoop, fr.kazejiyu.ekumi.core.workflow.Context) <em>Is Verified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Verified</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Condition#isVerified(fr.kazejiyu.ekumi.core.workflow.StructuredLoop, fr.kazejiyu.ekumi.core.workflow.Context)
	 * @generated
	 */
	EOperation getCondition__IsVerified__StructuredLoop_Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Runner#run(fr.kazejiyu.ekumi.core.workflow.Context) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Runner#run(fr.kazejiyu.ekumi.core.workflow.Context)
	 * @generated
	 */
	EOperation getRunner__Run__Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.ScriptedTask <em>Scripted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Task</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ScriptedTask
	 * @generated
	 */
	EClass getScriptedTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getScriptPath <em>Script Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Path</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getScriptPath()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EAttribute getScriptedTask_ScriptPath();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getScript()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EReference getScriptedTask_Script();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ScriptedTask#getLanguage()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EAttribute getScriptedTask_Language();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Script#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Script#getPath()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Path();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.workflow.Script#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Script#getInputs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.workflow.Script#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Script#getOutputs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Outputs();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.MultiChoice
	 * @generated
	 */
	EClass getMultiChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.MultiChoice#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.MultiChoice#getBranches()
	 * @see #getMultiChoice()
	 * @generated
	 */
	EReference getMultiChoice_Branches();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Branch#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availability</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Branch#getAvailability()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Availability();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Branch#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Branch#getActivity()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Activity();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext <em>Unsafe Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unsafe Context</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext
	 * @generated
	 */
	EClass getUnsafeContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getVariables()
	 * @see #getUnsafeContext()
	 * @generated
	 */
	EReference getUnsafeContext_Variables();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getExecution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Execution</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getExecution()
	 * @see #getUnsafeContext()
	 * @generated
	 */
	EReference getUnsafeContext_Execution();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getEvents()
	 * @see #getUnsafeContext()
	 * @generated
	 */
	EAttribute getUnsafeContext_Events();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext#getExecutionStatus()
	 * @see #getUnsafeContext()
	 * @generated
	 */
	EAttribute getUnsafeContext_ExecutionStatus();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.UnsafeContext#safe() <em>Safe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Safe</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.UnsafeContext#safe()
	 * @generated
	 */
	EOperation getUnsafeContext__Safe();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Serializable
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flows</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows
	 * @generated
	 */
	EClass getDataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows#getIncomings <em>Incomings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incomings</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows#getIncomings()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Incomings();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoings</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows#getOutgoings()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Outgoings();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows#getOwner()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Owner();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.DataFlows#resolveInputs() <em>Resolve Inputs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resolve Inputs</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.DataFlows#resolveInputs()
	 * @generated
	 */
	EOperation getDataFlows__ResolveInputs();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Execution#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#getActivity()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Execution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#getContext()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Context();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Execution#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#getStartDate()
	 * @see #getExecution()
	 * @generated
	 */
	EAttribute getExecution_StartDate();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Execution#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#start()
	 * @generated
	 */
	EOperation getExecution__Start();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Execution#join() <em>Join</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Join</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#join()
	 * @generated
	 */
	EOperation getExecution__Join();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Execution#cancel() <em>Cancel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#cancel()
	 * @generated
	 */
	EOperation getExecution__Cancel();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Execution#isRunning() <em>Is Running</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Running</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#isRunning()
	 * @generated
	 */
	EOperation getExecution__IsRunning();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Execution#isCancelled() <em>Is Cancelled</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Cancelled</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Execution#isCancelled()
	 * @generated
	 */
	EOperation getExecution__IsCancelled();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.ListOfVariables <em>List Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Of Variables</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ListOfVariables
	 * @generated
	 */
	EClass getListOfVariables();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.ListOfVariables#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ListOfVariables#getSize()
	 * @see #getListOfVariables()
	 * @generated
	 */
	EAttribute getListOfVariables_Size();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.MapOfVariables <em>Map Of Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Of Variables</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.MapOfVariables
	 * @generated
	 */
	EClass getMapOfVariables();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Driver#getDriven <em>Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Driven</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Driver#getDriven()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Driven();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.workflow.Driver#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Driver#getScript()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Script();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.DriverRunner <em>Driver Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Runner</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DriverRunner
	 * @generated
	 */
	EClass getDriverRunner();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.workflow.DriverRunner#getDriven <em>Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driven</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.DriverRunner#getDriven()
	 * @see #getDriverRunner()
	 * @generated
	 */
	EReference getDriverRunner_Driven();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Split</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ParallelSplit
	 * @generated
	 */
	EClass getParallelSplit();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.ParallelSplit#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.ParallelSplit#getBranches()
	 * @see #getParallelSplit()
	 * @generated
	 */
	EReference getParallelSplit_Branches();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.workflow.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#events() <em>Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Events</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#events()
	 * @generated
	 */
	EOperation getContext__Events();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#execution() <em>Execution</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execution</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#execution()
	 * @generated
	 */
	EOperation getContext__Execution();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#contains(java.lang.String) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#contains(java.lang.String)
	 * @generated
	 */
	EOperation getContext__Contains__String();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#get(java.lang.String) <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#get(java.lang.String)
	 * @generated
	 */
	EOperation getContext__Get__String();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#set(java.lang.String, java.lang.Object) <em>Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#set(java.lang.String, java.lang.Object)
	 * @generated
	 */
	EOperation getContext__Set__String_Object();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Context#unset(java.lang.String) <em>Unset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unset</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Context#unset(java.lang.String)
	 * @generated
	 */
	EOperation getContext__Unset__String();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.History <em>History</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.History
	 * @generated
	 */
	EClass getHistory();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.workflow.History#getExecutions <em>Executions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Executions</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.History#getExecutions()
	 * @see #getHistory()
	 * @generated
	 */
	EReference getHistory_Executions();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Identifiable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Identifiable#getId()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.Identifiable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Identifiable#getName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Name();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.Executable <em>Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Executable
	 * @generated
	 */
	EClass getExecutable();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.workflow.Executable#run(fr.kazejiyu.ekumi.core.workflow.Context) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.workflow.Executable#run(fr.kazejiyu.ekumi.core.workflow.Context)
	 * @generated
	 */
	EOperation getExecutable__Run__Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.workflow.HasStatus <em>Has Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.HasStatus
	 * @generated
	 */
	EClass getHasStatus();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.workflow.HasStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.HasStatus#getStatus()
	 * @see #getHasStatus()
	 * @generated
	 */
	EAttribute getHasStatus_Status();

	/**
	 * Returns the meta object for enum '{@link fr.kazejiyu.ekumi.core.workflow.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link fr.kazejiyu.ekumi.core.workflow.TestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Result</em>'.
	 * @see fr.kazejiyu.ekumi.core.workflow.TestResult
	 * @generated
	 */
	EEnum getTestResult();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage <em>Scripting Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scripting Language</em>'.
	 * @see fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage
	 * @model instanceClass="fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage"
	 * @generated
	 */
	EDataType getScriptingLanguage();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.datatypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Data Type</em>'.
	 * @see fr.kazejiyu.ekumi.core.datatypes.DataType
	 * @model instanceClass="fr.kazejiyu.ekumi.core.datatypes.DataType"
	 * @generated
	 */
	EDataType getDataType();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.execution.events.Events <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Events</em>'.
	 * @see fr.kazejiyu.ekumi.core.execution.events.Events
	 * @model instanceClass="fr.kazejiyu.ekumi.core.execution.events.Events"
	 * @generated
	 */
	EDataType getEvents();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException <em>Interrupted Execution Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interrupted Execution Exception</em>'.
	 * @see fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException
	 * @model instanceClass="fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException"
	 * @generated
	 */
	EDataType getInterruptedExecutionException();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.execution.ExecutionStatus <em>Execution Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Execution Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.execution.ExecutionStatus
	 * @model instanceClass="fr.kazejiyu.ekumi.core.execution.ExecutionStatus"
	 * @generated
	 */
	EDataType getExecutionStatus();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException <em>Variable Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Variable Not Found Exception</em>'.
	 * @see fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException
	 * @model instanceClass="fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException"
	 * @generated
	 */
	EDataType getVariableNotFoundException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkflowFactory getWorkflowFactory();

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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ActivityImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__INPUTS = eINSTANCE.getActivity_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__OUTPUTS = eINSTANCE.getActivity_Outputs();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SUCCESSOR = eINSTANCE.getActivity_Successor();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PREDECESSOR = eINSTANCE.getActivity_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FLOWS = eINSTANCE.getActivity_Flows();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.SequenceImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ROOT = eINSTANCE.getSequence_Root();

		/**
		 * The meta object literal for the '<em><b>Activities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIVITIES = eINSTANCE.getSequence_Activities();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MultipleInstancesImpl <em>Multiple Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MultipleInstancesImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMultipleInstances()
		 * @generated
		 */
		EClass MULTIPLE_INSTANCES = eINSTANCE.getMultipleInstances();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataFlow()
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
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__DESTINATION = eINSTANCE.getDataFlow_Destination();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.VariableImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getVariable()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__OWNER = eINSTANCE.getVariable_Owner();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.StructuredLoopImpl <em>Structured Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.StructuredLoopImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getStructuredLoop()
		 * @generated
		 */
		EClass STRUCTURED_LOOP = eINSTANCE.getStructuredLoop();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_LOOP__PRE_CONDITION = eINSTANCE.getStructuredLoop_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_LOOP__POST_CONDITION = eINSTANCE.getStructuredLoop_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_LOOP__ACTIVITY = eINSTANCE.getStructuredLoop_Activity();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ConditionImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Is Verified</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDITION___IS_VERIFIED__STRUCTUREDLOOP_CONTEXT = eINSTANCE
				.getCondition__IsVerified__StructuredLoop_Context();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.TaskImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.RunnerImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getRunner()
		 * @generated
		 */
		EClass RUNNER = eINSTANCE.getRunner();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RUNNER___RUN__CONTEXT = eINSTANCE.getRunner__Run__Context();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptedTaskImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScriptedTask()
		 * @generated
		 */
		EClass SCRIPTED_TASK = eINSTANCE.getScriptedTask();

		/**
		 * The meta object literal for the '<em><b>Script Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_TASK__SCRIPT_PATH = eINSTANCE.getScriptedTask_ScriptPath();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTED_TASK__SCRIPT = eINSTANCE.getScriptedTask_Script();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPTED_TASK__LANGUAGE = eINSTANCE.getScriptedTask_Language();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ScriptImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCRIPT__PATH = eINSTANCE.getScript_Path();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__INPUTS = eINSTANCE.getScript_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__OUTPUTS = eINSTANCE.getScript_Outputs();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MultiChoiceImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMultiChoice()
		 * @generated
		 */
		EClass MULTI_CHOICE = eINSTANCE.getMultiChoice();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CHOICE__BRANCHES = eINSTANCE.getMultiChoice_Branches();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.BranchImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__AVAILABILITY = eINSTANCE.getBranch_Availability();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ACTIVITY = eINSTANCE.getBranch_Activity();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.UnsafeContextImpl <em>Unsafe Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.UnsafeContextImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getUnsafeContext()
		 * @generated
		 */
		EClass UNSAFE_CONTEXT = eINSTANCE.getUnsafeContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSAFE_CONTEXT__VARIABLES = eINSTANCE.getUnsafeContext_Variables();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSAFE_CONTEXT__EXECUTION = eINSTANCE.getUnsafeContext_Execution();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSAFE_CONTEXT__EVENTS = eINSTANCE.getUnsafeContext_Events();

		/**
		 * The meta object literal for the '<em><b>Execution Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSAFE_CONTEXT__EXECUTION_STATUS = eINSTANCE.getUnsafeContext_ExecutionStatus();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNSAFE_CONTEXT___SAFE = eINSTANCE.getUnsafeContext__Safe();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.Serializable
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowsImpl <em>Data Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DataFlowsImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataFlows()
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
		 * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOWS__OUTGOINGS = eINSTANCE.getDataFlows_Outgoings();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOWS__OWNER = eINSTANCE.getDataFlows_Owner();

		/**
		 * The meta object literal for the '<em><b>Resolve Inputs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_FLOWS___RESOLVE_INPUTS = eINSTANCE.getDataFlows__ResolveInputs();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ExecutionImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__ACTIVITY = eINSTANCE.getExecution_Activity();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__CONTEXT = eINSTANCE.getExecution_Context();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION__START_DATE = eINSTANCE.getExecution_StartDate();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___START = eINSTANCE.getExecution__Start();

		/**
		 * The meta object literal for the '<em><b>Join</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___JOIN = eINSTANCE.getExecution__Join();

		/**
		 * The meta object literal for the '<em><b>Cancel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___CANCEL = eINSTANCE.getExecution__Cancel();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___IS_RUNNING = eINSTANCE.getExecution__IsRunning();

		/**
		 * The meta object literal for the '<em><b>Is Cancelled</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTION___IS_CANCELLED = eINSTANCE.getExecution__IsCancelled();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ListOfVariablesImpl <em>List Of Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ListOfVariablesImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getListOfVariables()
		 * @generated
		 */
		EClass LIST_OF_VARIABLES = eINSTANCE.getListOfVariables();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_OF_VARIABLES__SIZE = eINSTANCE.getListOfVariables_Size();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.MapOfVariablesImpl <em>Map Of Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.MapOfVariablesImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getMapOfVariables()
		 * @generated
		 */
		EClass MAP_OF_VARIABLES = eINSTANCE.getMapOfVariables();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDriver()
		 * @generated
		 */
		EClass DRIVER = eINSTANCE.getDriver();

		/**
		 * The meta object literal for the '<em><b>Driven</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__DRIVEN = eINSTANCE.getDriver_Driven();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER__SCRIPT = eINSTANCE.getDriver_Script();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverRunnerImpl <em>Driver Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.DriverRunnerImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDriverRunner()
		 * @generated
		 */
		EClass DRIVER_RUNNER = eINSTANCE.getDriverRunner();

		/**
		 * The meta object literal for the '<em><b>Driven</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRIVER_RUNNER__DRIVEN = eINSTANCE.getDriverRunner_Driven();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ParallelSplitImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getParallelSplit()
		 * @generated
		 */
		EClass PARALLEL_SPLIT = eINSTANCE.getParallelSplit();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_SPLIT__BRANCHES = eINSTANCE.getParallelSplit_Branches();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.ContextImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLES = eINSTANCE.getContext_Variables();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___EVENTS = eINSTANCE.getContext__Events();

		/**
		 * The meta object literal for the '<em><b>Execution</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___EXECUTION = eINSTANCE.getContext__Execution();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___CONTAINS__STRING = eINSTANCE.getContext__Contains__String();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___GET__STRING = eINSTANCE.getContext__Get__String();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___SET__STRING_OBJECT = eINSTANCE.getContext__Set__String_Object();

		/**
		 * The meta object literal for the '<em><b>Unset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONTEXT___UNSET__STRING = eINSTANCE.getContext__Unset__String();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.HistoryImpl <em>History</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.HistoryImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getHistory()
		 * @generated
		 */
		EClass HISTORY = eINSTANCE.getHistory();

		/**
		 * The meta object literal for the '<em><b>Executions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORY__EXECUTIONS = eINSTANCE.getHistory_Executions();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.IdentifiableImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__ID = eINSTANCE.getIdentifiable_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__NAME = eINSTANCE.getIdentifiable_Name();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.Executable <em>Executable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.Executable
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecutable()
		 * @generated
		 */
		EClass EXECUTABLE = eINSTANCE.getExecutable();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXECUTABLE___RUN__CONTEXT = eINSTANCE.getExecutable__Run__Context();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.gen.impl.HasStatusImpl <em>Has Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.HasStatusImpl
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getHasStatus()
		 * @generated
		 */
		EClass HAS_STATUS = eINSTANCE.getHasStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_STATUS__STATUS = eINSTANCE.getHasStatus_Status();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.Status
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.workflow.TestResult <em>Test Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.workflow.TestResult
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getTestResult()
		 * @generated
		 */
		EEnum TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em>Scripting Language</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getScriptingLanguage()
		 * @generated
		 */
		EDataType SCRIPTING_LANGUAGE = eINSTANCE.getScriptingLanguage();

		/**
		 * The meta object literal for the '<em>Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.datatypes.DataType
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getDataType()
		 * @generated
		 */
		EDataType DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em>Events</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.execution.events.Events
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getEvents()
		 * @generated
		 */
		EDataType EVENTS = eINSTANCE.getEvents();

		/**
		 * The meta object literal for the '<em>Interrupted Execution Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.exceptions.InterruptedExecutionException
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getInterruptedExecutionException()
		 * @generated
		 */
		EDataType INTERRUPTED_EXECUTION_EXCEPTION = eINSTANCE.getInterruptedExecutionException();

		/**
		 * The meta object literal for the '<em>Execution Status</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.execution.ExecutionStatus
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getExecutionStatus()
		 * @generated
		 */
		EDataType EXECUTION_STATUS = eINSTANCE.getExecutionStatus();

		/**
		 * The meta object literal for the '<em>Variable Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.exceptions.VariableNotFoundException
		 * @see fr.kazejiyu.ekumi.core.workflow.gen.impl.WorkflowPackageImpl#getVariableNotFoundException()
		 * @generated
		 */
		EDataType VARIABLE_NOT_FOUND_EXCEPTION = eINSTANCE.getVariableNotFoundException();

	}

} //WorkflowPackage
