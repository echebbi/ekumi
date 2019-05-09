/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.adapter;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;
import org.eclipse.emf.common.util.EList;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.datatypes.DataTypeFactory;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeUnserializationException;
import fr.kazejiyu.ekumi.core.exceptions.DataTypeNotFoundException;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguage;
import fr.kazejiyu.ekumi.core.scripting.ScriptingLanguageFactory;
import fr.kazejiyu.ekumi.core.specs.ActivityAdapter;
import fr.kazejiyu.ekumi.core.workflow.Activity;
import fr.kazejiyu.ekumi.core.workflow.Input;
import fr.kazejiyu.ekumi.core.workflow.Output;
import fr.kazejiyu.ekumi.core.workflow.ParallelSplit;
import fr.kazejiyu.ekumi.core.workflow.ScriptedActivity;
import fr.kazejiyu.ekumi.core.workflow.Sequence;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicInput;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicOutput;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicParallelSplit;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicScriptedActivity;
import fr.kazejiyu.ekumi.core.workflow.impl.BasicSequence;
import fr.kazejiyu.ekumi.specs.eds.Divergence;
import fr.kazejiyu.ekumi.specs.eds.ExternalTask;
import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.Start;
import fr.kazejiyu.ekumi.specs.eds.Synchronization;
import fr.kazejiyu.ekumi.specs.eds.gen.util.EdsSwitch;

public class BasicWorkflowAdapter extends EdsSwitch<Activity> implements ActivityAdapter {
	
	private DataTypeFactory datatypes;
	
	private ScriptingLanguageFactory languages;
	
	public BasicWorkflowAdapter() {
		// allows instantiation by the 'fr.kazejiyu.ekumi.specs' extension point
	}
	
