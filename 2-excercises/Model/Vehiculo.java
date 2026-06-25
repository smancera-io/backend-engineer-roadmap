package Model;
import java.time.Year;
import java.util.Objects;

import ENUM.EstadoVehiculo;
import Exception.KilometrajeInvalidoException;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    /* Class attributes */
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected double kilometraje;
    protected EstadoVehiculo estado;

    /* Constructor method */
    public Vehiculo (String placa, String marca, String modelo, int añoFabricacion, double kilometraje, EstadoVehiculo estado){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion =  añoFabricacion;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    /* Getter methods*/
    public String getPlaca () {
        return placa;
    }
    public String getMarca () {
        return marca;
    }
    public String getModelo () {
        return modelo;
    }
    public int getAñoFabricacion () {
        return añoFabricacion;
    }
    public double getKilometraje () {
        return kilometraje;
    }
    public EstadoVehiculo getEstadoVehiculo () {
        return estado;
    }

    /* Setter methods */
    public void setPlaca (String placa) {
        this.placa = placa;
    }
    public void setMarca (String marca) {
        this.marca = marca;
    }
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public void setAñoFabricacion (int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    public void setKilometraje (double kilometraje) {
        if (kilometraje < this.kilometraje) {
            throw new KilometrajeInvalidoException(String.format(
                "El kilometraje no puede decrecer. Actual: %.2f | Recibido: %.2f",
                this.kilometraje, kilometraje
            ));
        }
        this.kilometraje = kilometraje;
    }
    public void setEstado (EstadoVehiculo estado) {
        this.estado = estado;
    }

    /* Abtract method */
    public abstract double calcularCostoMantenimiento ();

    /* Share method */
    public int calcularAntiguedad () {
        int antiguedad = Year.now().getValue() - añoFabricacion;
        return antiguedad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo other = (Vehiculo) o;
        return Objects.equals(placa, other.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public int compareTo(Vehiculo other) {
        int cmp = Double.compare(
            other.calcularCostoMantenimiento(),
            this.calcularCostoMantenimiento()   // desc: mayor costo = "menor" en TreeSet
        );
        return (cmp != 0) ? cmp : this.placa.compareTo(other.placa);
    }
}