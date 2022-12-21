package ejemplosRaton;

import java.util.ArrayList;

public class PruebaEstado {
    public static void main(String[] args) {
        Raton r1 = new Raton("Minny",7);
        ArrayList<Thread.State> estadosHilo = new ArrayList<>();
        estadosHilo.add(r1.getState());
        r1.start();

        while (r1.getState()!=Thread.State.TERMINATED){
            estadosHilo.add(r1.getState());
        }
        if (!estadosHilo.contains(r1.getState())){
            estadosHilo.add(r1.getState());
        }
    }
}
