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
    }
}
