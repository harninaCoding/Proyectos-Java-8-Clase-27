package ejercicio06;

import java.util.List;
import java.util.stream.Collectors;

public class AlumnosRepository {
	private List<Alumno> alumnos;

	public AlumnosRepository() {
		super();
		alumnos = AlumnosOM.getAlumnos();
		}

//consultas genericas sobre alumnos
	public List<Alumno> findAlumnos(){
		return alumnos;
	}
	public List<Alumno> findAlumnosAprobados(){
		return alumnos.stream()
				.filter(Alumno::isAprobado)
				.collect(Collectors.toList());
	}
	public List<Alumno> findAlumnoByNombre(String nombre) {
		return alumnos.stream()
			.filter(alumno->alumno.isEqualsNombre(nombre))
			.collect(Collectors.toList());
	}

	
	public List<Alumno> findAlumnoByMateriaSuspensa(Materia materia){
		return alumnos.stream()
				.filter(alumno->!alumno.isMateriaAprobada(materia))
				.collect(Collectors.toList());
		//No tan bien por el uso de contains y tener x.x.x esta mal visto
//		return alumnos.stream()
//				.filter(alumno->alumno.getMateriasSuspensas().contains(materia))
//				.collect(Collectors.toList());
	}
}
