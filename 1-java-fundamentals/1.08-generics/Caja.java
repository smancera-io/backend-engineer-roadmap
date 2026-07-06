import java.util.List;

public class Caja<T> /* Use generic parameter */ {

    /* Generic variable */
    private T item;

    /* Generic setter method */
    public void setItem(T item) {
        this.item = item;
    }

    /* Generic getter method */
    public T getItem() {
        return item;
    }

    /* Generic print List items */
    public static <T> void printItems(List<T> lista) {
        for (T object : lista) {
            System.out.println(object);
        }
    }

    /* Generic count List items */
    public static <T> int countItems(List <T> lista) {
        return lista.size();
    }

}