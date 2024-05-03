package clasesTransaccion;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;
    private Moneda moneda;

    public Cuenta(String numeroCuenta, 
    double saldoInicial, Moneda moneda) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.moneda = moneda;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}
