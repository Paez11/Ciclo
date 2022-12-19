import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        String cadena1 ="";



    }

    public static boolean Ejercicio1(String cad){
        boolean esPalindromo=false;
        String cad2=cad;
        cad= cad.toLowerCase().replace(" ","").replace(",","");
        for(int i=0; i< cad.length(); i++){
            char c=cad.charAt(i);
            for(int j=c; j<cad2.length();j--){
                if(cad.equals(cad2)){
                    esPalindromo=true;
                }
            }
        }

        return esPalindromo;
    }
}