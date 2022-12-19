package Modelo;

import java.util.Arrays;

import Utils.Lee;

public class Grupo {
	private String nombreGrupo;
	private Alumno [] grupo;
	
	public Grupo(String nombreGrupo, int numAlumno) {
		this.nombreGrupo = nombreGrupo;
		grupo = new Alumno [numAlumno];
	}
	

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public Alumno[] getGrupo() {
		return grupo;
	}

	public void setGrupo(Alumno[] grupo) {
		this.grupo = grupo;
	}
	
	
	
	/**
	 * Metodo para insertar nuevos alumnos al grupo que se desee, la funcion también comprueba si el alumno ya existe dentro
	 * y si el grupo también está lleno
	 * @param a1 : se introduce el nuevo alumno con su nombre y su nota
	 * @return devuelve true si se ha insertado y false si ya existe o no se puede 
	 */
	public boolean newAlumno (Alumno a1) {
		boolean insert=false;
		
		if (this.getAlumno(a1)!=-1) {
			System.out.println("El alumno ya esta dentro "+this.getAlumno(a1));
		}else if (this.lleno()) {
			System.out.println("Grupo lleno");
		}else {
			for (int i = 0; i < grupo.length && !insert; i++) {
				if (this.grupo[i]==null) {
					this.grupo[i]=a1;
					insert=true;
					System.out.println("Alumno insertado en la posicion "+i);
					System.out.println();
				}
			}
		}
			
		return insert;
	}
	
	/**
	 * Funcion que encuentra al alumno dentro del array para saber si ya existe y decir en que posicion del array esta
	 * @param a1: el alumno a buscar
	 * @return devuelve -1 si no se ha encotrado
	 */
	public int getAlumno(Alumno a1) {
		int hueco=-1;
		
		for (int i = 0; i < grupo.length; i++) {
			if(a1.equals(this.grupo[i])) {
				hueco=i;
				System.out.println("El alumno esta en la posicion: "+(hueco+1));
				System.out.println();
				i=grupo.length;
			}else if(i==grupo.length-1) {
				System.out.println("no se ha encontrado el alumno");
			}
		}
		
		
		return hueco;
	}
	
	/**
	 * Funcion sobrecarga de la anterior para encontrar al alumno según su nombre
	 * @param nombre varia para para introducir el nombre y ver si coincide
	 * @return devuelve -1 si no se ha encotrado
	 */
	public int getAlumno(String nombre) {
		int hueco=-1;
		
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]!=null && grupo[i].getNombre()==nombre) {
				hueco=i;
				i=grupo.length;
			}
		}
		
		return hueco;
	}
	
	/**
	 * Funcion que sirve para eliminar un alumno del array
	 * @param nombre: nombre a introducir del alumno
	 * @return devuelve el alumno eliminado
	 */
	public Alumno eliminaAlumno(String nombre) {
		Alumno eliminado=null;
			
		int hueco = this.getAlumno(nombre);
		
		if(hueco!=-1) {
			eliminado=grupo[hueco];
			grupo[hueco]=null;
			System.out.println("Alumno eliminado");
		}
		
		return eliminado;
	}
	
	/**
	 * Funcion para saber si un array esta lleno y no se puede introducir mas alumnos
	 * @return devuel un boolean, true si esta lleno, false si no
	 */
	public boolean lleno() {
		boolean lleno=true;
		
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]==null) {
				lleno=false;
			}
		}
		
		return lleno;
	}
	
	/**
	 * Funcion que muestra los datos de un alumno en funcion de la busqueda de su nombre
	 * @param nombre nombre a buscar sus datos
	 */
	public void muestraAlumno(String nombre) {
		
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]!=null && grupo[i].getNombre().equals(nombre)) {
				System.out.println("nombre: "+ grupo[i].getNombre());
				System.out.println("nota: "+ grupo[i].getNota());
				i=grupo.length;
			}else {
				System.out.println("No se ha podido encontrar al alumno");
			}
		}
	}
	
	/**
	 * Funcion que sirve para modificar la nota de un alumno en funcion de la busqueda de su nombre
	 * @param nombre: nombre del alumno a buscar
	 * @return devuelve la nota del alumno modificada
	 */
	public 	Double modificaNota(String nombre) {
		
		Double nota=0.0;
		
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i]!=null && grupo[i].getNombre().equals(nombre)) {
				System.out.println("Introduzca la nueva nota del alumno: ");
				grupo[i].setNota(Lee.Double(nota));
				i=grupo.length;
				System.out.println("Nota modificada");
			}else {
				System.out.println("No se ha encontrado al alumno");
			}
		}
		
		return nota;
	}
	
	/**
	 * Funcion para ver la media de notas del grupo.
	 * @param nombreGrupo: Se introduce el grupo del que se quiere saber la media
	 * @return devuelve la media del grupo
	 */
	public Double mediaGrupo(Grupo nombreGrupo) {
		Double media=0.0;
		
		for (int i = 0; i < grupo.length; i++) {
			if (nombreGrupo!=null) {
				media=((media+grupo[i].getNota())/grupo.length);
				System.out.println("Esta es la media del grupo: "+media);
				i=grupo.length;
			}else {
				System.out.println("No se ha encontrado el grupo o el grupo no tiene alumnos");
			}
		}
		
		return media;
	}
	
	/**
	 * Funcion para saber cual es la mejor nota del grupo. Te mostrara la nota, el nombre del alumno y la posicion del array
	 * @param nombreGrupo: Introduce el grupo del que se quiera saber la mejor nota
	 */
	public void mejorNota(Grupo nombreGrupo) {
		
		Double aux=0.0;
		int indice=0;
		String alum="";
		
		for (int i = 0; i < grupo.length; i++) {
			if (grupo[i].getNota()>aux) {
				aux=grupo[i].getNota();
				indice=i;
				alum=grupo[i].getNombre();
			}
		}
		System.out.println("La nota mayor es: "+aux+" y es: "+alum+" en la posicion: "+indice);
		
	}
	
	/**
	 * Funcion para saber cual es la nota mas baja en el grupo. Te mostrara la nota, el nombre del alumno y la posicion del array
	 * @param nombreGrupo: Introduce el nombre del grupo
	 */
	public void peorNota(Grupo nombreGrupo) {
		
		Double aux=10.00;
		int indice=0;
		String alum="";
		
		for (int i = 1; i < grupo.length; i++) {
			if (grupo[i].getNota()<aux) {
				aux=grupo[i].getNota();
				indice=i;
				alum=grupo[i].getNombre();
			}
		}
		System.out.println("La nota más baja es: "+aux+" y es: "+alum+" en la posicion: "+indice);
		
	}
	

	@Override
	public String toString() {
		System.out.println("Grupo: "+ nombreGrupo);
		return  Arrays.toString(grupo);
	}
	
	
}
