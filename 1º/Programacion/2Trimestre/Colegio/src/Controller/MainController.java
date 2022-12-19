package Controller;

import Model.Group;
import Model.Pupil;
import Utils.Read;
import View.Error;
import View.Menu;
import View.Print;

public class MainController {
	
	public static void run(){
		int option=-1;
		do {
			Menu.mainMenu();
			option=Read.integrer();
			switchMain(option);
			
		}while(option!=3);
	}
	
	/**
	 * Ejecuta una de las opciones disponibles del menu principal
	 * @param option opcion que va ha recibir
	 */
	public static void switchMain(int option) {
		
		Group g1 = new Group ("Primero SMR");
		Group g2 = new Group ("Segundo SMR");
		
		Pupil a1 = new Pupil("Pedro", 7.5);
		Pupil a2 = new Pupil("Marta", 5.5);
		Pupil a3 = new Pupil("Sergio", 2.5);
		
		Pupil a4 = new Pupil("Lola", 9.5);
		Pupil a5 = new Pupil("Martin", 6.5);
		Pupil a6 = new Pupil("Antonio", 3.5);
		
		g1.add(a1);
		g1.add(a2);
		g1.add(a3);
		
		g2.add(a4);
		g2.add(a5);
		g2.add(a6);
		
		switch(option) {
		case 1:									//modificar datos del grupo
			Menu.groups();
			boolean result=false;
			do {
				int suboption=Read.integrer();
				if(suboption==1) {
					result=true;
					menuEdit(g1);
				}
				if(suboption==2) {
					result=true;
					menuEdit(g2);
				}
				else {
					Error.invalidOption();
				}
			}while(!result);
			break;
		case 2:								//mostrar datos del grupo
			Menu.groups();
			result=false;
			do {
				int suboption2=Read.integrer();
				if(suboption2==1) {
					result=true;
					menuShow(g1);
				}
				if(suboption2==2) {
					result=true;
					menuShow(g2);
				}
				else {
					Error.invalidOption();
				}
			}while(!result);
			break;
		case 3:								//salir
			Print.end();
			break;
		default:
			Error.invalidOption();
			break;
		}
	}
	
	/**
	 * Ejecuta una de las opciones del submenu de opciones
	 * @param g recibe el grupo el cual se quiere modificar
	 */
	public static void menuEdit(Group g) {
		
		String s="";
		double d=0.00;
		
		Menu.editMenu();
		int option=Read.integrer();
		switch(option) {
		case 1:							//insertar alumno
			Print.putName();
			s=Read.String();
			Print.putNote();
			d=Read.Double();
			Pupil a = new Pupil(s,d);
			g.add(a);
			Print.confirm();
			break;
		case 2:						//modificar nota
			Print.putName();
			s=Read.String();
			Print.putNote();
			d=Read.Double();
			if(d>=0 || d<=10) {
				g.editNote(s, d);
				Print.confirm();
			}else {
				Error.error();
			}
			break;
		case 3:					//eliminar alumno
			Print.putName();
			s=Read.String();
			g.remove3(s);
			Print.confirm();
			break;
		case 4:
			break;
		default:
			Error.invalidOption();
			break;
		}
	}
	
	
	/**
	 * Ejecuta una de las opciones disponibles del submenu que seran de mostar informacion
	 * @param g recibe el grupo del cual se quiere saber informacion
	 */
	public static void menuShow(Group g) {
		
		Menu.showMenu();
		int option=Read.integrer();
		String s="";
		
		switch(option) {
		case 1:						//mostar grupo
			Print.showGroup(g);
			break;
		case 2:						//buscar alumno
			Print.putName();
			s=Read.String();
			g.searchByName(s);
			if(g.searchByName(s)!=null) {
				Print.showPupil(g, s);
			}else {
				Error.unexistend();
			}
			break;
		case 3:						//mostar media
			Print.average(g);
			break;
		case 4:						//mostrar nota mas alta
			Print.highest(g);
			break;
		case 5:						//mostrar nota mas baja
			Print.lowest(g);
			break;
		case 6:
			break;
		default:
			Error.invalidOption();
			break;
		}
	}
}
