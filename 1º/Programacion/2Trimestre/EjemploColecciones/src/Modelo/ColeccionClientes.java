package Modelo;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColeccionClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new Cliente ("Pepe","001", 52000.00);
		Cliente c2 = new Cliente ("Ana","002", 2000.00);
		Cliente c3 = new Cliente ("Maria","003", 23000.00);
		Cliente c4 = new Cliente ("Andres","004", 12000.00);
		Cliente c5 = new Cliente ("Pepe","001", 52000.00);
		
		Set <Cliente> misClientes = new HashSet<Cliente>();
		
		misClientes.add(c1);
		misClientes.add(c2);
		misClientes.add(c3);
		misClientes.add(c4);
		misClientes.add(c5);
		
		
		for (Cliente cliente : misClientes) {
			System.out.println(cliente);
		}
		
		
		
		Iterator <Cliente> it = misClientes.iterator();
		/*while(it.hasNext()) {
			//System.out.println(it.next());
			Cliente c = it.next();
			System.out.println(c);
		}*/
		/*
		while(it.hasNext()) {
			Cliente c = it.next();
			System.out.println(c.getNombre());
			System.out.println(c.getNcuenta());
		}
		*/
		
		//Buscar un elemento y borrarlo usuando el foreach
		/*
		for (Cliente cliente : misClientes) {
			if(cliente.getNombre().equals("Maria")) {
				misClientes.remove(cliente);
			}
		}
		*/
		System.out.println();
		while(it.hasNext()) {
			Cliente c = it.next();
			if(c.getNcuenta().equals("002")) {
				it.remove();
			}
		}
		
		for (Cliente cliente : misClientes) {
			System.out.println(cliente);
		}
		
	}

}
