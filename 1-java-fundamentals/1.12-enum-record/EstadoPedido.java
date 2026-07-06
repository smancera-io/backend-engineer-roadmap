public enum EstadoPedido {
    /* Posibles estados enum */
    CREADO("El pedido ha sido creado con exito"),
    EN_PROCESO("El pedido esta en preparacion"),
    ENVIADO("El pedido esta en camino al destino"),
    ENTREGADO("El cliente ya recibio su pedido"),
    CANCELADO("El pedido fue cancelado y ya no se procesara");

    /* Private attribute */
    private String descripcion;

    /* Constructor method */
    private EstadoPedido(String descripcion) {
        this.descripcion = descripcion;
    }

    /* Getter method */
    public String getDescripcion () {
        return descripcion;
    }

    /* Boolean method */
    public boolean esFinalizado () {
        return this == ENTREGADO ||  this == CANCELADO;   
    }
}
