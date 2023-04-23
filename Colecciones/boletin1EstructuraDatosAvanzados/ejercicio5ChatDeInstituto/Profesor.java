package boletin1EstructuraDatosAvanzados.ejercicio5ChatDeInstituto;

import java.time.LocalDate;

public class Profesor extends Persona<Object> {

	public Profesor(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);		
	}

	@Override
	protected void enviarMensaje(Persona<?> p, String mensaje) throws Exception {

		if(p!=null && mensaje!=null) {
			p.registrarMensaje(this, mensaje);
		}else {
			throw new Exception("Persona o mensaje no valido");
		}
		
	}

}
