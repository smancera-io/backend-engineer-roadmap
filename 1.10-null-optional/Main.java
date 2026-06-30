import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Samuel", 3229455210L, "samuel@gmail.com", 19));
        personas.add(new Persona("Esteban", 3299874562L, "esteban@gmail.com", 45));
        personas.add(new Persona("Juan", 3134896522L, "juan@gmail.com", 8));
        personas.add(new Persona("David", 3478963201L, "david@gmail.com", 15));
        personas.add(new Persona("Nicolas", 3967584123L, "nicolas@gmail.com", 80));

        Optional <Persona> personaEncontrada = Persona.buscarPersonaPorNombre("Samuel", personas);
        if (personaEncontrada.isPresent()){
            System.out.println("El usuario exisite");
        }

        Persona persOptional = Persona.buscarPersonaPorNombre("David", personas).orElse(new Persona("Anonimo", 0, null, 0));
        System.out.println("Sesion iniciada con " + persOptional);

        try {
            Persona personaGet = Persona.buscarPersonaPorNombre("Andres", personas).orElseThrow();
            System.out.println("Sesion intentada con: " + personaGet);
        } catch (NoSuchElementException e) {
            System.out.println("Persona no encontrada finalizando intento de sesion.");
        }
    }
}