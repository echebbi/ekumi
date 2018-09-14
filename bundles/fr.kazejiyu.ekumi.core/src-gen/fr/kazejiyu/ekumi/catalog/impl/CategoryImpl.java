/**
 */
package fr.kazejiyu.ekumi.catalog.impl;

import fr.kazejiyu.ekumi.catalog.CatalogPackage;
import fr.kazejiyu.ekumi.catalog.Category;
import fr.kazejiyu.ekumi.core.ekumi.Activity;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.catalog.impl.CategoryImpl#getActivities <em>Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends GroupImpl implements Category {
	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected Activity activities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivities() {
		if (activities != null && activities.eIsProxy()) {
			InternalEObject oldActivities = (InternalEObject) activities;
			activities = (Activity) eResolveProxy(oldActivities);
			if (activities != oldActivities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CatalogPackage.CATEGORY__ACTIVITIES,
							oldActivities, activities));
			}
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetActivities() {
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CatalogPackage.CATEGORY__ACTIVITIES:
			if (resolve)
				return getActivities();
			return basicGetActivities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CatalogPackage.CATEGORY__ACTIVITIES:
			return activities != null;
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
