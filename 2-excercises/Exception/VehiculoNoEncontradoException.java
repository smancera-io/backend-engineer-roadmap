package Exception;

public class VehiculoNoEncontradoException extends RuntimeException {
    public VehiculoNoEncontradoException(String placa) {
        super("Vehículo con placa '" + placa + "' no encontrado en la flota.");
    }
}
