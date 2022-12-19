package programacion.bucles;
import java.util.Scanner;
public class bucles {
    public static void main(String args[]){
        System.out.println("Ejercicios de bucles");
    }
    public static void ejercicio1(){        //ejercicio 28
        int n;
        int n1;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero: ");
        n=teclado.nextInt();
        while(n<101){
            n1=n%2;                  //if (n%2==0) mas simple 
            if (n1==0){
            System.out.println(n);
            }
            n++;
        }
    }
    public static void ejercicio2(){    //ejercicio 29
        int n1;
        int n2;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce el primer numero");
        n1=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        n2=teclado.nextInt();
        while (n1<n2){
          if (n1%2==1){
            System.out.println(n1);
          }
          n1++;  
        }

    }
    public static void ejercicio3(){    //ejercicio 30
        int num;
        int con=1;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero entero mayor que 0");
        num=teclado.nextInt();
        if (num==0){
            System.out.println("Error");
        }
        while (con<num){
            System.out.println(con++);
        }
    }
    public static void ejercicio4(){    //ejercicio 31
        int num;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce un numero");
        num=teclado.nextInt();

        while (num>0){
            System.out.println(num--);
        }
    }
    public static void ejercicio5(){    //ejercicio 32
        
    }
}
