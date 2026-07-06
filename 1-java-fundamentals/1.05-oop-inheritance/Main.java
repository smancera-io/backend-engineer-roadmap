import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Create empleados List */
        List <Empleado> empleados = new ArrayList<>();

        /* Initialize gerente objects */
        Gerente gerente1 = new Gerente("Daniel", 1, 3500000, 500000);
        Gerente gerente2 = new Gerente("Esteban", 2, 4500000, 390000);
        Gerente gerente3 = new Gerente("Samuel", 3, 3000000, 550000);
        Gerente gerente4 = new Gerente("Nicolas", 4, 2700000, 450000);
        Gerente gerente5 = new Gerente("Juan", 5, 3800000, 600000);

        /* Add gerente objects to empleados List */
        empleados.add(gerente1);
        empleados.add(gerente2);
        empleados.add(gerente3);
        empleados.add(gerente4);
        empleados.add(gerente5);

        /* Initialize desarrollador objects  */
        Desarrollador desarrollador1 = new Desarrollador("David", 6, 3500000, 500000);
        Desarrollador desarrollador2 = new Desarrollador("Carlos", 7, 4500000, 390000);
        Desarrollador desarrollador3 = new Desarrollador("Andres", 8, 2000000, 550000);
        Desarrollador desarrollador4 = new Desarrollador("Kamlio", 9, 2700000, 450000);
        Desarrollador desarrollador5 = new Desarrollador("Jesus", 10, 3800000, 600000);

        /* Add desarrollador objects to empleados list */
        empleados.add(desarrollador1);
        empleados.add(desarrollador2);
        empleados.add(desarrollador3);
        empleados.add(desarrollador4);
        empleados.add(desarrollador5);

        /* Print results of polymorphis */
        for (Empleado empleado : empleados) {
            if (empleado.getID() == 10){
                /* Use instanceof */
                if (empleado instanceof Desarrollador) {
                    Desarrollador desarrollador9 = (Desarrollador) empleado;
                    System.out.println(desarrollador9.getDegreeBonus());
                }
            }
            System.out.println(empleado.calculateSalary());
        }
    }
}
