/*
Debes desarrollar un juego llamado ClaveSecreta, que consiste en abrir una maleta que guarda
un tesoro, a través de su combinación secreta de números. Esta combinación está formada por
dígitos del 1 al 5. El jugador especificará cuál es la longitud de la clave, mientras más larga, más
dificultad tendrá el juego, y también especificará el número de intentos permitidos.
La aplicación generará de forma aleatoria, una combinación secreta que el usuario tendrá que
acertar. En cada intento se muestra como pista, para cada dígito de la combinación introducida
por el jugador, si es mayor, menor o igual que el correspondiente en la combinación secreta.
El juego terminará cuando acierte la combinación, o cuando se agoten el número de intentos.
METODOS QUE NECESITARÁS IMPLEMENTAR:
- Comparar array: devolverá true si son iguales, y false si son distintos.
- Generar combinación secreta: generará un array con elementos aleatorios entre 1 y 5.
- Pedir combinación del jugador: generará un array con los valores introducidos por el
usuario (deberá validar los datos).
- Mostrar pistas: método que por cada elemento del array del usuario, mostrará Mayor,
Menor o Igual, al compararlo con la clave secreta.
Además de estos métodos, podrás necesitar otros, según el planteamiento que des a la tarea.
Se pide:
Implementar una clase, ClaveSecreta, que implemente el juego descrito anteriormente. Se
puntuará los comentarios, el orden, el código tabulado…
 */

package juegos;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Programa creado para jugar a ClaveSecreta. Instrucciones del juego en el pdf
 * @author victor Paez Anguita
 *
 */
public class ClaveSecreta {

	public static void main(String[] args) throws Exception {
		Scanner teclado = new Scanner (System.in);
		bienvenido();
		int lon=leeLongitud("Introduce la longitud de la contraseña");
		int [] clave = new int[lon];
		int [] usuario = new int[lon];
		rellenaAleatorio(clave,1, 5);
		muestraClave(clave);
		
		int intentos=leeLongitud("¿Cuantas veces quieres intentarlo?");
		int cont=0;
		do {
			try {
			usuarioArray(usuario);
			}catch(Exception e) {
				System.out.println(e);
			}
			cont++;												//He puesto el contandor encima de la condicion para que no muestre las pistas al terminar los intentos
			if(comparaArray(clave, usuario)==true) {
				cont=intentos;
			}else if(comparaArray(clave, usuario)==false) {
					if(cont!=intentos) {							//Mientras haya intentos y no aciertes muestre las pistas
					pistas(clave, usuario);
				}
			}
			System.out.println("te quedan "+(intentos-cont)+" intentos");

		}while(cont<intentos);
		if(comparaArray(clave, usuario)==false) {				//Para mostrar mensaje si pierdes
			perder();
		}else if(comparaArray(clave, usuario)==true) {		//Para mostrar mensaje si ganas
			ganar();
		}
	}
//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------	
	
	
	/**
	 * Funcion para que el usuario introduzca los numeros para acertar. Siempre que esten entre 1 y 5
	 * @param frase: para solicitar a la funcion la frase que quiera imprimir
	 * @return
	 */
	public static int leeEntero(String frase) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valid=false;
		do {
			System.out.println(frase);
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<=0 || n>5);
		return n;
	}
	
	/**
	 * Lo misma funcion que leeEntero pero modificada para la longitud de la contraseña
	 * @param frase: para solicitar a la funcion la frase que quiera imprimir
	 * @return
	 */
	public static int leeLongitud(String frase) {
		Scanner teclado = new Scanner (System.in);
		int n=0;
		boolean valid=false;
		do {
			System.out.println(frase);
			try {
				n=teclado.nextInt();
				valid=true;
			}catch(InputMismatchException ex) {
				System.out.println("Error");
				teclado.next();
			}
		}while(!valid || n<=0);
		return n;
	}
	
	/**
	 * Lanza las excepciones hacia el metodo principal para cuando el usuario teclee un número que no está comprendido entre 1 y 5
	 * @return
	 * @throws Exception
	 */
	public static int correct() throws Exception{
		int n1=-1;
		n1=leeEntero("Introduce un número del 1 a 5");
		if (n1<=0) {
			throw new Exception("Numero introducido no esta entre 1 y 5");
		}
		if (n1>5) {
			throw new Exception("Numero introducido no esta entre 1 y 5");
		}
		return n1;
	}

