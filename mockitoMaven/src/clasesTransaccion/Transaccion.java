package clasesTransaccion;

public class Transaccion {
    private Cuenta origen;
    private Cuenta destino;
    private double monto;
    private String fecha;

    public Transaccion(Cuenta origen, 
    Cuenta destino, double monto, String fecha) {
        this.origen = origen;
        this.destino = destino;
        this.monto = monto;
        this.fecha = fecha;
    }

    public boolean realizar() {
        if (origen.retirar(monto)) {
            destino.depositar(monto);
            return true;
        }
        return false;
    }
}
