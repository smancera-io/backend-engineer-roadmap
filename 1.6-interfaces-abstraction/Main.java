import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Create empleados List */
        Equipo equipo = new Equipo();

        /* Initialize gerente objects */
        Gerente gerente1 = new Gerente("Daniel", 1, 3500000, 500000);
        Gerente gerente2 = new Gerente("Esteban", 2, 4500000, 390000);
        Gerente gerente3 = new Gerente("Samuel", 3, 3000000, 550000);
        Gerente gerente4 = new Gerente("Nicolas", 4, 2700000, 450000);
        Gerente gerente5 = new Gerente("Juan", 5, 3800000, 600000);

        /* Add gerente objects to empleados List */
        equipo.addEmpleados(gerente1);
        equipo.addEmpleados(gerente2);
        equipo.addEmpleados(gerente3);
        equipo.addEmpleados(gerente4);
        equipo.addEmpleados(gerente5);

        /* Initialize desarrollador objects  */
        Desarrollador desarrollador1 = new Desarrollador("David", 6, 3500000, 500000);
        Desarrollador desarrollador2 = new Desarrollador("Carlos", 7, 4500000, 390000);
        Desarrollador desarrollador3 = new Desarrollador("Andres", 8, 2000000, 550000);
        Desarrollador desarrollador4 = new Desarrollador("Kamlio", 9, 2700000, 450000);
        Desarrollador desarrollador5 = new Desarrollador("Jesus", 10, 3800000, 600000);

        /* Add desarrollador objects to empleados list */
        equipo.addEmpleados(desarrollador1);
        equipo.addEmpleados(desarrollador2);
        equipo.addEmpleados(desarrollador3);
        equipo.addEmpleados(desarrollador4);
        equipo.addEmpleados(desarrollador5);

        /* Print results of polymorphis */
        equipo.calculateSingleSalaries();

        equipo.calculateEntireSalaries();
    }
}
