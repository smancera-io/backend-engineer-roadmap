import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        /* Create 1D array */
        int [] numbers = {2, 5, 6, 8, 9, 52, 15, 98, 459};

        /* Print numbers array content */
        for (int i : numbers) {
            System.out.println(i);
        }

        /* Create 2D array */
        int [][] numbers2 = {{14, 20, 39, 41},{27, 25, 46, 38}};

        /* Print numbers2 array content */
        for (int i = 0; i < numbers2.length; i++){
            for (int j = 0; j < numbers2[i].length; j++){
                System.out.println(numbers2[i][j]);
            }
        }

        /* Sort numbers array */
        Arrays.sort(numbers);
    }
}