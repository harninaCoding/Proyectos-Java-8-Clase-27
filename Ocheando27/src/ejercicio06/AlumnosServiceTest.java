package ejercicio06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnosServiceTest {
	AlumnosService alumnosService;

	@Test
	void testGetNombreAlumnosAprobadosYMateriasSuspensas() {
		alumnosService=new AlumnosService();
		System.out.println(alumnosService.getNombreAlumnosAprobadosYMateriasSuspensas());
	}

}
