package ejemplosRaton;

import ejemplosRaton.Raton;

public class Ejecutable {
    public static void main(String[] args) {
        Raton r1 = new Raton("Pablo",3);
        Raton r2 = new Raton("Prados",4);
        Raton r3 = new Raton("Angelin",8);
        Raton r4 = new Raton("Antonio",2);

        /*
        r1.comer();
        r2.comer();
        r3.comer();
        r4.comer();
        */
        /*
        r1.start();
        r2.start();
        r3.start();
        r4.start();
        */

        new Thread(r1).start();
        new Thread(r2).start();
        new Thread(r3).start();
        new Thread(r4).start();
    }
}
