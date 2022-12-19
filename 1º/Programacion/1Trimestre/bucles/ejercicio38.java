/*
Codificar el juego “Cálculo Mental” del producto. 
El jugador tendrá que introducir la solución del producto de dos números
aleatorios comprendidos entre 1 y 10. Mientras la solución introducida sea correcta,
el juego continuará. En caso contrario, el programa terminará y mostrará el número de
operaciones realizadas correctamente.  (Do While)
*/

package programacion.bucles;
import java.util.Scanner;
public class ejercicio38 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int n1=0;
        int n2=0;
        int cont=0;
        int prod=0;

        while((n1*n2)==prod){   

            n1= (int) (Math.random()*10+1);
            n2= (int) (Math.random()*10+1);

            System.out.print(n1+"*"+n2+"=");
            prod= teclado.nextInt();

            if (prod==n1*n2){
                System.out.println("Continua");
                cont++;   
            }else{
                System.out.println("fallastes");
                System.out.println("Acertastes: "+cont);
                break;
            }
            teclado.close();
        }
    }
}
