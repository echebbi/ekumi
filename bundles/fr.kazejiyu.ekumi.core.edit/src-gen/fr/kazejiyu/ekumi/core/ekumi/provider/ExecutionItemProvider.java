/**
 */
package fr.kazejiyu.ekumi.core.ekumi.provider;

import fr.kazejiyu.ekumi.core.ekumi.EkumiFactory;
import fr.kazejiyu.ekumi.core.ekumi.EkumiPackage;
import fr.kazejiyu.ekumi.core.ekumi.Execution;

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
 * This is the item provider adapter for a {@link fr.kazejiyu.ekumi.core.ekumi.Execution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionItemProvider extends IdentifiableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionItemProvider(AdapterFactory adapterFactory) {
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
			addActivityPropertyDescriptor(object);
			addContextPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
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
						EkumiPackage.Literals.HAS_STATUS__STATUS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Activity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Execution_activity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Execution_activity_feature",
								"_UI_Execution_type"),
						EkumiPackage.Literals.EXECUTION__ACTIVITY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Execution_context_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Execution_context_feature",
								"_UI_Execution_type"),
						EkumiPackage.Literals.EXECUTION__CONTEXT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Execution_startDate_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Execution_startDate_feature",
								"_UI_Execution_type"),
						EkumiPackage.Literals.EXECUTION__START_DATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(EkumiPackage.Literals.EXECUTION__ACTIVITY);
			childrenFeatures.add(EkumiPackage.Literals.EXECUTION__CONTEXT);
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
	 * This returns Execution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Execution"));
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
		String label = ((Execution) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Execution_type")
				: getString("_UI_Execution_type") + " " + label;
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

		switch (notification.getFeatureID(Execution.class)) {
		case EkumiPackage.EXECUTION__STATUS:
		case EkumiPackage.EXECUTION__START_DATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case EkumiPackage.EXECUTION__ACTIVITY:
		case EkumiPackage.EXECUTION__CONTEXT:
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

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createSequence()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createMultipleInstances()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createStructuredLoop()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createScriptedTask()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createMultiChoice()));

		newChildDescriptors.add(
				createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY, EkumiFactory.eINSTANCE.createDriver()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__ACTIVITY,
				EkumiFactory.eINSTANCE.createParallelSplit()));

		newChildDescriptors.add(createChildParameter(EkumiPackage.Literals.EXECUTION__CONTEXT,
				EkumiFactory.eINSTANCE.createUnsafeContext()));
	}

}
