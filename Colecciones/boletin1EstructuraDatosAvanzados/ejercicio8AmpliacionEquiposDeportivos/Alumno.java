package boletin1EstructuraDatosAvanzados.ejercicio8AmpliacionEquiposDeportivos;

import java.util.Objects;

public class Alumno {

	private String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	
	
	
	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.sexo = sexo;
		this.ciudad = ciudad;
	}
	
	

	public String getDni() {
		return dni;
	}



	public String getNombre() {
		return nombre;
	}



	public int getEdad() {
		return edad;
	}



	public String getSexo() {
		return String.valueOf(this.sexo);
	}



	public String getCiudad() {
		return ciudad;
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
