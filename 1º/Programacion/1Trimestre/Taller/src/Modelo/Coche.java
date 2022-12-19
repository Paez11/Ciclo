package Modelo;

public class Coche extends Vehiculo {
	private String luna;

	
	public Coche(String matricula, float kms, String marca, String modelo, String luna) {
		super(matricula, kms, marca, modelo);
		this.luna=luna;
	}
	
	
	public Coche() {
		super();
		this.luna="";
	}

	public String getLuna() {
		return luna;
	}

	public void setLuna(String luna) {
		this.luna = luna;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Coche ->"+ super.toString()+"\n luna: "+luna;
	}
	
}
