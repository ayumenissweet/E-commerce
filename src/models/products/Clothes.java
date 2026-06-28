package models.products;

import enums.ClothColor;
import enums.ClothSize;

public class Clothes extends Product{

	private String name;
	private int ID;
	private double basePrice;
	private ClothColor color;
	private ClothSize size;
	
	public Clothes(String name, double basePrice, ClothSize size, ClothColor color){
		super(name, basePrice);
		this.size = size;
		this.color = color;
	}
	
	@Override 
	public String getName() {
		
		return this.name;
	}
	
	@Override
	public int getID() {
		
		return this.ID;
	}
	
	@Override 
	public double getBasePrice() {
		
		return this.basePrice;
	}
	
	public ClothColor getColor() {
		
		return this.color;
	}
	
	public ClothSize getSize() {
		
		return this.size;
	}
}
