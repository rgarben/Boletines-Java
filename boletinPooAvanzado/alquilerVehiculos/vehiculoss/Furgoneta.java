package alquilerVehiculos.vehiculoss;

import alquilerVehiculos.Combustible;
import alquilerVehiculos.GamaVehiculo;
import alquilerVehiculos.TipoVehiculo;
import alquilerVehiculos.Vehiculos;

public class Furgoneta extends Vehiculos {

	public Furgoneta(String matricula, TipoVehiculo tipo, Combustible combustible, int plazas, double peso,
			GamaVehiculo gama) {
		super(matricula, tipo, combustible, plazas, peso, gama);
	}

}
