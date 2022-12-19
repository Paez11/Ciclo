package General;

import java.util.InputMismatchException;
import java.util.Scanner;

import Utils.lee;

public class Ejercicios {

	public static void main(String[] args) {
		//Numero3();
		//Numero4();
		//Numero5();
		Numero16();

	}
	
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void Numero3() {
		int perimetro=0, superficie=0, lado=0;
		System.out.println("Introduce el valor del lado (entero)");
		lado=lee.entero();
		perimetro=lado+lado+lado+lado;
		superficie=lado*lado;
		System.out.println("Este es el perimetro: "+perimetro);
		System.out.println("Esta es la superficie: "+superficie);
		
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void Numero4() {
		double salario=0, irpf=0, importe=0;
		System.out.println("Introduce el salario");
		salario=lee.decimal();
		System.out.println("Introduce el irpf en decimal");
		irpf=lee.decimal();
		importe=salario/irpf;
		System.out.println("Este es el importe: "+importe);
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void Numero5() {
		double superficie=0, largo=0, alto=0;
		
		System.out.print("Introduce el valor del lado de la pared: ");
		largo=lee.decimal();
		
		System.out.print("Introduce el valor de la altura de la pared: ");
		alto=lee.decimal();
		
		superficie=largo*alto;
		superficie=superficie*0.05;
		
		System.out.println("Necesita: "+superficie+"m^3 de arena");
		
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	public static void Numero16() {
		int min=0,valor=1;
		
		while(min!=6) {
			valor=(int)((double)valor*0.90);
			System.out.println(valor);
			if(min==5) {
				valor=(int)((double)valor*1.1);
				System.out.println(valor);
			}
			min++;
		}
	}
}
