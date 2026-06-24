package Model;

import Interface.Asegurable;

public class Automovil extends Vehiculo implements Asegurable {

    /* Superconstructor method */
    public Automovil(String placa, String marca, String modelo, int añoFabricacion, double kilometraje) {
        super(placa, marca, modelo, añoFabricacion, kilometraje);

    }

    /* Inherited method */
    @Override
    public double calcularCostoMantenimiento(double costoAceite, double costoFiltro, double manoObra) {
        double costo = (costoAceite + costoFiltro + manoObra) * kilometraje / 10000;
        return costo;
    }

    /* Asegurable interface method */
    @Override
    public double calcularPrimaSeguro() {
        double primaSeguro = 0;
        if (añoFabricacion >= 1990 && añoFabricacion < 2010) {
            primaSeguro = 200000;
        } else if (añoFabricacion >= 2010 && añoFabricacion < 2020) {
            primaSeguro = 450000;
        } else if (añoFabricacion >= 2020 && añoFabricacion < 2030) {
            primaSeguro = 700000;
        } else {
            primaSeguro = 20000;
        }
        return primaSeguro * 1.25;
    }
};
