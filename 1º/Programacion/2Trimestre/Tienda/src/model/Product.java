package model;

public class Product {
	private String id;
	private String description;
	private String size;
	private Float price;
	
	public Product(String id, String description, String size, Float price) {
		super();
		this.id = id;
		this.description = description;
		this.size = size;
		this.price = price;
	}
	
	public Product() {
		this("","","",0f);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product: \n -->id: " + id + ", description: " + description + ", size: " + size + ", price: " + price;
	}
	
	
}
