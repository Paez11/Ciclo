package programacion.condicionales;
import java.util.Scanner;
public class notas2 {
    
    public static void main(String args[]){
        int nota;
        Scanner teclado=new Scanner(System.in);

        System.out.println("Introduce tu nota: ");
        nota=teclado.nextInt();

        switch (nota){
            case 1, 2, 3, 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7, 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Sobresaliente");
                break;
            case 10:
                System.out.println("Matricula");
                break;
            default:
        }

    }
}
