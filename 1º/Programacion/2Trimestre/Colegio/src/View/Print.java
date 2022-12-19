package View;

import Model.Group;
import Model.Pupil;

public class Print {
	
	public static void end() {
		System.out.println("Adios");
	}
	
	public static void showGroup(Group g) {
		System.out.println(g);
	}
	
	public static void putName() {
		System.out.print("Introduce el nombre del alumno(Sensible a mayusculas): ");
	}
	public static void putNote() {
		System.out.print("Introduce la nota del alumno de 0-10 (decimal 0.00): ");
	}
	
	public static void showPupil(Group g, String s) {
		
		System.out.println("Este es el alumno: ");
		System.out.println(g.searchByName(s));
	}
	
	public static void average(Group g) {
		System.out.println(g.average());
	}
	
	public static void highest(Group g) {
		System.out.println(g.highestNote());
	}
	
	public static void lowest(Group g) {
		System.out.println(g.lowestNote());
	}
	public static void confirm() {
		System.out.println("Cambios realizados correctamente");
	}
}
