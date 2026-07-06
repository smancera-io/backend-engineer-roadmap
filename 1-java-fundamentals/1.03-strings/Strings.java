import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        /* Create 2 string variables */
        String word = "Carro";
        String word2 = new String("Carro");

        /* Compare strings using '==' */
        System.out.println((word == word2));

        /* Compare string using equals */
        System.out.println(word.equals(word2));

        /* The diference in the results is due to the operators function, 
        because '==' with strings compare their memory directions. 
        Besides, when we use new String that value its save directly in the Heap,
        so it has a new direction of memory 
        but creating normal strings with "" the first value goes to the String pool,
        and if we create another string with the same value, 
        java check if in the String pool already exists that value, if so,
        in the second string java aims to the same direction that the first one,
        so if we compare string 1 and to with == will return true.
        Finally, coming back to the another compare method, equals compare their values */

        /* Create string phrase */
        String phrase = "     Learning java fundamentals and using git control version";

        /* Use split method */
        String [] characters = phrase.split(" ");

        /* Print split result */
        for (String s: characters) {
            System.out.println(s);
        }

        /* Use substring */
        String newPhrase = phrase.substring(0, 26);
        System.out.println(newPhrase);

        /* Use indexOf */
        int index = word.indexOf('o');
        System.out.println(index);

        /* Use toLowerCase */
        String word3 = "CARRO";
        String lowerCase = word3.toLowerCase();
        System.out.println(lowerCase);

        /* Use trim */
        String trimPhrase = phrase.trim();
        System.out.println(trimPhrase);

        /* Use format */
        String formatPhrase = String.format("El dia de hoy compre un %s.", lowerCase);
        System.out.println(formatPhrase);

        /* Use stringbuilder */
        StringBuilder words = new StringBuilder();

        /* Inicialize scanner */
        Scanner scanner = new Scanner(System.in);

        /* Add values to the stringbuilder */
        boolean flag = true;
        while (flag){
            System.out.print("Ingresa una palabra: ");
            words.append(scanner.nextLine());
            String letter = "";
            System.out.print("Deseas agregar otra? (S/N): ");
            letter = scanner.nextLine().toLowerCase();
            if (letter.equals("n")){
                flag = false;
            }
        }
 
        /* Close scanner */
        scanner.close();

        /* Convert StringBuilder to normal String and print it */
        String resultado = words.toString();
        System.out.println(resultado);
    }
}