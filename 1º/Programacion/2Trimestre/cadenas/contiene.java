import java.util.Scanner;

public class contiene {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        String cad1, cad2;

        System.out.println("Escriba una cadena");
        cad1=teclado.next();

        System.out.println("Escriba la otra cadena");
        cad2=teclado.next();

        if(cad1.contains(cad2)){
            System.out.println("la segunda cadena se encuentra en la primera cadena");
        }else{
            System.out.println("la segunda cadena no se encuentra en la primera cadena");
        }

    }
}
