package taller7.ejercicio3;

public class PruebaUtilidades {
    public static void main(String[] args) {
        System.out.println("10 + 5 = " + Utilidades.suma(10, 5));
        System.out.println("10 - 5 = " + Utilidades.resta(10, 5));
        System.out.println("10 * 5 = " + Utilidades.multiplicacion(10, 5));
        System.out.println("10 / 5 = " + Utilidades.division(10, 5));
        System.out.println("10 / 0 = " + Utilidades.division(10, 0));
        boolean operacionesCorrectas = Utilidades.suma(10, 5) == 15
                && Utilidades.resta(10, 5) == 5
                && Utilidades.multiplicacion(10, 5) == 50
                && Utilidades.division(10, 5) == 2;
        System.out.println(operacionesCorrectas ? "Todas las operaciones son correctas." : "Hay operaciones incorrectas.");
    }
}
