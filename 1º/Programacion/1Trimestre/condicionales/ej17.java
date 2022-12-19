package programacion.condicionales;
public class ej17 {
    public static void main(String args[]){
        int horas=8;
        boolean turno;
        boolean domingo;
        float sueldo;
        if (turno==true) && (domingo==true){
            sueldo=10*8+2;

        }if else (turno==true) && (domingo==false){
            sueldo=10*8;
            System.out.printIn("el sueldo es"+sueldo);
        }
        if (turno==false) && (domingo==true){
            sueldo=13*8*3;
            System.out.printIn("el sueldo es"+sueldo);

        }if else (turno==false) && (domingo==false){
            sueldo=13*8;
            System.out.printIn("el sueldo es"+sueldo);
        }

    
    }
        

   
}
