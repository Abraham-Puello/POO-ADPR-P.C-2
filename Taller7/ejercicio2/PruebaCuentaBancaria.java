package taller7.ejercicio2;

public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123-456", 500000, "Ahorros");
        // System.out.println(cuenta.numeroCuenta);
        // No se puede consultar directamente porque es private

        System.out.println("Tipo de cuenta (público): " + cuenta.tipoCuenta);
        cuenta.setSaldo(750000);
        System.out.println("Saldo: " + cuenta.getSaldo());
        cuenta.mostrarDetalles();
    }
}
