package programacion.pruebas;
import java.util.Scanner;

public class RecogeDatos {
    public static void main(String args[]){
        int nume;
        float numf;
        String cadena;
        //Para recoger datos que introduzca el usuario
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce un valor entero:");
        nume=teclado.nextInt();//para recoger un entero next.Int

        System.out.println("Se ha introducido un valor real:");
        numf=teclado.nextFloat();

        System.out.println("Introduce un texto o cadena:");
        cadena=teclado.nextLine();
        

        System.out.println("El numero entero es: "+nume);
        System.out.println("El numero real es: "+numf);
        System.out.println("E texto es: "+cadena);
    }
}
