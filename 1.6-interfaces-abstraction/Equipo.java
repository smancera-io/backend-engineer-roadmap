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
}
