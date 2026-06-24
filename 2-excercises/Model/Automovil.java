package Model;
public class Automovil extends Vehiculo{

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
    
}
