
public class ArrayPrueba {

	public static void main(String[] args) {
		int[] miArray = new int[5];
		//int[] miArray= {15,25,8,-7,92};
		miArray[0]=15;
		miArray[1]=25;
		miArray[2]=8;
		miArray[3]=-7;
		miArray[4]=92;
		
		System.out.println("tamaño de mi array = "+miArray.length);
		for (int i=0; i<5; i++) {													//;i<miArray.length;
			System.out.println("elemento en la posicion "+i+" es "+miArray[i]);
		}
	}

}
