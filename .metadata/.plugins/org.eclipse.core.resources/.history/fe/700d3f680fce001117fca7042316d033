package groupingby07;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

class PersonaTest {
	List<Persona> personas = PersonaMother.createPersonas();
	@Test
	void test() {
		//clasificar por edad
		Map<Byte, List<Persona>> collect = personas.stream().collect(Collectors.groupingBy(Persona::getEdad));
		System.out.println(collect);
		//igual pero entregando un set
		Map<Byte, Set<Persona>> collect2 = personas.stream().collect(Collectors.groupingBy(Persona::getEdad,Collectors.toSet()));
		//si lo que hago es obtener un resumen
		Map<Byte, Long> collect3 = personas.stream()
				.collect(Collectors.groupingBy(Persona::getEdad,Collectors.counting()));
		 Map<Byte, Double> collect4 = personas.stream()
			.collect(Collectors.groupingBy(Persona::getEdad,Collectors.averagingDouble(Persona::getSaldo)));
		 // Agrupaciones anidadas
		 Map<Byte, Map<Categoria, List<Persona>>> collect5 = personas.stream()
				 .collect(Collectors.groupingBy(Persona::getEdad,Collectors.groupingBy(Persona::getCategoria)));
		 System.out.println();
		 
	}

}
