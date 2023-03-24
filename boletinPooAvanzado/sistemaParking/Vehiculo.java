package sistemaParking;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo implements Comparable<Vehiculo>{

	private String marca;
	private String modelo;
	private String matricula;
	private LocalDateTime fechaEntrada;
	private Combustible combus;
	private TipoVehiculo tipoVehi;
	
	public Vehiculo(String marca, String modelo, String matricula, LocalDateTime fechaEntrada, Combustible combus,
			TipoVehiculo tipoVehi) throws Exception {
		super();
		this.marca = marca;
		this.modelo = modelo;
		int contador=0;
		for(int i=0;i<matricula.length()-1;i++) {
			if(Character.isDigit(matricula.charAt(i))) {
				contador++;
			}
		}
		if(contador<4||matricula.length()>8) {
			throw new Exception("La matricula debe tener minimo 8 caracteres con minimo 4 digitos.");
		}else {
			this.matricula = matricula;
		}
				
		this.fechaEntrada = fechaEntrada;
		this.combus = combus;
		this.tipoVehi = tipoVehi;
	}	
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	public Combustible getCombus() {
		return combus;
	}

	public TipoVehiculo getTipoVehi() {
		return tipoVehi;
	}

	@Override
	public String toString() {
		return "Marca " + marca + ", modelo " + modelo + ", matricula " + matricula + ", fecha de entrada "
				+ fechaEntrada + ", combustible " + combus + ", tipo de vehiculo"  + tipoVehi + ".";
	}
	
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Vehiculo) 
				&& Objects.equals(this.matricula, ((Vehiculo) obj).matricula));
	}
	
	@Override
	public int compareTo(Vehiculo v) {
		return this.fechaEntrada.compareTo(v.fechaEntrada);
	}
	
}
