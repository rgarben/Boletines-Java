package blocDeNotas.notas;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable {

	private LocalDateTime fechaAlarma;
	private static final int MINUTOS_REPETIR_POR_DEFECTO=5;
	private int minutosRepetir;
	private boolean activado;
	
	public NotaAlarma(String texto, LocalDateTime fechaCreacion, boolean nose) {
		super(texto);
		this.fechaAlarma=fechaCreacion;
		minutosRepetir=MINUTOS_REPETIR_POR_DEFECTO;
		this.activado=nose;
	}
	public NotaAlarma(String texto, LocalDateTime fechaCreacion, int numero) {
		super(texto);
		this.fechaAlarma=fechaCreacion;
		this.minutosRepetir=numero;
	}
	
	private void setFechaAlarma(LocalDateTime fechaAlarma) {
		this.fechaAlarma=fechaAlarma;
	}

	public void activar() {
		
		this.activado=true;
		
	}
	
	public void desactivar() {
		
		this.activado=false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}
	@Override
	public String toString() {
		return super.toString()+"\nAlarma de la nota en: " + fechaAlarma + "\nRepetir cada " + minutosRepetir + " minutos";
	}


}
