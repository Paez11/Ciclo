package programacion.excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Try_CatchE {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        int numero=0;
        numero/=0;
        System.out.println("Inserte un numero entero");
        throw new Exception("Estoy cansado");
        try{
            numero=teclado.nextInt();
            System.out.println("El numero insertado es "+numero);
            }catch(Exception ex){
                System.out.println("Introduzca un numero entero");
                //System.out.println("Inserte un numero entero");
                //System.out.println(ex);
                //ex.printStackTrace();                               //Precaución
            }catch(ArithmeticException ex){
                System.out.println("no 0");
            }catch(Exception ex){
                System.out.println("Error desconocido");
            }finally{
                System.out.println("En cualquier caso se ejecuta");
        }
        teclado.close();
    }
}
