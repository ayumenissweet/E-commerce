package models.inventory;

import models.products.Product;

public class InventoryItem {
	
	Product  product;
	int quantity;
	
	public InventoryItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	Product getProduct() {
		return this.product;
	}
	
	int getQuantity() {
		return this.quantity;
	}
	
	void setQuantity(int amount) {
		this.quantity = amount;
	}
	
	@Override 
	public String toString() {
		return product + "x " + this.quantity; 
	}
}
