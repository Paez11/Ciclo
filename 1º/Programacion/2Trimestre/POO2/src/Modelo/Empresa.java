package Modelo;

public class Empresa {
	private String name;
	private int nEmployees;
	private Persona ceo;
	
	public Empresa(String name, int nEmployees, Persona ceo) {
		this.name = name;
		this.nEmployees = nEmployees;
		this.ceo = ceo;
	}
	
	public Empresa() {
		this("Unknown", -1, new Persona());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getnEmployees() {
		return nEmployees;
	}

	public void setnEmployees(int nEmployees) {
		this.nEmployees = nEmployees;
	}

	public Persona getCeo() {
		return ceo;
	}

	public void setCeo(Persona ceo) {
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Empresa [name=" + name + ", nEmployees=" + nEmployees + ", ceo=" + ceo + "]";
	}
	
	public Object clone() {
		Empresa result=null;
		try {
			result=(Empresa)super.clone();
			Persona ceoDuplicado=(Persona) this.ceo.clone();
			result.setCeo(ceoDuplicado);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Object) result;
	}
	
}
