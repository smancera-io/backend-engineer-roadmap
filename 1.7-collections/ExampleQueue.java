import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        /* Create a FIFO structure */
        Queue <String> list = new LinkedList<>();

        /* Add simple values */
        list.offer("Karen");
        list.offer("Samuel");
        list.offer("Esteban");
        list.offer("Daniel");
        list.offer("Sofia");
        list.offer("Laura");

        /* Print FIFO structure */
        System.out.println(list);

        /* Print the first value, showing FIFO function */
        System.out.println(list.peek());
    }
}
