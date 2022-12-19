import Modelo.Alumno;
import Modelo.Grupo;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Alumno a1 = new Alumno("victor" , 8.67);
//		System.out.println(a1);
		
		Grupo g1 = new Grupo ("PrimeroSMR", 4);
		Grupo g2 = new Grupo ("SegundoSMR", 3);
		
		
		Alumno a1 = new Alumno("Victor" , 8.67);
		g1.newAlumno(a1);
		
		Alumno a2 = new Alumno("Maria", 6.45);
		g1.newAlumno(a2);
		
		Alumno a3 = new Alumno("Antonio", 5.55);
		g1.newAlumno(a3);
		
		Alumno a4 = new Alumno("Quique", 9.45);
		g1.newAlumno(a4);

		System.out.println(g1);
		
		System.out.println();
		
		Alumno a5 = new Alumno("Pepe" , 9.99);
		g2.newAlumno(a5);
		
		Alumno a6 = new Alumno("Felipe", 3.25);
		g2.newAlumno(a6);
		
		Alumno a7 = new Alumno("Lucia", 7.55);
		g2.newAlumno(a7);
		
		System.out.println(g2);
		
		System.out.println();
		
		g1.mediaGrupo(g1);
		g2.mediaGrupo(g2);
		
		System.out.println();
		
		g1.mejorNota(g1);
		g1.peorNota(g1);
		
		System.out.println();
		
		g2.mejorNota(g2);
		g2.peorNota(g2);
		
		System.out.println();
		
		g1.modificaNota("Victor");
		System.out.println();
		g2.modificaNota("Lucia");
		
		System.out.println();
		
		g1.muestraAlumno("Victor");
		g1.eliminaAlumno("Victor");
	}

}
