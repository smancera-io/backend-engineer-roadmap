import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        /* Create hashMap structure */
        Map <Producto, String> hashMap = new HashMap<>();

        /* Create instances of Producto class */
        Producto harina = new Producto(1, "Harina");
        Producto leche = new Producto(1, "Leche");

        /* Add object to hashMap */
        hashMap.put(harina, "Encontrado producto Harina");
    }
}
