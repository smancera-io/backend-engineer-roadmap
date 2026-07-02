public final class PuntoGeografico {
    /* Private final attributes */
    private final double latitud;
    private final double longitud;

    /* Constructor method */
    public PuntoGeografico (double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    /* Getter methods */
    public double getLatitud () {
        return latitud;
    }
    public double getLongitud () {
        return longitud;
    }

    /* Setter method in order to try inmutability objects */
    public void setLatitud () {
        throw new UnsupportedOperationException("Este objeto no puede ser modifcado es de solo lectura o uso");
    }

}
