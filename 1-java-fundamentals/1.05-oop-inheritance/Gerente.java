public class Gerente extends Empleado {

    /* Add new class attribute */
    private double manageBonus;

    /* Create super constructor method*/
    public Gerente (String name, int ID, double salary, double manageBonus) {
        super(name, ID, salary);
        this.manageBonus = manageBonus;
    }

     /* Create getter methods */
    public double getManageBonus () {
        return manageBonus;
    }

    /* Apply override to the father's method */
    @Override
    public double calculateSalary () {
        return salary + manageBonus;
    }
}
