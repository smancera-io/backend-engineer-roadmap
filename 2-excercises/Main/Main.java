package Main;

import ENUM.EstadoVehiculo;
import Exception.KilometrajeInvalidoException;
import Exception.VehiculoNoEncontradoException;
import Model.Automovil;
import Model.Camion;
import Model.Motocicleta;
import Model.Vehiculo;
import Service.GestorFlota;

public class Main {
    public static void main(String[] args) {
        /* Create instances of objects */
        Automovil auto1 = new Automovil("ABC123", "Toyota", "Corolla", 2018, 85_000, EstadoVehiculo.ACTIVO, 4, 45_000_000.0);
        Automovil auto2 = new Automovil("XYZ789", "Mazda", "CX-5", 2020, 40_000, EstadoVehiculo.ACTIVO, 4, 85_000_000.0);
        Camion camion1 = new Camion("TRK001", "Volvo", "FH16", 2015, 320_000, EstadoVehiculo.ACTIVO, 25.0, 6, 350_000_000.0);
        Camion camion2 = new Camion("TRK002", "Mercedes", "Actros", 2010, 490_000, EstadoVehiculo.EN_MANTENIMIENTO, 18.0, 4, 280_000_000.0);
        Motocicleta moto1 = new Motocicleta("MOT456", "Honda", "CB500F", 2021, 15_000, EstadoVehiculo.ACTIVO, 500);
        
        /* Add objects to GestorFlota class */
        GestorFlota gestor = new GestorFlota();
        gestor.agregarVehiculo(auto1);
        gestor.agregarVehiculo(auto2);
        gestor.agregarVehiculo(camion1);
        gestor.agregarVehiculo(camion2);
        gestor.agregarVehiculo(moto1);

        /* Modify an object state */
        camion2.setEstado(EstadoVehiculo.EN_MANTENIMIENTO);

        /* Use method to print a report */
        gestor.imprimirReporte();

        /* Print extra logic and performance of the system */
        System.out.println("\n── Primas de seguro ────────────────────────────────────────────────");
        gestor.obtenerAsegurables().forEach(asegurable -> {
            if (asegurable instanceof Vehiculo v) {
                System.out.printf("  [%s] Prima: $%,.2f%n",
                        v.getPlaca(), asegurable.calcularPrimaSeguro());
            }
        });
        System.out.println("\n── Certificados de inspección ──────────────────────────────────────");
        gestor.obtenerInspeccionables().forEach(inspeccionable -> {
            if (inspeccionable instanceof Vehiculo v) {
                System.out.printf("  [%s] %s%n",
                        v.getPlaca(), inspeccionable.generarCertificado());
            }
        });
        System.out.println("\n── Búsqueda por placa ──────────────────────────────────────────────");
        try {
            Vehiculo encontrado = gestor.buscarPorPlaca("TRK001");
            System.out.println("  Encontrado: " + encontrado);
        } catch (VehiculoNoEncontradoException e) {
            System.err.println("  ERROR: " + e.getMessage());
        }
        try {
            gestor.buscarPorPlaca("FAKE99");
        } catch (VehiculoNoEncontradoException e) {
            System.err.println("\n  ERROR esperado: " + e.getMessage());
        }
        try {
            auto1.setKilometraje(50_000); 
        } catch (KilometrajeInvalidoException e) {
            System.err.println("  ERROR esperado: " + e.getMessage());
        }
        System.out.println("\n── Estado operativo ────────────────────────────────────────────────");
        for (EstadoVehiculo estado : EstadoVehiculo.values()) {
            System.out.printf("  %s → puedeOperar: %b%n", estado, estado.puedeOperar());
        }
        System.out.println("\n── Contrato equals/hashCode ────────────────────────────────────────");
        Automovil duplicado = new Automovil("ABC123", "Toyota", "Corolla", 2018, 85_000, EstadoVehiculo.ACTIVO, 4, 45_000_000.0);
        System.out.println("  auto1.equals(duplicado) [misma placa]: " + auto1.equals(duplicado));
        System.out.println("  auto1.equals(auto2)     [placa diff] : " + auto1.equals(auto2));
        System.out.println("  hashCode igual          [misma placa]: "
                + (auto1.hashCode() == duplicado.hashCode()));
    }
}
