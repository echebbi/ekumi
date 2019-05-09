/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.core.execution.impl;

import static java.lang.Long.parseLong;

import java.sql.Date;

import fr.kazejiyu.ekumi.core.execution.FrozenExecution;
import fr.kazejiyu.ekumi.core.workflow.State;

/**
 * An execution persisted in a CSV file. 
 */
// TODO [TMP] Just a temporary class used to make the History view works,
//			  it should be replaced as soon as possible.
//			  All serialization-related stuff should be put in separated bundles
public class CsvFrozenExecution implements FrozenExecution {
	
	private final String id;
	
	private final String name;
	
	private final State state;
	
	private final Date startDate;
	
	public CsvFrozenExecution(String csv) {
		String[] parts = csv.split(";");
		this.id = parts[0];
		this.name = parts[1];
		this.state = State.valueOf(parts[2]);
		this.startDate = new Date(parseLong(parts[3]));
	}

	@Override
	public String id() {
		return id;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public State state() {
		return state;
	}
	
	@Override
	public Date startDate() {
		return startDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof CsvFrozenExecution)) {
			return false;
		}
		CsvFrozenExecution other = (CsvFrozenExecution) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (state != other.state) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CsvFreezedExecution [id=" + id + ", name=" + name + ", state=" + state + ", startDate=" + startDate + "]";
	}

}
