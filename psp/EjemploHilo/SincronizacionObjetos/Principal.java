package SincronizacionObjetos;

public class Principal {
    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa();
        HiloEnvio hiloEnvio = new HiloEnvio(bolsa);
        hiloEnvio.start();

        for (int i = 0; i < 10; i++) {
            Producto producto = new Producto("Producto "+i);
            bolsa.addProducto(producto);
            System.out.println("Añadido producto "+i);
            synchronized (bolsa){
                try {
                    Thread.sleep(1000);
                    if (bolsa.estaLlena()){
                        bolsa.notify();
                        i=10;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
