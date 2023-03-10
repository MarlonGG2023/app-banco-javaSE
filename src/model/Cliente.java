package model;

public class Cliente { //Modelar para la vida real
    //Inicializar atributos
    private String nombre;
    private String ocupacion;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Cliente (String nombre, String ocupacion, String dni){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.dni = dni;
    }//Fin constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }


    public void procesarTransaccion(Transaccion transaccion){

        transaccion.ejecutarTransaccion();

    }
    public void consultarSaldo(CuentaBancaria  cuentaBancaria){
        System.out.println("El saldo de tu cuenta es: " + cuentaBancaria.getSaldo());
    }
}//Fin clase Cliente

