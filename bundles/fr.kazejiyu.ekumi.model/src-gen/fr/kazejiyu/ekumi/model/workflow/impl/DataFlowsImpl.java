/**
 */
package fr.kazejiyu.ekumi.model.workflow.impl;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.DataFlow;
import fr.kazejiyu.ekumi.model.workflow.DataFlows;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Flows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.DataFlowsImpl#getIncomings <em>Incomings</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.DataFlowsImpl#getOutgoings <em>Outgoings</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.workflow.impl.DataFlowsImpl#getOwner <em>Owner</em>}</li>
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
		return WorkflowPackage.Literals.DATA_FLOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getIncomings() {
		if (incomings == null) {
			incomings = new EObjectContainmentEList<DataFlow>(DataFlow.class, this,
					WorkflowPackage.DATA_FLOWS__INCOMINGS);
		}
		return incomings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataFlow> getOutgoings() {
		if (outgoings == null) {
			outgoings = new EObjectContainmentEList<DataFlow>(DataFlow.class, this,
					WorkflowPackage.DATA_FLOWS__OUTGOINGS);
		}
		return outgoings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getOwner() {
		if (eContainerFeatureID() != WorkflowPackage.DATA_FLOWS__OWNER)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Activity newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner, WorkflowPackage.DATA_FLOWS__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Activity newOwner) {
		if (newOwner != eInternalContainer()
				|| (eContainerFeatureID() != WorkflowPackage.DATA_FLOWS__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, WorkflowPackage.ACTIVITY__FLOWS, Activity.class,
						msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_FLOWS__OWNER, newOwner,
					newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resolveInputs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.DATA_FLOWS__OWNER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwner((Activity) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.DATA_FLOWS__INCOMINGS:
			return ((InternalEList<?>) getIncomings()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.DATA_FLOWS__OUTGOINGS:
			return ((InternalEList<?>) getOutgoings()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.DATA_FLOWS__OWNER:
			return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case WorkflowPackage.DATA_FLOWS__OWNER:
			return eInternalContainer().eInverseRemove(this, WorkflowPackage.ACTIVITY__FLOWS, Activity.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.DATA_FLOWS__INCOMINGS:
			return getIncomings();
		case WorkflowPackage.DATA_FLOWS__OUTGOINGS:
			return getOutgoings();
		case WorkflowPackage.DATA_FLOWS__OWNER:
			return getOwner();
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
		case WorkflowPackage.DATA_FLOWS__INCOMINGS:
			getIncomings().clear();
			getIncomings().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case WorkflowPackage.DATA_FLOWS__OUTGOINGS:
			getOutgoings().clear();
			getOutgoings().addAll((Collection<? extends DataFlow>) newValue);
			return;
		case WorkflowPackage.DATA_FLOWS__OWNER:
			setOwner((Activity) newValue);
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
		case WorkflowPackage.DATA_FLOWS__INCOMINGS:
			getIncomings().clear();
			return;
		case WorkflowPackage.DATA_FLOWS__OUTGOINGS:
			getOutgoings().clear();
			return;
		case WorkflowPackage.DATA_FLOWS__OWNER:
			setOwner((Activity) null);
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
		case WorkflowPackage.DATA_FLOWS__INCOMINGS:
			return incomings != null && !incomings.isEmpty();
		case WorkflowPackage.DATA_FLOWS__OUTGOINGS:
			return outgoings != null && !outgoings.isEmpty();
		case WorkflowPackage.DATA_FLOWS__OWNER:
			return getOwner() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case WorkflowPackage.DATA_FLOWS___RESOLVE_INPUTS:
			resolveInputs();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataFlowsImpl
