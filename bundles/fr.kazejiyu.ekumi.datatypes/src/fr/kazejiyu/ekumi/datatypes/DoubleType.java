package fr.kazejiyu.ekumi.datatypes;

import static java.lang.Double.parseDouble;

import fr.kazejiyu.ekumi.core.datatypes.DataType;
import fr.kazejiyu.ekumi.core.datatypes.exceptions.DataTypeUnserializationException;

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
		try {
			return parseDouble(representation);
			
		} catch(NumberFormatException e) {
			throw new DataTypeUnserializationException("Unable to create a Double from the representation: \"" + representation + "\"", e);
		}
	}

}
