package blocDeNotas.notas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota implements Comparable<Nota>,Activable{

	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) {
		super();
		this.codigo = codigoSiguiente++;
		this.texto = texto;
		this.fechaCreacion = LocalDateTime.now();
		this.fechaUltimaModificacion = LocalDateTime.now();
	}

	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String tex) {
		this.fechaUltimaModificacion=LocalDateTime.now();
		this.texto=tex;
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}
	
	private boolean isModificado() {
		
		boolean modi=false;
		
		if(fechaCreacion!=null && fechaUltimaModificacion!=null && !fechaCreacion.equals(fechaUltimaModificacion)) {
			modi=true;
		}
		
		return modi;
	}
	
	private boolean isEmpty() {

		boolean vacio=false;
		
		if(this.texto!=null && this.texto.isEmpty()) {
			vacio=true;
		}
		
		return vacio;
	}
	
	private boolean isCreadoAnterior(Nota nota) {
		return this.fechaCreacion.isBefore(nota.getFechaCreacion());
	}
	
	private boolean isModificadoAnterior(Nota nota) {
		return this.fechaUltimaModificacion.isBefore(nota.getFechaCreacion());
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Nota) 
				&& Objects.equals(this.fechaCreacion, ((Nota) obj).fechaCreacion)
					&& Objects.equals(this.texto, ((Nota) obj).texto));
	}

	@Override
	public String toString() {
		return "Nota: " + texto + "\nFecha de creacion: " + fechaCreacion + "\nFecha de ultima modificacion: "
				+ fechaUltimaModificacion;
	}

	@Override
	public int compareTo(Nota o) {
		int resultado = 0;
		if(o.getTexto().compareTo(texto)==1) {
			resultado=1;
		}else if (!(o.getTexto().compareTo(texto)==-1)) {
			resultado=-1;
		}else if (o.getTexto().equalsIgnoreCase(texto)) {
			resultado=(o.getFechaCreacion().compareTo(this.fechaCreacion));
		}
				
		return resultado;
	}
	
	
	
}


