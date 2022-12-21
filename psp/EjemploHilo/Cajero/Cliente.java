package Cajero;

public class Cliente extends Thread {
    private Cuenta cuenta;
    private Float saldo;
    private String nombre;
    private String tipo;

    public Cliente(Cuenta cuenta, Float saldo, String nombre, String tipo) {
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    @Override
    public void run() {
        if (this.tipo.equals("ingreso")){
            cuenta.sumaSaldo(saldo, nombre);
        }else if (this.tipo.equals("retiro")){
            cuenta.restaSaldo(saldo, nombre);
        }else {
            System.out.println("Tipo de transaccion no válido");
        }
    }
}
