public class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;
    protected int añoFabricacion;
    protected double kilometraje;

    public Vehiculo (String placa, String marca, String modelo, int añoFabricacion, double kilometraje){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion =  añoFabricacion;
        this.kilometraje = kilometraje;
    }

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
}