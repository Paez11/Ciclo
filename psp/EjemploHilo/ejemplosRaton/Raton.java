package ejemplosRaton;

public class Raton extends Thread{
    private String nombre;
    private int tiempoAlimentacion;
    private int alimentoConsumido;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer(){
        try{
            System.out.println("El raton "+this.nombre+" ha comenzado a comer");
            Thread.sleep(tiempoAlimentacion*1000);
            alimentoConsumido++;
            System.out.println("El raton "+this.nombre+" ha terminado de comer");
            System.out.println("alimento consumido: "+alimentoConsumido);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void run(){
        this.comer();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoAlimentacion() {
        return tiempoAlimentacion;
    }

    public void setTiempoAlimentacion(int tiempoAlimentacion) {
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    @Override
    public String toString() {
        return "ejemplosRaton.Raton{" +
                "nombre='" + nombre + '\'' +
                ", tiempoAlimentacion=" + tiempoAlimentacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Raton raton = (Raton) o;

        return nombre.equals(raton.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
