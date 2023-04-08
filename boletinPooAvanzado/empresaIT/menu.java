package empresaIT;

import java.time.LocalDate;

import empresaIT.empresa.BackendProgrammer;
import empresaIT.empresa.Empresa;
import empresaIT.empresa.FullStackDeveloper;
import empresaIT.empresa.WebDesigner;

public class menu {

	public static void main(String[] args) {

		Empresa empre = new Empresa();

        try {
            FullStackDeveloper empleado1 = new FullStackDeveloper(LocalDate.of(1992, 03, 13),"63763644B", "Pepe", "Cuevas", "FULLTIME",false);
            BackendProgrammer empleado2 = new BackendProgrammer(LocalDate.of(1986, 10, 16), "85468542E", "Juan", "Maldonado", "PARTIAL",true);
            WebDesigner empleado3 = new WebDesigner(LocalDate.of(1976, 04, 9), "27654735P", "Antonio", "Pelayo", "PARTIAL",true);

            empre.addEmpleado(empleado1);
            empre.addEmpleado(empleado2);

            System.out.println(empleado1);
            System.out.println("---------------");
            System.out.println(empleado2.computeGrossSalary());

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
