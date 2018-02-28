/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Task;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TaskImpl extends ActivityImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.TASK;
	}

} //TaskImpl
