package Model;

import ENUM.EstadoVehiculo;
import Interface.Asegurable;
import Interface.Inspeccionable;

public class Camion extends Vehiculo implements Asegurable, Inspeccionable{

    /* New class attribute */
    private double capacidadCarga;
    private int numeroEjes;
    private double valorComercial;

    /* Superconstructor method */
    public Camion(String placa, String marca, String modelo, int añoFabricacion, double kilometraje,
            EstadoVehiculo estado, double capacidadCarga, int numeroEjes, double valorComercial) {
        super(placa, marca, modelo, añoFabricacion, kilometraje, estado);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.valorComercial = valorComercial;
    }
    
    /* Inherited method */
    @Override
    public double calcularCostoMantenimiento() {
        return 500.0
            + (getKilometraje() * 0.10)
            + (capacidadCarga * 100.0)
            + (calcularAntiguedad() * 80.0);
    }

    /* Setter method */
    public void setCapacidadCarga (double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    /* Getter method */
    public double getCapacidadCarga () {
        return capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public double getValorComercial() {
        return valorComercial;
    }

    /* Asegurable interface method */
    @Override
    public double calcularPrimaSeguro() {
       return (valorComercial * 0.025) + (numeroEjes * 200.0);
    }
    @Override
    public boolean realizarInspeccion() {
        return calcularAntiguedad() < 15 && getKilometraje() < 500_000;
    }
}
