package programacion.condicionales;
import java.util.Scanner;
public class Sueldo {
    public static void main(String args[]){
        double sueldo;
        int year;
        double sueldo2=0.0;

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Introduzca el sueldo del operario: ");
        sueldo=teclado.nextFloat();
        System.out.println("Introduzca los años de trabajo del operario: ");
        year=teclado.nextInt();


        if (sueldo<1000 && year>=10){
            sueldo2=sueldo*0.2;
            System.out.println("Tu sueldo es: "+sueldo2);
        }else if (sueldo<1000 && year<10){
            sueldo2=sueldo*0.05;
            System.out.println("Tu sueldo es: "+sueldo2);
        }else if (sueldo>=1000){
            System.out.println("Tu sueldo es: "+sueldo);
        }

        System.out.println("sueldo inicial"+sueldo);
        System.out.println("sueldo aumentado"+(sueldo2-sueldo));
        System.out.println("sueldo inicial"+sueldo2);
    }
}
