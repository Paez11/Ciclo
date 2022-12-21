package ejemplosRaton;

public class EjecutableRecursoCompartido {
    public static void main(String[] args) {
        RatonRunneable r1 = new RatonRunneable("a",4);

        for (int i=0; i<100 ; i++) {
            new Thread(r1).start();
        }
    }
}
