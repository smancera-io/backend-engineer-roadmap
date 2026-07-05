import java.util.function.Predicate;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Predicate <Persona> mayorEdad = persona -> persona.getAge() > 18;
    }
}