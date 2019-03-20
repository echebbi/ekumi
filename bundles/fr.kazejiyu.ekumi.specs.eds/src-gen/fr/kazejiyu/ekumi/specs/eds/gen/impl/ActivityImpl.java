/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.kazejiyu.ekumi.specs.eds.Activity;
import fr.kazejiyu.ekumi.specs.eds.ConditionalDivergence;
import fr.kazejiyu.ekumi.specs.eds.Convergence;
import fr.kazejiyu.ekumi.specs.eds.Divergence;
import fr.kazejiyu.ekumi.specs.eds.EdsPackage;
import fr.kazejiyu.ekumi.specs.eds.Start;
import fr.kazejiyu.ekumi.specs.eds.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getNestedActivities <em>Nested Activities</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getParentActivity <em>Parent Activity</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getDivergences <em>Divergences</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getConvergences <em>Convergences</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.specs.eds.gen.impl.ActivityImpl#getConditionalDivergences <em>Conditional Divergences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends TaskImpl implements Activity {
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
	 * The cached value of the '{@link #getNestedActivities() <em>Nested Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> nestedActivities;

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
	 * The cached value of the '{@link #getConvergences() <em>Convergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConvergences()
	 * @generated
	 * @ordered
	 */
	protected EList<Convergence> convergences;

	/**
	 * The cached value of the '{@link #getConditionalDivergences() <em>Conditional Divergences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionalDivergences()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalDivergence> conditionalDivergences;

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
		return EdsPackage.Literals.ACTIVITY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EdsPackage.ACTIVITY__START,
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
						EOPPOSITE_FEATURE_BASE - EdsPackage.ACTIVITY__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EdsPackage.ACTIVITY__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsPackage.ACTIVITY__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getNestedActivities() {
		if (nestedActivities == null) {
			nestedActivities = new EObjectContainmentWithInverseEList<Activity>(Activity.class, this,
					EdsPackage.ACTIVITY__NESTED_ACTIVITIES, EdsPackage.ACTIVITY__PARENT_ACTIVITY);
		}
		return nestedActivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getParentActivity() {
		if (eContainerFeatureID() != EdsPackage.ACTIVITY__PARENT_ACTIVITY)
			return null;
		return (Activity) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentActivity(Activity newParentActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentActivity, EdsPackage.ACTIVITY__PARENT_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentActivity(Activity newParentActivity) {
		if (newParentActivity != eInternalContainer()
				|| (eContainerFeatureID() != EdsPackage.ACTIVITY__PARENT_ACTIVITY && newParentActivity != null)) {
			if (EcoreUtil.isAncestor(this, newParentActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentActivity != null)
				msgs = ((InternalEObject) newParentActivity).eInverseAdd(this, EdsPackage.ACTIVITY__NESTED_ACTIVITIES,
						Activity.class, msgs);
			msgs = basicSetParentActivity(newParentActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdsPackage.ACTIVITY__PARENT_ACTIVITY,
					newParentActivity, newParentActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, EdsPackage.ACTIVITY__TASKS);
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
					EdsPackage.ACTIVITY__DIVERGENCES);
		}
		return divergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Convergence> getConvergences() {
		if (convergences == null) {
			convergences = new EObjectContainmentEList<Convergence>(Convergence.class, this,
					EdsPackage.ACTIVITY__CONVERGENCES);
		}
		return convergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalDivergence> getConditionalDivergences() {
		if (conditionalDivergences == null) {
			conditionalDivergences = new EObjectContainmentEList<ConditionalDivergence>(ConditionalDivergence.class,
					this, EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES);
		}
		return conditionalDivergences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNestedActivities()).basicAdd(otherEnd, msgs);
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
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
		case EdsPackage.ACTIVITY__START:
			return basicSetStart(null, msgs);
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			return ((InternalEList<?>) getNestedActivities()).basicRemove(otherEnd, msgs);
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			return basicSetParentActivity(null, msgs);
		case EdsPackage.ACTIVITY__TASKS:
			return ((InternalEList<?>) getTasks()).basicRemove(otherEnd, msgs);
		case EdsPackage.ACTIVITY__DIVERGENCES:
			return ((InternalEList<?>) getDivergences()).basicRemove(otherEnd, msgs);
		case EdsPackage.ACTIVITY__CONVERGENCES:
			return ((InternalEList<?>) getConvergences()).basicRemove(otherEnd, msgs);
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
			return ((InternalEList<?>) getConditionalDivergences()).basicRemove(otherEnd, msgs);
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
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			return eInternalContainer().eInverseRemove(this, EdsPackage.ACTIVITY__NESTED_ACTIVITIES, Activity.class,
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
		case EdsPackage.ACTIVITY__START:
			return getStart();
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			return getNestedActivities();
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			return getParentActivity();
		case EdsPackage.ACTIVITY__TASKS:
			return getTasks();
		case EdsPackage.ACTIVITY__DIVERGENCES:
			return getDivergences();
		case EdsPackage.ACTIVITY__CONVERGENCES:
			return getConvergences();
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
			return getConditionalDivergences();
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
		case EdsPackage.ACTIVITY__START:
			setStart((Start) newValue);
			return;
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			getNestedActivities().clear();
			getNestedActivities().addAll((Collection<? extends Activity>) newValue);
			return;
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			setParentActivity((Activity) newValue);
			return;
		case EdsPackage.ACTIVITY__TASKS:
			getTasks().clear();
			getTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case EdsPackage.ACTIVITY__DIVERGENCES:
			getDivergences().clear();
			getDivergences().addAll((Collection<? extends Divergence>) newValue);
			return;
		case EdsPackage.ACTIVITY__CONVERGENCES:
			getConvergences().clear();
			getConvergences().addAll((Collection<? extends Convergence>) newValue);
			return;
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
			getConditionalDivergences().clear();
			getConditionalDivergences().addAll((Collection<? extends ConditionalDivergence>) newValue);
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
		case EdsPackage.ACTIVITY__START:
			setStart((Start) null);
			return;
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			getNestedActivities().clear();
			return;
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			setParentActivity((Activity) null);
			return;
		case EdsPackage.ACTIVITY__TASKS:
			getTasks().clear();
			return;
		case EdsPackage.ACTIVITY__DIVERGENCES:
			getDivergences().clear();
			return;
		case EdsPackage.ACTIVITY__CONVERGENCES:
			getConvergences().clear();
			return;
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
			getConditionalDivergences().clear();
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
		case EdsPackage.ACTIVITY__START:
			return start != null;
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
			return nestedActivities != null && !nestedActivities.isEmpty();
		case EdsPackage.ACTIVITY__PARENT_ACTIVITY:
			return getParentActivity() != null;
		case EdsPackage.ACTIVITY__TASKS:
			return tasks != null && !tasks.isEmpty();
		case EdsPackage.ACTIVITY__DIVERGENCES:
			return divergences != null && !divergences.isEmpty();
		case EdsPackage.ACTIVITY__CONVERGENCES:
			return convergences != null && !convergences.isEmpty();
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
			return conditionalDivergences != null && !conditionalDivergences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
