package ligafutbol.clasificacion;

public class Equipo {

	private String nombre;
	private String estadio;
	private String ciudad;
	private int victorias;
			
	public Equipo() {
		super();
	}

	public Equipo(String nombre, String estadio, String ciudad) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.ciudad = ciudad;
	}
	
	public void sumarVictorias() {
		this.victorias+=1;
	}
	
	@Override
	public boolean equals(Object obj) {	
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Equipo) {
			Equipo otroEquipo = (Equipo)obj;
			sonIguales= this.nombre.equals(otroEquipo.nombre);
		}
		return sonIguales;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getVictorias() {
		return victorias;
	}
	
	
	
}
