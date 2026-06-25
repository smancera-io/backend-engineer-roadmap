package Exception;

public class VehiculoNoEncontradoException extends RuntimeException {
    /* Create method to modify exception message */
    public VehiculoNoEncontradoException(String placa) {
        super("Vehículo con placa '" + placa + "' no encontrado en la flota.");
    }
}
