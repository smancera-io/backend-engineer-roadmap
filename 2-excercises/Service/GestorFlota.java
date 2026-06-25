package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import Model.Vehiculo;

public class GestorFlota {

    private final Map<String, Vehiculo> flota = new HashMap<>();
    private final TreeSet<Vehiculo> flotaOrdenada = new TreeSet<>();
    
}
