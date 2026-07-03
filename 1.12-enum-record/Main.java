import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Create LinkedList */
        List<Pedido> listaPedidos = new LinkedList<>();

        /* Add instances to listaPedidos */
        listaPedidos.add(new Pedido(1, "Samuel", EstadoPedido.CREADO, 2100000));
        listaPedidos.add(new Pedido(2, "David", EstadoPedido.ENVIADO, 1750000));
        listaPedidos.add(new Pedido(3, "Juan", EstadoPedido.ENTREGADO, 570000));
        listaPedidos.add(new Pedido(4, "Sofia", EstadoPedido.EN_PROCESO, 890000));
        listaPedidos.add(new Pedido(5, "Daniel", EstadoPedido.CANCELADO, 254000));
        listaPedidos.add(new Pedido(6, "Miguel", EstadoPedido.CREADO, 210000));
        listaPedidos.add(new Pedido(7, "Esteban", EstadoPedido.ENVIADO, 1850000));
        listaPedidos.add(new Pedido(8, "Nicolas", EstadoPedido.ENTREGADO, 400000));
        listaPedidos.add(new Pedido(9, "Laura", EstadoPedido.EN_PROCESO, 190000));
        listaPedidos.add(new Pedido(10, "Carlos", EstadoPedido.EN_PROCESO, 175000));

        /* Filter instances of Pedido by their 'EstadoPedido' */
        System.out.println("Pedidos 'EN_PROCESO': ");
        listaPedidos.stream()
                .filter(pedido -> pedido.estado() == EstadoPedido.EN_PROCESO)
                .forEach(System.out::println);

        System.out.println("Pedido 'FINALIZADOS': ");
        listaPedidos.stream()
                .filter(pedido -> pedido.estado().esFinalizado())
                .forEach(System.out::println);

        /* Create HashSet */
        HashSet<Pedido> pedidosSet = new HashSet<>(listaPedidos);

        /* Create a duplicate instance */
        Pedido pedidoDuplicado = new Pedido(4, "Sofia", EstadoPedido.EN_PROCESO, 890000);

        /* Show that different instances have same hashCode */
        System.out.println("HashOriginal: " + listaPedidos.get(3).hashCode());
        System.out.println("HashClon: " + pedidoDuplicado.hashCode());

        /* Variable to get if it's possible to add a duplicate value */
        boolean agregado = pedidosSet.add(pedidoDuplicado);

        /* Print result and performance of 'equals' and 'hashCode' methods */
        System.out.println("Pedido duplicado agregado: " + agregado);
    }
}
