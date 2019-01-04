/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.Divergence;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.Start;
import fr.kazejiyu.ekumi.model.spec.Task;

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
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getNestedActivity <em>Nested Activity</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getParentActivity <em>Parent Activity</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.ActivityImpl#getDivergences <em>Divergences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends MinimalEObjectImpl.Container implements Activity {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Start start;

	/**
	 * The cached value of the '{@link #getNestedActivity() <em>Nested Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity nestedActivity;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getDivergences() <em>Divergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDivergences()
	 * @generated
	 * @ordered
	 */
	protected EList<Divergence> divergences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecPackage.Literals.ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(Start newStart, NotificationChain msgs) {
		Start oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__START,
					oldStart, newStart);
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
	public void setStart(Start newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SpecPackage.ACTIVITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - SpecPackage.ACTIVITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getNestedActivity() {
		return nestedActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedActivity(Activity newNestedActivity, NotificationChain msgs) {
		Activity oldNestedActivity = nestedActivity;
		nestedActivity = newNestedActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SpecPackage.ACTIVITY__NESTED_ACTIVITY, oldNestedActivity, newNestedActivity);
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
	public void setNestedActivity(Activity newNestedActivity) {
		if (newNestedActivity != nestedActivity) {
			NotificationChain msgs = null;
			if (nestedActivity != null)
				msgs = ((InternalEObject) nestedActivity).eInverseRemove(this, SpecPackage.ACTIVITY__PARENT_ACTIVITY,
						Activity.class, msgs);
			if (newNestedActivity != null)
				msgs = ((InternalEObject) newNestedActivity).eInverseAdd(this, SpecPackage.ACTIVITY__PARENT_ACTIVITY,
						Activity.class, msgs);
			msgs = basicSetNestedActivity(newNestedActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__NESTED_ACTIVITY,
					newNestedActivity, newNestedActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getParentActivity() {
		if (eContainerFeatureID() != SpecPackage.ACTIVITY__PARENT_ACTIVITY)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentActivity(Activity newParentActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentActivity, SpecPackage.ACTIVITY__PARENT_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentActivity(Activity newParentActivity) {
		if (newParentActivity != eInternalContainer()
				|| (eContainerFeatureID() != SpecPackage.ACTIVITY__PARENT_ACTIVITY && newParentActivity != null)) {
			if (EcoreUtil.isAncestor(this, newParentActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentActivity != null)
				msgs = ((InternalEObject) newParentActivity).eInverseAdd(this, SpecPackage.ACTIVITY__NESTED_ACTIVITY,
						Activity.class, msgs);
			msgs = basicSetParentActivity(newParentActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.ACTIVITY__PARENT_ACTIVITY,
					newParentActivity, newParentActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, SpecPackage.ACTIVITY__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Divergence> getDivergences() {
		if (divergences == null) {
			divergences = new EObjectContainmentEList<Divergence>(Divergence.class, this,
					SpecPackage.ACTIVITY__DIVERGENCES);
		}
		return divergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			if (nestedActivity != null)
				msgs = ((InternalEObject) nestedActivity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SpecPackage.ACTIVITY__NESTED_ACTIVITY, null, msgs);
			return basicSetNestedActivity((Activity) otherEnd, msgs);
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentActivity((Activity) otherEnd, msgs);
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
		case SpecPackage.ACTIVITY__START:
			return basicSetStart(null, msgs);
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			return basicSetNestedActivity(null, msgs);
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			return basicSetParentActivity(null, msgs);
		case SpecPackage.ACTIVITY__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case SpecPackage.ACTIVITY__DIVERGENCES:
			return ((InternalEList<?>) getDivergences()).basicRemove(otherEnd, msgs);
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
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			return eInternalContainer().eInverseRemove(this, SpecPackage.ACTIVITY__NESTED_ACTIVITY, Activity.class,
					msgs);
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
		case SpecPackage.ACTIVITY__NAME:
			return getName();
		case SpecPackage.ACTIVITY__ID:
			return getId();
		case SpecPackage.ACTIVITY__START:
			return getStart();
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			return getNestedActivity();
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			return getParentActivity();
		case SpecPackage.ACTIVITY__TASKS:
			return getTasks();
		case SpecPackage.ACTIVITY__DIVERGENCES:
			return getDivergences();
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
		case SpecPackage.ACTIVITY__NAME:
			setName((String) newValue);
			return;
		case SpecPackage.ACTIVITY__ID:
			setId((String) newValue);
			return;
		case SpecPackage.ACTIVITY__START:
			setStart((Start) newValue);
			return;
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			setNestedActivity((Activity) newValue);
			return;
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			setParentActivity((Activity) newValue);
			return;
		case SpecPackage.ACTIVITY__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case SpecPackage.ACTIVITY__DIVERGENCES:
			getDivergences().clear();
			getDivergences().addAll((Collection<? extends Divergence>) newValue);
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
		case SpecPackage.ACTIVITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SpecPackage.ACTIVITY__ID:
			setId(ID_EDEFAULT);
			return;
		case SpecPackage.ACTIVITY__START:
			setStart((Start) null);
			return;
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			setNestedActivity((Activity) null);
			return;
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			setParentActivity((Activity) null);
			return;
		case SpecPackage.ACTIVITY__TASKS:
			getTasks().clear();
			return;
		case SpecPackage.ACTIVITY__DIVERGENCES:
			getDivergences().clear();
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
		case SpecPackage.ACTIVITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SpecPackage.ACTIVITY__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SpecPackage.ACTIVITY__START:
			return start != null;
		case SpecPackage.ACTIVITY__NESTED_ACTIVITY:
			return nestedActivity != null;
		case SpecPackage.ACTIVITY__PARENT_ACTIVITY:
			return getParentActivity() != null;
		case SpecPackage.ACTIVITY__TASKS:
			return tasks != null && !tasks.isEmpty();
		case SpecPackage.ACTIVITY__DIVERGENCES:
			return divergences != null && !divergences.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
