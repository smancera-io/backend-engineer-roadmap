import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        HashMap<String, Integer> frequence = new HashMap<>();

        String phrase = "Juan tuvo un tubo y el tubo que tuvo se le rompió y para recuperar el tubo que tuvo tuvo que comprar un tubo igual al tubo que tuvo y rompió";
        String[] pieces = phrase.split(" ");
        for (String piece : pieces) {
            frequence.merge(piece, 1, Integer::sum);
        }

        System.out.println(frequence);
    }
}
