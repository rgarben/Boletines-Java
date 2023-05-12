
package feriaSevilla;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import feriaSevilla.model.Caseta;
import feriaSevilla.model.EscribirJson;
import feriaSevilla.model.LectorXMLcasetas;

public class MenuFeria {

	public static void main(String[] args) {

		
		List<Caseta> casetas = new LectorXMLcasetas().cargarDatos(".\\src\\feriaSevilla\\xml\\casetasferia.xml");
		
		/*for (Caseta c : casetas) {
			
			if(c!=null) {
				System.out.println(c.toString());
			}
			
		}*/
		
		//System.out.println(mostrarCasetasDeUnaCalle(casetas,"PASCUAL MARQUEZ"));
		
		//System.out.println(mostrarCasetasFamiliares(casetas));
		
		//System.out.println(mostrarCasetasDistrito(casetas));
		
		//System.out.println(mostrarCasetasQueNoSeanDistritoFamiliar(casetas));
		
		//System.out.println(mostrarNumeroCasetasFamiliaresPorCalle(casetas));
		
		//System.out.println(mostrarNumeroCasetasDistritoPorCalle(casetas));
		
		//System.out.println(eliminarCaseta(casetas,"PASCUAL MARQUEZ","111"));
		
		Scanner sc = new Scanner(System.in);
		
		String opcion = "",calle="",numero="";
		
		new EscribirJson().cargarCasetas(".\\src\\feriaSevilla\\xml\\casetas.json");
		
		new EscribirJson().escribirCasetas(casetas);
		
		String menu="1. Mostrar todas las casetas existentes en una calle.\n"
				+ "2. Mostrar todas las casetas de tipo familiar.\n"
				+ "3. Mostrar todas las casetas de tipo Distrito.\n"
				+ "4. Mostrar todas las casetas que no sean ni familiares ni distritos.\n"
				+ "5. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo familiar.\n"
				+ "6. Mostrar para cada una de las calles del recinto ferial el número de casetas de tipo Distrito.\n"
				+ "7. Eliminar una caseta.\n"
				+ "8. Salir.";
		
		do {
			
			System.out.println(menu);
			
			System.out.println("Inserte opcion del menu: \n");
			
			opcion = sc.nextLine();			
			
			switch (opcion) {
			case "1":
				System.out.println("Inserte nombre de la calle: \n");
				calle = sc.nextLine();
				System.out.println(mostrarCasetasDeUnaCalle(casetas,calle));
				break;
			case "2":
				System.out.println(mostrarCasetasFamiliares(casetas));
				break;

			case "3":
				System.out.println(mostrarCasetasDistrito(casetas));
				break;

			case "4":
				System.out.println(mostrarCasetasQueNoSeanDistritoFamiliar(casetas));
				break;

			case "5":
				System.out.println(mostrarNumeroCasetasFamiliaresPorCalle(casetas));
				break;

			case "6":
				System.out.println(mostrarNumeroCasetasDistritoPorCalle(casetas));
				break;

			case "7":
				System.out.println("Inserte nombre de la calle: \n");
				calle = sc.nextLine();
				System.out.println("Inserte numero de la caseta: \n");
				numero = sc.nextLine();
				try {
					System.out.println(eliminarCaseta(casetas,calle,numero));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case "8":
				System.out.println("Programa terminado");
				break;
				
			default:
				
				System.out.println("Opcion del menu no valida");
				
				break;
			}
			
		}while(!opcion.equalsIgnoreCase("8"));
		
	}
	
	//<>
	
	public static String mostrarCasetasDeUnaCalle(List<Caseta> listaCasetas, String calle){
		
		StringBuilder sb = new StringBuilder();
		
		calle=calle.toUpperCase();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && caseta.getCalle().equalsIgnoreCase(calle)) {
				sb.append(caseta.toString()+"\n");
			}
			
		}
		
