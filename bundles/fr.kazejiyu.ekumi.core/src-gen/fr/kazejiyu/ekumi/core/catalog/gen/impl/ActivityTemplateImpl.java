/**
 */
package fr.kazejiyu.ekumi.core.catalog.gen.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.kazejiyu.ekumi.core.catalog.ActivityTemplate;
import fr.kazejiyu.ekumi.core.catalog.CatalogPackage;
import fr.kazejiyu.ekumi.core.catalog.Category;
import fr.kazejiyu.ekumi.core.workflow.Activity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl#getModelPath <em>Model Path</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.core.catalog.gen.impl.ActivityTemplateImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityTemplateImpl extends MinimalEObjectImpl.Container implements ActivityTemplate {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelPath() <em>Model Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelPath()
	 * @generated
	 * @ordered
	 */
	protected String modelPath = MODEL_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatalogPackage.Literals.ACTIVITY_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ACTIVITY_TEMPLATE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ACTIVITY_TEMPLATE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ACTIVITY_TEMPLATE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelPath() {
		return modelPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelPath(String newModelPath) {
		String oldModelPath = modelPath;
		modelPath = newModelPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ACTIVITY_TEMPLATE__MODEL_PATH,
					oldModelPath, modelPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (eContainerFeatureID() != CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY)
			return null;
		return (Category) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(Category newCategory, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newCategory, CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		if (newCategory != eInternalContainer()
				|| (eContainerFeatureID() != CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY && newCategory != null)) {
			if (EcoreUtil.isAncestor(this, newCategory))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCategory != null)
				msgs = ((InternalEObject) newCategory).eInverseAdd(this, CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES,
						Category.class, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY,
					newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity toActivity() {
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
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetCategory((Category) otherEnd, msgs);
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
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			return basicSetCategory(null, msgs);
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
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			return eInternalContainer().eInverseRemove(this, CatalogPackage.CATEGORY__ACTIVITY_TEMPLATES,
					Category.class, msgs);
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
		case CatalogPackage.ACTIVITY_TEMPLATE__ID:
			return getId();
		case CatalogPackage.ACTIVITY_TEMPLATE__NAME:
			return getName();
		case CatalogPackage.ACTIVITY_TEMPLATE__DESCRIPTION:
			return getDescription();
		case CatalogPackage.ACTIVITY_TEMPLATE__MODEL_PATH:
			return getModelPath();
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			return getCategory();
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
		case CatalogPackage.ACTIVITY_TEMPLATE__ID:
			setId((String) newValue);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__NAME:
			setName((String) newValue);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__MODEL_PATH:
			setModelPath((String) newValue);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			setCategory((Category) newValue);
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
		case CatalogPackage.ACTIVITY_TEMPLATE__ID:
			setId(ID_EDEFAULT);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__MODEL_PATH:
			setModelPath(MODEL_PATH_EDEFAULT);
			return;
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			setCategory((Category) null);
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
		case CatalogPackage.ACTIVITY_TEMPLATE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case CatalogPackage.ACTIVITY_TEMPLATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CatalogPackage.ACTIVITY_TEMPLATE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CatalogPackage.ACTIVITY_TEMPLATE__MODEL_PATH:
			return MODEL_PATH_EDEFAULT == null ? modelPath != null : !MODEL_PATH_EDEFAULT.equals(modelPath);
		case CatalogPackage.ACTIVITY_TEMPLATE__CATEGORY:
			return getCategory() != null;
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
		case CatalogPackage.ACTIVITY_TEMPLATE___TO_ACTIVITY:
			return toActivity();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", description: ");
		result.append(description);
		result.append(", modelPath: ");
		result.append(modelPath);
		result.append(')');
		return result.toString();
	}

} //ActivityTemplateImpl
