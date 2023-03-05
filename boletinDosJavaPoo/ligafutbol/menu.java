package ligafutbol;

import ligafutbol.clasificacion.Equipo;
import ligafutbol.clasificacion.Partido;

public class menu {

	public static void main(String[] args) {

		Equipo betis = new Equipo("Betis","Estadio Benito Villamarín","Sevilla");
		Equipo sevilla = new Equipo("Sevilla","Ramón Sánchez-Pizjuán","Sevilla");
		
		Partido derbi = new Partido(betis,sevilla,1);
		
		System.out.println(derbi);
		
		derbi.ponerResultado(derbi, "2-1");
		
		System.out.println(derbi);
		
		derbi.ponerResultado(derbi, "0-0");
		
		System.out.println(derbi);
		
		derbi.ponerResultado(derbi, "1-2");
		
		System.out.println(derbi);

	}

}
