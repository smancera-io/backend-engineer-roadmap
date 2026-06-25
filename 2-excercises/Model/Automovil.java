package Model;

import ENUM.EstadoVehiculo;
import Interface.Asegurable;

public class Automovil extends Vehiculo implements Asegurable {

    /* New attributes class */
    private int numeroPuertas;
    private double valorComercial;

    /* Superconstructor method */
    public Automovil(String placa, String marca, String modelo, int añoFabricacion, double kilometraje,
            EstadoVehiculo estado, int numeroPuertas, double valorComercial) {
        super(placa, marca, modelo, añoFabricacion, kilometraje, estado);
        this.numeroPuertas = numeroPuertas;
        this.valorComercial = valorComercial;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public double getValorComercial() {
        return valorComercial;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    /* Inherited method */
    @Override
    public double calcularCostoMantenimiento() {
        return 200.0
                + (getKilometraje() * 0.05)
                + (calcularAntiguedad() * 50.0);
    }

    /* Asegurable interface method */
    @Override
    public double calcularPrimaSeguro() {
        return valorComercial * 0.015;
    }
};
