package Interface;

import java.time.LocalDate;

public interface Inspeccionable {
    public boolean realizarInspeccion ();

    public default String generarCertificado () {
        boolean aprobado = realizarInspeccion();
        String estado = aprobado ? "APROBADO" : "RECHAZADO";
        int id = (int) (Math.random()*100000) + 1;
        return String.format("[CERTIFICADO]\nNº: %d\nFecha: %s\nResultado: %s", id, LocalDate.now(), estado);
    }
}
