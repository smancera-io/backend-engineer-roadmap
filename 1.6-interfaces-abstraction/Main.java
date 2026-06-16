public class Main {
    public static void main(String[] args) {
        /* Create Equipo instance */
        Equipo equipo = new Equipo();

        /* Initialize gerente objects */
        Gerente gerente1 = new Gerente("Daniel", 1, 3500000, 500000);
        Gerente gerente2 = new Gerente("Esteban", 2, 4500000, 390000);
        Gerente gerente3 = new Gerente("Samuel", 3, 3000000, 550000);
        Gerente gerente4 = new Gerente("Nicolas", 4, 2700000, 450000);
        Gerente gerente5 = new Gerente("Juan", 5, 3800000, 600000);

        /* Use addEmpleados method in order to add gerente objects in empleados list */
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

        /* Use addEmpleados method in order to add desarrollador objects in empleados list */
        equipo.addEmpleados(desarrollador1);
        equipo.addEmpleados(desarrollador2);
        equipo.addEmpleados(desarrollador3);
        equipo.addEmpleados(desarrollador4);
        equipo.addEmpleados(desarrollador5);

        /* Use method for printing each salary */
        equipo.calculateSingleSalaries();

        /* Use method for printing the total cost of salaries */
        equipo.calculateEntireSalaries();

        /* Use interfaces methods */
        desarrollador1.asignarCurso(2);
        System.out.println(desarrollador1.evaluarDesempeño());
        System.out.println(gerente1.evaluarDesempeño());
    }
}
