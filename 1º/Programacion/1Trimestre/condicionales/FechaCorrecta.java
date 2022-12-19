package programacion.condicionales;
import java.util.Scanner;
public class FechaCorrecta {
    public static void main(String args[]){
        int dia;
        int mes;
        int year;
        Scanner teclado = new Scanner (System.in);

        System.out.println("Introduce un año:");
        year=teclado.nextInt();
        System.out.println("Introduce un mes:");
        mes=teclado.nextInt();
        System.out.println("Introduce un día:");
        dia=teclado.nextInt();

        if (year>0 && mes>=0 && mes<=12 && dia>=1 && dia<=31){
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && mes==2 && dia<=29){
                System.out.println("La fecha es: "+dia+"/"+mes+"/"+year);
            }else{
                if (mes==2 && dia<=28){
                    System.out.println("La fecha es: "+dia+"/"+mes+"/"+year);
            }else if (dia<=30 && (mes==4 || mes==6 || mes==9 || mes==11)){
                System.out.println("La fecha es: "+dia+"/"+mes+"/"+year);
            }else if ((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&dia<32) {
                System.out.println("La fecha es: "+dia+"/"+mes+"/"+year);
            }else{
                System.out.println("La fecha es incorrecta"); 
            }
            }
        }else{
            System.out.println("La fecha es incorrecta");
        }
    }
}