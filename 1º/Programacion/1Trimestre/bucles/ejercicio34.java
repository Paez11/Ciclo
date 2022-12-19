/*
Realizar un programa para calcular datos estadísticos de los alumnos de un centro.
 Se introducirá datos hasta que uno sea negativo, y se mostrará la suma de todas las edades,
  la media aritmética de las edades, el número de alumnos y cuántos son mayores de edad.
*/

package programacion.bucles;
import java.util.Scanner;
public class ejercicio34 {
    public static void main(String args[]){
        int edad=0;
        float media=0f;
        int mayor=0;
        float cont=0f;
        float totaledad=0f;

        Scanner teclado= new Scanner (System.in);
        
        while(edad>=0){
            System.out.println("Introduzca edades de los alumnos");
            edad=teclado.nextInt();
            if (edad>=0){
            cont++;
            }
            totaledad=edad+totaledad;
            if (edad>=18){
                mayor++;
            }
        }
        System.out.println("Edad total: "+totaledad);
        if(totaledad>0){
            media=totaledad/cont;
            System.out.println("la media de las edades es: "+media);
        }
        System.out.println("Hay " +cont+ " alumnos");
        System.out.println("Hay " +mayor+ " alumnos mayores de edad");
        teclado.close();
    }
}
