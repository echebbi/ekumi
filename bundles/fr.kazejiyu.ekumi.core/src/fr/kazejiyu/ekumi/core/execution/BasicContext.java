package fr.kazejiyu.ekumi.core.execution;

import static java.util.Objects.requireNonNull;

import java.util.Optional;

import fr.kazejiyu.ekumi.model.exceptions.VariableNotFoundException;
import fr.kazejiyu.ekumi.model.execution.ExecutionStatus;
import fr.kazejiyu.ekumi.model.execution.events.Events;
import fr.kazejiyu.ekumi.model.workflow.Variable;
import fr.kazejiyu.ekumi.model.workflow.WorkflowFactory;
import fr.kazejiyu.ekumi.model.workflow.impl.ContextImpl;

class BasicContext extends ContextImpl {
	
	private final Events events;
	
	private final ExecutionStatus status;
	
	BasicContext(Events events, ExecutionStatus status) {
		super();
		this.events = requireNonNull(events, "Context cannot have null events");
		this.status = requireNonNull(status, "Context cannot have null execution status");
	}

	@Override
	public Events events() {
		return events;
	}

	@Override
	public ExecutionStatus execution() {
		return status;
	}

	@Override
	public boolean contains(String name) {
		return find(name).isPresent();
	}
	
	@Override
	public Variable get(String name) {
		Optional<Variable> variable = find(name);
		
		if (! variable.isPresent())
			throw new VariableNotFoundException("No variable named " + name + " exists in this context");
		
		return variable.get();
	}

	@Override
	public Optional<Variable> find(String name) {
		return getVariables().stream().filter(var -> var.getName().equals(name)).findAny();
	}

	@Override
	public void set(String name, Object value) {
		if (contains(name)) {
			find(name).ifPresent(var -> var.setValue(value));
		} else {
			Variable var = WorkflowFactory.eINSTANCE.createVariable();
			var.setName(requireNonNull(name));
			var.setValue(value);
			getVariables().add(var);
		}
	}

	@Override
	public void unset(String name) {
		find(name).ifPresent(var -> getVariables().remove(var));
	}
	
}