//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
	/**
	 * Para rellenar aleatoriamente un array
	 * @param miArray: el array al que se introduciran los valores aleatorios
	 * @param upper: El elemento mas alto que se quiera introducir
	 * @param lower: El elemento mas bajo que se quiera introducir
	 */
	public static void rellenaAleatorio(int[]miArray, int upper, int lower) {
		int aux=0;
		if(lower>upper) {
			aux=lower;
			lower=upper;
			upper=aux;
		}
		for (int i=0;i<miArray.length;i++) {
			miArray[i]=(int) (Math.random() * (upper - lower)) + lower;
		}
	}
	
	/**
	 * Funcion para generar el array que el usuario introduzca mientras juega
	 * @param usuario: Array en el que se acomularan los elementos
	 * @throws Exception 
	 */
	public static void usuarioArray(int[]usuario) throws Exception {
		for(int i=0;i<usuario.length;i++) {
			usuario[i]=correct();
		}
	}

//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
	/**
	 * Funcion para saber si los elementos introducidos por el usuario son iguales que los generados aleatoriamente
	 * @param clave: Para el array aleatorio
	 * @param usuario: Para los elementos introducidos por el usuario
	 * @return
	 */
	public static boolean comparaArray(int[]clave, int[]usuario) {
		boolean igual=true;
		for(int i=0;i<clave.length;i++) {
			if(clave[i]==usuario[i]) {
					igual=true;
					//System.out.println("Acertastes");
					
			}else {
				//System.out.println("Fallastes");
				igual=false;
			}
		}
			
		return igual;
	}
	/**
	 * Funcion para dar pistas al usuario cuando no acierta la contraseña
	 * @param clave: array de la clave generada aleatoriamente
	 * @param usuario: array del usuario
	 */
	public static void pistas(int[]clave, int[]usuario) {
		for(int i=0;i<clave.length;i++) {
			if(clave[i]<usuario[i]) {
				System.out.println("El numero de la clave es menor que: "+usuario[i]);
			}else if(clave[i]==usuario[i]) {
				System.out.println("El numero de la clave es igual que: "+usuario[i]);
			}else {
				System.out.println("El numero de la clave es mayor que: "+usuario[i]);
			}
		}
	}
	
//------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------
	
	/**
	 * Funcion de decoracion para que muestre el numero de asterisco como elementos haya introducido el usuario en la longitud del array
	 * @param miArray
	 */
	public static void muestraClave(int [] miArray) {
		String d="*";
		for(int i=0; i<miArray.length;i++) {
			System.out.print(d+" ");
		}
		System.out.println();
	}
	
//Las siguientes funciones son un mensaje para finalizar el juego
	
	public static void ganar() {
		System.out.println("----------------------------------------------------------");
		System.out.println("           Felicidades, has ganado el juego");
		System.out.println("----------------------------------------------------------");
	}
	public static void perder() {
		System.out.println("----------------------------------------------------------");
		System.out.println("           Lo sentimos, has perdido el juego");
		System.out.println("----------------------------------------------------------");
	}
	public static void bienvenido() {
		System.out.println("----------------------------------------------------------");
		System.out.println("           El juego de la contraseña secreta");
		System.out.println("----------------------------------------------------------");
	}
	/*
	public static void muestraArray(int [] miArray) {
		for(int i=0; i<miArray.length;i++) {
			System.out.print(miArray[i]+" ");
		}
		System.out.println();
	}
	*/

}