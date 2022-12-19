/*
 * Realiza un programa organizado en funciones, que implemente
 *  las 4 operaciones básicas de una calculadora. El programa
 *   muestra un menú, y debe controlar los posibles errores del usuario.
 */

package Ejercicios;
/**
 * calculadora
 * @author victor
 *
 */
import java.util.Scanner;
import java.util.InputMismatchException;
public class ejercicio54 {

	public static void main(String[] args) {
		int op=0;
		do {
			muestraMenu();
			op=leeEntero();
			switch(op) {
			case 0:
				break;
			case 1:
				System.out.println("Introduce dos numeros");
				suma();
				break;
			case 2:
				System.out.println("Introduce dos numeros");
				resta();
				break;
			case 3:
				System.out.println("Introduce dos numeros");
				multi();
				break;
			case 4:
				System.out.println("Introduce dos numeros");
				int o1=leeEntero();
				int o2=leeEntero();
				try {
					int resultado=div(o1,o2);
					System.out.println(resultado);
				}catch(ArithmeticException ex) {
					System.out.println("Error");
				}
				break;
			default:
				System.out.println("Opción no valida");	
			}
		}while(op!=0);
		System.out.println("Adios");
			

	}
	public static void muestraMenu() {
		System.out.println("        Calculadora");
		System.out.println("Pulsa 1  suma");
		System.out.println("Pulsa 2  resta");
		System.out.println("Pulsa 3  multiplicación");
		System.out.println("Pulsa 4  división");
		System.out.println("Pulsa 0  salir");
	}

	public static int leeEntero() {
		int n=0;
		boolean valido=false;
		Scanner teclado = new Scanner (System.in);
		do{
            try{
                n=teclado.nextInt();
                valido=true;
            }catch(InputMismatchException ex){
                System.out.println("numero no valido");
                teclado.next();
            }
        }while(!valido || n<0);
		return n;
	}

	public static void suma() {
		int result=leeEntero()+leeEntero();
		System.out.println(result);
	}
	public static void resta() {
		int result=leeEntero()-leeEntero();
		System.out.println(result);
	}
	public static void multi() {
		int result=leeEntero()*leeEntero();
		System.out.println(result);
	}
	public static int div(int s1, int s2)
			throws ArithmeticException{
		int result=-1;
			result=s1/s2;
		return result;
	}
	/*
	public static int div(int s1, int s2) {
		int result=-1;
		if (s2!=0) {
			result=s1/s2;
		}else {
			System.out.println("Error");
		}
		System.out.println(result);
		return result;
	}
	*/
	/*
	public static int div(int s1, int s2) {
		int result=-1;
		try {
			result=s1/s2;
		}catch (ArithmeticException ex) {
			System.out.println("Error");
		}
		System.out.println(result);
		return result;
	}
	*/
	


}
/*
 * 	public static int(int s1, int s2) {
		int result=-1;
		result=s1+s2;
		return result;
	}
	case 1:
	Syso ("Introduce n1");
	int s1=leeEntero();
	Syso ("Introduce n2");
	int s2=leeEntero();
	int r=suma(s1, s2);
	Syso("....."+r);
*/
