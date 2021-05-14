package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.dominio.*;
import isi.died.parcial01.ejercicio02.dominio.Inscripcion.Estado;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();

	/*
	 * En la clase MySysAcadImpl implementar el metodo registrarNota para que:
Setear la nota en el examen.
Si la nota es 6 o superior,
buscar el alumno y actualizar la última inscripción a esta materia como PROMOCIONADA.
Luego agregar a la interface MySysAcad el método "List<Examen> topNExamenes(Alumno a,Integer n,Integer nota)" que lista los N exames del alumno donde obtuvo una nota mayor o igual al parametro nota.
La lista del punto 2 debe ordenarse de mayor a menor por la nota obtenida (puede resolverlo con lambda o con otro mecanismo de comparacion y puede agregar los métodos necesarios)
	 */

	private List<Materia> materia = new ArrayList<Materia>();
	List<Examen> e = new ArrayList<Examen>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		//DB.guardar(insc);
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	
	public void registrarNota(Examen e) {
		for(int i=0; i<alumnos.size(); i++) {
			
			if(alumnos.get(i).getNombre().equals(e.getAlumno().getNombre())) {
				alumnos.get(i).addExamen(e);
			}
			if(e.getNota()>=6) {
				alumnos.get(i).getMateriasCursadas().get(i).setEstado(Estado.PROMOCIONADO);
			}
		}
	}


	@Override
	public List<Examen> topNexamenes(Alumno a, Integer n, Integer nota) {
		
		if(nota>=6) {
			e.addAll(a.getExamenes());
		}
		return e;
	}
	
	public void ordenarMayorNota() {
		e.stream().sorted((n1, n2) -> n1.getNota().compareTo(n2.getNota())).collect(Collectors.toList());;
	}

}
