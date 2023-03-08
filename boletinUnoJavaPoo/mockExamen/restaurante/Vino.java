package restaurante;

import java.util.Objects;

public class Vino {

	private String nombre;
	private double graduacion;
	
	
	public Vino(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Vino(String nombre, double graduacion) {
		super();
		this.nombre = nombre;
		this.graduacion = graduacion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getGraduacion() {
		return graduacion;
	}

	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Vino) 
				&& Objects.equals(this.nombre, ((Vino) obj).nombre));
	}
	
	public String toString() {
		return "Vino " + this.nombre + " con graduacion " + this.graduacion + ".";
	}
	
}
