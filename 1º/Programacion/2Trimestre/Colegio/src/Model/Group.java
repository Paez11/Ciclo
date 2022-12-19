package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Group {
	
	private String name;
	private ArrayList <Pupil> unidad;
	
	public Group(String name) {
		this.name=name;
		unidad = new ArrayList<>();
	}

	
	public boolean add (Pupil a) {
		boolean result=false;
		
		if(!this.unidad.contains(a)) {
			unidad.add(a);
			result=true;
		}
		/*
		if(unidad.contains(a)) {
			result=false;
			System.out.println("Ya existe el alumno");
		}else {
			unidad.add(a);
			result=true;
		}
		*/
		
		return result;
	}
	
	public Pupil remove(Pupil a) {
		
		Iterator <Pupil> it = unidad.iterator();
		
		while(it.hasNext()) {
			Pupil c = it.next();
			if(c.getName().equals(a.getName())) {
				it.remove();
				a=c;
			}
			
		}
		
		return a;
	}
	
	/*
	public Alumno remove(String nombre) {
		
		Iterator <Alumno> it = unidad.iterator();
		Alumno del=null;
		Alumno aux=null;
		
		while(it.hasNext()) {
			aux= it.next();
			if(aux.getName().equals(nombre)) {
				it.remove();
				del=aux;
			}
			
		}
		
		return del;
	}
	*/
	
	public Pupil remove2(String nombre) {
		Pupil del=null;
		
		for (int i = 0; i < unidad.size(); i++) {
			if(unidad.get(i).getName().equals(nombre)) {
				del=unidad.get(i);
				if(del!=null) {
					unidad.remove(del);	
				}
			}
		}
		
		return del;
	}
	
	public Pupil remove3(String nombre) {
		Pupil del=null;
		
		for (int i = 0; i < unidad.size(); i++) {
			if(unidad.get(i).getName().equals(nombre)) {
				del=unidad.get(i);
				if(del!=null) {
					unidad.remove(i);	
				}
			}
		}
		
		return del;
	}
	
	public Pupil remove4(String nombre) {
		Pupil del=null;
		
		for (Pupil alumno : unidad) {
			if(alumno.getName().equals(nombre)) {
				del=alumno;
			}
		}
		if(del!=null) {
			this.unidad.remove(del);
		}
		if(this.unidad.indexOf(del)>=0) {
			del=this.unidad.remove(this.unidad.indexOf(del));
		}
		
		//return del;
		return this.unidad.remove(this.unidad.indexOf(del));
	}
	
	/**
	 * Busca un alumno por su nombre
	 * @param name del alumno a buscar
	 * @return devuelve el alumno si lo ha encontrado
	 */
	public Pupil searchByName(String name) {
		Pupil search=null;
		
		for (int i = 0; i < unidad.size(); i++) {
			if(unidad.get(i).getName().equals(name)) {
				search=unidad.get(i);
			}
		}
		
		return search;
	}
	
	/**
	 * el indice dentro de la lista de un alumno buscado por su nombre
	 * @param name nombre del alumno buscado
	 * @return un entero con la posicion de la lista del alumno o -1 si no existe
	 */
	public int find(String name) {
		int pos=-1;
		if(this.searchByName(name)!=null) {
			pos=this.unidad.indexOf(this.searchByName(name));	
		}
		return pos; 
	}
	
	/**
	 * Modifica la nota de un alumno en funcion de su nombre
	 * @param name nombre del alumno
	 * @param newNote nueva nota del alumno
	 * @return devuelve true si ha podido modificarse y false si no
	 */
	public boolean editNote(String name,Double newNote) {
		boolean result=false;
		Pupil aux=this.searchByName(name);
		
		if(aux!=null) {
			aux.setNote(newNote);
			result=true;
		}
		
		return result;
	}
	
	/**
	 * Calcula la media de notas del grupo
	 * @return el valor de la media
	 */
	public double average() {
		Double average=0.00;
		
		for (Pupil alumno : unidad) {
			average+=alumno.getNote();
		}
		if(this.unidad.size()!=0) {
			average=average/this.unidad.size();
		}
		
		return average;
	}
	
	/**
	 * Obtiene la nota mas alta del grupo
	 * @return devuelve el alumno con la nota mas alta
	 */
	public Pupil highestNote() {
		Pupil aux=null;
		Double max=0.00;
		for (Pupil alumno : unidad) {
			if(alumno.getNote()>max) {
				max=alumno.getNote();
				aux=alumno;
			}
		}
		return aux;
	}
	
	/**
	 * Obtiene la nota mas baja del grupo
	 * @return devuelve el alumno con la nota mas baja
	 */
	public Pupil lowestNote() {
		Pupil aux=null;
		if(!this.unidad.isEmpty()) {
			Double min=this.unidad.get(0).getNote();
			for (Pupil alumno : unidad) {
				if(alumno.getNote()<min) {
					min=alumno.getNote();
					aux=alumno;
				}
			}
		}
		return aux;
	}
	
	@Override
	public String toString() {
		String s = "Unidad: "+this.name;
		
		for (Pupil alumno : unidad) {
			s+=alumno.toString();
		}
		
		return s;
		//return "Grupo --> name: " + name + " | unidad: \n" + unidad;
	}
	
	
	
}
