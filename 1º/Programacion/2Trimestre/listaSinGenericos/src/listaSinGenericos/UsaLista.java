package listaSinGenericos;

public class UsaLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista nombres = new Lista (4);
		nombres.add("Maria");
		nombres.add("Juan");
		nombres.add("Pedro");
		nombres.add("Ana");
		
		nombres.add(new Empleado("Ana","progr",52,1500));
		
		String nom = (String) nombres.get(3);
		
		System.out.println(nom);
	}

}
