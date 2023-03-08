package restaurante;

import java.util.Scanner;

public class menu {

	public static int buscarPlato(String nombre,Plato[] plato) {
        int posicion = -1;
        for (int i=0; i<plato.length; i++) {
            if(plato[i]!=null && plato[i].getNombre().equals(nombre)) {
                posicion=i;
            }
        }

        return posicion;
    }
		
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String opcion="";
		double precio=0;
		
		Plato[] menuPlatos = new Plato[20];
		int index=0;
		//<>
		
		do {
			
			System.out.println("Eliga una opcion del menu: \n"
			+ "1. Dar de alta un plato.\n"
			+ "2. Modificar el precio de un plato.\n"
			+ "3. Asignar un vino a un plato.\n"
			+ "4. Mostrar información de un plato.\n"
			+ "5. Mostrar información de todos los platos.\n"
			+ "6. Salir.");
			
			opcion = sc.nextLine();
			
			
			switch (opcion) {
			case "1":
				System.out.println("Introduzca el nombre del plato: ");
				opcion = sc.nextLine();
				System.out.println("Introduzca el precio del plato: ");
				precio = Double.valueOf(sc.nextLine());
				
				if (buscarPlato(opcion,menuPlatos)==-1) {
					menuPlatos[index%menuPlatos.length]= new Plato(opcion,precio);
					index++;
				}else {
					System.out.println("El plato ya existe.");
				}
				
				break;
			case "2":
				
				System.out.println("Introduzca el nombre del plato: ");
				opcion = sc.nextLine();
				System.out.println("Introduzca el precio nuevo del plato: ");
				precio = Double.valueOf(sc.nextLine());
				
				if (buscarPlato(opcion,menuPlatos)!=-1) {
					menuPlatos[buscarPlato(opcion,menuPlatos)].setPrecio(precio);
				}else {
					System.out.println("El plato no existe.");
				}
				
				break;
			case "3":
				
				System.out.println("Introduzca el nombre del plato: ");
				String nombre = sc.nextLine();
				
				if (buscarPlato(nombre,menuPlatos)!=-1 && menuPlatos[0]!=null) {
					System.out.println("Introduzca el nombre del vino: ");
					String nombreVino = sc.nextLine();
					System.out.println("Introduzca el grado del vino: ");
					double precioVino = Double.valueOf(sc.nextLine());
					menuPlatos[buscarPlato(nombre,menuPlatos)].setVinoRecomendado(nombreVino,precioVino);
				}else {
					System.out.println("El plato no existe.");
				}

				break;
			case "4":
				System.out.println("Introduzca el nombre del plato: ");
				nombre = sc.nextLine();			
				if (buscarPlato(nombre,menuPlatos)!=-1 && menuPlatos[buscarPlato(nombre,menuPlatos)]!=null) {
					System.out.println(menuPlatos[buscarPlato(nombre,menuPlatos)]);
				}else {
					System.out.println("El plato no existe.");
				}
				break;
			case "5":
				for(Plato p: menuPlatos) {
					if(p!=null) {
						System.out.println(p);
					}
				}
				break;
			case "6":
				System.out.println("Saliendo del programa.");
				break;
	
			default:
				break;
			}	
		}while(!opcion.equalsIgnoreCase("6"));
		sc.close();		
	}

}