		return sb.toString();		
	}
	
	public static String mostrarCasetasFamiliares(List<Caseta> listaCasetas){
		
		StringBuilder sb = new StringBuilder();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && caseta.getClase().equalsIgnoreCase("FAMILIAR")) {
				sb.append(caseta.toString()+"\n");
			}
			
		}
		
		return sb.toString();		
	}
	
	public static String mostrarCasetasDistrito(List<Caseta> listaCasetas){
		
		StringBuilder sb = new StringBuilder();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && caseta.getClase().equalsIgnoreCase("DISTRITO")) {
				sb.append(caseta.toString()+"\n");
			}
			
		}
		
		return sb.toString();		
	}
	
	public static String mostrarCasetasQueNoSeanDistritoFamiliar(List<Caseta> listaCasetas){
		
		StringBuilder sb = new StringBuilder();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && !caseta.getClase().equalsIgnoreCase("DISTRITO") && !caseta.getClase().equalsIgnoreCase("FAMILIAR")) {
				sb.append(caseta.toString()+"\n");
			}
			
		}
		
		return sb.toString();		
	}
	
	//<>
	
	public static String mostrarNumeroCasetasFamiliaresPorCalle(List<Caseta> listaCasetas){
		
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> numeroCasetas = new HashMap<>();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && caseta.getClase().equalsIgnoreCase("FAMILIAR") && !numeroCasetas.containsKey(caseta.getCalle())) {
				numeroCasetas.put(caseta.getCalle(), 1);
			}else if(caseta!=null && caseta.getClase().equalsIgnoreCase("FAMILIAR") && numeroCasetas.containsKey(caseta.getCalle())){
				numeroCasetas.put(caseta.getCalle(), numeroCasetas.get(caseta.getCalle())+1);
			}
		}
		
		for (Entry<String, Integer> calle : numeroCasetas.entrySet()) {
			
			if(calle!=null) {
									
					sb.append("Calle: "+calle.getKey() + ", Nº Casetas Familiares: "+calle.getValue()+"\n");
				
			}
			
		}
		
		return sb.toString();	
	}
	
	public static String mostrarNumeroCasetasDistritoPorCalle(List<Caseta> listaCasetas){
		
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> numeroCasetas = new HashMap<>();
		
		for (Caseta caseta : listaCasetas) {
			
			if(caseta!=null && caseta.getClase().equalsIgnoreCase("DISTRITO") && !numeroCasetas.containsKey(caseta.getCalle())) {
				numeroCasetas.put(caseta.getCalle(), 1);
			}else if(caseta!=null && caseta.getClase().equalsIgnoreCase("DISTRITO") && numeroCasetas.containsKey(caseta.getCalle())){
				numeroCasetas.put(caseta.getCalle(), numeroCasetas.get(caseta.getCalle())+1);
			}
		}
		
		for (Entry<String, Integer> calle : numeroCasetas.entrySet()) {
			
			if(calle!=null) {
									
					sb.append("Calle: "+calle.getKey() + ", Nº Casetas Distrito: "+calle.getValue()+"\n");
				
			}
			
		}
		
		return sb.toString();	
	}
	
	public static String eliminarCaseta(List<Caseta> listaCasetas, String calle, String numero) throws Exception {
		
		calle=calle.toUpperCase();
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Caseta> itCaseta = listaCasetas.iterator();
		
		Caseta aux= null;
		Caseta caseta=null;
		
		boolean borrada=false;
		
		while(itCaseta.hasNext() && !borrada) {
			
			caseta = itCaseta.next();			
			
			if(caseta.getCalle().equalsIgnoreCase(calle) && caseta.getNumero().equalsIgnoreCase(numero)) {
				listaCasetas.remove(caseta);
				borrada=true;
			}else if(borrada && caseta.getCalle().equalsIgnoreCase(calle)){
				
				aux=caseta;
				
				caseta.setNumero(String.valueOf((Integer.valueOf(caseta.getNumero()))-(Integer.valueOf(caseta.getModulos()))));
				
				listaCasetas.set(listaCasetas.indexOf(aux), caseta);
				
				sb.append(caseta.toString()+"\n");
			}else {
				sb.append(caseta.toString()+"\n");
			}
						
		}
		
		if(!borrada) {
			throw new Exception("La caseta no existe.");
		}
		
		return sb.toString();
	}
	
}
	
	