package taller8.ejercicio3;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2500000);
        Gerente gerente = new Gerente("María", 6000000, "Finanzas");

        empleado.mostrarDetalles();
        gerente.mostrarDetalles();
    }
}
