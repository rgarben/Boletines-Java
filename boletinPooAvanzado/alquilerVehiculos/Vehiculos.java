package alquilerVehiculos;

import java.util.Objects;

public abstract class Vehiculos {
	
	private String matricula;
	private TipoVehiculo tipo;
	private Combustible combustible;
	private int plazas;
	private double peso;
	private GamaVehiculo gama;
	
	public Vehiculos(String matricula, TipoVehiculo tipo, Combustible combustible, int plazas, double peso, GamaVehiculo gama) {
		super();
		this.matricula = matricula;
		this.tipo = tipo;
		this.combustible = combustible;
		this.plazas = plazas;
		this.peso = peso;
		this.gama = gama;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	
	

	public int getPlazas() {
		return plazas;
	}

	public GamaVehiculo getGama() {
		return gama;
	}
	
	

	public Combustible getCombustible() {
		return combustible;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Vehiculos) 
				&& Objects.equals(this.matricula, ((Vehiculos) obj).matricula));
	}

	@Override
	public String toString() {
		return "Tipo de vehiculos " + tipo + "\nMatricula " + matricula + "\nCombustible " + combustible + "\nPlazas "
				+ plazas + "\nPeso " + peso + "\nGama "+ gama;
	}	
	
}
