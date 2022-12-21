package Tienda;

public class Trabajador implements Runnable {
    private String nombre;
    private Cliente cliente;
    private long initialTime;

    public Trabajador(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public Trabajador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cobraProducto(Cliente cliente, long time){
        System.out.println("Trabajador" + this.nombre + "COMIENZA A PROCESAR LA COMPRA DEL CLIENTE" +
                cliente.getNombre() + "EN EL TIEMPO: "+ (System.currentTimeMillis() - time)/1000 + "segundos");
        for (int i = 0; i< cliente.getCarroCompra().length; i++){
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Trabajador "+this.nombre+", procesado el producto "
                    + (i + 1) + " ->Tiempo: " + (System.currentTimeMillis() - time) / 1000
                    +"seg");
        }
        System.out.println("El trabajador " + this.nombre + " HA TERMINADO DE PROCESAR "
                + cliente.getNombre() + " EN EL TIEMPO: " + (System.currentTimeMillis() - time)
                / 1000 + "seg");
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        cobraProducto(cliente, initialTime);
    }
}
