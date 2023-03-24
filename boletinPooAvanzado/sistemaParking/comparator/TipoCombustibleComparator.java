package sistemaParking.comparator;

import java.util.Comparator;

import sistemaParking.Vehiculo;

public class TipoCombustibleComparator implements Comparator<Vehiculo> {

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {

		int resultado = 0;
		
		if(o1!=o2) {
			if(o1==null) {
				resultado=-1;
			}else if(o2==null){
				resultado=1;
			}else {
				resultado=o1.getTipoVehi().compareTo(o2.getTipoVehi())==0?
							o1.getCombus().compareTo(o2.getCombus()):
								o1.getTipoVehi().compareTo(o2.getTipoVehi());
			}
		}
		
		return resultado;
	}

	

}
