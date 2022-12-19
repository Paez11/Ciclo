package General;

import Utils.lee;

public class Piramides {

	public static void main(String[] args) {
		int n=0, opcion=0;
	
		do {
			
			menu();
			opcion=lee.entero3();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Introduce la longuitud entre 3 y 9");
				n=lee.entero2();
				piramide1(n);
				break;
			case 2:
				System.out.println("Introduce la longuitud entre 3 y 9");
				n=lee.entero2();
				piramide2(n);
				break;
			case 3:
				System.out.println("Introduce la longuitud entre 3 y 9");
				n=lee.entero2();
				piramide3(n);
				break;
			case 4:
				break;
			}
			System.out.println();
		}while(opcion!=4);

		
	}
	
	public static void piramide1(int n) {
		for (int i=0;i<=n; i++) {
			for (int j=0;j<(n-i);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<(2*i-1);j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void piramide2(int n) {
		for(int i=0;i<=n;i++) {
			for (int j=0;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print(j+1);
			}
			for(int z=i-1;z>=1;z--) {
				System.out.print(z);
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--) {
			for (int j=0;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<=(i-1);j++) {
				System.out.print(j+1);
			}
			for(int z=i-1;z>=1;z--) {
				System.out.print(z);
			}
			System.out.println();
		}
	}
	
	public static void piramide3(int n) {
		for(int i=0;i<=n;i++) {
			for (int j=0;j>(n+1);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for (int j=0;j>(n+1);j++) {
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	public static void menu() {
		System.out.println("1.Piramide de números");
		System.out.println("2.Rombo");
		System.out.println("3.Medio rombo de números");
		System.out.println("4.Salir");
	}

}
