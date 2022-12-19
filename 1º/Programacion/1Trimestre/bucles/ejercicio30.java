package programacion.bucles;
import java.util.Scanner;
public class ejercicio30 {
    public static void main(String args[]){
        int num=0;
        int con=1;
        int suma=0;
        Scanner teclado= new Scanner (System.in);

       // System.out.println("Introduce un numero entero mayor que 0");
       // num=teclado.nextInt();
        while (num<=0){
            System.out.println("Introduce un numero entero mayor que 0");
            num=teclado.nextInt();
            if (num<=0){
                System.out.println("Error, vuelve a introducir");
            }
        }
       // if (num<=0){
         //   System.out.println("Error");
       // }
        while (con<=num){
            suma=suma+con;
            con++;
        }
        System.out.println(suma);

        /*
        do{
            System.out.println("Introduce un numero entero mayor que 0");
            num=teclado.nextInt();
            if (num<=0){
                System.out.println("Error, vuelve a introducir");
            }
        }while(num<=0);


        do{
            suma=suma+con;
            con++;
        }while(con<=num);
        System.out.println(suma);
        */
        teclado.close();
    }
}