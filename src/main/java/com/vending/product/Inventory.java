package com.vending.product;

import java.util.ArrayList;

public class Inventory{

	static ArrayList<Product> items;
	static Product product;
	public Inventory(){

		//		if (items.size()==0 || items.equals(null) || items.isEmpty()){
		createInventory();
		//		}
	}

	private static void createInventory() {
		items = new ArrayList<>();
		product = new Product();
		product.addProduct(1, "Cola", 1.00, 5);
		items.add(product);
		product = new Product();
		product.addProduct(2, "Chips", 0.50, 5);
		items.add(product);
		product = new Product();
		product.addProduct(3, "Candy", 0.65, 5);
		items.add(product);
	}

	public Product getProductById(int Id){
		product = new Product();
		for (Product product : items) {
			if (product.getProductId() == Id) {
				return product;
			}
		}
		return null; 
	}

	public boolean checkMachineHasNoProducts(){
		items.size();
		int i = 0;
		for (Product product : items) {
			if (product.getQuantiy()<1) {
				i++;
			}
		}
		if(i==items.size()){
			return true;
		}else{
			return false;
		}
	}

	public void createDisplay(){
		System.out.println();
		System.out.printf("%-10s%-25s%-18s%-20s%n","Item No.", "Description","Price","Quantity" );
		for(Product item:items){
			System.out.println();
			System.out.printf("%-10s%-25s%-20s%-20s%n",item.getProductId(),item.getProductName(), "$"+item.getPrice(),item.getQuantiy());
		}
	}
}


//As a vendor
//I want customers to select products
//So that I can give them an incentive to put money in the machine
//There are three products: cola for $1.00, chips for $0.50, and candy for $0.65.
//When the respective button is pressed and enough money has been inserted,
//the product is dispensed and the machine displays THANK YOU. If the display is
//checked again, it will display INSERT COIN and the current amount will be set to
//$0.00. If there is not enough money inserted then the machine displays PRICE
//and the price of the item and subsequent checks of the display will display either
//INSERT COIN or the current amount as appropriate.