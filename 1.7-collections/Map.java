import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        /* Create a HashMap */
        HashMap<String, Integer> frequence = new HashMap<>();

        /* Initialize a String phrase */
        String phrase = "Juan tuvo un tubo y el tubo que tuvo se le rompió y para recuperar el tubo que tuvo tuvo que comprar un tubo igual al tubo que tuvo y rompió";
        
        /* Split string phrase into an array */
        String[] pieces = phrase.split(" ");

        /* Add keys and values to frequency HashMap */
        for (String piece : pieces) {
            frequence.merge(piece, 1, Integer::sum);
        }

        /* Print result */
        System.out.println(frequence);
    }
}
