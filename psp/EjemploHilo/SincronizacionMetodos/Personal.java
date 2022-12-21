package SincronizacionMetodos;

public class Personal extends Thread {
    private String nombre;
    private Saludo saludo;
    private boolean esProfesor;

    public Personal(String nombre, Saludo saludo, boolean esProfesor) {
        this.nombre = nombre;
        this.saludo = saludo;
        this.esProfesor = esProfesor;
    }

    public Personal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Saludo getSaludo() {
        return saludo;
    }

    public void setSaludo(Saludo saludo) {
        this.saludo = saludo;
    }

    public boolean isEsProfesor() {
        return esProfesor;
    }

    public void setEsProfesor(boolean esProfesor) {
        this.esProfesor = esProfesor;
    }

    public void run(){
        System.out.println("Ha llegado: "+nombre+" ...");
        if(esProfesor) {
            saludo.saludaProfesor(nombre);
        }else {
            saludo.saludaEstudiante(nombre);
        }
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", saludo=" + saludo +
                ", esProfesor=" + esProfesor +
                '}';
    }
}
