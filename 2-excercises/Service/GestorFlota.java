package Service;

import java.util.*;
import java.util.stream.Collectors;

import ENUM.EstadoVehiculo;
import Exception.VehiculoNoEncontradoException;
import Interface.Asegurable;
import Interface.Inspeccionable;
import Model.Vehiculo;

public class GestorFlota {

    private final Map<String, Vehiculo> flota = new HashMap<>();
    private final TreeSet<Vehiculo> flotaOrdenada = new TreeSet<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        Objects.requireNonNull(vehiculo, "El vehículo no puede ser null");
        flota.put(vehiculo.getPlaca(), vehiculo);
        flotaOrdenada.add(vehiculo);
    }

    public void eliminarVehiculo(String placa) throws VehiculoNoEncontradoException {
        Vehiculo v = flota.remove(placa);
        if (v == null)
            throw new VehiculoNoEncontradoException(placa);
        flotaOrdenada.remove(v);
    }

    public Vehiculo buscarPorPlaca(String placa) throws VehiculoNoEncontradoException {
        Vehiculo v = flota.get(placa);
        if (v == null)
            throw new VehiculoNoEncontradoException(placa);
        return v;
    }

    public Map<Class<?>, List<Vehiculo>> agruparPorTipo() {
        return flota.values().stream()
                .collect(Collectors.groupingBy(Vehiculo::getClass));
    }

    public Map<EstadoVehiculo, Long> contarPorEstado() {
        Map<EstadoVehiculo, Long> resultado = new EnumMap<>(EstadoVehiculo.class);
        for (EstadoVehiculo e : EstadoVehiculo.values())
            resultado.put(e, 0L);
        flota.values().forEach(v -> resultado.merge(v.getEstadoVehiculo(), 1L, Long::sum));
        return resultado;
    }

    public double calcularCostoTotalFlota() {
        return flota.values().stream()
                .mapToDouble(Vehiculo::calcularCostoMantenimiento)
                .sum();
    }

    public Optional<Vehiculo> vehiculoMayorCosto() {
        return flotaOrdenada.isEmpty()
                ? Optional.empty()
                : Optional.of(flotaOrdenada.first());
    }

    public List<Asegurable> obtenerAsegurables() {
        return flota.values().stream()
                .filter(v -> v instanceof Asegurable)
                .map(v -> (Asegurable) v)
                .collect(Collectors.toList());
    }

    public List<Inspeccionable> obtenerInspeccionables() {
        return flota.values().stream()
                .filter(v -> v instanceof Inspeccionable)
                .map(v -> (Inspeccionable) v)
                .collect(Collectors.toList());
    }

    public void imprimirReporte() {
        String sep = "=".repeat(70);
        System.out.println(sep);
        System.out.println("              REPORTE DE FLOTA VEHICULAR");
        System.out.println(sep);

        System.out.printf("Total vehículos       : %d%n", flota.size());
        System.out.printf("Costo total flota     : $%,.2f%n", calcularCostoTotalFlota());

        vehiculoMayorCosto().ifPresent(v -> System.out.printf("Mayor costo           : %s  →  $%,.2f%n",
                v.getPlaca(), v.calcularCostoMantenimiento()));

        System.out.println("\n── Por estado ──────────────────────────────────────────────────────");
        contarPorEstado().forEach((estado, count) -> System.out.printf("  %-20s : %d%n", estado, count));

        System.out.println("\n── Por tipo ────────────────────────────────────────────────────────");
        agruparPorTipo().forEach((tipo, lista) -> {
            System.out.printf("  %s (%d)%n", tipo.getSimpleName(), lista.size());
            lista.forEach(v -> System.out.println("    └─ " + v.getPlaca()));
        });

        System.out.println("\n── Ordenados por costo de mantenimiento (desc) ─────────────────────");
        flotaOrdenada.forEach(v -> System.out.println("  " + v));

        System.out.println(sep);
    }
}