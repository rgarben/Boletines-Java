package alquilerVehiculos;

public enum Combustible {

	GASOLINA(3.5),
	DIESEL(2);
	
	private double combus;
	
	private Combustible(double combus) {
		this.combus=combus;
	}
	
	public double getCombustible(){
		return combus;
	}
	
}
