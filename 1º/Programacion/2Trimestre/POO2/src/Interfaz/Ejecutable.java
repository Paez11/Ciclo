package Interfaz;

public class Ejecutable {

	public static void main(String[] args) {
		Controlador c= new Controlador();
		c.ejecutaPrograma(new Vista(),new Modelo());

	}

}
