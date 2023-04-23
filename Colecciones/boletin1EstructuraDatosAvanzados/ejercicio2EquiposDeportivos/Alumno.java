package boletin1EstructuraDatosAvanzados.ejercicio2EquiposDeportivos;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String dni;
	
	public Alumno(String nombre, String dNI) {
		super();
		this.nombre = nombre;
		this.dni = dNI;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Alumno a) 
				&& Objects.equals(this.dni, a.dni));
	}

	@Override
	public String toString() {
		return "Alumno: " + nombre + "\nDNI: " + dni;
	}
	
}
