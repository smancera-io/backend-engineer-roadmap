public class Main {
    public static void main(String[] args) {

        /* Inizialize 8 variables */
        byte number1 = 5;
        float number2 = 12.2f;
        int number3 = 520000;
        double number4 = 3.141516;
        long number5 = 10000000000L;
        char letter = 'S';
        String word = "Samuel";
        boolean flag = true;

        /* Casting double number to int number */
        int casting = (int) number4;
        System.out.println(number4);
        System.out.println(casting);

        /* Create a for loop */
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                if (i == 16) {
                    break;
                }
            }
        }

        /* Create a while loop */
        int i = 1;
        while (i < 21) {
            if (i % 2 == 0) {
                System.out.println(i);
                if (i == 16) {
                    break;
                }
            }
            i++;
        }

        /* Create a switch expression */
        int dia = 3;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(nombreDia);
    }
}