package taller7.ejercicio1;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", 2500000);
        Empleado empleado2 = new Empleado("María", 3200000);
        System.out.println("Empleado 1: " + empleado1.nombre + " - Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.nombre + " - Salario: " + empleado2.getSalario());

        empleado1.nombre = "Carlos Pérez";
        empleado1.setSalario(2800000);   // Cambio permitido
        empleado2.setSalario(-100);      // No se acepta un salario negativo

        System.out.println("Empleado 1 actualizado: " + empleado1.nombre + " - Salario: " + empleado1.getSalario());
        System.out.println("Empleado 2 sin cambios: " + empleado2.nombre + " - Salario: " + empleado2.getSalario());
    }
}