	/**
	 * Creates a new adapter with specific factories.
	 * <p>
	 * This constructor is intended for users who do not plan to use the
	 * {@link #adapt(Object, DataTypeFactory, ScriptingLanguageFactory)} method.
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
		return specification instanceof fr.kazejiyu.ekumi.specs.eds.Activity;
	}
	
	@Override
	public Optional<Activity> adapt(Object specification, DataTypeFactory datatypes, ScriptingLanguageFactory languages) {
		if (! (specification instanceof fr.kazejiyu.ekumi.specs.eds.Activity)) {
			return Optional.empty();
		}
		this.datatypes = requireNonNull(datatypes, "The datatype factory must not be null");
		this.languages = requireNonNull(languages, "The language factory must not be null");
		return Optional.ofNullable(caseActivity((fr.kazejiyu.ekumi.specs.eds.Activity) specification));
	}
	
	@Override 
	public Activity caseActivity(fr.kazejiyu.ekumi.specs.eds.Activity activity) {
		Start start = activity.getStart();
		
		if (start == null) {
			return null;
		}
		if (! start.hasSuccessors()) {
			return new BasicSequence(activity.getId(), activity.getName());
		}
		Pair<Sequence, Node> sequenceAndRemainingNode = fillSequence(activity.getId(), activity.getName(), start.getSuccessors().get(0));
		Sequence sequence = sequenceAndRemainingNode.getOne();
		Node remainingNode = sequenceAndRemainingNode.getTwo();
		
		// We're on a divergence
		if (remainingNode != null) {
			Activity adapted = doSwitch(remainingNode);
			
			if (adapted != null) {
				sequence.precede(adapted);
			}
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
	private Pair<Sequence, Node> fillSequence(String id, String name, Node startingNode) {
		Node current = startingNode;
		Activity lastAdapted = null;
		Sequence sequence = new BasicSequence(id, name);
		
		while (current != null && ! (current instanceof Divergence)) {
			Activity adapted = doSwitch(current);
			
			if (adapted != null) {
				// The sequence has not been created yet -> initialize it with its root
				if (sequence.isEmpty()) {
					sequence = new BasicSequence(id, name, adapted);
				}
				// The sequence exist -> add a new activity at its tail
				else {
					// note: cannot be null here, no matter what Sonar says
					lastAdapted.precede(adapted);
				}
				// Prepare next iteration
				lastAdapted = adapted;
				current = current.hasSuccessors() ? current.getSuccessors().get(0) : null;
			}
		}
		return Tuples.pair(sequence, current);
	}
	
	@Override
	public Activity caseExternalTask(ExternalTask task) {
		ScriptingLanguage language = languages.get(task.getLanguageId());
		ScriptedActivity script = new BasicScriptedActivity(task.getId(), task.getName(), language, task.getScriptId());
		asInputs(task.getInputs()).forEach(script.inputs()::add);
		asOutputs(task.getOutputs()).forEach(script.outputs()::add);
		return script;
	}
	
	private List<Input> asInputs(EList<fr.kazejiyu.ekumi.specs.eds.Variable> variables) {
		return variables.stream()
						.map(this::asInput)
						.filter(Objects::nonNull)
						.collect(toList());
	}
	
	private Input asInput(fr.kazejiyu.ekumi.specs.eds.Variable variable) {
		// Input's characteristics that are going to be computed.
		String name = variable.getName();
		DataType<Object> datatype = null;
		Object value = null;
		
		datatype = datatypes.find(variable.getTypeId())
						    .orElseThrow(() -> new DataTypeNotFoundException(variable.getTypeId()));

		try {
			value = datatype.unserialize(variable.getValue());
			return new BasicInput(name, datatype, value);
		} 
		catch (DataTypeUnserializationException e) {
			Activator.warn(e, "Unable to set value of variable " + variable.getName() + ", setting value to default");
			return new BasicInput(name, datatype);
		}
	}
	
	private List<Output> asOutputs(EList<fr.kazejiyu.ekumi.specs.eds.Variable> variables) {
		return variables.stream()
						.map(this::asOutput)
						.filter(Objects::nonNull)
						.collect(toList());
	}
	
	private Output asOutput(fr.kazejiyu.ekumi.specs.eds.Variable variable) {
		// Input's characteristics that are going to be computed.
		String name = variable.getName();
		DataType<Object> datatype = null;
		Object value = null;
		
		datatype = datatypes.find(variable.getTypeId())
						    .orElseThrow(() -> new DataTypeNotFoundException(variable.getTypeId()));

		try {
			value = datatype.unserialize(variable.getValue());
			return new BasicOutput(name, datatype, value);
		} 
		catch (DataTypeUnserializationException e) {
			Activator.warn(e, "Unable to set value of variable " + variable.getName() + ", setting value to default");
			return new BasicOutput(name, datatype);
		}
	}
	
	@Override
	public Activity caseParallelSplit(fr.kazejiyu.ekumi.specs.eds.ParallelSplit spec) {
		Synchronization sync = null;
		List<Activity> branches = new ArrayList<>();
		
		for (int i = 0; i < spec.getSuccessors().size(); i++) {
			Node successor = spec.getSuccessors().get(i);
			Node next = successor;

			Activity firstActivity = doSwitch(successor);
			Sequence branch = new BasicSequence("split_" + firstActivity.id(), "Branch " + firstActivity.name(), firstActivity);
			
			Activity previousActivity = firstActivity;
			while (next.hasSuccessors()) {
				next = next.getSuccessors().get(0);
				
				if (next instanceof Synchronization) {
					sync = (Synchronization) next;
					break;
				}
				Activity nextActivity = doSwitch(next);
				nextActivity.succeed(previousActivity);
				previousActivity = nextActivity;
			}
			
			branches.add(branch);
		}
		ParallelSplit split = new BasicParallelSplit("", "", branches);
		if (sync != null) {
			Activity synchronize = doSwitch(sync);
			
			if (synchronize != null) {
				split.precede(synchronize);
			}
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
