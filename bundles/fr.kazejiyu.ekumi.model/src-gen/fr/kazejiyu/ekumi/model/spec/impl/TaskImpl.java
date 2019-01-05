/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.model.spec.DataFlows;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.Task;
import fr.kazejiyu.ekumi.model.spec.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.TaskImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.TaskImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskImpl extends StartingNodeImpl implements Task {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected DataFlows flows;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> outputs;

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
		return SpecPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.TASK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlows getFlows() {
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlows(DataFlows newFlows, NotificationChain msgs) {
		DataFlows oldFlows = flows;
		flows = newFlows;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.TASK__FLOWS,
					oldFlows, newFlows);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlows(DataFlows newFlows) {
		if (newFlows != flows) {
			NotificationChain msgs = null;
			if (flows != null)
				msgs = ((InternalEObject) flows).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpecPackage.TASK__FLOWS,
						null, msgs);
			if (newFlows != null)
				msgs = ((InternalEObject) newFlows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpecPackage.TASK__FLOWS,
						null, msgs);
			msgs = basicSetFlows(newFlows, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.TASK__FLOWS, newFlows, newFlows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Variable>(Variable.class, this, SpecPackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Variable>(Variable.class, this, SpecPackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecPackage.TASK__FLOWS:
			return basicSetFlows(null, msgs);
		case SpecPackage.TASK__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case SpecPackage.TASK__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
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
		case SpecPackage.TASK__ID:
			return getId();
		case SpecPackage.TASK__NAME:
			return getName();
		case SpecPackage.TASK__FLOWS:
			return getFlows();
		case SpecPackage.TASK__INPUTS:
			return getInputs();
		case SpecPackage.TASK__OUTPUTS:
			return getOutputs();
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
		case SpecPackage.TASK__ID:
			setId((String) newValue);
			return;
		case SpecPackage.TASK__NAME:
			setName((String) newValue);
			return;
		case SpecPackage.TASK__FLOWS:
			setFlows((DataFlows) newValue);
			return;
		case SpecPackage.TASK__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Variable>) newValue);
			return;
		case SpecPackage.TASK__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends Variable>) newValue);
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
		case SpecPackage.TASK__ID:
			setId(ID_EDEFAULT);
			return;
		case SpecPackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpecPackage.TASK__FLOWS:
			setFlows((DataFlows) null);
			return;
		case SpecPackage.TASK__INPUTS:
			getInputs().clear();
			return;
		case SpecPackage.TASK__OUTPUTS:
			getOutputs().clear();
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
		case SpecPackage.TASK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpecPackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpecPackage.TASK__FLOWS:
			return flows != null;
		case SpecPackage.TASK__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case SpecPackage.TASK__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
