package taller8.ejercicio1;

public class Vehiculo {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacionVehiculo() {
        System.out.println("Marca: " + marca + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}
