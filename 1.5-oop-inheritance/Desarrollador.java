public class Desarrollador extends Empleado {
    
    private double degreeBonus;

    public Desarrollador (String name, int ID, double salary, double degreeBonus) {
        super(name, ID, salary);
        this.degreeBonus = degreeBonus;
    }

    public double getDegreeBonus () {
        return degreeBonus;
    }

    @Override
    public double calculateSalary () {
        return salary + degreeBonus;
    }
}
