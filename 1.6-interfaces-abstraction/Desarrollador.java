public class Desarrollador extends Empleado implements Evaluable, Capacitable {
    
    /* Add new class attribute */
    private double degreeBonus;

    /* Create super constructor method*/
    public Desarrollador (String name, int ID, double salary, double degreeBonus) {
        super(name, ID, salary);
        this.degreeBonus = degreeBonus;
    }

    /* Create getter methods */
    public double getDegreeBonus () {
        return degreeBonus;
    }

    /* Apply override to the father's method */
    @Override
    public double calculateSalary () {
        return salary + (degreeBonus * 1.5);
    }
}
