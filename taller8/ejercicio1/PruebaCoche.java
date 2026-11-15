package taller8.ejercicio1;

public class PruebaCoche {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Yamaha", 180);
        Coche coche = new Coche("Toyota", 200, 4);

        vehiculo.mostrarInformacionVehiculo();
        coche.mostrarInformacionCoche();
    }
}
