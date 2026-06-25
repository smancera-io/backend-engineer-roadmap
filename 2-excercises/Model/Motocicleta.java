package Model;

import Interface.Asegurable;

public class Motocicleta extends Vehiculo implements Asegurable{

    /* New class attribute */
    private double cilindraje;

    /* Superconstructor method */
    public Motocicleta(String placa, String marca, String modelo, int añoFabricacion, double kilometraje, double cilindraje) {
        super(placa, marca, modelo, añoFabricacion, kilometraje);
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
    public void setCilindraje ( double cilindraje) {
        this.cilindraje = cilindraje;
    }
    /* Getter method */
    public double getCilindraje () {
        return cilindraje;
    }

    /* Asegurable interface method */
    @Override
    public double calcularPrimaSeguro() {
        int n = (int) cilindraje / 100;
        double primaSeguro = switch (n) {
            case 1, 2, 3 -> 150000;
            case 4, 5, 6, 7 -> 250000;
            case 8, 9, 10 -> 500000;
            default -> 20000;
        };
    return primaSeguro * 1.05;
    }
}
