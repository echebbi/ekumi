/**
 */
package fr.kazejiyu.ekumi.specs.eds.gen.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.kazejiyu.ekumi.specs.eds.Activity;
import fr.kazejiyu.ekumi.specs.eds.EdsFactory;
import fr.kazejiyu.ekumi.specs.eds.EdsPackage;

/**
 * This is the item provider adapter for a {@link fr.kazejiyu.ekumi.specs.eds.Activity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityItemProvider extends TaskItemProvider {
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

			addParentActivityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Activity_parentActivity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Activity_parentActivity_feature",
								"_UI_Activity_type"),
						EdsPackage.Literals.ACTIVITY__PARENT_ACTIVITY, true, false, true, null, null, null));
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
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__START);
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__NESTED_ACTIVITIES);
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__TASKS);
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__DIVERGENCES);
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__CONVERGENCES);
			childrenFeatures.add(EdsPackage.Literals.ACTIVITY__CONDITIONAL_DIVERGENCES);
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
		case EdsPackage.ACTIVITY__START:
		case EdsPackage.ACTIVITY__NESTED_ACTIVITIES:
		case EdsPackage.ACTIVITY__TASKS:
		case EdsPackage.ACTIVITY__DIVERGENCES:
		case EdsPackage.ACTIVITY__CONVERGENCES:
		case EdsPackage.ACTIVITY__CONDITIONAL_DIVERGENCES:
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

		newChildDescriptors
				.add(createChildParameter(EdsPackage.Literals.ACTIVITY__START, EdsFactory.eINSTANCE.createStart()));

		newChildDescriptors.add(createChildParameter(EdsPackage.Literals.ACTIVITY__NESTED_ACTIVITIES,
				EdsFactory.eINSTANCE.createActivity()));

		newChildDescriptors
				.add(createChildParameter(EdsPackage.Literals.ACTIVITY__TASKS, EdsFactory.eINSTANCE.createActivity()));

		newChildDescriptors.add(
				createChildParameter(EdsPackage.Literals.ACTIVITY__TASKS, EdsFactory.eINSTANCE.createExternalTask()));

		newChildDescriptors.add(
				createChildParameter(EdsPackage.Literals.ACTIVITY__TASKS, EdsFactory.eINSTANCE.createLibraryTask()));

		newChildDescriptors
				.add(createChildParameter(EdsPackage.Literals.ACTIVITY__TASKS, EdsFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add(createChildParameter(EdsPackage.Literals.ACTIVITY__DIVERGENCES,
				EdsFactory.eINSTANCE.createParallelSplit()));

		newChildDescriptors.add(createChildParameter(EdsPackage.Literals.ACTIVITY__CONVERGENCES,
				EdsFactory.eINSTANCE.createSynchronization()));

		newChildDescriptors.add(createChildParameter(EdsPackage.Literals.ACTIVITY__CONVERGENCES,
				EdsFactory.eINSTANCE.createSimpleMerge()));

		newChildDescriptors.add(createChildParameter(EdsPackage.Literals.ACTIVITY__CONDITIONAL_DIVERGENCES,
				EdsFactory.eINSTANCE.createMultiChoice()));
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

		boolean qualify = childFeature == EdsPackage.Literals.TASK__INPUTS
				|| childFeature == EdsPackage.Literals.TASK__OUTPUTS
				|| childFeature == EdsPackage.Literals.ACTIVITY__NESTED_ACTIVITIES
				|| childFeature == EdsPackage.Literals.ACTIVITY__TASKS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
