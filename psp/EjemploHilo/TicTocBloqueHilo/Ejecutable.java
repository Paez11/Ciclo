package TicTocBloqueHilo;

public class Ejecutable {
    public static void main(String[] args) {
        Imprime imprime = new Imprime();
        HiloTicToc hiloTic = new HiloTicToc(imprime,"Tic");
        HiloTicToc hiloToc = new HiloTicToc(imprime,"Toc");
        hiloTic.start();
        hiloToc.start();
    }
}
