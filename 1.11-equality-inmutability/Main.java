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

        /* Show that using id to compare with another object if it has the same id return de same value */
        String result = hashMap.get(leche);
        System.out.println(result);

        /* Create an instance of PuntoGeografico class */
        PuntoGeografico maldivas = new PuntoGeografico(41031.5 , 733033.3);

        /* Print initial and inmutable value */
        System.out.println("Punto geografico inical: " + maldivas.getLatitud());

        /* Try to change the value */
        try {
            maldivas.setLatitud(4.0256);
        } catch (UnsupportedOperationException e) {
            System.out.println("Error en el proceso:" + e.getMessage());
        }

        /* Print the final value that is the same as the first one */
        System.out.println("Valor final: " + maldivas.getLatitud());
    }
}
