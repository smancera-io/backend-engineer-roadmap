import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {

        /* Create a HashMap */
        HashMap<String, Integer> frequency = new HashMap<>();

        /* Initialize a String phrase */
        String phrase = "Juan tuvo un tubo y el tubo que tuvo se le rompió y para recuperar el tubo que tuvo tuvo que comprar un tubo igual al tubo que tuvo y rompió";
        
        /* Split string phrase into an array */
        String[] pieces = phrase.split(" ");

        /* For loop to count the frecuency */
        for (String piece : pieces) {
            frequency.put(piece, frequency.getOrDefault(piece, 0) + 1);
        }

        /* For loop to print the results using entrySet() */
        for (Entry <String, Integer> pair : frequency.entrySet()) {
            System.out.println("Palabra: '" + pair.getKey() + "' se repite: " + pair.getValue() + " veces.");
        }

        for ( Integer value : frequency.values()){
            System.out.println("Numero de repetido " + value);
        }

        for ( String key : frequency.keySet()) {
            System.out.println("Palabra " + key);
        }
    }
}
