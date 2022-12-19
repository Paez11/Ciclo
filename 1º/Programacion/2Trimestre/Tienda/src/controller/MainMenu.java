package controller;

import Utils.Read;
import model.Product;
import model.Store;
import view.Error;
import view.Print;

public class MainMenu {
	
	static Store store = new Store();
	
	public static void run() {
		int option=-1;
		do {
			Print.MainMenu();
			option=Read.integrer();
			switchMain(option);
		}while(option!=5);
	}
	
	public static void switchMain(int option) {
		
		String id="";
		
		switch(option) {
		case 1:
			newProduct();
			Print.confirm();
			break;
		case 2:
			newPrice(id);
			Print.confirm();
			break;
		case 3:
			Print.showProducts(store);
			break;
		case 4:
			Print.print("Introduzca el id del producto a eliminar");
			id=Read.String();
			store.removeProducts(id);
			Print.confirm();
			break;
		case 5:
			Print.print("adios");
			break;
			default:
				Error.error();
		}
	}
	
	public static boolean newProduct() {
	
		Print.print("Introduzca el codigo del producto");
		String id=Read.String();
		Print.print("Introduzca una descripcion del producto");
		String des=Read.String();
		Print.print("Introduzca la talla del producto");
		String size=Read.String();
		Print.print("Introduzca el precio del producto");
		float price=Read.Float();
		
		Product item=null;
		item=new Product(id,des,size,price);
		
		return store.addProduct(item);
	}
	
	public static boolean newPrice(String id) {
		float newPrice=0f;
		
		Print.print("Introduzca el id del producto: ");
		id=Read.String();
		Print.print("Introduzca el nuevo precio del producto");
		newPrice=Read.Float();
		
		return store.editPrice(id, newPrice);
	}
	
}
