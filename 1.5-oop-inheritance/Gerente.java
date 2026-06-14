public class Gerente extends Empleado {

    private double manageBonus;

    public Gerente (String name, int ID, double salary, double manageBonus) {
        super(name, ID, salary);
        this.manageBonus = manageBonus;
    }

    public double getManageBonus () {
        return manageBonus;
    }

    @Override
    public double calculateSalary () {
        return salary + manageBonus;
    }
}
