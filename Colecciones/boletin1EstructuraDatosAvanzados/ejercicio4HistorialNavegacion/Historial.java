package boletin1EstructuraDatosAvanzados.ejercicio4HistorialNavegacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Historial {
	
	private String id;
	private List<PaginaWeb> listaWeb;
	private List<PaginaWeb> historia;

	public Historial(String id) {
		super();
		this.id = id;
		this.historia = new ArrayList<PaginaWeb>();
	}
	
	public void nuevaVisita(PaginaWeb pw) {
		
		boolean visitada = false;
		
		for (PaginaWeb paginaWeb : listaWeb) {
			if(paginaWeb!=null && paginaWeb.equals(pw) && paginaWeb.getFechaHora().isBefore(LocalDateTime.now()) ) {
				visitada=true;
			}
		}
		
		if(visitada) {
			pw.setFechaHora();
			historia.add(pw);
		}
		
	}
	
	public String consultarHistorialCompleto() {
		
		StringBuilder sb = new StringBuilder();
		
		for (PaginaWeb paginaWeb : historia) {
			if(paginaWeb!=null) {
				sb.append(paginaWeb+"\n");
			}
		}
		return sb.toString();
	}
	
	public String consultarHistorialDeUnDia(LocalDate ld) {
		
		StringBuilder sb = new StringBuilder();
		Iterator <PaginaWeb> it = historia.iterator();
		
		while(it.hasNext()){
			PaginaWeb pw = it.next();
			if(pw.dameFecha().compareTo(ld)==0) {
				sb.append(pw);
			}
			
		}
		
		return sb.toString();
	}
	
	public void borrarHistorial() {
		this.historia.clear();
	}
	
	public void borrarHistorialDeUnaPaginaWeb(PaginaWeb pagina) {
		
		Iterator <PaginaWeb> it = historia.iterator();
		
		while(it.hasNext()){
			PaginaWeb pw = it.next();
			if(pw.equals(pagina)) {
				historia.remove(pw);
			}
			
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Historial e) 
				&& Objects.equals(this.id, e.id));
	}
	
}
