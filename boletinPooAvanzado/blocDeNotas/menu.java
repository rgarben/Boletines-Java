package blocDeNotas;

import java.time.LocalDateTime;

import blocDeNotas.bloc.Bloc;
import blocDeNotas.bloc.BlocException;
import blocDeNotas.notas.Nota;
import blocDeNotas.notas.NotaAlarma;

public class menu {

	public static void main(String[] args) {

		Bloc b = new Bloc("Notitas");
		
		Nota pepe = new Nota("hola me llamo pepe");
		
		NotaAlarma pepe2 = new NotaAlarma("hola me llamo pepe con alamar", LocalDateTime.of(2023, 05, 13, 13, 30), 10);
		
		try {
			b.addNota(pepe);
			System.out.println(pepe);
			System.out.println("-----------------");
			System.out.println(pepe2);
			System.out.println("-----------------");
			System.out.println(b.getNota(0));
			b.updateNota(0, "texto cambio");
			System.out.println("-----------------");
			System.out.println(pepe);
		} catch (BlocException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
