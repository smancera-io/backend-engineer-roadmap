import java.lang.reflect.Field;
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

        PuntoGeografico maldivas = new PuntoGeografico(41031.5 , 733033.3);
        System.out.println("Punto geografico inical: " + maldivas.getLatitud());
        try {
            System.out.println("Intentando modificar el valor de latitud");
            Field campoLatitud = PuntoGeografico.class.getDeclaredField("latitud");
            campoLatitud.setAccessible(true);
            campoLatitud.set(maldivas, 40.4167);
            
            System.out.println("¡El código de modificación se ejecutó!");
        } catch (Exception e) {
            System.out.println("Error en el proceso:" + e);
        }
    }
}
