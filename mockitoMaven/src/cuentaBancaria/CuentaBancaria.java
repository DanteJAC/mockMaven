package cuentaBancaria;

public class CuentaBancaria {

    private int saldo;

    public CuentaBancaria() {
        this.saldo = 0;
    }

    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

   /* public void retirar(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }*/
    
    public void retirar(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }
}