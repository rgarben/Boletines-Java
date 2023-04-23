package boletin1EstructuraDatosAvanzados.ejercicio5ChatDeInstituto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Persona<T> {

	protected static final int MAYORDEDAD=18;
	private String nombre;
	private LocalDate fechaNacimiento;
	private List<Mensaje> buzon;
	
	protected Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.buzon = new ArrayList<Mensaje>();
	}
	
	protected abstract void enviarMensaje(Persona<?> p, String mensaje) throws Exception;
	
	public void registrarMensaje(Persona<?> p, String mensaje) {
		this.buzon.add(new Mensaje(p, mensaje));
	}
	
	protected String leerMensajes() throws Exception {
		
		StringBuilder sb = new StringBuilder();
		
		if(!this.buzon.isEmpty()) {
			for (Mensaje mensaje : buzon) {
				sb.append(mensaje+"\n");
			}
		}else {
			throw new Exception("No tienes mensajes.");
		}
		
		return sb.toString();
		
	}
	
	protected String leerMensajesOrdenadosPorNombres() throws Exception {
		
		this.buzon.sort(new OrdenarPorNombre());
		
		return leerMensajes();
		
	}
	
	protected void borrarMensaje(int num) throws Exception {
		
		if(num<0 || num<this.buzon.size() || this.buzon.get(num)==null) {
			throw new Exception("El mensaje no existe.");
		}else {
			this.buzon.remove(num);
		}
				
	}

	protected String leerMensajesConFrase(String frase) {
		
		Iterator<Mensaje> it = this.buzon.iterator();
		
		StringBuilder sb = new StringBuilder();
		
		while(it.hasNext()) {
			if(it.next().getSms().contains(frase)) {
				sb.append(it+"\n");
			}
		}
		
		return sb.toString();
		
	}
	
	protected int calcularEdad() {
		
		return (int) ChronoUnit.YEARS.between(this.fechaNacimiento, LocalDate.now());
	}

	public String getNombre() {
		return nombre;
	}
		
}
