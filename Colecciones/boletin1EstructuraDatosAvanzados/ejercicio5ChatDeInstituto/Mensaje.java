package boletin1EstructuraDatosAvanzados.ejercicio5ChatDeInstituto;

import java.time.LocalDateTime;

public class Mensaje {

	Persona<?> perso;
	private String sms;
	private LocalDateTime fechaHora;
	private int numero;
	
	public Mensaje(Persona<?> perso, String sms) {
		super();
		this.perso = perso;
		this.sms = sms;
		this.fechaHora = LocalDateTime.now();
		this.numero = numero++;
	}

	@Override
	public String toString() {
		return "Mensaje numero: " + numero + "\nNombre: " + perso.getNombre() + "\nMensaje: " + sms + "\nFecha y hora: " + fechaHora;
	}
	
	public String getNombre() {
		return this.perso.getNombre();
	}

	public String getSms() {
		return sms;
	}
		
}
