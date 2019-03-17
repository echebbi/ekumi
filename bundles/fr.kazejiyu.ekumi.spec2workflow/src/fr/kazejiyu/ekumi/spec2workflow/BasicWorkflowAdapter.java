/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.spec2workflow;

import static java.util.Objects.requireNonNull;

import java.util.Optional;

import fr.kazejiyu.ekumi.model.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.model.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.model.spec.Divergence;
import fr.kazejiyu.ekumi.model.spec.ExternalTask;
import fr.kazejiyu.ekumi.model.spec.Node;
import fr.kazejiyu.ekumi.model.spec.ParallelSplit;
import fr.kazejiyu.ekumi.model.spec.Start;
import fr.kazejiyu.ekumi.model.spec.Synchronization;
import fr.kazejiyu.ekumi.model.spec.ActivityAdapter;
import fr.kazejiyu.ekumi.model.spec.util.SpecSwitch;
import fr.kazejiyu.ekumi.model.workflow.Activity;
import fr.kazejiyu.ekumi.model.workflow.ScriptedTask;
import fr.kazejiyu.ekumi.model.workflow.Sequence;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;

public class BasicWorkflowAdapter extends SpecSwitch<Activity> implements ActivityAdapter {
	
	@SuppressWarnings("unused") // Will be used as soon as inputs & outputs are handled
	private DataTypeFactory datatypes;
	
	private ScriptingLanguageFactory languages;
	
	public BasicWorkflowAdapter() {
		// allows instantiation by the 'fr.kazejiyu.ekumi.specs' extension point
	}
	
	/**
	 * <p>Creates a new adapter with specific factories.</p>
	 * 
	 * <p>This constructor is intended for users who do not plan to use the
	 * {@link #adapt(Object, DataTypeFactory, ScriptingLanguageFactory)} method.</p>
	 * 
	 * @param datatypes
	 * 			The factory used to create datatypes.
	 * @param languages
	 * 			The factory used to create scripting languages.
	 */
	public BasicWorkflowAdapter(DataTypeFactory datatypes, ScriptingLanguageFactory languages) {
		this.datatypes = requireNonNull(datatypes, "The datatype factory must not be null");
		this.languages = requireNonNull(languages, "The language factory must not be null");
	}

	@Override
	public boolean canAdapt(Object specification) {
		return specification instanceof fr.kazejiyu.ekumi.model.spec.Activity;
	}
	
	@Override
	public Optional<Activity> adapt(Object specification, DataTypeFactory datatypes, ScriptingLanguageFactory languages) {
		if (! (specification instanceof fr.kazejiyu.ekumi.model.spec.Activity)) {
			return Optional.empty();
		}
		this.datatypes = requireNonNull(datatypes, "The datatype factory must not be null");
		this.languages = requireNonNull(languages, "The language factory must not be null");
		return Optional.ofNullable(caseActivity((fr.kazejiyu.ekumi.model.spec.Activity) specification));
	}
	
	@Override 
	public Activity caseActivity(fr.kazejiyu.ekumi.model.spec.Activity activity) {
		Start start = activity.getStart();
		
		if (start == null)
			return null;
		
		Sequence sequence = WorkflowFactory.eINSTANCE.createSequence();
		sequence.setId(activity.getId());
		sequence.setName(activity.getName());
		
		if (! start.hasSuccessors())
			return sequence;
			
		Node remainingNode = fillSequence(start.getSuccessors().get(0), sequence);
		
		// We're on a divergence
		if (remainingNode != null) {
			Activity adapted = doSwitch(remainingNode);
			
			if (adapted != null)
				sequence.setSuccessor(adapted);
		}
		return sequence;
	}

	/**
	 * Adapts a node and its successors by filling a Sequence.
	 * 
	 * @param startingNode
	 * 			The node to adapt.
	 * @param sequence
	 * 			The sequence to fill with the adaption of the node.
	 * 
	 * @return the first node that cannot be adapted
	 */
	private Node fillSequence(Node startingNode, Sequence sequence) {
		Node current = startingNode;
		Activity lastAdapted = null;
		
		while (current != null && ! (current instanceof Divergence)) {
			Activity adapted = doSwitch(current);
			
			if (adapted != null) {
				if (sequence.getRoot() == null)
					sequence.setRoot(adapted);
				else if (lastAdapted != null)
					lastAdapted.setSuccessor(adapted);
				
				lastAdapted = adapted;
				current = current.hasSuccessors() ? current.getSuccessors().get(0) : null;
			}
		}
		return current;
	}
	
	@Override
	public Activity caseExternalTask(ExternalTask task) {
		ScriptedTask script = WorkflowFactory.eINSTANCE.createScriptedTask();
		
		script.setId(task.getId());
		script.setName(task.getName());
		script.setScriptPath(task.getScriptId());
		
		Optional<ScriptingLanguage> scriptLanguage = languages.find(task.getLanguageId());
		scriptLanguage.ifPresent(script::setLanguage);
		
		if (! scriptLanguage.isPresent()) {
			Activator.warn(new IllegalArgumentException(task.getLanguageId()), "Unable to find any language for id: " + task.getLanguageId());
		}
		return script;
	}
	
	@Override
	public Activity caseParallelSplit(ParallelSplit spec) {
		fr.kazejiyu.ekumi.model.workflow.ParallelSplit split = WorkflowFactory.eINSTANCE.createParallelSplit();
		
		Synchronization sync = null;
		
		for (Node successor : spec.getSuccessors()) {
			Sequence branch = WorkflowFactory.eINSTANCE.createSequence();
			
			Activity firstActivity = doSwitch(successor);
			branch.setRoot(firstActivity);
			branch.getActivities().add(firstActivity);
			
			Node next = successor;
			
			while (next.hasSuccessors()) {
				next = next.getSuccessors().get(0);
				
				if (next instanceof Synchronization) {
					sync = (Synchronization) next;
					break;
				}
				
				Activity nextActivity = doSwitch(next);
				branch.getActivities().add(nextActivity);
			}
			
			split.getBranches().add(branch);
		}
		if (sync != null) {
			Activity splitSuccessor = doSwitch(sync);
			
			if (splitSuccessor != null)
				split.setSuccessor(splitSuccessor);
		}
		return split;
	}
	
	@Override
	public Activity caseSynchronization(Synchronization sync) {
		if (sync.hasSuccessors()) {
			return doSwitch(sync.getSuccessors().get(0));
		}
		return null;
	}

}
