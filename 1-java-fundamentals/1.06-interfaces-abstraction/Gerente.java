public class Gerente extends Empleado implements Evaluable {

    /* Add new class attribute */
    private double manageBonus;

    /* Create super constructor method */
    public Gerente(String name, int ID, double salary, double manageBonus) {
        super(name, ID, salary);
        this.manageBonus = manageBonus;
    }

    /* Create getter methods */
    public double getManageBonus() {
        return manageBonus;
    }

    /* Apply override to the father's method */
    @Override
    public double calculateSalary() {
        return salary + manageBonus;
    }

    /* Implement a new method from interface Evaluable */
    @Override
    public String evaluarDesempeño() {
        String message = "";
        if (manageBonus >= 300000) {
            message = "Excelent performance";
        } else {
            message = "Good performance, keep working on your abilities";
        }
        return message;
    }
}
