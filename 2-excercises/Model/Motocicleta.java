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
    public double calcularCostoMantenimiento(double precioAceite, double precioFiltro, double manoObra) {
        double costo = 0;
        if ( cilindraje <= 250.0){
            costo = (precioAceite + precioFiltro + manoObra) * 1.7;
            return costo;
        } else {
            costo = (precioAceite + precioFiltro + manoObra) * 2.7;
            return costo;
        }
    }
    
    /* Setter method */
    public void setCilindraje ( double cilindraje) {
        this.cilindraje = cilindraje;
    }
    /* Getter method */
    public double getCilindraje () {
        return cilindraje;
    }

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
