package programacion.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.*;     para importar todo el paquete

public class TryCatchEjemplo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;
        boolean valido=false;

        do{
            try{
                System.out.println("Inserte un numero entero");
                numero=teclado.nextInt();
                System.out.println("El cuadrado de su nuemro es: "+Math.pow(numero, 2));
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("Numero entero no valido");
                teclado.next();
            }catch(Exception ex){
                System.out.println("Error desconocido");
                valido=true;
            }finally{
                //teclado.close();
            }
        }while(!valido); //valido==false
        System.out.println("Gracias por usar nuestro software");
    }
}
