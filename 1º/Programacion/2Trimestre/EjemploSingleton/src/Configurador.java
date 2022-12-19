
public class Configurador {

	private String url;
	private String dataBase;
	
	
	//2. variable estatica y privada de la misma clase
	private static Configurador miConfigurador;
	
	//1. Constructor privado
	private Configurador(String url, String dataBase) {
		this.url = url;
		this.dataBase = dataBase;
	}
	
	//3. Metodo estatico publico que se encarga de instanciar a la variable y almacenarlo en una variable estatica
	public static Configurador newInstance (String url, String dataBase) {
		
		if(miConfigurador==null) {
			miConfigurador = new Configurador(url,dataBase);
		}
		
		return miConfigurador;
	}

	@Override
	public String toString() {
		return "Configurador [url=" + url + ", dataBase=" + dataBase + "]";
	}
	
	
	
}
