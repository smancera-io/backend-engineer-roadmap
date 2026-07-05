import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Predicate<Persona> mayorEdad = persona -> persona.getAge() > 18;
        Function<List<Persona>, List<String>> listaEmail = lista -> lista.stream().map(Persona::getEmail)
                .collect(Collectors.toList());
    }
}