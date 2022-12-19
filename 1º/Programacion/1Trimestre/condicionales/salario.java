package programacion.condicionales;
import java.util.Scanner;
public class salario {
    
    public static void main(String args[]){
        double sueldo;
        double sueldo2=0.0;
        int year;

        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce el salario del operario: ");
        sueldo=teclado.nextDouble();
        System.out.println("Introduce el tiempo del operario en el trabajo: ");
        year=teclado.nextInt();

        if (sueldo>1000 && year>=10){
            sueldo2=sueldo*0.2;
            System.out.println("Tu sueldo es: "+sueldo2);
        }else if (sueldo>1000 && year<10){
            sueldo2=sueldo*0.05;
            System.out.println("Tu sueldo es: "+sueldo2);
        }else if (sueldo>=1000){
            System.out.println("Tu sueldo es: "+sueldo);
        }
        System.out.println("Tu sueldo inicial era: "+sueldo);
        System.out.println("tu aumento es: "+(sueldo2-sueldo));
        System.out.println("Tu sueldo final es:"+sueldo2);
    }

    
}
