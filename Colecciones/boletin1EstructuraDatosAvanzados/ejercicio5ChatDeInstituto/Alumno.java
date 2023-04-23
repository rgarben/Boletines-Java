package boletin1EstructuraDatosAvanzados.ejercicio5ChatDeInstituto;

import java.time.LocalDate;

public class Alumno extends Persona<Object> {

	public Alumno(String nombre, LocalDate fechaNacimiento) {
		super(nombre, fechaNacimiento);
	}

	@Override
	protected void enviarMensaje(Persona<?> p, String mensaje) throws Exception {

		if(p!=null && mensaje!=null && p instanceof Alumno && this.calcularEdad()>=MAYORDEDAD) {
			p.registrarMensaje(this, mensaje);
		}else if(p!=null && mensaje!=null && p instanceof Profesor) {
			p.registrarMensaje(this, mensaje);
		}else {
			throw new Exception("Al ser menor de edad solo puedes enviar a Profesores");
		}
		
	}

}
