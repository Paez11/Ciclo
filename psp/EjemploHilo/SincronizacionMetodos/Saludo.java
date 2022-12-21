package SincronizacionMetodos;

public class Saludo {
    private boolean haLlegadoProfesor;

    public Saludo() {
        this.haLlegadoProfesor = false;
    }
    public synchronized void saludaEstudiante(String nombre){
        if (!haLlegadoProfesor){
            try {
                wait();
                System.out.println(nombre.toUpperCase()+" : Buenos días profesor");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }else {
            System.out.println(nombre.toUpperCase()+" : Perdon por el retraso");
        }
    }

    public synchronized void saludaProfesor(String nombre){
        System.out.println(nombre.toUpperCase()+" : Buenos días estudiantes");
        haLlegadoProfesor = true;
        notifyAll();
    }


}
