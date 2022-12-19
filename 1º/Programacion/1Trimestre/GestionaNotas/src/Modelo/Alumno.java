package Modelo;

public class Alumno {
	private String nombre;
	private Double nota;
	
	
	public Alumno(String nombre, Double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	
	public Alumno() {
		this.nombre ="";
		this.nota =0.0;
	}
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Double getNota() {
		return nota;
	}


	public void setNota(Double nota) {
		this.nota = nota;
	}


	@Override
	public String toString() {
		return " nombre: " + nombre + "|con nota: " + nota ;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if (this == obj) {
			result = true;
		}else if(obj==null) {
			result=false;
		}else {
			Alumno tmp = (Alumno)obj;						
			if(tmp.getNombre()==this.getNombre()) {
				result=true;
			}
		}
		return result;
	}
	
	
}
