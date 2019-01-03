/**
 */
package fr.kazejiyu.ekumi.model.workflow.provider;

import fr.kazejiyu.ekumi.model.workflow.util.WorkflowAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProviderAdapterFactory extends WorkflowAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Sequence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceItemProvider sequenceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceAdapter() {
		if (sequenceItemProvider == null) {
			sequenceItemProvider = new SequenceItemProvider(this);
		}

		return sequenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.MultipleInstances} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultipleInstancesItemProvider multipleInstancesItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.MultipleInstances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultipleInstancesAdapter() {
		if (multipleInstancesItemProvider == null) {
			multipleInstancesItemProvider = new MultipleInstancesItemProvider(this);
		}

		return multipleInstancesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.DataFlow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowItemProvider dataFlowItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.DataFlow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFlowAdapter() {
		if (dataFlowItemProvider == null) {
			dataFlowItemProvider = new DataFlowItemProvider(this);
		}

		return dataFlowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Variable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableItemProvider variableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableAdapter() {
		if (variableItemProvider == null) {
			variableItemProvider = new VariableItemProvider(this);
		}

		return variableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.StructuredLoop} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredLoopItemProvider structuredLoopItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.StructuredLoop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredLoopAdapter() {
		if (structuredLoopItemProvider == null) {
			structuredLoopItemProvider = new StructuredLoopItemProvider(this);
		}

		return structuredLoopItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.ScriptedTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptedTaskItemProvider scriptedTaskItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.ScriptedTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScriptedTaskAdapter() {
		if (scriptedTaskItemProvider == null) {
			scriptedTaskItemProvider = new ScriptedTaskItemProvider(this);
		}

		return scriptedTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.MultiChoice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiChoiceItemProvider multiChoiceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.MultiChoice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiChoiceAdapter() {
		if (multiChoiceItemProvider == null) {
			multiChoiceItemProvider = new MultiChoiceItemProvider(this);
		}

		return multiChoiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Branch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchItemProvider branchItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchAdapter() {
		if (branchItemProvider == null) {
			branchItemProvider = new BranchItemProvider(this);
		}

		return branchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsafeContextItemProvider unsafeContextItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.UnsafeContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnsafeContextAdapter() {
		if (unsafeContextItemProvider == null) {
			unsafeContextItemProvider = new UnsafeContextItemProvider(this);
		}

		return unsafeContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.DataFlows} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFlowsItemProvider dataFlowsItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.DataFlows}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataFlowsAdapter() {
		if (dataFlowsItemProvider == null) {
			dataFlowsItemProvider = new DataFlowsItemProvider(this);
		}

		return dataFlowsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Execution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionItemProvider executionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Execution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionAdapter() {
		if (executionItemProvider == null) {
			executionItemProvider = new ExecutionItemProvider(this);
		}

		return executionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.ListOfVariables} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListOfVariablesItemProvider listOfVariablesItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.ListOfVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createListOfVariablesAdapter() {
		if (listOfVariablesItemProvider == null) {
			listOfVariablesItemProvider = new ListOfVariablesItemProvider(this);
		}

		return listOfVariablesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.MapOfVariables} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapOfVariablesItemProvider mapOfVariablesItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.MapOfVariables}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMapOfVariablesAdapter() {
		if (mapOfVariablesItemProvider == null) {
			mapOfVariablesItemProvider = new MapOfVariablesItemProvider(this);
		}

		return mapOfVariablesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Driver} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DriverItemProvider driverItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Driver}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDriverAdapter() {
		if (driverItemProvider == null) {
			driverItemProvider = new DriverItemProvider(this);
		}

		return driverItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.ParallelSplit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelSplitItemProvider parallelSplitItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.ParallelSplit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParallelSplitAdapter() {
		if (parallelSplitItemProvider == null) {
			parallelSplitItemProvider = new ParallelSplitItemProvider(this);
		}

		return parallelSplitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Context} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextItemProvider contextItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Context}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContextAdapter() {
		if (contextItemProvider == null) {
			contextItemProvider = new ContextItemProvider(this);
		}

		return contextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.History} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryItemProvider historyItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.History}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHistoryAdapter() {
		if (historyItemProvider == null) {
			historyItemProvider = new HistoryItemProvider(this);
		}

		return historyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.Identifiable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableItemProvider identifiableItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.Identifiable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentifiableAdapter() {
		if (identifiableItemProvider == null) {
			identifiableItemProvider = new IdentifiableItemProvider(this);
		}

		return identifiableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.kazejiyu.ekumi.model.workflow.HasStatus} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasStatusItemProvider hasStatusItemProvider;

	/**
	 * This creates an adapter for a {@link fr.kazejiyu.ekumi.model.workflow.HasStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHasStatusAdapter() {
		if (hasStatusItemProvider == null) {
			hasStatusItemProvider = new HasStatusItemProvider(this);
		}

		return hasStatusItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (sequenceItemProvider != null)
			sequenceItemProvider.dispose();
		if (multipleInstancesItemProvider != null)
			multipleInstancesItemProvider.dispose();
		if (dataFlowItemProvider != null)
			dataFlowItemProvider.dispose();
		if (variableItemProvider != null)
			variableItemProvider.dispose();
		if (structuredLoopItemProvider != null)
			structuredLoopItemProvider.dispose();
		if (scriptedTaskItemProvider != null)
			scriptedTaskItemProvider.dispose();
		if (multiChoiceItemProvider != null)
			multiChoiceItemProvider.dispose();
		if (branchItemProvider != null)
			branchItemProvider.dispose();
		if (unsafeContextItemProvider != null)
			unsafeContextItemProvider.dispose();
		if (dataFlowsItemProvider != null)
			dataFlowsItemProvider.dispose();
		if (executionItemProvider != null)
			executionItemProvider.dispose();
		if (listOfVariablesItemProvider != null)
			listOfVariablesItemProvider.dispose();
		if (mapOfVariablesItemProvider != null)
			mapOfVariablesItemProvider.dispose();
		if (driverItemProvider != null)
			driverItemProvider.dispose();
		if (parallelSplitItemProvider != null)
			parallelSplitItemProvider.dispose();
		if (contextItemProvider != null)
			contextItemProvider.dispose();
		if (historyItemProvider != null)
			historyItemProvider.dispose();
		if (identifiableItemProvider != null)
			identifiableItemProvider.dispose();
		if (hasStatusItemProvider != null)
			hasStatusItemProvider.dispose();
	}

}