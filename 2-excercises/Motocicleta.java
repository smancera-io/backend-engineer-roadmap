public class Motocicleta extends Vehiculo {

    private double cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int añoFabricacion, double kilometraje, double cilindraje) {
        super(placa, marca, modelo, añoFabricacion, kilometraje);
        this.cilindraje = cilindraje;
        
    }

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
    
    public void setCilindraje ( double cilindraje) {
        this.cilindraje = cilindraje;
    }
    public double getCilindraje () {
        return cilindraje;
    }
}
