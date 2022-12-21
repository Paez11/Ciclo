package Cajero;

public class Ejecutable {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(10f);

        Cliente cliente1 = new Cliente(cuenta, 200f, "Andres", "ingreso");
        Cliente cliente2 = new Cliente(cuenta, 150f, "Maria", "retiro");

        cliente1.start();
        cliente2.start();
    }
}
