package alquilerVehiculos;

import java.util.Objects;

import alquilerVehiculos.vehiculoss.Coche;
import alquilerVehiculos.vehiculoss.Furgoneta;
import alquilerVehiculos.vehiculoss.Microbus;

public class Empresa {
	//<>
	private static int NUMERO_MAXIMO_VEHICULOS=200;
	private Vehiculos[] garaje;
	private String nombre;
		
	public Empresa(String nombre) {
		super();
		this.garaje = new Vehiculos[NUMERO_MAXIMO_VEHICULOS];
		this.nombre = nombre;
	}

	public void addVehiculo(String matricula, String tipo, Combustible combustible, int plazas, double peso, GamaVehiculo gama) throws exceptionAlquilerVehiculos{
		
		boolean hueco = false;
		
		for(int i=0;!hueco&&i<NUMERO_MAXIMO_VEHICULOS;i++) {
			if(garaje[i]==null) {
				hueco=true;
				
				if(tipo.equalsIgnoreCase("FURGONETA")) {
					garaje[i]= new Furgoneta(matricula, TipoVehiculo.FURGONETA, combustible, plazas, peso, gama);
				}
				else if(tipo.equalsIgnoreCase("COCHE")) {
					garaje[i]= new Coche(matricula, TipoVehiculo.COCHE, combustible, plazas, peso, gama);
				}
				else if(tipo.equalsIgnoreCase("MICROBUS")) {
					garaje[i]= new Microbus(matricula, TipoVehiculo.MICROBUS, combustible, plazas, peso, gama);
				}
				
			}
		}
		
		if(!hueco) {
			throw new exceptionAlquilerVehiculos("Tipo de coche no valido o garaje lleno.");
		}
		
	}
	
	public double alquilarVehiculo(String matricula, int dias) {
		
		double precio=0;
		
		for(int i=0;i<NUMERO_MAXIMO_VEHICULOS;i++) {
			if(garaje[i]!=null && garaje[i].getMatricula().equalsIgnoreCase(matricula) && garaje[i] instanceof Furgoneta) {
				
				if(garaje[i].getGama().toString().equalsIgnoreCase("ALTA")) {
					precio= (GamaVehiculo.ALTA.getGama()*dias)+3500*0.5;
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("BAJA")) {
					precio= (GamaVehiculo.BAJA.getGama()*dias)+3500*0.5;
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("MEDIA")) {
					precio= (GamaVehiculo.MEDIA.getGama()*dias)+3500*0.5;
				}
								
			}
			else if(garaje[i]!=null && garaje[i].getMatricula().equalsIgnoreCase(matricula) && garaje[i] instanceof Coche) {
				
				if(garaje[i].getGama().toString().equalsIgnoreCase("ALTA")) {
					precio= (GamaVehiculo.ALTA.getGama()+(garaje[i].getCombustible().toString().equalsIgnoreCase("GASOLINA")?Combustible.GASOLINA.getCombustible():Combustible.DIESEL.getCombustible()))*dias;
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("BAJA")) {
					precio= (GamaVehiculo.BAJA.getGama()+(garaje[i].getCombustible().toString().equalsIgnoreCase("GASOLINA")?Combustible.GASOLINA.getCombustible():Combustible.DIESEL.getCombustible()))*dias;
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("MEDIA")) {
					precio= (GamaVehiculo.MEDIA.getGama()+(garaje[i].getCombustible().toString().equalsIgnoreCase("GASOLINA")?Combustible.GASOLINA.getCombustible():Combustible.DIESEL.getCombustible()))*dias;
				}
				
			}
			else if(garaje[i]!=null && garaje[i].getMatricula().equalsIgnoreCase(matricula) && garaje[i] instanceof Microbus) {
				
				if(garaje[i].getGama().toString().equalsIgnoreCase("ALTA")) {
					precio= (GamaVehiculo.ALTA.getGama()*dias)+(garaje[i].getPlazas()*5);
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("BAJA")) {
					precio= (GamaVehiculo.BAJA.getGama()*dias)+(garaje[i].getPlazas()*5);
				}
				else if(garaje[i].getGama().toString().equalsIgnoreCase("MEDIA")) {
					precio= (GamaVehiculo.MEDIA.getGama()*dias)+(garaje[i].getPlazas()*5);
				}
				
			}
		}
				
		return precio;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	@Override
	public boolean equals(Object obj) {
		return this==obj || (( obj!=null && obj instanceof Empresa) 
				&& Objects.equals(this.nombre, ((Empresa) obj).nombre));
	}

	
}
