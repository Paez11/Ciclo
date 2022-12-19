package model;

import java.util.HashMap;

public class Store {
	private String name;
	private HashMap <String, Product> store;

	public Store(String name) {
		this.name = name;
		store = new HashMap<>(); 
	}
	
	public Store() {
		this("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public boolean addProduct(Product item) {
		boolean result=false;
		
		if(item!=null && !store.containsKey(item.getId())) {
			store.put(item.getId(), item);
			result=true;
		}
		
		return result;
	}
	
	public Product searchById(String id) {
		Product search=null;
		
		for (String e: store.keySet()) {
			if(store.containsKey(id)) {
				search=store.get(e);
			}
		}
		
		return search;
	}
	
	public boolean editPrice(String id, float newPrice) {
		boolean result=false;
		Product item=this.searchById(id);
		if(item!=null) {
			item.setPrice(newPrice);
			result=true;
		}
		
		return result;
	}
	
	public Product removeProducts(String id) {
		Product item=null;
		
		for(String i: store.keySet()) {
			if(store.containsKey(id)) {
				item=store.get(i);
				if(item!=null) {
					store.remove(i);
				}
			}
		}
		return item;
	}
	
	@Override
	public String toString() {
		String s =this.name+": ";
		
		for (String i: store.keySet()) {
			s+=i+" "+store.get(i);
		}
		
		return s;
	}
	
	
}
