package boletin1EstructuraDatosAvanzados.ejercicio2EquiposDeportivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private String nombreEquipo;
	private List<Alumno> alumnos;
	
	public Equipo(String nombreEquipo) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.alumnos = new ArrayList<Alumno>();
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
		
	public void addAlumno(Alumno a) throws Exception {
		
		boolean esta = false;
		
		for (Alumno alumno : alumnos) {
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
	
	public void deleteAlumno(Alumno a) throws Exception {
		
		boolean esta = false;
		
		for (Alumno alumno : alumnos) {
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
	
	public Alumno buscarAlumno(Alumno a) throws Exception {
		
		boolean esta = false;
		Alumno b=null;
		
		for (Alumno alumno : alumnos) {
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
		
		for (Alumno alumno : this.alumnos) {
			if(alumno!=null) {
				c.alumnos.add(alumno);
			}
		}
		
		for (Alumno alumno2 : a.alumnos) {
			if(alumno2!=null && !alumno2.equals(c.buscarAlumno(alumno2))) {
				c.alumnos.add(alumno2);
			}
		}
		
		return c;
	}
	
	public Equipo interseccionEquipos(Equipo a) throws Exception {
		
		Equipo c = new Equipo("betis");
				
		for (Alumno alumno2 : a.alumnos) {
			if(alumno2!=null && alumno2.equals(this.buscarAlumno(alumno2))) {
				c.alumnos.add(alumno2);
			}
		}
		
		return c;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null) {
				sb.append(alumno+"\n");
			}
		}
		
		return "Equipo: " + nombreEquipo + "\n" + sb.toString();
	}
		
}


