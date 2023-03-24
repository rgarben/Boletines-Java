package sistemaParking;

import java.time.LocalDateTime;

public class Menu {

	public static void main(String[] args) throws Exception {
		
		Parking p = new Parking();
				
		Vehiculo vehiculo1 = new Vehiculo("Opel", "a", "7636aytd", LocalDateTime.of(2005, 10, 13, 3, 43), Combustible.ELECTRICO, TipoVehiculo.AUTOMOVIL);
		Vehiculo vehiculo2 = new Vehiculo("Honda", "b", "2325askd", LocalDateTime.of(2007, 9, 3, 4, 52), Combustible.GASOIL, TipoVehiculo.CICLOMOTOR);
		Vehiculo vehiculo3 = new Vehiculo("Audi", "c", "8645asgf", LocalDateTime.of(2009, 7, 26, 5, 23), Combustible.HIBRIDO, TipoVehiculo.TRANSPORTECOLECTIVO);
		Vehiculo vehiculo4 = new Vehiculo("Nissan", "d", "1647askd", LocalDateTime.of(2012, 2, 16, 10, 32), Combustible.GASOLINA, TipoVehiculo.TRANSPORTEMERCANCIAS);
		Vehiculo vehiculo5 = new Vehiculo("Suziki", "e", "9467uskd", LocalDateTime.of(2021, 3, 11, 8, 43), Combustible.GASOIL, TipoVehiculo.AUTOMOVIL);
		
		try {
			Vehiculo vehiculo6 = new Vehiculo("Opel", "volao", "634try", LocalDateTime.now(), Combustible.GASOIL, TipoVehiculo.AUTOMOVIL);
		} catch (Exception e) {
			System.out.println(e);
		}
						
		p.aparcarCoche(vehiculo1);
		p.aparcarCoche(vehiculo2);
		p.aparcarCoche(vehiculo3);
		p.aparcarCoche(vehiculo4);
		p.aparcarCoche(vehiculo5);
		
		System.out.println(p.ordenarPorFechaHora());
		
		System.out.println(p.ordenarMarcaModelo());
		
		System.out.println(p.ordenarMatricula());
		
		System.out.println(p.ordenarTipoCumbustible());
		
		p.salirDelParking(vehiculo5);
		
	}

}
