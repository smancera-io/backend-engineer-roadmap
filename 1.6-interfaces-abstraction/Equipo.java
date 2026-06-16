import java.util.ArrayList;
import java.util.List;

public class Equipo {

    /* Inicialize empleados List */
    List <Empleado> empleados = new ArrayList<>();

    /* Create method to add instances to the list */
    public void addEmpleados (Empleado empleado) {
        empleados.add(empleado);
    }

    /* Create method to calculate the total cost of salaries */
    public void calculateEntireSalaries () {
        double totalSalaries = 0;
        for (Empleado empleado : empleados) {
            totalSalaries += empleado.calculateSalary();
        }
        System.out.println(totalSalaries);
    }

    /* Create method to calculate and print each salary */
    public void calculateSingleSalaries () {
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
