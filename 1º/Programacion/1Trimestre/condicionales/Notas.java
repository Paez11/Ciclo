package programacion.condicionales;
import java.util.Scanner;
public class Notas {
    public static void main(String args[]){
        int nota;
        Scanner teclado= new Scanner (System.in);

        System.out.println("Introduce tu nota: ");
        nota=teclado.nextInt();

        if (nota>=0 && nota<=10){
            if (nota<5){
                System.out.println("Suspenso");
            }
            else if (nota==5){
                System.out.println("Aprobado");
            }
            else if (nota==6){
                System.out.println("Bien");
            }
            else if (nota==7 || nota==8){
                System.out.println("Notable");
            }
            else if (nota==9){
                System.out.println("Sobresaliente");
            }
            else if (nota==10){
                System.out.println("Matrícula");
            }
        }else{
            System.out.println("Nota incorrecta");
        }
    }
    
}
