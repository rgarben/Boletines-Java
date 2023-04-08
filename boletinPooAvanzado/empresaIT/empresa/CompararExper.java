package empresaIT.empresa;

import java.util.Comparator;

public class CompararExper implements Comparator<Candidate> {

	@Override
	public int compare(Candidate o1, Candidate o2) {
		
		int num=0;
		
		if(o1!=null && o2!=null ) {
			num=o1.getStartDate().compareTo(o2.getStartDate());
		}else if(o1==null) {
			num=1;
		}else if(o2==null) {
			num=-1;
		}
		
		return num;
	}

}
