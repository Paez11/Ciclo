package listaEnlazadaSimple;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	protected String matricula;
	private float kms;
	private String marca;
	private String modelo;
	
	public Vehiculo(String matricula, float kms, String marca, String modelo) {
		this.matricula = matricula;
		this.kms = kms;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Vehiculo() {
		this.matricula = "";
		this.kms = 0f;
		this.marca = "";
		this.modelo = "";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getKms() {
		return kms;
	}

	public void setKms(float kms) {
		this.kms = kms;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return " "+
				"\n matricula: " + matricula + 
				"\n kms: " + kms + 
				"\n marca: " + marca + 
				"\n modelo: " + modelo;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		if(obj!=null) {
			if(this==obj) {
				result=true;
			}else {
				if(obj instanceof Vehiculo) {								
					Vehiculo tmp= (Vehiculo) obj;								
					if(this.matricula!=null && this.matricula.equals(tmp.matricula)) {	
						result=true;
					}else {
						result=false;
					}
				}
			}
		}
		return result;
	}
	
	
	
	
}
