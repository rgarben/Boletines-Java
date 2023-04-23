package boletin1EstructuraDatosAvanzados.ejercicio8AmpliacionEquiposDeportivos;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int comparador=0;

        if(o1!=null && o2!=null) {
            comparador=o1.compareTo(o2);
        }else if(o1==null) {
            comparador=1;
        }else if(o2==null) {
            comparador=-1;
        }

        return comparador;
	}	
	
}
