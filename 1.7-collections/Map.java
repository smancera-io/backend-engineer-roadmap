import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map {
    public static void main(String[] args) {

        /* Create a HashMap */
        HashMap<String, Integer> frequency = new HashMap<>();

        TreeMap <String, Integer> frecuencyTree =  new TreeMap<>();

        /* Initialize a String phrase */
        String phrase = "Juan tuvo un tubo y el tubo que tuvo se le rompió y para recuperar el tubo que tuvo tuvo que comprar un tubo igual al tubo que tuvo y rompió";
        
        /* Split string phrase into an array */
        String[] pieces = phrase.split(" ");

        /* For loop to count the frecuency */
        for (String piece : pieces) {
            frequency.put(piece, frequency.getOrDefault(piece, 0) + 1);
            frecuencyTree.put(piece, frecuencyTree.getOrDefault(piece, 0) + 1);
        }

        /* For loop to print the results using entrySet() */
        for (Entry <String, Integer> pair : frequency.entrySet()) {
            System.out.println("Palabra: '" + pair.getKey() + "' se repite: " + pair.getValue() + " veces.");
        }

        /* For loop to print the results with TreeMap */
        for (Entry <String, Integer> pair : frecuencyTree.entrySet()) {
            System.out.println("Palabra: '" + pair.getKey() + "' se repite: " + pair.getValue() + " veces.");
        }

        /* For loop to print the keys */
        for ( String key : frequency.keySet()) {
            System.out.println("Palabra " + key);
        }

        /* For loop to print keys TreeMap */
        for ( String key : frecuencyTree.keySet()) {
            System.out.println("Palabra " + key);
        }

        /* For loop to print the values */
        for ( Integer value : frequency.values()){
            System.out.println("Numero de repetido " + value);
        }

        /* For loop to print values TreeMap */
        for ( Integer value : frecuencyTree.values()){
            System.out.println("Numero de repetido " + value);
        }
    }
}
