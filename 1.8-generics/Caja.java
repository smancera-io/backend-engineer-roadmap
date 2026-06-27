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

}