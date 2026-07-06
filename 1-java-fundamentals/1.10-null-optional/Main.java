import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        /* Create List personas */
        List<Persona> personas = new ArrayList<>();

        /* Add values to personas */
        personas.add(new Persona("Samuel", 3229455210L, "samuel@gmail.com", 19));
        personas.add(new Persona("Esteban", 3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", null));

        /* Use method with Optional thing */
        Optional<Persona> personaEncontrada = Persona.buscarPersonaPorNombre("Samuel", personas);
        if (personaEncontrada.isPresent()) {
            System.out.println("El usuario exisite");
        }

        /* User .orElse() */
        Persona persOptional = Persona.buscarPersonaPorNombre("Antonio", personas)
                .orElse(new Persona("Anonimo", 0, null, 0));
        System.out.println("Sesion iniciada con " + persOptional);

        /* Use .orElseThrow() inside a tryCatch */
        try {
            Persona personaGet = Persona.buscarPersonaPorNombre("Andres", personas).orElseThrow();
            System.out.println("Sesion ingresada con: " + personaGet);
        } catch (NoSuchElementException e) {
            System.out.println("Persona no encontrada finalizando intento de sesion.");
        }

        /* Use .map to get persona's email */
        System.out.println(personaEncontrada.map(persona -> persona.getEmail()));

        /* Show NullPointerException in wrapper classes */
        try {
            for (Persona persona2 : personas) {
                int edad = persona2.getAge();
                System.out.println(edad);
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Edad nula " + e);
        }
    }
}