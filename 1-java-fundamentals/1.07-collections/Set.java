import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        
        /* Create a HashSet */
        HashSet <Persona> personasHash = new HashSet<>();

        /* Create a TreeSet */
        TreeSet <Persona> personasTree = new TreeSet<>();

        /* Create a LinkedHashSet */
        LinkedHashSet <Persona> personasLinkedHash = new LinkedHashSet<>();

        /* Add values to personasHash */
        personasHash.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasHash.add(new Persona("Juan", 3147522003L, "juan@gmail.com", 71));
        personasHash.add(new Persona("David", 3132599677L, "david@gmail.com", 32));
        personasHash.add(new Persona("Carlos", 3102554190L, "carlos@gmail.com", 48));
        personasHash.add(new Persona("Esteban", 3204599963L, "esteban@gmail.com",20));

        /* Add values to personasTree */
        personasTree.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasTree.add(new Persona("Esteban", 3204599963L, "esteban@gmail.com",20));
        personasTree.add(new Persona("Juan", 3147522003L, "juan@gmail.com", 71));
        personasTree.add(new Persona("David", 3132599677L, "david@gmail.com", 32));
        personasTree.add(new Persona("Carlos", 3102554190L, "carlos@gmail.com", 48));

        /* Add values to LinkedHashSet */
        personasLinkedHash.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasLinkedHash.add(new Persona("Esteban", 3204599963L, "esteban@gmail.com",20));
        personasLinkedHash.add(new Persona("Juan", 3147522003L, "juan@gmail.com", 71));
        personasLinkedHash.add(new Persona("David", 3132599677L, "david@gmail.com", 32));
        personasLinkedHash.add(new Persona("Carlos", 3102554190L, "carlos@gmail.com", 48));

        /* Add a duplicate value */
        personasHash.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasTree.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasLinkedHash.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));

        /* Print data structures */
        System.out.println("HashSet: " + personasHash);
        System.out.println("TreeSet: " + personasTree);
        System.out.println("LinkedHashSet: " + personasLinkedHash);
    }
}
