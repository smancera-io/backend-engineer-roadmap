public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(1, "Samuel", EstadoPedido.CREADO, 2100000);
        Pedido pedido2 = new Pedido(2, "David", EstadoPedido.ENVIADO, 1750000);
        Pedido pedido3 = new Pedido(3, "Juan", EstadoPedido.ENTREGADO, 570000);
        Pedido pedido4 = new Pedido(4, "Sofia", EstadoPedido.EN_PROCESO, 890000);
        Pedido pedido5 = new Pedido(5, "Daniel", EstadoPedido.CANCELADO, 254000);
    }
}
