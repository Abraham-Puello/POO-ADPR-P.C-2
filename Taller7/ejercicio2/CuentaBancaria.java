package taller7.ejercicio2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido: no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + ", Tipo: " + tipoCuenta + ", Saldo: $" + saldo);
    }
}
