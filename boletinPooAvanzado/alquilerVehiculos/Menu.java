package alquilerVehiculos;

import java.util.Scanner;

public class Menu {
	
	
	public static void main(String[] args) {
		Empresa e = new Empresa("pepe");
		
		String matricula="";
		String tipoVehiculo="";
		String combustible="";
		int plazas=0;
		int peso=0;
		String gama="";
		int num=0;
		String matri="";
		int dias=0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			do {				

				System.out.println("--------------------");
				System.out.println("1. Alta de vehículo.");
				System.out.println("2. Cálculo de precio de alquiler.");
				System.out.println("3. Salir.");
				System.out.println("--------------------");
				
				System.out.println("Introduzca opcion del menu: \n");
				
				num = Integer.valueOf(sc.nextLine());
				
				switch (num) {
				case 1:
					
					System.out.println("Indodruzca matricula: \n");
					matricula = sc.nextLine();
					System.out.println("Indodruzca tipo de vehiculo - COCHE | FURGONETA | MICROBUS: \n");
					tipoVehiculo = sc.nextLine().toUpperCase();
					System.out.println("Indodruzca tipo de combustible - DIESEL | GASOLINA: \n");
					combustible = sc.nextLine().toUpperCase();
					System.out.println("Indodruzca numero de plazas: \n");
					plazas = Integer.valueOf(sc.nextLine());
					System.out.println("Indodruzca el peso: \n");
					peso = Integer.valueOf(sc.nextLine());
					System.out.println("Indodruzca gama - BAJA | MEDIA | ALTA: \n");
					gama = sc.nextLine().toUpperCase();
					
					if (tipoVehiculo.equalsIgnoreCase("COCHE")) {
						
						if(combustible.equalsIgnoreCase("DIESEL")) {
							
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
							
						}else if(combustible.equalsIgnoreCase("GASOLINA")) {
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
						}else {
							System.out.println("Tipo de combustible no valido.");
						}
						
					}else if (tipoVehiculo.equalsIgnoreCase("FURGONETA")) {
						if(combustible.equalsIgnoreCase("DIESEL")) {
							
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
							
						}else if(combustible.equalsIgnoreCase("GASOLINA")) {
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
						}else {
							System.out.println("Tipo de combustible no valido.");
						}
					}else if (tipoVehiculo.equalsIgnoreCase("MICROBUS")) {
						if(combustible.equalsIgnoreCase("DIESEL")) {
							
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.DIESEL, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
							
						}else if(combustible.equalsIgnoreCase("GASOLINA")) {
							if(gama.equalsIgnoreCase("BAJA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.BAJA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("MEDIA")) {
								
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.MEDIA);
								System.out.println("Vehiculo registrado.");
								
							}else if(gama.equalsIgnoreCase("ALTA")) {
								e.addVehiculo(matricula, tipoVehiculo, Combustible.GASOLINA, plazas, peso, GamaVehiculo.ALTA);
								System.out.println("Vehiculo registrado.");
							}else {
								System.out.println("Tipo de gama no valida.");
							}
						}else {
							System.out.println("Tipo de combustible no valido.");
						}
					}else {
						System.out.println("Tipo vehiculo no valido.");
					}				
					
					break;
				case 2:
					System.out.println("Introduzca numero de matricula.");
					matri = sc.nextLine();
					System.out.println("Introduzca numero de dias.");
					dias = Integer.valueOf(sc.nextLine());
					
					System.out.println("El precio seria: "+ e.alquilarVehiculo(matricula, dias));
					
					break;
	
				case 3:
					System.out.println("Programa terminado.");
					break;
				default:
					System.out.println("Opcion del menu no valida.");
					break;
				}
				
			}while(num!=3);
			
		} catch (exceptionAlquilerVehiculos e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}


}
