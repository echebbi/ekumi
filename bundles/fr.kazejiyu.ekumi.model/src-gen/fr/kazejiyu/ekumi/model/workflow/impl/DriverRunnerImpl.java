/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.DriverRunner;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Runner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.DriverRunnerImpl#getDriven <em>Driven</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DriverRunnerImpl extends RunnerImpl implements DriverRunner {
	/**
	 * The cached value of the '{@link #getDriven() <em>Driven</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriven()
	 * @generated
	 * @ordered
	 */
	protected Activity driven;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverRunnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DRIVER_RUNNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getDriven() {
		if (driven != null && driven.eIsProxy()) {
			InternalEObject oldDriven = (InternalEObject) driven;
			driven = (Activity) eResolveProxy(oldDriven);
			if (driven != oldDriven) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DRIVER_RUNNER__DRIVEN,
							oldDriven, driven));
			}
		}
		return driven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetDriven() {
		return driven;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriven(Activity newDriven) {
		Activity oldDriven = driven;
		driven = newDriven;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DRIVER_RUNNER__DRIVEN, oldDriven,
					driven));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.DRIVER_RUNNER__DRIVEN:
			if (resolve)
				return getDriven();
			return basicGetDriven();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.DRIVER_RUNNER__DRIVEN:
			setDriven((Activity) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.DRIVER_RUNNER__DRIVEN:
			setDriven((Activity) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.DRIVER_RUNNER__DRIVEN:
			return driven != null;
		}
		return super.eIsSet(featureID);
	}

} //DriverRunnerImpl
