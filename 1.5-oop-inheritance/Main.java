import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Empleado> empleados = new ArrayList<>();
        Gerente gerente1 = new Gerente("Daniel", 1, 3500000, 500000);
        Gerente gerente2 = new Gerente("Esteban", 2, 4500000, 390000);
        Gerente gerente3 = new Gerente("Samuel", 3, 3000000, 550000);
        Gerente gerente4 = new Gerente("Nicolas", 4, 2700000, 450000);
        Gerente gerente5 = new Gerente("Juan", 5, 3800000, 600000);
        empleados.add(gerente1);
        empleados.add(gerente2);
        empleados.add(gerente3);
        empleados.add(gerente4);
        empleados.add(gerente5);
    }
}
