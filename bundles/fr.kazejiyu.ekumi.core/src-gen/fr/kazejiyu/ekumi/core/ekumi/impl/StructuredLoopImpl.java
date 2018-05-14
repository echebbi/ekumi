/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.Condition;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredLoopImpl extends ActivityImpl implements StructuredLoop {
	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition postCondition;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Activity activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EkumiPackage.Literals.STRUCTURED_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreCondition(Condition newPreCondition, NotificationChain msgs) {
		Condition oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION, oldPreCondition, newPreCondition);
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
	public void setPreCondition(Condition newPreCondition) {
		if (newPreCondition != preCondition) {
			NotificationChain msgs = null;
			if (preCondition != null)
				msgs = ((InternalEObject) preCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION, null, msgs);
			if (newPreCondition != null)
				msgs = ((InternalEObject) newPreCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION, null, msgs);
			msgs = basicSetPreCondition(newPreCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION,
					newPreCondition, newPreCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Condition newPostCondition, NotificationChain msgs) {
		Condition oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.STRUCTURED_LOOP__POST_CONDITION, oldPostCondition, newPostCondition);
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
	public void setPostCondition(Condition newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject) postCondition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject) newPostCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__POST_CONDITION,
					newPostCondition, newPostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Activity newActivity, NotificationChain msgs) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.STRUCTURED_LOOP__ACTIVITY, oldActivity, newActivity);
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
	public void setActivity(Activity newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject) activity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__ACTIVITY, null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__ACTIVITY, null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__ACTIVITY, newActivity,
					newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
			return basicSetPreCondition(null, msgs);
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
			return basicSetPostCondition(null, msgs);
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			return basicSetActivity(null, msgs);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
			return getPreCondition();
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
			return getPostCondition();
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			return getActivity();
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
			setPreCondition((Condition) newValue);
			return;
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
			setPostCondition((Condition) newValue);
			return;
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			setActivity((Activity) newValue);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
			setPreCondition((Condition) null);
			return;
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
			setPostCondition((Condition) null);
			return;
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			setActivity((Activity) null);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_CONDITION:
			return preCondition != null;
		case EkumiPackage.STRUCTURED_LOOP__POST_CONDITION:
			return postCondition != null;
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			return activity != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredLoopImpl
