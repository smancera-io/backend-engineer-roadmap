import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* Create hashMap structure */
        Map<Producto, String> hashMap = new HashMap<>();

        /* Create instances of Producto class */
        Producto harina = new Producto(1, "Harina");
        Producto leche = new Producto(1, "Leche");

        /* Add object to hashMap */
        hashMap.put(harina, "Encontrado producto Harina");

        /*
         * Show that using id to compare with another object if it has the same id
         * return de same value
         */
        String result = hashMap.get(leche);
        System.out.println(result);

        /* Create an instance of PuntoGeografico class */
        PuntoGeografico maldivas = new PuntoGeografico(41031.5, 733033.3);

        /* Print initial and inmutable value */
        System.out.println("Punto geografico inical: " + maldivas.getLatitud());

        System.out.println("Compartiendo valor con metodos");
        procesarEnModuloA(maldivas);
        procesarEnModuloB(maldivas);

        System.out.println("Compartiendo estructuras");
        List<PuntoGeografico> registroVuelos = new ArrayList<>();
        List<PuntoGeografico> catalogoHoteles = new ArrayList<>();

        registroVuelos.add(maldivas);
        catalogoHoteles.add(maldivas);

        System.out.println("Vuelo programado a: " + registroVuelos.get(0).getLatitud());
        System.out.println("Hotel ubicado en: " + catalogoHoteles.get(0).getLatitud());

        System.out.println("Datos finales");
        System.out.println("Maldivas sigue siendo: " + maldivas.getLatitud() + ", " + maldivas.getLongitud());
        System.out.println("Garantía: Ninguna estructura o método pudo alterar el objeto original.");
    }

    private static void procesarEnModuloA(PuntoGeografico punto) {
        double calculo = punto.getLatitud() * 2;
        System.out.println("Leyendo coordenadas de forma segura.");
        System.out.println(calculo);
    }

    private static void procesarEnModuloB(PuntoGeografico punto) {
        System.out.println("Dibujando pin en: " + punto.getLongitud());
    }

}
