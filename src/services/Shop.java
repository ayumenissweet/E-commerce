package services;

import java.util.Scanner;

import enums.ClothColor;
import enums.ClothSize;
import enums.Specs;
import models.inventory.Inventory;
import models.products.Clothes;
import models.products.Electronics;
import models.products.Food;
import models.products.Product;

public class Shop {
	
	Scanner scanner = new Scanner(System.in);
	Inventory inventory = new Inventory();
	
	void init() {
		
		System.out.println("=================");
		System.out.println("E-COMMERCE SHOP :");
		System.out.println("=================");
		System.out.println("Would you like to:");
		System.out.println("1.Create a new Product");
		System.out.println("2.Delete a product");
		System.out.println("3.quit");
		
		int choice = scanner.nextInt();
		
		while(choice > 3 || choice < 1){
			
			System.out.println("Invalid number !");
			choice = scanner.nextInt();
		}
		
		switch(choice){
			
			case 1 :
				addProduct();
				break;
		
			case 2:
				//TODO
				break;
				
			case 3 :
				System.exit(0);
				break;
		}
	}
	
	void addProduct(){
		
		Product newProduct;
		
		System.out.println("Enter the name of the product : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the price of the product : ");
		double price = scanner.nextDouble();
		
		System.out.println("Entera value (1 - Clothes. 2 - Food. 3 - Electronics.) :");
		int choice = scanner.nextInt();
		
		while(choice > 3 || choice < 1){
			
			System.out.println("Invalid number !");
			System.out.println("Entera value (1 - Clothes. 2 - Food. 3 - Electronics.) :");
			choice = scanner.nextInt();
		}
		
		switch(choice){
			
			case 1 :
				newProduct = addClothes(name, price);
				break;
				
			case 2 :
				newProduct = addFood(name,price);
				break;
				
			case 3 :
				newProduct = addElectronics(name,price);
				break;
				
			default : newProduct = addElectronics(name,price); break; //TODO
		}
		
		System.out.println("Entera the quantity of the product :");
		int quantity = scanner.nextInt();
		
		inventory.addProduct(newProduct, quantity);
	}
		
	Product addClothes(String name, double price){
		
		System.out.println("Enter the color of the product : ");
		ClothColor color = ClothColor.valueOf(scanner.nextLine().toUpperCase());//grab 'RED' and see if it has a value
		
		System.out.println("Enter the size of the product : ");//S, M, XL
		ClothSize size = ClothSize.valueOf(scanner.nextLine().toUpperCase());
		
		Clothes newCloth = new Clothes(name, price, size, color);
		
		return newCloth;
	}
	
	Product addFood(String name, double price){

		System.out.println("Enter the expiration time of the product : ");
		double expirationTime = scanner.nextDouble();
		
		Food  newFood = new Food(name, price, expirationTime);
		
		return newFood;
	}
	
	Product addElectronics(String name, double price){
	
		System.out.println("Enter the spec of the product : ");//ASUS, AMD
		Specs spec = Specs.valueOf(scanner.nextLine().toUpperCase());
		
		Electronics newElectronic = new Electronics(name, price, spec);
		
		return newElectronic;
	}
}
