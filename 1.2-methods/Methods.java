import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        /* Inicialize scanner */
        Scanner scanner = new Scanner(System.in);

        /* Read and save input */
        int number1 = Integer.parseInt(scanner.nextLine().trim());
        int number2 = Integer.parseInt(scanner.nextLine().trim());
        
        /* Close scanner */
        scanner.close();

        /* Use sum method */
        int result = sum(number1,number2);

        /* Print result */
        System.out.println(result);
    }

        /* Create a sum method */
        public static int sum (int number1, int number2){
            return number1 + number2;
        }
}