package programacion.condicionales;
import java.util.Scanner;
public class Mes {
    public static void main(String args[]){
        int mes;
        int dias=0;
        String mes2="";

        Scanner teclado=new Scanner (System.in);

        System.out.println("Introduzca un mes: ");
        mes=teclado.nextInt();

        switch (mes){
            case 1: mes2="Enero";
                dias=31;
                break;
            case 2: mes2="Febrero";
                dias=28;
                break;
            case 3: mes2="Marzo";
                dias=31;
                break;
            case 4: mes2="Abril";
                dias=30;
                break;
            case 5: mes2="mayo";
                dias=31;
                break;
            case 6: mes2="junio";
                dias=30;
                break;
            case 7: mes2="julio";
                dias=31;
                break;
            case 8: mes2="agosto";
                dias=31;
                break;
            case 9: mes2="septiembre";
                dias=30;
                break;
            case 10: mes2="octubre";
                dias=31;
                break;
            case 11: mes2="noviembre";
                dias=30;
                break;
            case 12: mes2="diciembre";
                dias=31;
                break;
            default:
                System.out.println("mes no valido");
        }
        System.out.println("El mes es"+mes2+"y tiene "+dias+" dias");

    }
    
}
