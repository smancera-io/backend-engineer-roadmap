package Model;
public class Camion extends Vehiculo {

    /* New class attribute */
    private double capacidadCarga;

    /* Superconstructor method */
    public Camion(String placa, String marca, String modelo, int añoFabricacion, double kilometraje, double capacidadCarga) {
        super(placa, marca, modelo, añoFabricacion, kilometraje);
        this.capacidadCarga = capacidadCarga;
    }
    
    /* Inherited method */
    @Override
    public double calcularCostoMantenimiento(double precioAceite, double precioFiltro, double manoObra) {
        double costo = (precioAceite + precioAceite + manoObra) * (capacidadCarga * 0.5);
        return costo;
    }

    /* Setter method */
    public void setCapacidadCarga (double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /* Getter method */
    public double getCapacidadCarga () {
        return capacidadCarga;
    }
}
