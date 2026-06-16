public abstract class Empleado {

    /* Initialize attributes */
    protected String name;
    protected int ID;
    protected double salary;

    /* Create constructor method */
    public Empleado (String name, int ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    /* Create getter methods */
    public String getName () {
        return name;
    }
    public int getID () {
        return ID;
    }

    /* Modify and create abstract method */
    public abstract double calculateSalary ();

    /* Create setter methods */
    public void setName (String name){
        this.name = name;
    }
    public void setID (int ID) {
        this.ID = ID;
    }
    public void setSalary (double salary) {
        this.salary = salary;
    }
}
