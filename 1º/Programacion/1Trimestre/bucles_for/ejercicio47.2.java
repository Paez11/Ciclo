/*
Hacer un programa que muestre el promedio de varias notas ingresadas por teclado,
 la nota mayor y la nota menor. Se debe definir el número de notas por el usuario.
*/

package bucles_for;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio47_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int  i=0;
        float media=0, nota=0, notaMax=0, notaMin=10, notas=1, suma=0;
        boolean valido=false;

        do{
            try{
                System.out.println("Introduce el numero de notas");
                notas=teclado.nextFloat();
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("Nota no valida");
                teclado.next();
            }
        }while(!valido || notas<=0);
        
        for(i=1;i<=notas;i++){
            
            do{
                try{
                    System.out.println("Introduce la nota entre 0 y 10");
                    nota=teclado.nextFloat();
                    valido=true;
                }catch(InputMismatchException ex){
                    System.out.println("Nota no valida");
                    teclado.next();
                }
            }while(!valido || nota<0 || nota>10);
            suma=suma+nota;
            media=suma/notas;
        
            if (i>notas){
                media=0;
            }

            if (nota>notaMax){
                notaMax=nota;
            }

            if(nota<notaMin || notaMin==0){
                notaMin=nota;
            }
        }
        System.out.println("Esta es la media de las notas: "+media);
        System.out.println("Esta es la nota más alta: "+notaMax);
        System.out.println("Esta es la nota más baja: "+notaMin);
        teclado.close();
    }
}

