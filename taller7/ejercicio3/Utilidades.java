package taller7.ejercicio3;

public class Utilidades {
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return Double.NaN;
        }
        return a / b;
    }
}
