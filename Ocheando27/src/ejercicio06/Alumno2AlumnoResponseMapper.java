package ejercicio06;

public class Alumno2AlumnoResponseMapper {

	public static AlumnoResponse convert(Alumno alumno) {
		return new AlumnoResponse(alumno.getNombre(), alumno.getMateriasSuspensas());
	}
}
