package Entidades;

public class Cuenta {
    private int numeroCuenta, saldoActual;
    private long DNI;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long DNI) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.DNI = DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "numeroCuenta: " + numeroCuenta +
                "\nsaldoActual: $" + saldoActual +
                "\nDNI: " + DNI;
    }
}
