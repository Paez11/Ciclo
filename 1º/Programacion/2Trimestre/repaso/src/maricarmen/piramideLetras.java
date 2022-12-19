package maricarmen;

import java.util.Scanner;

public class piramideLetras {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		char []miArray = new char [26];
		rellenaLetras(miArray);
		
		System.out.print("Introduce la longuitud: ");
		int t=teclado.nextInt();
		/*
		for(int i=0; i<miArray.length;i++) {
			System.out.print(miArray[i]+" ");
			
		}
		*/
		piramideArray1(t,miArray);
		//System.out.println("--------------------------------------------------------------------------------------------");
		piramideArray2(t,miArray);
		System.out.println("--------------------------------------------------------------------------------------------");
		piramideArray3(t,miArray);
		System.out.println("--------------------------------------------------------------------------------------------");
		piramideArray4(t,miArray);
		System.out.println("--------------------------------------------------------------------------------------------");
		piramideArray5(t,miArray);
	}
	
	public static void rellenaLetras(char[] miArray) {
		for(int i=0;i<miArray.length;i++) {
			miArray[i]=(char)(i+97);
		}
	}
	public static int piramideArray1(int n, char[] lon) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(lon[j]);
			}
			System.out.println();
		}
		return n;
	}
	public static int piramideArray2(int n, char[] lon) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(lon[j]);
			}
			System.out.println();
		}
		return n;
	}
	
	public static int piramideArray3(int n, char[] lon) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++) {
				System.out.print(lon[j]);
			}
			System.out.println();
		}
		return n;
	}
	public static int piramideArray4(int n, char[] lon) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(" ");
			}
            for (int j=0; j<=i; j++){        
            	System.out.print(lon[j]);
            }
            for (int j=i;j>0;j--) {
            	System.out.print(lon[j-1]);
            }
			System.out.println();
		}
		return n;
	}
	public static int piramideArray5(int n, char[] lon) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(" ");
			}
            for (int j=0; j<=(2*i); j++){        
            	System.out.print(lon[j]);
            }
			System.out.println();
		}
		return n;
	}

}
