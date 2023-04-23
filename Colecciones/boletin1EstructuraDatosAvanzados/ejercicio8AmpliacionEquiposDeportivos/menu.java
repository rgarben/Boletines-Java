package boletin1EstructuraDatosAvanzados.ejercicio8AmpliacionEquiposDeportivos;

public class menu {

	public static void main(String[] args) {

		Equipo betisB = new Equipo("BetisB");
		Equipo sevillaB = new Equipo("SevillaB");
		

		
		try {
			
			Alumno a = new Alumno("rafa", "82838492E", 19, 'H',"sevilla");
			Alumno b = new Alumno("cristina", "283828483V", 15, 'M',"cordoba");
			Alumno c = new Alumno("fran", "59437285Y", 18, 'H',"almeria");
			Alumno d = new Alumno("ana", "19346284P", 20, 'M',"huelva");
			Alumno f = new Alumno("beatriz", "38592847O", 16, 'M',"cadiz");
			Alumno x = new Alumno("gonzalo", "2145353I", 18, 'H',"malaga");
			
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
