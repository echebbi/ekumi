/**
 */
package fr.kazejiyu.ekumi.model.workflow.provider;

import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.model.workflow.WorkflowPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStatusPropertyDescriptor(object);
			addSuccessorPropertyDescriptor(object);
			addPredecessorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_HasStatus_status_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_HasStatus_status_feature",
								"_UI_HasStatus_type"),
						WorkflowPackage.Literals.HAS_STATUS__STATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Successor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuccessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_successor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_successor_feature",
								"_UI_Activity_type"),
						WorkflowPackage.Literals.ACTIVITY__SUCCESSOR, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Predecessor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredecessorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_predecessor_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_predecessor_feature",
								"_UI_Activity_type"),
						WorkflowPackage.Literals.ACTIVITY__PREDECESSOR, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(WorkflowPackage.Literals.ACTIVITY__OUTPUTS);
			childrenFeatures.add(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR);
			childrenFeatures.add(WorkflowPackage.Literals.ACTIVITY__FLOWS);
			childrenFeatures.add(WorkflowPackage.Literals.ACTIVITY__INPUTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Activity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Activity"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Activity) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Activity_type")
				: getString("_UI_Activity_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Activity.class)) {
		case WorkflowPackage.ACTIVITY__STATUS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case WorkflowPackage.ACTIVITY__OUTPUTS:
		case WorkflowPackage.ACTIVITY__SUCCESSOR:
		case WorkflowPackage.ACTIVITY__FLOWS:
		case WorkflowPackage.ACTIVITY__INPUTS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__OUTPUTS,
				WorkflowFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__OUTPUTS,
				WorkflowFactory.eINSTANCE.createListOfVariables()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__OUTPUTS,
				WorkflowFactory.eINSTANCE.createMapOfVariables()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createMultipleInstances()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createStructuredLoop()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createScriptedTask()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createMultiChoice()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__SUCCESSOR,
				WorkflowFactory.eINSTANCE.createParallelSplit()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__FLOWS,
				WorkflowFactory.eINSTANCE.createDataFlows()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__INPUTS,
				WorkflowFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__INPUTS,
				WorkflowFactory.eINSTANCE.createListOfVariables()));

		newChildDescriptors.add(createChildParameter(WorkflowPackage.Literals.ACTIVITY__INPUTS,
				WorkflowFactory.eINSTANCE.createMapOfVariables()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == WorkflowPackage.Literals.ACTIVITY__OUTPUTS
				|| childFeature == WorkflowPackage.Literals.ACTIVITY__INPUTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
