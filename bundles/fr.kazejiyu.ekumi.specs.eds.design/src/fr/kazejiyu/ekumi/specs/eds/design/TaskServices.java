/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import fr.kazejiyu.ekumi.specs.eds.Convergence;
import fr.kazejiyu.ekumi.specs.eds.Divergence;
import fr.kazejiyu.ekumi.specs.eds.EdsFactory;
import fr.kazejiyu.ekumi.specs.eds.MultiChoice;
import fr.kazejiyu.ekumi.specs.eds.Node;
import fr.kazejiyu.ekumi.specs.eds.ParallelSplit;
import fr.kazejiyu.ekumi.specs.eds.SimpleMerge;
import fr.kazejiyu.ekumi.specs.eds.Synchronization;
import fr.kazejiyu.ekumi.specs.eds.Task;
import fr.kazejiyu.ekumi.specs.eds.Variable;

/**
 * Provides services related to {@link Task} for EKumi's workflow editor viewpoint.
 */
public class TaskServices {
	
	/**
	 * Returns whether the given node is either a {@link Convergence}
	 * or {@link Divergence} related to parallel processing.
	 * 
	 * @param node
	 * 			The node to check.
	 * 
	 * @return whether the given object is related to parallel processing
	 */
	public Boolean isParallel(Node node) {
		return node instanceof ParallelSplit
			|| node instanceof Synchronization;
	}
    
	/**
	 * Returns whether the given node is either a {@link Convergence}
	 * or {@link Divergence} related to conditional processing.
	 * 
	 * @param node
	 * 			The node to check.
	 * 
	 * @return whether the given object is related to conditional processing
	 */
	public Boolean isConditional(EObject node) {
		return node instanceof MultiChoice
			|| node instanceof SimpleMerge;
	}
	
	/**
	 * Removes the {@link Node#getSuccessors() successor link} represented by the given edge.
	 * 
	 * @param edge
	 * 			The edge representing the link to remove.
	 */
	public void unsetSuccessor(DEdge edge) {
		DSemanticDecorator source = ((DSemanticDecorator) edge.getSourceNode());
		DSemanticDecorator target = ((DSemanticDecorator) edge.getTargetNode());
		((Node) source.getTarget()).getSuccessors().remove((Node) target.getTarget());
	}
	
	/**
	 * Creates a new input in the given task.
	 * 
	 * @param task
	 * 			The task to which an input is added.
	 */
	public void createInput(Task task) {
		Variable newInput = EdsFactory.eINSTANCE.createVariable();
		newInput.setName("in " + task.getInputs().size());
		
		task.getInputs().add(newInput);
	}
	
	/**
	 * Creates a new output in the given task.
	 * 
	 * @param task
	 * 			The task to which an input is added.
	 */
	public void createOutput(Task task) {
		Variable newOutput = EdsFactory.eINSTANCE.createVariable();
		newOutput.setName("out " + task.getInputs().size());
		
		task.getOutputs().add(newOutput);
	}
	
}
