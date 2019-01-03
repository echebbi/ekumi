package fr.kazejiyu.ekumi.datatypes;

import fr.kazejiyu.ekumi.model.datatypes.DataType;

public class StringType implements DataType<String> {

	@Override
	public String getName() {
		return "String";
	}

	@Override
	public Class<String> getJavaClass() {
		return String.class;
	}

	@Override
	public String getDefaultValue() {
		return "";
	}

	@Override
	public String serialize(String instance) {
		return instance;
	}

	@Override
	public String unserialize(String representation) {
		return representation;
	}

}
