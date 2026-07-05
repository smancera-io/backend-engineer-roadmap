import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        /* Predicate lambda to filter by age */
        Predicate<Persona> mayorEdadLambda = persona -> persona.getAge() > 18;
        Predicate<Persona> mayorEdadReference = Persona::esMayor;

        /* Function lambda to get a List of emails */
        Function<List<Persona>, List<String>> listaEmailLambda = lista -> lista.stream().map(persona -> persona.getEmail())
                .collect(Collectors.toList());
        Function<List<Persona>, List<String>> listaEmailReference = lista -> lista.stream().map(Persona :: getEmail)
                .collect(Collectors.toList());

        /* Consumer lambda to print each person */
        Consumer<Persona> imprimirPersona = persona -> System.out.println(persona);
        Consumer<Persona> imprimirPersonaReference = System.out :: println;

        /* Supplier lambda to create a default instance */
        Supplier<Persona> crearDefaultPersonaLambda = () -> new Persona("Samuel", 3559633152L, "samuel@gmail.com", 20);
        Supplier<Persona> crearDefaultPersonaReference = Persona :: new;

        List <Persona> personas = new LinkedList<>();
        personas.add(new Persona("Andres", 3229455210L, "andres@gmail.com", 19));
        personas.add(new Persona("Esteban", 3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", null));

        int mayores = 0;
        int menores = 0;
        for (Persona persona : personas) {
            if (mayorEdadLambda.test(persona)){
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Lambda results");
        System.out.println("Personas mayores: " + mayores);
        System.out.println("Personas menores: " + menores);

        int mayoresReference = 0;
        int menoresReference = 0;
        for (Persona persona : personas) {
            if (mayorEdadReference.test(persona)){
                mayoresReference++;
            } else {
                menoresReference++;
            }
        }
        System.out.println("Lambda results");
        System.out.println("Personas mayores: " + mayoresReference);
        System.out.println("Personas menores: " + menoresReference);

    }
}