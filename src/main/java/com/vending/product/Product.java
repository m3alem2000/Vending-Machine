package com.vending.product;

public class Product {

private int productId;
private String productName;
private double price;
private int quantity;

public void addProduct(int productId, String productName, double price, int quantity){
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantiy() {
	return quantity;
}
public void setQuantiy(int quantiy) {
	this.quantity = quantiy;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
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