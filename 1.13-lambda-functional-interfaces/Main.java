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
        Predicate<Persona> mayorEdadReference = Persona :: esMayor;

        /* Function lambda to get a List of emails */
        Function<List<Persona>, List<String>> listaEmail = lista -> lista.stream().map(persona -> persona.getEmail())
                .collect(Collectors.toList());

        /* Consumer lambda to print each person */
        Consumer<Persona> imprimirPersona = persona -> System.out.println(persona);

        /* Supplier lambda to create a default instance */
        Supplier<Persona> crearDefaultPersona = () -> new Persona("Samuel", 3559633152L, "samuel@gmail.com", 20);


    }
}