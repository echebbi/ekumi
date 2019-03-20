/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.kazejiyu.ekumi.specs.eds.DataFlow;
import fr.kazejiyu.ekumi.specs.eds.DataFlows;
import fr.kazejiyu.ekumi.specs.eds.EdsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.DataFlowsImpl#getIncomings <em>Incomings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowsImpl extends MinimalEObjectImpl.Container implements DataFlows {
	/**
	 * The cached value of the '{@link #getIncomings() <em>Incomings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomings()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> incomings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdsPackage.Literals.DATA_FLOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, EdsPackage.DATA_FLOWS__INCOMINGS);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsPackage.DATA_FLOWS__INCOMINGS:
			return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EdsPackage.DATA_FLOWS__INCOMINGS:
			return getIncomings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EdsPackage.DATA_FLOWS__INCOMINGS:
			getIncomings().clear();
			getIncomings().addAll((Collection<? extends DataFlow>) newValue);
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
		case EdsPackage.DATA_FLOWS__INCOMINGS:
			getIncomings().clear();
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
		case EdsPackage.DATA_FLOWS__INCOMINGS:
			return incomings != null && !incomings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataFlowsImpl
