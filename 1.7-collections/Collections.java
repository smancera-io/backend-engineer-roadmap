import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {

    public static void main(String[] args) {
        
        /* Create ArrayList */
        ArrayList <Persona> personasArray = new ArrayList<>();

        /* Create LinkedList */
        LinkedList <Persona> personasLinked = new LinkedList<>();

        /* Add personasArray values */
        personasArray.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasArray.add(new Persona("Esteban", 3204599963L, "esteban@gmail.com",20));
        personasArray.add(new Persona("Juan", 3147522003L, "juan@gmail.com", 71));
        personasArray.add(new Persona("David", 3132599677L, "david@gmail.com", 32));
        personasArray.add(new Persona("Carlos", 3102554190L, "carlos@gmail.com", 48));

        /* Add personasLinked values */
        personasLinked.add(new Persona("Samuel", 3229884569L, "samuel@gmail.com", 15));
        personasLinked.add(new Persona("Esteban", 3204599963L, "esteban@gmail.com",20));
        personasLinked.add(new Persona("Juan", 3147522003L, "juan@gmail.com", 71));
        personasLinked.add(new Persona("David", 3132599677L, "david@gmail.com", 32));
        personasLinked.add(new Persona("Carlos", 3102554190L, "carlos@gmail.com", 48));
    }
}