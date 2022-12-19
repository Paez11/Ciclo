package Controladores;

import MisEmpleados.Empleado;
import Utils.Lee;
import vistas.Menus;

public class ControlMenu {
	
	public static void menuPrincipal(Empleado e1) {
		
		int opcion=-1;
		int op2=0;
		int aumento=0;
		
		
		do {
			
			System.out.println("                 MENU\n");
			
			Menus.menuPrincipal();
			opcion=Lee.Entero();
			
			switch(opcion){
				case 1:
					System.out.println("--------------------------------------------------------------------------------------");
					menuDatos(e1);
					break;
				case 2:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce el aumento fijo para el empleado: ");
					e1.increaseSalary(Lee.Double((double)aumento));
					System.out.println(e1);
					break;
				case 3:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce el aumento en porcentaje para el empleado: ");
					e1.increaseSalary(aumento=Lee.Entero());
					System.out.println(e1);
					break;
				case 0:
					break;
			}
	
		}while(opcion>0);
		System.out.println("Hasta luego");
	}
	
	public static void menuDatos(Empleado e1) {
		String nuevoNombre="";
		int opcion=0;
		int n=0;
		double salario=0;
		
		do {
			
			Menus.menuDatos();
			opcion=Lee.Entero();
			
			switch(opcion){
				case 1:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce el nuevo nombre: ");
					e1.setNombre(Lee.String(nuevoNombre));
					System.out.println(e1);
					break;
				case 2:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce el nuevo departamento: ");
					e1.setDpto(Lee.String(nuevoNombre));
					System.out.println(e1);
					break;
				case 3:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce la nueva edad: ");
					e1.setAge(n=Lee.Entero());
					System.out.println(e1);
					break;
				case 4:
					System.out.println("--------------------------------------------------------------------------------------");
					System.out.print("Introduce el nuevo salario base: ");
					e1.setSalary(Lee.Double(salario));
					System.out.println(e1);
					break;
				case 0:
					
					break;
			}
	
		}while(opcion>0);
	}
}
