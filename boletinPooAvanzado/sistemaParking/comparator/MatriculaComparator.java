package sistemaParking.comparator;

import java.util.Comparator;

import sistemaParking.Vehiculo;

public class MatriculaComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
				
		int resultado=0;
		if(o1!=null && o2!=null) {
			resultado=o1.getMatricula().compareTo(o2.getMatricula());
		}else if(o1==null) {
			resultado=-1;
		}else {
			resultado=1;
		}
					
		return resultado;
	}

}
