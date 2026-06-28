package models.inventory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import models.products.Product;

public class Inventory {
	private Map <Integer, InventoryItem> stock = new HashMap<>();
	
	public void addProduct(Product  product, int quantity) {
		if(stock.containsKey(product.getID())){
			System.out.println("Product already exists");
			System.out.println("Would you like to modify it? (y/n)");
			Scanner scanner = new Scanner(System.in);
			char choice;
			do {
				choice = scanner.nextLine().toLowerCase().charAt(0);
			}while(choice != 'y' || choice != 'n');
			if(choice == 'y') {
				//do something
			}else {
				return;
			}
		}else {
			stock.put(product.getID(), new InventoryItem(product, quantity));
			System.out.println("Product Added");
			return;
		}
	}
	
	public void deleteProduct(int id) {
		if(!stock.containsKey(id)) {
			System.out.println("Product not found.");
			return;
		}else {
			stock.remove(id);
			System.out.println("Product deleted successfully.");
		}
	}
}
