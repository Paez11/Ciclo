package programacion.condicionales;
public class ej17_2 {
    public static void main(String args[]){
        boolean turno=true; //dia
        boolean esDomingo=false;
        int nhoras=7;
        int sueldoPorHoras=-1;
        if (nhoras > 0 && nhoras <= 8){
            if(turno==true){
                sueldoPorHoras=10; //es diurno
            }
        }else{
            sueldoPorHoras=13;   //es nocturno
        }
        if (turno==true && esDomingo==true){
            sueldoPorHoras=sueldoPorHoras+2;
        }
        if (turno==false && esDomingo==true){
            sueldoPorHoras=sueldoPorHoras+3;
        }
    }
}