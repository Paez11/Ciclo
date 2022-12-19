package ejemploXML;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club c = Club.getInstance();
		/*c.addSocio(new Socio(1,"Paco","C/ nueva 25","27/01/2022"));
		c.addSocio(new Socio(2,"Maria","C/ vieja 67","14/02/2022"));
		
		c.saveFile("Club.xml");
		 */
		c.loadFile("Club.xml");
		System.out.println(c);
	}

}
