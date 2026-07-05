import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        /* Create LinkedList of Persona */
        List<Persona> personas = new LinkedList<>();

        /* Add values to LinkedList */
        personas.add(new Persona("Andres", 3229455210L, "andres@gmail.com", 19));
        personas.add(new Persona("Esteban", 3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", 50));

        /* .stream to filter by age, sort by name and create a new list */
        List<Persona> orderFilterByAge = personas.stream().filter(Persona::esMayor).sorted().toList();
        System.out.println(orderFilterByAge);

        /* Use groupingBy */
        Map <Boolean, List<Persona>> personasByLegalAge = personas.stream().collect(Collectors.groupingBy(Persona::esMayor));
        List<Persona> mayoresEdad = personasByLegalAge.get(true);
        List<Persona> menoresEdad = personasByLegalAge.get(false);
        System.out.println("Personas mayores de edad: " + mayoresEdad);
        System.out.println("Personas menores de edad: " + menoresEdad);

    }
}
