package Modelo;

import java.util.HashMap;
import java.util.Map;

public class UsaMap {

	public static void main(String[] args) {
		
		HashMap <String, Persona> miMapa = new HashMap<String, Persona>();
		
		miMapa.put("1234F", new Persona("1234F","Adrian",25));
		miMapa.put("2345C", new Persona("2345C","Ana",21));
		miMapa.put("3456Y", new Persona("3456Y","Pepe",23));
		miMapa.put("4567W", new Persona("4567W","Felipe",54));
		
		miMapa.put("3456Y", new Persona("3456Y","Maria",12)); //al insertar uno nuevo con la misma clave lo reempleza por el que habia
		
		Persona borrada = miMapa.remove("3456Y");
		
		Persona p = miMapa.get("1234F");
		/*
		for(Map.Entry<String, Persona> e :miMapa.entrySet()) {
			System.out.println("Clave: "+e.getKey());
			System.out.println("valor: "+e.getValue());
		}
		*/
		for(String e:miMapa.keySet()) {
			System.out.println(miMapa.get(e));
		}
		
	}

}
