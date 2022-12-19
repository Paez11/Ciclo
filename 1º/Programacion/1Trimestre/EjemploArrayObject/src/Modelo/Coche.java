package Modelo;

public class Coche {
	private String matricula;
	private String propietario;
	
	
	
	public Coche(String matricula, String propietario) {
		this.matricula = matricula;
		this.propietario = propietario;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", propietario=" + propietario + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if (this == obj) {
			result = true;
		}else if(obj==null) {
			result=false;
		}else {
			Coche tmp = (Coche)obj;						//temporal 
			if(tmp.getMatricula()==this.getMatricula()) {
				result=true;
			}
		}
		return result;
	}
	
}
