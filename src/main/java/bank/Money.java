package bank;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import com.vending.coin.Coin;
import com.vending.coin.CoinValue;
import com.vending.product.Product;
import com.vending.product.Inventory;

public class Money{
	private int currentMoney = 0;
	int depositAmount = 0;
	Inventory inventory;
	Product product;

	public Money(Inventory inventory) {
		this.inventory = inventory;
	}

	public double getCurrentMoney() {
		return currentMoney;

	}

	public int deposit(int itemNumber) throws IOException {
		product = inventory.getProductById(itemNumber);
		currentMoney = currentMoney + depositAmount;
		Coin coin = new Coin();
		while(currentMoney < product.getPrice()*100){
			Scanner userInput = new Scanner(System.in);
			if(coin.getQuarters()==0 && coin.getDimes()==0 && coin.getNickles()==0){
				System.out.println("Exact Change Only");
			}else{
			System.out.println("Insert Coins (Nickles, Dimes, Quarters Only)");
			}
//			depositAmount = userInput.nextInt();
			depositAmount = getCoinBasedOnProperty();  // randomly generating the coin value based on weight & diameter
			if(depositAmount == -1){
				// eject last coin
				System.out.println("Eject last coin");
			}else{
			updateCoinQuantity(depositAmount);
			currentMoney = currentMoney + depositAmount;
			}
			System.out.println("Your Deposit: ¢"+currentMoney);
		}
		return currentMoney;
	}
	
	// This is a random coin generator based on weight and diameter. It is meant to simulate a sensor
	//	an actual vending machine.
	public int getCoinBasedOnProperty(){
		int[] items = new int[]{0,1,2,3};
		CoinValue coinValue = new CoinValue();
		Coin coin = new Coin();

		Random random = new Random();
		int i = items[random.nextInt(items.length)];
		double[][] coinProperty = new double[][]{{ 2.5, 19.05},{ 5, 21.21},{ 2.268, 17.92},{ 5.67, 24.26}};
		double weight = coinProperty[i][0];
		double diameter = coinProperty[i][1];
		coin.setDiameter(diameter);
		coin.setWeight(weight);
		int value = coinValue.getCoin(coin);
		return value;
	}

	public void updateCoinQuantity(int depositAmount){
		Coin coin = new Coin();
		if(depositAmount == 5){
			coin.addNickle();
		}else if(depositAmount == 10){
			coin.addDime();
		}else if (depositAmount == 25){
			coin.addQuarter();
		}
	}
}
