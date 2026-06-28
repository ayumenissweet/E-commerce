package models.products;

import java.util.UUID;

public abstract class Product{
	
	private String name;
	private int ID;
	private double basePrice;
	
	Product(String name, double basePrice){
		this.name = name;
		this.ID = Integer.parseInt(UUID.randomUUID().toString());
		this.basePrice = basePrice;
	}
	
	public abstract String getName();
	public abstract int getID();
	public abstract double getBasePrice();
	
	@Override 
	public String toString() {
		
		return String.format("Product Name: %s\nProduct ID: %d\nProduct Price: %.2f", this.name,this.ID,this.basePrice);
	}
}
