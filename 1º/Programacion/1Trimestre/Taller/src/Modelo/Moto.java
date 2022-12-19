package Modelo;

public class Moto extends Vehiculo {
	private String patilla;

	
	public Moto(String matricula, float kms, String marca, String modelo, String patilla) {
		super(matricula, kms, marca, modelo);
		this.patilla=patilla;
	}
	
	public Moto() {
		super();
		this.patilla="";
		
	}
	public String getPatilla() {
		return patilla;
	}

	public void setPatilla(String patilla) {
		this.patilla = patilla;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Moto ->"+ super.toString()+"\n patilla: "+patilla;
	}
	
}
