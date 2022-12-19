

package Introduccion;

import java.util.Scanner;


public class Ejecutable {

	public static void main(String[] args) {
		//int n=7;
		//String frase="hola";
		//String frase2=new String("Adiós");
		//Scanner teclado=new Scanner (System.in);
		Garaje g=new Garaje("Colón");
		System.out.println(g);
		
		coche c1=new coche("4565-VFC", "ford", 45);
		g.setPlaza1(c1);
		
		System.out.println(g);
		
		c1.setKms(777777777);
		System.out.println(g);
		/*
		coche micoche= new coche();
		coche tucoche= new coche("Fiat","0000-kkk",9999);
		
		System.out.println(micoche.toString());						
		System.out.println(tucoche);
		
		micoche.setMatricula("4352-HDR");								//micoche.matricula="4352-HDR";
		micoche.setModelo("Toyota");
		micoche.setKms(100);
		
		tucoche.setMatricula("6543-BGD");
		tucoche.setModelo("BMW");
		tucoche.setKms(200);
		
		System.out.println(micoche.toString());					//System.out.println(micoche.info());	
		System.out.println(tucoche);
		*/

	}

}
