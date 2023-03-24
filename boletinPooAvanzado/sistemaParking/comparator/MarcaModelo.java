package sistemaParking.comparator;

import java.util.Comparator;

import sistemaParking.Vehiculo;

public class MarcaModelo implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {

		int resultado = 0;
		
		if(o1!=o2) {
			if(o1==null) {
				resultado=-1;
			}else if(o2==null){
				resultado=1;
			}else {
				resultado=o1.getMarca().compareTo(o2.getMarca())==0?
							o1.getModelo().compareTo(o2.getModelo()):
								o1.getMarca().compareTo(o2.getMarca());
			}
		}
		
		return resultado;
	}

}
