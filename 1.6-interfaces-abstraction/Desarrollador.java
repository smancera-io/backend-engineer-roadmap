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

    @Override
    public void asignarCurso(String curso) {
        
    }

    @Override
    public String evaluarDesempeño() {
        String message = "";
        if (salary / degreeBonus > 6){
            message = "Excelent performance you have obtained an extra bonus";
            salary += 200000;
        } else {
            message = "Good performance, keep working on your abilities";
        }
        return message;
    }
}
