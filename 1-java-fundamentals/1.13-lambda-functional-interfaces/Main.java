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
        /* Predicate method reference to filter by age */
        Predicate<Persona> mayorEdadReference = Persona::esMayor;

        /* Function lambda to get a List of emails */
        Function<List<Persona>, List<String>> listaEmailLambda = lista -> lista.stream()
                .map(persona -> persona.getEmail())
                .collect(Collectors.toList());
        /* Function method reference to get a List of emails */
        Function<List<Persona>, List<String>> listaEmailReference = lista -> lista.stream().map(Persona::getEmail)
                .collect(Collectors.toList());

        /* Consumer lambda to print a person */
        Consumer<Persona> imprimirPersonaLambda = persona -> System.out.println(persona);
        /* Consumer method reference to print a person */
        Consumer<Persona> imprimirPersonaReference = System.out::println;

        /* Supplier lambda to create a default instance */
        Supplier<Persona> crearDefaultPersonaLambda = () -> new Persona("Samuel", 3559633152L, "samuel@gmail.com", 20);
        /* Sipplier method reference to create a default instance */
        Supplier<Persona> crearDefaultPersonaReference = Persona::new;

        /* Create a LinkedList of Persona class */
        List<Persona> personas = new LinkedList<>();

        /* Add values to LinkedList */
        personas.add(new Persona("Andres", 3229455210L, "andres@gmail.com", 19));
        personas.add(new Persona("Esteban", 3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", 50));

        /* Use Predicate lambda */
        int mayores = 0;
        int menores = 0;
        for (Persona persona : personas) {
            if (mayorEdadLambda.test(persona)) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("Lambda results");
        System.out.println("Personas mayores: " + mayores);
        System.out.println("Personas menores: " + menores);

        /* Use Predicate Method Reference */
        int mayoresReference = 0;
        int menoresReference = 0;
        for (Persona persona : personas) {
            if (mayorEdadReference.test(persona)) {
                mayoresReference++;
            } else {
                menoresReference++;
            }
        }
        System.out.println("Reference results");
        System.out.println("Personas mayores: " + mayoresReference);
        System.out.println("Personas menores: " + menoresReference);

        /* Use Function Lambda and Method Reference */
        System.out.println("===================");
        System.out.print("Lambda emails: ");
        System.out.println(listaEmailLambda.apply(personas));
        System.out.print("Reference emails: ");
        System.out.println(listaEmailReference.apply(personas));

        /* Use Consumer Lambda and Method Reference */
        System.out.println("===================");
        System.out.print("Persona lambda: ");
        imprimirPersonaLambda.accept(personas.get(1));
        System.out.print("Persona reference: ");
        imprimirPersonaReference.accept(personas.get(1));

        /* Use Supplier Lambda and Method Reference */
        System.out.println("===================");
        System.out.println(crearDefaultPersonaLambda.get());
        System.out.println(crearDefaultPersonaReference.get());
    }
}