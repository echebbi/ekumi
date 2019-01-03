/**
 */
package fr.kazejiyu.ekumi.model.catalog.impl;

import fr.kazejiyu.ekumi.model.catalog.ActivityTemplate;
import fr.kazejiyu.ekumi.model.catalog.CatalogPackage;
import fr.kazejiyu.ekumi.model.catalog.Category;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.catalog.impl.CategoryImpl#getActivityTemplates <em>Activity Templates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends GroupImpl implements Category {
	/**
	 * The cached value of the '{@link #getActivityTemplates() <em>Activity Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityTemplate> activityTemplates;

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
	public EList<ActivityTemplate> getActivityTemplates() {
		if (activityTemplates == null) {
			activityTemplates = new EObjectContainmentWithInverseEList<ActivityTemplate>(ActivityTemplate.class, this,
					CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES, CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY);
		}
		return activityTemplates;
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getActivityTemplates()).basicAdd(otherEnd,
					msgs);
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			return ((InternalEList<?>) getActivityTemplates()).basicRemove(otherEnd, msgs);
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			return getActivityTemplates();
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			getActivityTemplates().clear();
			getActivityTemplates().addAll((Collection<? extends ActivityTemplate>) newValue);
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			getActivityTemplates().clear();
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
		case CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES:
			return activityTemplates != null && !activityTemplates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CategoryImpl
