import Modelo.*;
import Utils.Storage;

public class Ejecutable {

	public static void main(String[] args) {
		Coche c1 = new Coche ("69F", 32000, "Peugeot","307","tintadas");
		System.out.println(c1);
		
		Tractor t1 = new Tractor ("69A",20000, "Renold", "Titan", "Dos ejes");
		System.out.println(t1);
		
		System.out.println(t1.equals(c1));
		
		Moto m1 = new Moto ("12D", 32111, "Honda", "321w", "larga");
		System.out.println(m1);
		
		Vehiculo [] taller = new Vehiculo [3];
		taller [0] = c1;
		taller [1] = t1;
		taller[2] = m1;
		
		Tractor t2 = new Tractor ("42R",20000, "Renold", "Titan", "Dos ejes");
		
		
		Vehiculo v = new Vehiculo("",0,"Cualquiera","otro");
		Storage.saveVehiculo(v, "db.txt");
		
		/*
		for (int i = 0; i < taller.length; i++) {
			if (//taller[i].equals(t2) taller[i].getClass()==Tractor.class) {
				Tractor tmp = (Tractor) taller[i];
				tmp.getRemolque();
				System.out.println(tmp.getRemolque());
			}else {
				System.out.println("No esta en el taller");
			}
		}
		
		for (int i = 0; i < taller.length; i++) {
			System.out.println(taller[i]);
			System.out.println("-----------------");
			//System.out.println(taller[i] instanceof Vehiculo );
			System.out.println(taller[i].getClass());
		}
		*/
	}

}
