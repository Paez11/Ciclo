package HilosCooperantes;

public class Contador{
    private int cuenta = 0;

    public Contador() {}

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public synchronized int incrementa(){
        return ++cuenta;
    }

}
