package com.vending.view;

import java.util.Scanner;

import com.vending.coin.Coin;
import com.vending.product.Inventory;

public class BuyItem{
	int itemNumber = 0;
	String strItemNumber = "";
	int new_quantity = 0;
	Inventory inventory;
	BuyItem(Inventory inventory){
		this.inventory = inventory;
	}
	public int selectItem(){
		do{
			Scanner scanUser = new Scanner(System.in);
			System.out.println("Enter Item Number");
			strItemNumber =  scanUser.nextLine();
			if (parseInteger(strItemNumber)){
				itemNumber = Integer.parseInt((strItemNumber));

				if(inventory.getProductById(itemNumber) != null && inventory.getProductById(itemNumber).getQuantiy()<1){
					if(inventory.checkMachineHasNoProducts()){
						System.out.println("Out of order");
					}else{
					System.out.println("Sold Out!");
					}
				}
			}
		}while (inventory.getProductById(itemNumber)==null || inventory.getProductById(itemNumber).getQuantiy()<1);

		return itemNumber;
	}

	public boolean parseInteger(String str)
	{
		try {
			Integer.parseInt(str);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
}