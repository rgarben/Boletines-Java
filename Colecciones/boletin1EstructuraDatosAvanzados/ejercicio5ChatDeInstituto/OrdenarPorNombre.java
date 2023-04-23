package boletin1EstructuraDatosAvanzados.ejercicio5ChatDeInstituto;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Mensaje> {

	@Override
	public int compare(Mensaje o1, Mensaje o2) {
		int comparador=0;

        if(o1!=null && o2!=null) {
            comparador=o1.getNombre().compareTo(o2.getNombre());
        }else if(o1==null) {
            comparador=1;
        }else if(o2==null) {
            comparador=-1;
        }

        return comparador;
	}	
	
}
