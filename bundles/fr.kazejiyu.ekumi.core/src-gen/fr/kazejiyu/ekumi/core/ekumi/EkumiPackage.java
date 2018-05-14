/**
 */
package fr.kazejiyu.ekumi.core.ekumi;

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
 * @see fr.kazejiyu.ekumi.core.ekumi.EkumiFactory
 * @model kind="package"
 * @generated
 */
public interface EkumiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ekumi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.kazejiyu.io/ekumi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ekumi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EkumiPackage eINSTANCE = fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getActivity()
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
	int ACTIVITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INPUTS = 2;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTPUTS = 3;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__SUCCESSORS = 4;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PREDECESSOR = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__STATUS = 6;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__FLOWS = 7;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY___RUN__CONTEXT = 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.WorkflowImpl <em>Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.WorkflowImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getWorkflow()
	 * @generated
	 */
	int WORKFLOW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ID = ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__FLOWS = ACTIVITY__FLOWS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW__ACTIVITIES = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW___RUN__CONTEXT = ACTIVITY___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.SequenceImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = WORKFLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = WORKFLOW__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INPUTS = WORKFLOW__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__OUTPUTS = WORKFLOW__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUCCESSORS = WORKFLOW__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PREDECESSOR = WORKFLOW__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STATUS = WORKFLOW__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__FLOWS = WORKFLOW__FLOWS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITIES = WORKFLOW__ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = WORKFLOW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE___RUN__CONTEXT = WORKFLOW___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = WORKFLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.MultipleInstancesImpl <em>Multiple Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.MultipleInstancesImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getMultipleInstances()
	 * @generated
	 */
	int MULTIPLE_INSTANCES = 3;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_INSTANCES__FLOWS = ACTIVITY__FLOWS;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ParallelSplitImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getParallelSplit()
	 * @generated
	 */
	int PARALLEL_SPLIT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__ID = WORKFLOW__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__NAME = WORKFLOW__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__INPUTS = WORKFLOW__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__OUTPUTS = WORKFLOW__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__SUCCESSORS = WORKFLOW__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__PREDECESSOR = WORKFLOW__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__STATUS = WORKFLOW__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__FLOWS = WORKFLOW__FLOWS;

	/**
	 * The feature id for the '<em><b>Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT__ACTIVITIES = WORKFLOW__ACTIVITIES;

	/**
	 * The number of structural features of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_FEATURE_COUNT = WORKFLOW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT___RUN__CONTEXT = WORKFLOW___RUN__CONTEXT;

	/**
	 * The number of operations of the '<em>Parallel Split</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_SPLIT_OPERATION_COUNT = WORKFLOW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 5;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getData()
	 * @generated
	 */
	int DATA = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl <em>Structured Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getStructuredLoop()
	 * @generated
	 */
	int STRUCTURED_LOOP = 7;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_LOOP__FLOWS = ACTIVITY__FLOWS;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ScriptImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 12;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 8;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 9;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__FLOWS = ACTIVITY__FLOWS;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 10;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ScriptedTaskImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScriptedTask()
	 * @generated
	 */
	int SCRIPTED_TASK = 11;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__INPUTS = TASK__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__OUTPUTS = TASK__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SUCCESSORS = TASK__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__PREDECESSOR = TASK__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__STATUS = TASK__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__FLOWS = TASK__FLOWS;

	/**
	 * The feature id for the '<em><b>Script Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT_PATH = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK__SCRIPT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scripted Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPTED_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.MultiChoiceImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getMultiChoice()
	 * @generated
	 */
	int MULTI_CHOICE = 13;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE__FLOWS = ACTIVITY__FLOWS;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.BranchImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 14;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 15;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
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
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.Serializable <em>Serializable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.Serializable
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getSerializable()
	 * @generated
	 */
	int SERIALIZABLE = 16;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl <em>Data Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataFlows()
	 * @generated
	 */
	int DATA_FLOWS = 17;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__INCOMING = 0;

	/**
	 * The feature id for the '<em><b>Outgoings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS__OUTGOINGS = 1;

	/**
	 * The number of structural features of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl <em>Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getExecution()
	 * @generated
	 */
	int EXECUTION = 18;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataListImpl <em>Data List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataListImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataList()
	 * @generated
	 */
	int DATA_LIST = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST__OWNER = DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST__VALUE = DATA__VALUE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST__SIZE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_LIST_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataMapImpl <em>Data Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataMapImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataMap()
	 * @generated
	 */
	int DATA_MAP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP__TYPE = DATA__TYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP__OWNER = DATA__OWNER;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP__VALUE = DATA__VALUE;

	/**
	 * The number of structural features of the '<em>Data Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MAP_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl <em>Driver</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDriver()
	 * @generated
	 */
	int DRIVER = 21;

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
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__INPUTS = ACTIVITY__INPUTS;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__OUTPUTS = ACTIVITY__OUTPUTS;

	/**
	 * The feature id for the '<em><b>Successors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__SUCCESSORS = ACTIVITY__SUCCESSORS;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__PREDECESSOR = ACTIVITY__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__STATUS = ACTIVITY__STATUS;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRIVER__FLOWS = ACTIVITY__FLOWS;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverRunnerImpl <em>Driver Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DriverRunnerImpl
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDriverRunner()
	 * @generated
	 */
	int DRIVER_RUNNER = 22;

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
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 23;

	/**
	 * The meta object id for the '{@link fr.kazejiyu.ekumi.core.ekumi.TestResult <em>Test Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.ekumi.TestResult
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 24;

	/**
	 * The meta object id for the '<em>Scripting Language</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.languages.ScriptingLanguage
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScriptingLanguage()
	 * @generated
	 */
	int SCRIPTING_LANGUAGE = 25;

	/**
	 * The meta object id for the '<em>Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.kazejiyu.ekumi.core.datatypes.DataType
	 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 26;

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getId()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getName()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getInputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getOutputs()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Outputs();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Successors</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getSuccessors()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Successors();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getPredecessor()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getStatus()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#getFlows()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Flows();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.ekumi.Activity#run(fr.kazejiyu.ekumi.core.ekumi.Context) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Activity#run(fr.kazejiyu.ekumi.core.ekumi.Context)
	 * @generated
	 */
	EOperation getActivity__Run__Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Workflow
	 * @generated
	 */
	EClass getWorkflow();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Workflow#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activities</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Workflow#getActivities()
	 * @see #getWorkflow()
	 * @generated
	 */
	EReference getWorkflow_Activities();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.MultipleInstances <em>Multiple Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Instances</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.MultipleInstances
	 * @generated
	 */
	EClass getMultipleInstances();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.ParallelSplit <em>Parallel Split</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Split</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.ParallelSplit
	 * @generated
	 */
	EClass getParallelSplit();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getInput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Input();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getOutput()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Output();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getDestination()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Destination();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Data#getType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Type();

	/**
	 * Returns the meta object for the container reference '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Data#getOwner()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Owner();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Data#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Data#getValue()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Value();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop <em>Structured Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Loop</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.StructuredLoop
	 * @generated
	 */
	EClass getStructuredLoop();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPreCondition()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_PreCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getPostCondition()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_PostCondition();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.StructuredLoop#getActivity()
	 * @see #getStructuredLoop()
	 * @generated
	 */
	EReference getStructuredLoop_Activity();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.ekumi.Condition#isVerified(fr.kazejiyu.ekumi.core.ekumi.StructuredLoop, fr.kazejiyu.ekumi.core.ekumi.Context) <em>Is Verified</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Verified</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Condition#isVerified(fr.kazejiyu.ekumi.core.ekumi.StructuredLoop, fr.kazejiyu.ekumi.core.ekumi.Context)
	 * @generated
	 */
	EOperation getCondition__IsVerified__StructuredLoop_Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for the '{@link fr.kazejiyu.ekumi.core.ekumi.Runner#run(fr.kazejiyu.ekumi.core.ekumi.Context) <em>Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Run</em>' operation.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Runner#run(fr.kazejiyu.ekumi.core.ekumi.Context)
	 * @generated
	 */
	EOperation getRunner__Run__Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask <em>Scripted Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scripted Task</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.ScriptedTask
	 * @generated
	 */
	EClass getScriptedTask();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScriptPath <em>Script Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Path</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScriptPath()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EAttribute getScriptedTask_ScriptPath();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.ScriptedTask#getScript()
	 * @see #getScriptedTask()
	 * @generated
	 */
	EReference getScriptedTask_Script();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.Script#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Script#getPath()
	 * @see #getScript()
	 * @generated
	 */
	EAttribute getScript_Path();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Script#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Script#getInputs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Script#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputs</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Script#getOutputs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Outputs();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.MultiChoice <em>Multi Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.MultiChoice
	 * @generated
	 */
	EClass getMultiChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.MultiChoice#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.MultiChoice#getBranches()
	 * @see #getMultiChoice()
	 * @generated
	 */
	EReference getMultiChoice_Branches();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Availability</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Branch#getAvailability()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Availability();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.Branch#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Branch#getActivity()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Activity();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.Context#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Context#getVariables()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Variables();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Serializable <em>Serializable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serializable</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Serializable
	 * @generated
	 */
	EClass getSerializable();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows <em>Data Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flows</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlows
	 * @generated
	 */
	EClass getDataFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incoming</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlows#getIncoming()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Incoming();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOutgoings <em>Outgoings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoings</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataFlows#getOutgoings()
	 * @see #getDataFlows()
	 * @generated
	 */
	EReference getDataFlows_Outgoings();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Execution
	 * @generated
	 */
	EClass getExecution();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Execution#getActivity()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Activity();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.Execution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Execution#getContext()
	 * @see #getExecution()
	 * @generated
	 */
	EReference getExecution_Context();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.DataList <em>Data List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data List</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataList
	 * @generated
	 */
	EClass getDataList();

	/**
	 * Returns the meta object for the attribute '{@link fr.kazejiyu.ekumi.core.ekumi.DataList#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataList#getSize()
	 * @see #getDataList()
	 * @generated
	 */
	EAttribute getDataList_Size();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.DataMap <em>Data Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Map</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DataMap
	 * @generated
	 */
	EClass getDataMap();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.Driver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Driver
	 * @generated
	 */
	EClass getDriver();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getDriven <em>Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Driven</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Driver#getDriven()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Driven();

	/**
	 * Returns the meta object for the containment reference '{@link fr.kazejiyu.ekumi.core.ekumi.Driver#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Driver#getScript()
	 * @see #getDriver()
	 * @generated
	 */
	EReference getDriver_Script();

	/**
	 * Returns the meta object for class '{@link fr.kazejiyu.ekumi.core.ekumi.DriverRunner <em>Driver Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Driver Runner</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DriverRunner
	 * @generated
	 */
	EClass getDriverRunner();

	/**
	 * Returns the meta object for the reference '{@link fr.kazejiyu.ekumi.core.ekumi.DriverRunner#getDriven <em>Driven</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Driven</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.DriverRunner#getDriven()
	 * @see #getDriverRunner()
	 * @generated
	 */
	EReference getDriverRunner_Driven();

	/**
	 * Returns the meta object for enum '{@link fr.kazejiyu.ekumi.core.ekumi.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link fr.kazejiyu.ekumi.core.ekumi.TestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Result</em>'.
	 * @see fr.kazejiyu.ekumi.core.ekumi.TestResult
	 * @generated
	 */
	EEnum getTestResult();

	/**
	 * Returns the meta object for data type '{@link fr.kazejiyu.ekumi.core.languages.ScriptingLanguage <em>Scripting Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scripting Language</em>'.
	 * @see fr.kazejiyu.ekumi.core.languages.ScriptingLanguage
	 * @model instanceClass="fr.kazejiyu.ekumi.core.languages.ScriptingLanguage"
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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EkumiFactory getEkumiFactory();

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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ActivityImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

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
		 * The meta object literal for the '<em><b>Successors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__SUCCESSORS = eINSTANCE.getActivity_Successors();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PREDECESSOR = eINSTANCE.getActivity_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__STATUS = eINSTANCE.getActivity_Status();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__FLOWS = eINSTANCE.getActivity_Flows();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITY___RUN__CONTEXT = eINSTANCE.getActivity__Run__Context();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.WorkflowImpl <em>Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.WorkflowImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getWorkflow()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.SequenceImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.MultipleInstancesImpl <em>Multiple Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.MultipleInstancesImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getMultipleInstances()
		 * @generated
		 */
		EClass MULTIPLE_INSTANCES = eINSTANCE.getMultipleInstances();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ParallelSplitImpl <em>Parallel Split</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ParallelSplitImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getParallelSplit()
		 * @generated
		 */
		EClass PARALLEL_SPLIT = eINSTANCE.getParallelSplit();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataFlow()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__TYPE = eINSTANCE.getData_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__OWNER = eINSTANCE.getData_Owner();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__VALUE = eINSTANCE.getData_Value();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl <em>Structured Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getStructuredLoop()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ConditionImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.TaskImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.RunnerImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getRunner()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ScriptedTaskImpl <em>Scripted Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ScriptedTaskImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScriptedTask()
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
		 * The meta object literal for the '<em><b>Script</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPTED_TASK__SCRIPT = eINSTANCE.getScriptedTask_Script();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ScriptImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScript()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.MultiChoiceImpl <em>Multi Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.MultiChoiceImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getMultiChoice()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.BranchImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getBranch()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ContextImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__VARIABLES = eINSTANCE.getContext_Variables();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.Serializable <em>Serializable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.Serializable
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getSerializable()
		 * @generated
		 */
		EClass SERIALIZABLE = eINSTANCE.getSerializable();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl <em>Data Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataFlows()
		 * @generated
		 */
		EClass DATA_FLOWS = eINSTANCE.getDataFlows();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOWS__INCOMING = eINSTANCE.getDataFlows_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOWS__OUTGOINGS = eINSTANCE.getDataFlows_Outgoings();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl <em>Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.ExecutionImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getExecution()
		 * @generated
		 */
		EClass EXECUTION = eINSTANCE.getExecution();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__ACTIVITY = eINSTANCE.getExecution_Activity();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION__CONTEXT = eINSTANCE.getExecution_Context();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataListImpl <em>Data List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataListImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataList()
		 * @generated
		 */
		EClass DATA_LIST = eINSTANCE.getDataList();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_LIST__SIZE = eINSTANCE.getDataList_Size();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataMapImpl <em>Data Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DataMapImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataMap()
		 * @generated
		 */
		EClass DATA_MAP = eINSTANCE.getDataMap();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl <em>Driver</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DriverImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDriver()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.impl.DriverRunnerImpl <em>Driver Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.DriverRunnerImpl
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDriverRunner()
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
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.Status
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link fr.kazejiyu.ekumi.core.ekumi.TestResult <em>Test Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.ekumi.TestResult
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getTestResult()
		 * @generated
		 */
		EEnum TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em>Scripting Language</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.languages.ScriptingLanguage
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getScriptingLanguage()
		 * @generated
		 */
		EDataType SCRIPTING_LANGUAGE = eINSTANCE.getScriptingLanguage();

		/**
		 * The meta object literal for the '<em>Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.kazejiyu.ekumi.core.datatypes.DataType
		 * @see fr.kazejiyu.ekumi.core.ekumi.impl.EkumiPackageImpl#getDataType()
		 * @generated
		 */
		EDataType DATA_TYPE = eINSTANCE.getDataType();

	}

} //EkumiPackage
