/*
Realizar un programa que pida un número entero entre 1 y 15.
El programa mostrará una serie de opciones: 0.
Abandonar el programa, 1. Factorial del número, 2.
Tabla de multiplicar del número, 3. Serie Fibonacci del número. 4.
Cambiar el número.
*/

package programacion.bucles;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio42 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        int usuario=1, num=1 , cont=0, result=0, num2=0, num3=1;
        boolean valido=false;

        do{
            try{
            System.out.println("introduce un numero entre 1 y 15");
            num=teclado.nextInt();
            valido=true;
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido || num<=0 || num>15);

        /*
        do{
            System.out.println("introduce un numero entre 1 y 15");
            num=teclado.nextInt();

            if (num<0 || num>15){
                System.out.println("El numero no esta entre 1 y 15");
            }
        }while(num<1 || num>15);
        */
        do{
            try{

                System.out.println("Pulsa 1 para ver el factorial del numero introducido");
                System.out.println("Pulsa 2 para ver la tabla de multiplicar del numero");
                System.out.println("Pulsa 3 para ver la serie de Fibonacci del numero");
                System.out.println("Pulsa 4 para cambiar el numero");
                System.out.println("Pulsa 0 para abandonar el programa");
                usuario=teclado.nextInt();

                switch(usuario){
                    case 1:
                        cont=num;
                        while(cont>=1){
                            result=num*--cont;
                            System.out.println(result);
                        }
                        break;
                    case 2:
                        cont=0;
                        while(cont<10){
                            cont++;
                            result=num*cont;
                            System.out.println(result);
                        }
                        break;
                    case 3:
                        cont=0;
                        while(cont<=num){
                            cont++;
                            result=num2+num3;
                            num2=num3;
                            num3=result;
                            System.out.println(result);
                        }
                        break;
                    case 4:
                        do{
                            try{
                            System.out.println("introduce un numero entre 1 y 15");
                            num=teclado.nextInt();
                            valido=true;
                            }catch(InputMismatchException ex){
                                System.out.println("numero no valido");
                                teclado.next();
                            }
                        }while(!valido || num<=0 || num>15);
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(usuario!=0);
        System.out.println("Hasta la próxima");
        teclado.close();
    }
}