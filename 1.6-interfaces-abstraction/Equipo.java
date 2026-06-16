import java.util.ArrayList;
import java.util.List;

public class Equipo {

    List <Empleado> empleados = new ArrayList<>();

    public void addEmpleados (Empleado empleado) {
        empleados.add(empleado);
    }

    public void calculateEntireSalaries () {
        double totalSalaries = 0;
        for (Empleado empleado : empleados) {
            totalSalaries += empleado.calculateSalary();
        }
        System.out.println(totalSalaries);
    }

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
