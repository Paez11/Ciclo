package Utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import Modelo.Vehiculo;

public class Storage {
	public static boolean saveVehiculo(Vehiculo aguardar, String file) {
		boolean result=false;
		try {
			FileOutputStream f = new FileOutputStream(new File(file));
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(aguardar);
			o.close();
			f.close();
			result=true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
}
