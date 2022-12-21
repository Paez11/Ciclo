package Cajero;

public class Cuenta {
    private Float saldo;

    public Cuenta(Float saldo) {
        this.saldo = saldo;
    }

    public Float getSaldo() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public synchronized void sumaSaldo(Float saldo, String nombre){
        System.out.println("+++++");
        System.out.println("Saldo inicial: "+this.saldo);
        this.saldo += saldo;
        System.out.println(nombre+" ha ingresado "+saldo);
        System.out.println("Saldo final: "+this.saldo);
        System.out.println("+++++\n");
    }

    public synchronized void restaSaldo(Float saldo, String nombre){
        System.out.println("+++++");
        System.out.println("Saldo inicial: "+this.saldo);
        if (this.saldo > saldo){
            this.saldo -= saldo;
            System.out.println(nombre+" ha retirado "+saldo);
        }else{
            System.out.println(" no puede retirar "+saldo);
        }
        System.out.println("Saldo final: "+this.saldo);
        System.out.println("+++++\n");
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                '}';
    }
}
