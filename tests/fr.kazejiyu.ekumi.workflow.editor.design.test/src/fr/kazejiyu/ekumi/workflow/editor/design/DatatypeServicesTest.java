package fr.kazejiyu.ekumi.workflow.editor.design;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import fr.kazejiyu.ekumi.model.datatypes.DataType;
import fr.kazejiyu.ekumi.model.spec.SpecFactory;
import fr.kazejiyu.ekumi.model.spec.Variable;
import fr.kazejiyu.ekumi.tests.common.mock.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@DisplayName("A DatatypeServices")
public class DatatypeServicesTest implements WithAssertions {

	// Object to test
	DatatypeServices services;
	
	@BeforeEach
	void setup() {
		services = new DatatypeServices();
	}
	
	@Test @DisplayName("knows the name of a type")
	void knows_the_name_of_a_type(@Mock DataType<String> type) {
		when (type.getName()) .thenReturn("String");
		assertThat(services.name(type)).isEqualTo("String");
	}
	
	@ParameterizedTest 
	@MethodSource("emptyTypeId")
	@DisplayName("does not know the type of a variable without a typeId")
	void does_not_know_the_type_of_a_variable_without_a_typeId(String typeId) {
		Variable variable = SpecFactory.eINSTANCE.createVariable();
		variable.setTypeId(typeId);
		
		assertThat(services.getDatatype(variable)).isNull();
	}
	
	@Test @DisplayName("can set the type of a variable")
	void can_set_the_type_of_a_variable(@Mock DataType<String> type) {
		Variable variable = SpecFactory.eINSTANCE.createVariable();
		when (type.getId()) .thenReturn ("type.of.String");
		
		services.setDatatype(variable, type);
		
		assertThat(variable.getTypeId()).isEqualTo("type.of.String");
	}
	
	@SuppressWarnings("unused") // called by @MethodSource
	private static Stream<String> emptyTypeId() {
		return Stream.of("", null);
	}
	
}
