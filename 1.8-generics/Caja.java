import java.util.List;

public class Caja <T> /* Use generic parameter */ {

    /* Generic variable */
    T item;

    /* Generic setter method */
    public void setItem(T item) {
        this.item = item;
    }

    /* Generic getter method */
    public T getItem() {
        return item;
    }

    public void printItems (List <T> lista){
        for (T object : lista) {
            System.out.println(object);
        }

    }

}