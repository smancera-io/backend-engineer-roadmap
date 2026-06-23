public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, int añoFabricacion, double kilometraje, double capacidadCarga) {
        super(placa, marca, modelo, añoFabricacion, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCostoMantenimiento(double precioAceite, double precioFiltro, double manoObra) {
        double costo = (precioAceite + precioAceite + manoObra) * (capacidadCarga * 0.5);
        return costo;
    }
    
}
