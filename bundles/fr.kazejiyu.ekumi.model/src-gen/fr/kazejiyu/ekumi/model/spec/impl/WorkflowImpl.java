/**
 */
package fr.kazejiyu.ekumi.model.spec.impl;

import fr.kazejiyu.ekumi.model.spec.Activity;
import fr.kazejiyu.ekumi.model.spec.SpecPackage;
import fr.kazejiyu.ekumi.model.spec.StartJoin;
import fr.kazejiyu.ekumi.model.spec.Workflow;
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
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl#getStart <em>Start</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl#getSubWorkflow <em>Sub Workflow</em>}</li>
 *   <li>{@link fr.kazejiyu.ekumi.model.spec.impl.WorkflowImpl#getParentWorkflow <em>Parent Workflow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached value of the '{@link #getSubWorkflow() <em>Sub Workflow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubWorkflow()
	 * @generated
	 * @ordered
	 */
	protected Workflow subWorkflow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecPackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, SpecPackage.WORKFLOW__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartJoin getStart() {
		// TODO: implement this method to return the 'Start' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StartJoin newStart, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'Start' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(StartJoin newStart) {
		// TODO: implement this method to set the 'Start' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getSubWorkflow() {
		return subWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubWorkflow(Workflow newSubWorkflow, NotificationChain msgs) {
		Workflow oldSubWorkflow = subWorkflow;
		subWorkflow = newSubWorkflow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SpecPackage.WORKFLOW__SUB_WORKFLOW, oldSubWorkflow, newSubWorkflow);
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
	public void setSubWorkflow(Workflow newSubWorkflow) {
		if (newSubWorkflow != subWorkflow) {
			NotificationChain msgs = null;
			if (subWorkflow != null)
				msgs = ((InternalEObject) subWorkflow).eInverseRemove(this, SpecPackage.WORKFLOW__PARENT_WORKFLOW,
						Workflow.class, msgs);
			if (newSubWorkflow != null)
				msgs = ((InternalEObject) newSubWorkflow).eInverseAdd(this, SpecPackage.WORKFLOW__PARENT_WORKFLOW,
						Workflow.class, msgs);
			msgs = basicSetSubWorkflow(newSubWorkflow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.WORKFLOW__SUB_WORKFLOW, newSubWorkflow,
					newSubWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow getParentWorkflow() {
		if (eContainerFeatureID() != SpecPackage.WORKFLOW__PARENT_WORKFLOW)
			return null;
		return (Workflow) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentWorkflow(Workflow newParentWorkflow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentWorkflow, SpecPackage.WORKFLOW__PARENT_WORKFLOW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentWorkflow(Workflow newParentWorkflow) {
		if (newParentWorkflow != eInternalContainer()
				|| (eContainerFeatureID() != SpecPackage.WORKFLOW__PARENT_WORKFLOW && newParentWorkflow != null)) {
			if (EcoreUtil.isAncestor(this, newParentWorkflow))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentWorkflow != null)
				msgs = ((InternalEObject) newParentWorkflow).eInverseAdd(this, SpecPackage.WORKFLOW__SUB_WORKFLOW,
						Workflow.class, msgs);
			msgs = basicSetParentWorkflow(newParentWorkflow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecPackage.WORKFLOW__PARENT_WORKFLOW,
					newParentWorkflow, newParentWorkflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			if (subWorkflow != null)
				msgs = ((InternalEObject) subWorkflow).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - SpecPackage.WORKFLOW__SUB_WORKFLOW, null, msgs);
			return basicSetSubWorkflow((Workflow) otherEnd, msgs);
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentWorkflow((Workflow) otherEnd, msgs);
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
		case SpecPackage.WORKFLOW__ACTIVITIES:
			return ((InternalEList<?>) getActivities()).basicRemove(otherEnd, msgs);
		case SpecPackage.WORKFLOW__START:
			return basicSetStart(null, msgs);
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			return basicSetSubWorkflow(null, msgs);
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			return basicSetParentWorkflow(null, msgs);
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
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			return eInternalContainer().eInverseRemove(this, SpecPackage.WORKFLOW__SUB_WORKFLOW, Workflow.class, msgs);
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
		case SpecPackage.WORKFLOW__ACTIVITIES:
			return getActivities();
		case SpecPackage.WORKFLOW__START:
			return getStart();
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			return getSubWorkflow();
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			return getParentWorkflow();
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
		case SpecPackage.WORKFLOW__ACTIVITIES:
			getActivities().clear();
			getActivities().addAll((Collection<? extends Activity>) newValue);
			return;
		case SpecPackage.WORKFLOW__START:
			setStart((StartJoin) newValue);
			return;
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			setSubWorkflow((Workflow) newValue);
			return;
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			setParentWorkflow((Workflow) newValue);
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
		case SpecPackage.WORKFLOW__ACTIVITIES:
			getActivities().clear();
			return;
		case SpecPackage.WORKFLOW__START:
			setStart((StartJoin) null);
			return;
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			setSubWorkflow((Workflow) null);
			return;
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			setParentWorkflow((Workflow) null);
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
		case SpecPackage.WORKFLOW__ACTIVITIES:
			return activities != null && !activities.isEmpty();
		case SpecPackage.WORKFLOW__START:
			return getStart() != null;
		case SpecPackage.WORKFLOW__SUB_WORKFLOW:
			return subWorkflow != null;
		case SpecPackage.WORKFLOW__PARENT_WORKFLOW:
			return getParentWorkflow() != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
