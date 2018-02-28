/**
 */
package fr.kazejiyu.ekumi.core.ekumi.impl;

import fr.kazejiyu.ekumi.core.ekumi.Activity;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.StructuredLoop;
import fr.kazejiyu.ekumi.core.ekumi.TestableScript;

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
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getPreTest <em>Pre Test</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getPostTest <em>Post Test</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.ekumi.impl.StructuredLoopImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredLoopImpl extends ActivityImpl implements StructuredLoop {
	/**
	 * The cached value of the '{@link #getPreTest() <em>Pre Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreTest()
	 * @generated
	 * @ordered
	 */
	protected TestableScript preTest;

	/**
	 * The cached value of the '{@link #getPostTest() <em>Post Test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostTest()
	 * @generated
	 * @ordered
	 */
	protected TestableScript postTest;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' reference.
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
	public TestableScript getPreTest() {
		return preTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreTest(TestableScript newPreTest, NotificationChain msgs) {
		TestableScript oldPreTest = preTest;
		preTest = newPreTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.STRUCTURED_LOOP__PRE_TEST, oldPreTest, newPreTest);
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
	public void setPreTest(TestableScript newPreTest) {
		if (newPreTest != preTest) {
			NotificationChain msgs = null;
			if (preTest != null)
				msgs = ((InternalEObject) preTest).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__PRE_TEST, null, msgs);
			if (newPreTest != null)
				msgs = ((InternalEObject) newPreTest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__PRE_TEST, null, msgs);
			msgs = basicSetPreTest(newPreTest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__PRE_TEST, newPreTest,
					newPreTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestableScript getPostTest() {
		return postTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostTest(TestableScript newPostTest, NotificationChain msgs) {
		TestableScript oldPostTest = postTest;
		postTest = newPostTest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EkumiPackage.STRUCTURED_LOOP__POST_TEST, oldPostTest, newPostTest);
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
	public void setPostTest(TestableScript newPostTest) {
		if (newPostTest != postTest) {
			NotificationChain msgs = null;
			if (postTest != null)
				msgs = ((InternalEObject) postTest).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__POST_TEST, null, msgs);
			if (newPostTest != null)
				msgs = ((InternalEObject) newPostTest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - EkumiPackage.STRUCTURED_LOOP__POST_TEST, null, msgs);
			msgs = basicSetPostTest(newPostTest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__POST_TEST, newPostTest,
					newPostTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivity() {
		if (activity != null && activity.eIsProxy()) {
			InternalEObject oldActivity = (InternalEObject) activity;
			activity = (Activity) eResolveProxy(oldActivity);
			if (activity != oldActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EkumiPackage.STRUCTURED_LOOP__ACTIVITY,
							oldActivity, activity));
			}
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivity(Activity newActivity) {
		Activity oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EkumiPackage.STRUCTURED_LOOP__ACTIVITY, oldActivity,
					activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EkumiPackage.STRUCTURED_LOOP__PRE_TEST:
			return basicSetPreTest(null, msgs);
		case EkumiPackage.STRUCTURED_LOOP__POST_TEST:
			return basicSetPostTest(null, msgs);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_TEST:
			return getPreTest();
		case EkumiPackage.STRUCTURED_LOOP__POST_TEST:
			return getPostTest();
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			if (resolve)
				return getActivity();
			return basicGetActivity();
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_TEST:
			setPreTest((TestableScript) newValue);
			return;
		case EkumiPackage.STRUCTURED_LOOP__POST_TEST:
			setPostTest((TestableScript) newValue);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_TEST:
			setPreTest((TestableScript) null);
			return;
		case EkumiPackage.STRUCTURED_LOOP__POST_TEST:
			setPostTest((TestableScript) null);
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
		case EkumiPackage.STRUCTURED_LOOP__PRE_TEST:
			return preTest != null;
		case EkumiPackage.STRUCTURED_LOOP__POST_TEST:
			return postTest != null;
		case EkumiPackage.STRUCTURED_LOOP__ACTIVITY:
			return activity != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredLoopImpl
