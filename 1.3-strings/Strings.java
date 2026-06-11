public class Strings {

    public static void main(String[] args) {
        /* Create 2 string variables */
        String word = "Carro";
        String word2 = new String("Carro");

        /* Compare strings using '==' */
        System.out.println((word == word2));

        /* Compare string using equals */
        System.out.println(word.equals(word2));

        /* The diference in the results is due to the operators function, because '==' with strings compare their memory directions, and equals their value */
    }
}