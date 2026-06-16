public class Desarrollador extends Empleado implements Evaluable, Capacitable {
    
    /* Add new class attributes */
    private double degreeBonus;
    private String curso;

    /* Create super constructor method*/
    public Desarrollador (String name, int ID, double salary, double degreeBonus) {
        super(name, ID, salary);
        this.degreeBonus = degreeBonus;
    }

    /* Create getter methods */
    public double getDegreeBonus () {
        return degreeBonus;
    }
    public String getCurso() {
        return curso;
    }

    /* Apply override to the father's method */
    @Override
    public double calculateSalary () {
        return salary + (degreeBonus * 1.5);
    }

    /* Implement a new method from interface capacitable */
    @Override
    public void asignarCurso(int indentifier) {
        switch (indentifier) {
            case 1:
                curso = "Opp degree";
                System.out.println("Curso oop asignado");
                break;
            case 2:
                curso = "Python degree";
                System.out.println("Curso python asignado");
                break;
            case 3:
                curso = "Spring boot degree";
                System.out.println("Curso spring boot asignado");
                break;
            default:
                System.out.println("Curso no encontrado");
                break;
        }
    }

    /* Implement a new method from interface Evaluable */
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
