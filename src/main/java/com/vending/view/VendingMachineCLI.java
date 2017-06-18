package com.vending.view;
import java.io.IOException;
import com.vending.product.Inventory;

import bank.Money;
import bank.Transact;


public class VendingMachineCLI {

	Inventory inventory;

	public VendingMachineCLI(Inventory inventory){
		this.inventory = inventory;
	} 

	public void run() throws IOException {
		inventory.createDisplay();
		while(true) {		
			BuyItem buyItem = new BuyItem(inventory);
			Money money = new Money(inventory);
			Transact transact = new Transact(inventory);
			int itemNumber = buyItem.selectItem();
			int deposit = money.deposit(itemNumber);
			transact.process(itemNumber, deposit);
		}
	}



}
