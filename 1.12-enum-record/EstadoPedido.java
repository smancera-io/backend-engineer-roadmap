public enum EstadoPedido {
    /* Posibles estados enum */
    CREADO("El pedido ha sido creado con exito"),
    EN_PROCESO("El pedido esta en preparacion"),
    ENVIADO("El pedido esta en camino al destino"),
    ENTREGADO("El cliente ya recibio su pedido"),
    CANCELADO("El pedido fue cancelado y ya no se procesara");

    private String descripcion;

    private EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion () {
        return descripcion;
    }

    public boolean esFinalizado () {
        return this == ENTREGADO ||  this == CANCELADO;   
    }
}
