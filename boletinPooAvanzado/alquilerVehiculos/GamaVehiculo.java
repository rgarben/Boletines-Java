package alquilerVehiculos;

public enum GamaVehiculo {
	
	BAJA(30),
	MEDIA(40),
	ALTA(50);

	private double gama;
	
	private GamaVehiculo(int gama) {
		this.gama=gama;
	}
	
	public double getGama() {
		return gama;
	}
}
