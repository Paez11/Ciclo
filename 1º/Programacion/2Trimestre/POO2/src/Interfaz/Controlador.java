package Interfaz;

public class Controlador implements IControlador{

	@Override
	public void ejecutaPrograma(IVista v, IModelo m) {
		// TODO Auto-generated method stub
		int opcion=-1;
		do {
			v.mostrarMenuPrincipal();
			opcion=v.leeEntero("Elige una opcion");
			switch(opcion) {
				case 1:
					int op1=v.leeEntero("Inserta op1");
					int op2=v.leeEntero("Inserte op2");
					int resultado=m.suma(op1, op2);
					v.muestraResultado(resultado);
					break;
				case 2:
					int op3=v.leeEntero("Inserta op1");
					int op4=v.leeEntero("Inserte op2");
					int resultado2=m.resta(op3, op4);
					v.muestraResultado(resultado2);
					break;
					default:
			}
		}while(opcion!=3);
	}

	
}
