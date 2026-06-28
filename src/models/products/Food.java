package models.products;

public class Food extends Product {
	
	private String name;
	private int ID;
	private double basePrice;
	double expirationTime; 
	
	public Food(String name, double basePrice, double expirationTime) {
		super(name,basePrice );
		this.expirationTime = expirationTime;
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
	
	public double getExpirationTime(){
		
		return this.expirationTime;
	}
}
