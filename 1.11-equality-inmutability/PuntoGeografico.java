public final class PuntoGeografico {
    private final double latitud;
    private final double longitud;

    public PuntoGeografico (double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud () {
        return latitud;
    }
    public double getLongitud () {
        return longitud;
    }

}
