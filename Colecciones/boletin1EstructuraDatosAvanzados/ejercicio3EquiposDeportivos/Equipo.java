package boletin1EstructuraDatosAvanzados.ejercicio3EquiposDeportivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo<T> {

	private String nombreEquipo;
	private List<T> alumnos;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.alumnos = new ArrayList<T>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreEquipo);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Equipo e) 
				&& Objects.equals(this.nombreEquipo, e.nombreEquipo));
	}
		
	public void addAlumno(T a) throws Exception {
		
		boolean esta = false;
		
		for (T alumno : alumnos) {
			if(alumno!=null && alumno.equals(a)) {
				esta=true;
			}
		}
		
		if(!esta) {
			alumnos.add(a);
		}else {
			throw new Exception("El alumno ya existe.");
		}
		
	}
	
	public void deleteAlumno(T a) throws Exception {
		
		boolean esta = false;
		
		for (T alumno : alumnos) {
			if(alumno!=null && alumno.equals(a)) {
				esta=true;
			}
		}
		
		if(esta) {
			alumnos.remove(a);
		}else {
			throw new Exception("El alumno no existe.");
		}
		
	}
	
	public T buscarAlumno(T a) throws Exception {
		
		boolean esta = false;
		T b=null;
		
		for (T alumno : alumnos) {
			if(alumno!=null && alumno.equals(a)) {
				esta=true;
			}
		}
		
		if(esta) {
			b=a;
		}else {
			throw new Exception("El alumno no esta en el equipo.");
		}
		
		return b;
	}
	
	public Equipo unionEquipos(Equipo a) throws Exception {
		
		Equipo c = new Equipo("betis");
		
		for (T alumno : this.alumnos) {
			if(alumno!=null) {
				c.alumnos.add(alumno);
			}
		}
		
		for (T alumno2 : alumnos) {
			if(alumno2!=null && !alumno2.equals(c.buscarAlumno(alumno2))) {
				c.alumnos.add(alumno2);
			}
		}
		
		return c;
	}
	
	public Equipo interseccionEquipos(Equipo a) throws Exception {
		
		Equipo c = new Equipo("betis");
						
		for (T alumno2 : alumnos) {
			if(alumno2!=null && alumno2.equals(this.buscarAlumno(alumno2)) && alumno2.equals(a.buscarAlumno(alumno2))) {
				c.alumnos.add(alumno2);
			}
		}
		
		return c;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (T alumno : alumnos) {
			if(alumno!=null) {
				sb.append(alumno+"\n");
			}
		}
		
		return "Equipo: " + nombreEquipo + "\n" + sb.toString();
	}
		
}


