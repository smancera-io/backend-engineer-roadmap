public class Main {
    public static void main(String[] args) {

        /* Inizialize 8 variables */
        byte number1 = 5;
        float number2 = 12.2f;
        int number3 = 520000;
        double number4 = 3.141516;
        long number5 = 10000000000L;
        short number6 = 4;
        char letter = 'S';
        boolean flag = true;

        /* Inizialize 'var' variables */
        var data1 = 5;
        var data2 = 'E';
        var data3 = false;

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
        int season = 3;
        String seasonName = switch (season) {
            case 1 -> "Spring";
            case 2 -> "Summer";
            case 3 -> "Autumn";
            case 4 -> "Winter";
            default -> "Invalid season";
        };
        System.out.println(seasonName);
    }
}