package models.products;

import enums.Specs;

public class Electronics extends Product{
	
	private String name;
	private int ID;
	private double basePrice;
	Specs specs;
	
	public Electronics(String name, double basePrice,Specs specs) {
		super(name,basePrice);
		this.specs = specs;
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
	
	Specs getSpecs(){
		return this.specs;
	}
}
