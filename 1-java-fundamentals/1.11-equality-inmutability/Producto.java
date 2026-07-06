public class Producto {

    /* Private attributes */
    private int id;
    private String name;

    /* Constructor method */
    public Producto (int id, String name) {
        this.id = id;
        this.name = name;
    }

    /* hashCode method with id */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    /* equals method with id */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (id != other.id)
            return false;
        return true;
    }

    /* Getter methods */
    public int getId () {
        return id;
    }
    public String getName () {
        return name;
    }
}
