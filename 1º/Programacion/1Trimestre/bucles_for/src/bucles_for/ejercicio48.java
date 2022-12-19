/*
Mostrar los 10 primeros elementos de la serie Fibonacci:
0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34.
*/

package bucles_for;

public class ejercicio48 {
    public static void main(String[] args) {
        int i=0, n1=0, n2=1, aux=0;

        for(i=0;i<8;i++){
        	aux=n2;
            n2=n1+n2;
            n1=aux;
            System.out.println(n2);
        }
    }
}