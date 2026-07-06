package Model;

import ENUM.EstadoVehiculo;

public class Motocicleta extends Vehiculo {

    /* New class attribute */
    private double cilindraje;

    /* Superconstructor method */
    public Motocicleta(String placa, String marca, String modelo, int añoFabricacion, double kilometraje,
            EstadoVehiculo estado, double cilindraje) {
        super(placa, marca, modelo, añoFabricacion, kilometraje, estado);
        this.cilindraje = cilindraje;
    }

    /* Inherited method */
    @Override
    public double calcularCostoMantenimiento() {
        return 80.0
                + (getKilometraje() * 0.02)
                + (cilindraje * 0.10)
                + (calcularAntiguedad() * 20.0);
    }

    /* Setter method */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    /* Getter method */
    public double getCilindraje() {
        return cilindraje;
    }
}
