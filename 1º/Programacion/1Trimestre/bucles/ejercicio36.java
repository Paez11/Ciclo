/*
Un centro de estadística, está realizando un estudio para encontrar
a la persona más alta de una población. Para ello se introducirá por
teclado la altura (en centímetros) de cada persona participante en el estudio,
(terminando el programa cuando se introduzca -1 como altura). Las personas participantes
se identificarán por su dni (String). Al finalizar el programa mostrará el nombre de la
persona más alta y su altura, así como el número de personas que han participado en el estudio.
*/


package programacion.bucles;
import java.util.Scanner;
public class ejercicio36 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int altura=1;
        int max=1;
        String dni1="";
        String dni2="";
        int cont=0;

        while(altura>=0){
            System.out.println("Introduzca su altura en cm: ");
            altura= teclado.nextInt();
            if(altura>0){
                System.out.println("Introduzca su DNI: ");
                dni1= teclado.next();
                cont++;

                if (altura>max){
                    max=altura;
                    dni2=dni1;
                }
            }

        }
        System.out.println("La persona más alta es: "+dni2+" Con altura: "+max+" De "+cont+" pesonas que han participado");
        teclado.close();
    }
}
