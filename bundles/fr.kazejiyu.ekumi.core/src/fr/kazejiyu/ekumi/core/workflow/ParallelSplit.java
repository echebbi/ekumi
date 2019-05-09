/**
 */
package fr.kazejiyu.ekumi.core.workflow;

import org.eclipse.collections.api.list.ImmutableList;

/**
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @see fr.kazejiyu.ekumi.core.workflow.WorkflowPackage#getParallelSplit()
 * @model
 * @generated
 */
public interface ParallelSplit extends Activity {
	
	ImmutableList<Activity> branches();

}
