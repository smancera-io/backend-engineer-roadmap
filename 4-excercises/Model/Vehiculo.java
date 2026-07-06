package Model;
import java.time.Year;
import java.util.Objects;

import ENUM.EstadoVehiculo;
import Exception.KilometrajeInvalidoException;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    /* Class attributes */
    protected final String placa;
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected double kilometraje;
    protected EstadoVehiculo estado;

    /* Constructor method */
    public Vehiculo (String placa, String marca, String modelo, int añoFabricacion, double kilometraje, EstadoVehiculo estado){
        this.placa =  Objects.requireNonNull(placa, "La placa no puede ser null");
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion =  añoFabricacion;
        this.kilometraje = 0.0;
        setKilometraje(kilometraje);
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

    /* Equals method */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        Vehiculo other = (Vehiculo) o;
        return Objects.equals(placa, other.placa);
    }

    /* HashCode method */
    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    /* compareTo method */
    @Override
    public int compareTo(Vehiculo other) {
        int cmp = Double.compare(
            other.calcularCostoMantenimiento(),
            this.calcularCostoMantenimiento()   // desc: mayor costo = "menor" en TreeSet
        );
        return (cmp != 0) ? cmp : this.placa.compareTo(other.placa);
    }

    /* toString method */
    @Override
    public String toString() {
        return String.format("[%s] %s %s %d | KM: %.0f | Estado: %-16s | Mantenimiento: $%,.2f",
            placa, marca, modelo, añoFabricacion,
            kilometraje, estado, calcularCostoMantenimiento());
    }
}