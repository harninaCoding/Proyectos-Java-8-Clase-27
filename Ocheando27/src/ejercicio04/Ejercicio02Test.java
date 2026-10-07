package ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio02Test {

	@Test
	void testOmitirRepetidosConvencional() {
		Ejercicio02 instancia=new Ejercicio02();
		instancia.omitirRepetidosConvencional(instancia.getListQQ()).forEach(System.out::println);;
	}

}
