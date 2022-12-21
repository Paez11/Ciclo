package SincronizacionMetodos;

public class TestSaludos {
    public static void main(String[] args) {
        Saludo saludo = new Saludo();
        Personal p1 = new Personal("Juan", saludo, false);
        Personal p2 = new Personal("Ana", saludo, false);
        Personal p3 = new Personal("Luis", saludo, true);
        Personal p4 = new Personal("Maria", saludo, true);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
