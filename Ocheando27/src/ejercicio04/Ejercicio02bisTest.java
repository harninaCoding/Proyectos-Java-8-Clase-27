package ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Ejercicio02bisTest {

	@Test
	void test() {
		System.out.println("testalterar");
		Ejercicio02bis bis=new Ejercicio02bis();
		bis.vehiculos.forEach(System.out::println);
		System.out.println("alterada");
		List<Vehiculo> alteraCollecion = bis.alteraCollecion();
		alteraCollecion.forEach(System.out::println);
		System.out.println("original");
		bis.vehiculos.forEach(System.out::println);
	}
	@Test
	void test2() {
		System.out.println("testSinalterar");
		Ejercicio02bis bis=new Ejercicio02bis();
		bis.vehiculos.forEach(System.out::println);
		System.out.println("alterada");
		bis.sinAlteraCollecion().forEach(System.out::println);
		System.out.println("original");
		bis.vehiculos.forEach(System.out::println);
	}

}
