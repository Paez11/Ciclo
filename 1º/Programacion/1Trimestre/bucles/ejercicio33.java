package programacion.bucles;
import java.util.Scanner;
public class ejercicio33 {
    public static void main(String args[]){
        int n1=1;
        int n2=1;
        Scanner teclado= new Scanner (System.in);
        
        while (n1!=0 || n2!=0){
            System.out.println("Introduce un numero: ");
            n1=teclado.nextInt();
            if (n1==0){
                System.out.println("Es 0");
            }
            
            System.out.println("Introduce otro numero: ");
            n2=teclado.nextInt();
            if (n2==0){
                System.out.println("Es 0");
            }
            
            System.out.println("El cuadrado del primer número es: "+(n1*n1));
            System.out.println("El cuadrado del segundo es: "+(n2*n2));
            
            if (n1%2==0 ){
                System.out.println("El primer número es par");
            }else{
                System.out.println("El primer número es impar");
    
            }
            if (n1!=-n1){
                System.out.println("El primer número es positivo");
            }else{                
                System.out.println("El segundo número es negativo");
            }
    
            if (n2%2==0 ){
                System.out.println("El segundo número es par");
            }else{
                System.out.println("El segundo número es impar");
    
            }
            if (n2!=-n2){
                System.out.println("El segundo número es positivo");
            }else{                
                System.out.println("El segundo número es negativo");
            }
            /*
            do{
                System.out.println("Introduce un numero: ");
                n1=teclado.nextInt();
                if (n1==0){
                    System.out.println("Es 0");
                }
                
                System.out.println("Introduce otro numero: ");
                n2=teclado.nextInt();
                if (n2==0){
                    System.out.println("Es 0");
                }
                
                System.out.println("El cuadrado del primer número es: "+(n1*n1));
                System.out.println("El cuadrado del segundo es: "+(n2*n2));
                
                if (n1%2==0 ){
                    System.out.println("El primer número es par");
                }else{
                    System.out.println("El primer número es impar");
        
                }
                if (n1>0){
                    System.out.println("El primer número es positivo");
                }else{                
                    System.out.println("El segundo número es negativo");
                }
        
                if (n2%2==0 ){
                    System.out.println("El segundo número es par");
                }else{
                    System.out.println("El segundo número es impar");
        
                }
                if (n2>0){
                    System.out.println("El segundo número es positivo");
                }else{                
                    System.out.println("El segundo número es negativo");
            }while(n1!=0 || n2!=0);
            */
        }
        teclado.close();
    }
}
