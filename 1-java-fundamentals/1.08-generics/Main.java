import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Initialize a Caja class with String argument*/
        Caja<String> names = new Caja<>();

        /* Add String value */
        names.setItem("Samuel");

        /* Initialize a new Caja class with Integer argument */
        Caja<Integer> numbers = new Caja<>();

        /* Add Integer value */
        numbers.setItem(47);

        /* Print Cajas class values */
        System.out.println(names.getItem());
        System.out.println(numbers.getItem());

        /* Initialize a String List  */
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Samuel");
        listaNombres.add("Elena");
        listaNombres.add("Lucas");

        /* Use generic methods from Caja class with String values*/
        Caja.printItems(listaNombres);
        System.out.println(Caja.countItems(listaNombres));

        /* Use Caja class with Persona class */
        /* Initialize a Caja class with Persona argument (single instance) */
        Caja<Persona> persona = new Caja<>();

        /* Add Persona instance */
        persona.setItem(new Persona("Daniel", 322947889852L, "daniel@gmail.com", 52));

        /* Print Caja value */
        System.out.println(persona.getItem());

        /* Initialize a Persona List */
        List <Persona> personas = new ArrayList<>();
        personas.add(new Persona("Samuel", 3229455210L, "samuel@gmail.com", 19));
        personas.add(new Persona("Esteban",3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", 80));

        /* Use generics methods from Caja class with Persona values */
        Caja.printItems(personas);
        System.out.println(Caja.countItems(personas));
    }
}
