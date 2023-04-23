package boletin1EstructuraDatosAvanzados.ejercicio8AmpliacionEquiposDeportivos;

import java.util.Comparator;

public class OrdenarPorEdad implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {

		int comparador=0;

        if(o1!=null && o2!=null) {
            comparador=o1.getEdad()-o2.getEdad();
        }else if(o1==null) {
            comparador=1;
        }else if(o2==null) {
            comparador=-1;
        }
      //<>
        return comparador;
	}	

}
