/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.DataFlow;
import fr.kazejiyu.ekumi.core.ekumi.DataFlows;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.DataFlowsImpl#getOutgoings <em>Outgoings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFlowsImpl extends MinimalEObjectImpl.Container implements DataFlows {
	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> incoming;

	/**
	 * The cached value of the '{@link #getOutgoings() <em>Outgoings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoings()
	 * @generated
	 * @ordered
	 */
	protected EList<DataFlow> outgoings;

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
		return EkumiPackage.Literals.DATA_FLOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, EkumiPackage.DATA_FLOWS__INCOMING);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectContainmentEList<DataFlow>(DataFlow.class, this, EkumiPackage.DATA_FLOWS__OUTGOINGS);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.DATA_FLOWS__INCOMING:
			return ((InternalEList<?>) getIncoming()).basicRemove(otherEnd, msgs);
		case EkumiPackage.DATA_FLOWS__OUTGOINGS:
			return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd, msgs);
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
		case EkumiPackage.DATA_FLOWS__INCOMING:
			return getIncoming();
		case EkumiPackage.DATA_FLOWS__OUTGOINGS:
			return getOutgoings();
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
		case EkumiPackage.DATA_FLOWS__INCOMING:
			getIncoming().clear();
			getIncoming().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case EkumiPackage.DATA_FLOWS__OUTGOINGS:
			getOutgoings().clear();
			getOutgoings().addAll((Collection<? extends DataFlow>) newValue);
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
		case EkumiPackage.DATA_FLOWS__INCOMING:
			getIncoming().clear();
			return;
		case EkumiPackage.DATA_FLOWS__OUTGOINGS:
			getOutgoings().clear();
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
		case EkumiPackage.DATA_FLOWS__INCOMING:
			return incoming != null && !incoming.isEmpty();
		case EkumiPackage.DATA_FLOWS__OUTGOINGS:
			return outgoings != null && !outgoings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataFlowsImpl
