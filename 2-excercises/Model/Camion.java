package Model;

import Interface.Asegurable;

public class Camion extends Vehiculo implements Asegurable{

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

    /* Asegurable interface method */
    @Override
    public double calcularPrimaSeguro() {
        int n = (int) capacidadCarga / 2;
        double primaSeguro = switch (n) {
            case 1, 2, 3 -> 250000;
            case 4, 5, 6, 7 -> 500000;
            case 8, 9, 10 -> 750000;
            default -> 20000;
        };
    return primaSeguro * 1.25;
    }
}
