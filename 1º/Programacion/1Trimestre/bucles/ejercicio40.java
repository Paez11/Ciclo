package programacion.bucles;
import java.util.Scanner;
public class ejercicio40 {
    public static void main(String[] args) {
        int usuario=0;
        int n1=0;
        int n2=0;

        Scanner teclado = new Scanner (System.in);

        do{
            n1= (int) (Math.random()*100+1);
            n2= (int) (Math.random()*100+1);

            System.out.println("Pulsa 1 para ver una suma");
            System.out.println("Pulsa 2 para ver una resta");
            System.out.println("Pulsa 3 para ver una multiplicación");
            System.out.println("Pulsa 4 para ver una división");
            System.out.println("Pulsa 5 para salir");
            usuario=teclado.nextInt();

            if(usuario>5 || usuario<1){
                System.out.println("Operacion no valida");
            }

            switch(usuario){
                case 1: System.out.println("Esta es la suma: "+(n1+n2));
                break;
                case 2: System.out.println("Esta es la resta: "+(n1-n2));
                break;
                case 3: System.out.println("Esta es la multiplicación: "+(n1*n2));
                break;
                case 4: System.out.println("Esta es la división: "+(n1/n2));
                    if(n2>n1 || n2==0){
                        System.out.println("No se puede hacer la división");
                    }
                break;
            }
        }while(usuario!=5);
        System.out.println("Hasta la vista baby");
        teclado.close();
    }
}
