package taller8.ejercicio2;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Abraham Puello", 20, "2024001");
        Estudiante estudiante2 = new Estudiante("Laura Gómez", 19, "2024002");

        estudiante1.mostrarDetalles();
        estudiante2.mostrarDetalles();
    }
}
