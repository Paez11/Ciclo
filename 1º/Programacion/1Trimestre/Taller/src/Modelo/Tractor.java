package Modelo;

public class Tractor extends Vehiculo {
	private String remolque;

	public Tractor(String matricula, float kms, String marca, String modelo, String remolque) {
		super(matricula, kms, marca, modelo);
		this.remolque=remolque;
	}
	
	public Tractor() {
		super();
		this.remolque="";
	}


	public String getRemolque() {
		return remolque;
	}

	public void setRemolque(String remolque) {
		this.remolque = remolque;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tractor ->"+ super.toString()+"\n remolque: "+remolque;
	}
	
}
