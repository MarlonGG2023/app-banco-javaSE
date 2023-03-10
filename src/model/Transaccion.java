package model;

public class Transaccion {
    private CuentaBancaria cuentaBancariaOrigen;
    private CuentaBancaria cuentaBancariaDestino;
    private double montoTransaccion;

    public Transaccion(CuentaBancaria cuentaBancariaOrigen, CuentaBancaria cuentaBancariaDestino, double montoTransaccion) {
        this.cuentaBancariaOrigen = cuentaBancariaOrigen;
        this.cuentaBancariaDestino = cuentaBancariaDestino;
        this.montoTransaccion = montoTransaccion;
    }

    public void ejecutarTransaccion(){
        if(cuentaBancariaOrigen.getSaldo() >= montoTransaccion){
            System.out.println("Mostar saldo actual de la cuenta origen: " + cuentaBancariaOrigen.getSaldo());
            System.out.println("Mostar saldo actual de la cuenta destino: " + cuentaBancariaDestino.getSaldo());
            cuentaBancariaOrigen.retirar(montoTransaccion);
            System.out.println("Mostar saldo después del retiro: " + cuentaBancariaOrigen.getSaldo());
            cuentaBancariaDestino.depositar(montoTransaccion);
            System.out.println("Mostar saldo actual de la cuenta de destino: " + cuentaBancariaDestino.getSaldo());

        }
        else{
            System.out.println("No tienes saldo para transferir");
        }
    }
}
