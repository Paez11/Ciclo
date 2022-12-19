package Modelo;

import java.util.Objects;

public class Cliente {
	private String nombre;
	private String Ncuenta;
	private Double saldo;
	
	
	
	public Cliente(String nombre, String nCuenta, Double saldo) {
		super();
		this.nombre = nombre;
		Ncuenta = nCuenta;
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNcuenta() {
		return Ncuenta;
	}
	public void setNcuenta(String ncuenta) {
		Ncuenta = ncuenta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente--> \n" 
				+ "nombre:" + nombre + ", Ncuenta:" + Ncuenta + ", saldo:" + saldo ;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		boolean result=false;
		
		if(obj!=null){
			if(this == obj) {
				result=true;
			}else if(this.getClass()==obj.getClass()) {
				Cliente tmp=(Cliente)obj;
				if(this.Ncuenta!=null && tmp.Ncuenta==this.Ncuenta) {
					result=true;
				}
			}
		}
		
		return result;
	}
	*/

	@Override
	public int hashCode() {
		return Objects.hash(Ncuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(Ncuenta, other.Ncuenta);
	}
	
	
	
}
