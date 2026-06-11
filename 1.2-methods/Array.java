import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        /* Create 1D array */
        int [] numbers = {458, 58, 6, 8, 91, 52, 15, 98, 459};

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

        /* Print the sorted numbers array */
        System.out.println(Arrays.toString(numbers));

        /* Use modifyArray method */
        int [] newNumbers = modifyArray(numbers);

        /* Print numbers array content */
        for (int i : newNumbers) {
            System.out.println(i);
        }
    }

    /* Create method modify array */
    public static int [] modifyArray (int [] numbers){
        numbers [0] = 526;
        return numbers;
    }
}