package boletin1EstructuraDatosAvanzados.ejercicio4HistorialNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class PaginaWeb {

	private String url;
	private LocalDateTime fechaHora;
	private LocalDateTime fechaHoraVisita;
	
	public PaginaWeb(String url) {
		super();
		this.url = url;
		this.fechaHora = LocalDateTime.now();
		this.fechaHoraVisita=null;
	}

	
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	
	public LocalDate dameFecha() {
				
		return this.fechaHoraVisita.toLocalDate();
	}



	public void setFechaHora() {
		this.fechaHoraVisita = LocalDateTime.now();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(url);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof PaginaWeb e) 
				&& Objects.equals(this.url, e.url));
	}

	@Override
	public String toString() {
		return "Pagina Web: " + url + "\nUltima visita: " + fechaHora;
	}
	
}
