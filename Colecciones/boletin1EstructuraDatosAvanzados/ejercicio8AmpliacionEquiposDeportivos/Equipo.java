package boletin1EstructuraDatosAvanzados.ejercicio8AmpliacionEquiposDeportivos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Equipo {

	private String nombreEquipo;
	private List<Alumno> alumnos;
	private static final int MAYOREDAD=18;
	
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
	//<>
	public String listaJugadoresSexoMasculinoMayorEdad() {
		
		StringBuilder sb = new StringBuilder();
		
		this.alumnos.sort(new OrdenarPorEdad());
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null && alumno.getEdad()>=MAYOREDAD && alumno.getSexo().equalsIgnoreCase("H")) {
				sb.append(alumno+"\n");
			}
		}
		
		return sb.toString();
	}
	
	public boolean equipoFemenino() {
		
		int contador=0;
		boolean esFemenino=false;
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null && alumno.getSexo().equalsIgnoreCase("M") && contador<this.alumnos.size()) {
				contador++;
			}	
		}
		
		return contador==this.alumnos.size()?esFemenino=true:esFemenino;
	}
	
	public int numeroJugadoras() {
		
		int contador=0;
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null && alumno.getSexo().equalsIgnoreCase("M") && alumno.getEdad()>=MAYOREDAD && contador<this.alumnos.size()) {
				contador++;
			}	
		}
		
		return contador;
	}
		
	public int edadMayorJugadoras() {
		
		int aux=Integer.MIN_VALUE;
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null && alumno.getSexo().equalsIgnoreCase("M") && alumno.getEdad()>=MAYOREDAD && alumno.getEdad()>aux) {
				aux=alumno.getEdad();
			}	
		}
		
		return aux;
	}
	
	public Set<String> dniJugadoresMasculinoMayorEdad(){
		
		Set<String> dni = new HashSet<>();
		
		for (Alumno alum : alumnos) {
			if(alum!=null && alum.getSexo().equalsIgnoreCase("H") && alum.getEdad()<MAYOREDAD) {
				dni.add(alum.getDni());
			}
		}
		
		return dni;
	}
	
	public List<String> nombresJugadorasOrdenadasAsc(){
		
		List<String> nombres = new ArrayList<String>();
		
		for (Alumno alum : alumnos) {
			if(alum!=null && alum.getSexo().equalsIgnoreCase("M") && alum.getEdad()<MAYOREDAD) {
				nombres.add(alum.getNombre());
			}
		}
		
		nombres.sort(new OrdenarPorNombre());
		
		return nombres;
	}
	
	public boolean existeJugadoraMayorEdad() {
				
		boolean existe=false;
		
		for (Alumno alumno : alumnos) {
			if(alumno!=null && alumno.getSexo().equalsIgnoreCase("M") && alumno.getEdad()>=MAYOREDAD) {
				existe=true;
			}	
		}
		
		return existe;
	}
	
	public int numeroCiudadesDiferentes() {
		
		Set<String> ciudades = new HashSet<String>();
		
		for (Alumno alum : alumnos) {
			if(alum!=null) {
				ciudades.add(alum.getCiudad());
			}
		}
		
		return ciudades.size();
	}
	
}


