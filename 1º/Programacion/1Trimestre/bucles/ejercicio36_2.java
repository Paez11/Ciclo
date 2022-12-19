/*
Realiza un programa que muestre el siguiente menú:

      0.   Salir	
Introducir datos (introducirá el número de participantes y la altura de cada uno)
Mostrará la media de las alturas (si se han introducido los datos en el punto1)
Mostrará la mayor de las alturas.
Mostrará la menor de las alturas.
      Cualquier otro valor, volverá a mostrar el menú.

*/

package programacion.bucles;
import java.util.Scanner;
public class ejercicio36_2 {

  
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int usuario=1 , altura=1 , totalaltura=0 , part=1 , max=1 , min=1 , cont=0;
        String dni1="" , dni2="" , dni3="";

        do{
            System.out.println("Pulsa 1 para introducir a los participantes");
            System.out.println("Pulsa 2 para ver la media de altura (en caso de que haya participantes)");
            System.out.println("Pulsa 3 para ver la persona con altura máxima");
            System.out.println("Pulsa 4 para ver la persona con altura mínima");
            System.out.println("Pulsa 0 para salir");
            usuario=teclado.nextInt();

            if(usuario>4 || usuario<0){
                System.out.println("Operacion no valida");
            }
            
            switch (usuario){
                case 1:
                    System.out.println("Introduzca el numero de participantes");
                    part= teclado.nextInt();
                    if(part>0){
                        while(cont!=part){
                            System.out.println("Introduzca su altura en cm: ");
                            altura= teclado.nextInt();
                            if(altura>0){
                                System.out.println("Introduzca su DNI: ");
                                dni1= teclado.next();
                                cont++;
                                totalaltura=altura+totalaltura;
                            }else{
                                System.out.println("Altura no valida");
                            }
                        }
                    }
                break;
                case 2:
                    if (cont>0){
                        System.out.println("Esta es la media de las alturas: "+totalaltura/cont);
                    }
                break;
                case 3:
                    if(altura>max){
                        max=altura;
                        dni2=dni1;
                        System.out.println("Esta es la altura mayor: "+max+" Con DNI: "+dni2+" de "+cont+" personas");
                    }
                break;
                case 4:
                    if(altura<min || min==0){
                        min=altura;
                        dni3=dni1;
                        System.out.println("Esta es la altura menor: "+min+" Con DNI: "+dni3+" de "+cont+" personas");
                    }
                break;
            }
        }while(usuario!=0);
        System.out.println("Hasta la vista");
        teclado.close();
    }
}
