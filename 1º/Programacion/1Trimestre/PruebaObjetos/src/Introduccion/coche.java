package Introduccion;

public class coche {
	private String matricula;			
	private String modelo;
	private int kms;
	
	public coche() {
		System.out.println("Creando coche...");
		matricula="Desconocida";
		modelo="Desconocido";
		kms=0;
	}
	public coche(String matricula, String modelo,int kms) {
		this.matricula=matricula;																	
		this.modelo=modelo;
		this.kms=kms;
	}
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;						
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	
	
	public String toString() {					
		String resultado="";
		
		resultado="El coche "+this.matricula+" de modelo "+this.modelo+" y kms "+this.kms;
		
		return resultado;
	}
	
	
}
