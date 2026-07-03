import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Pedido> listaPedidos = new LinkedList<>();
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

        System.out.println("Pedidos 'EN_PROCESO': ");
        listaPedidos.stream()
                    .filter(pedido -> pedido.estado() == EstadoPedido.EN_PROCESO)
                    .forEach(System.out::println);

        System.out.println("Pedido 'FINALIZADOS': ");
        listaPedidos.stream()
                    .filter(pedido -> pedido.estado().esFinalizado())
                    .forEach(System.out::println);

        HashSet <Pedido> pedidosSet = new HashSet<>(listaPedidos);
        Pedido pedidoDuplicado = new Pedido(4, "Sofia", EstadoPedido.EN_PROCESO, 890000);
        System.out.println("HashOriginal: " + listaPedidos.get(3).hashCode());
        System.out.println("HashClon: " + pedidoDuplicado.hashCode());
    }
}
