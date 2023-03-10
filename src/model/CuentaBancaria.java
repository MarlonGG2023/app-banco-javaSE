package model;

public class CuentaBancaria {
    private Cliente cliente;
    private int numCuenta;
    private double saldo;

    public CuentaBancaria(Cliente cliente, int numCuenta, double saldo) {
        this.cliente = cliente;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo){
        this.saldo += saldo;
    }

    public void retirar(double saldo){
        if(this.saldo >= saldo){
            this.saldo -= saldo;
            System.out.println("Transaccion exitosa");
        }
        else{
            System.out.println("No tienes saldo para retirar");
        }
    }
}


