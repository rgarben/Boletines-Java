package boletin1EstructuraDatosAvanzados.ejercicio3EquiposDeportivos;

public class menu {

	public static void main(String[] args) {

		Equipo betisB = new Equipo("BetisB");
		Equipo sevillaB = new Equipo("SevillaB");
		

		
		try {
			
			Alumno a = new Alumno("rafa", "82838492E");
			Alumno b = new Alumno("cristina", "283828483V");
			Alumno c = new Alumno("fran", "59437285Y");
			Alumno d = new Alumno("gonzalo", "19346284P");
			Alumno f = new Alumno("alvaro", "38592847O");
			Alumno x = new Alumno("infiltrado", "2145353I");
			
			betisB.addAlumno(a);
			betisB.addAlumno(b);
			betisB.addAlumno(c);
			betisB.addAlumno(d);
			betisB.addAlumno(f);
			
			sevillaB.addAlumno(a);
			sevillaB.addAlumno(b);
			sevillaB.addAlumno(c);
			sevillaB.addAlumno(d);
			sevillaB.addAlumno(f);
			sevillaB.addAlumno(x);
			
			System.out.println(betisB.unionEquipos(sevillaB).toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
