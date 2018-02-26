package fr.kazejiyu.ekumi.datatypes;

import static java.lang.Double.parseDouble;

import fr.kazejiyu.ekumi.core.datatypes.DataType;

public class DoubleType implements DataType<Double> {

	@Override
	public String getName() {
		return "Double";
	}

	@Override
	public Class<Double> getJavaClass() {
		return Double.class;
	}

	@Override
	public Double getDefaultValue() {
		return 0d;
	}

	@Override
	public String serialize(Double instance) {
		return instance.toString();
	}

	@Override
	public Double unserialize(String representation) {
		return parseDouble(representation);
	}

}
