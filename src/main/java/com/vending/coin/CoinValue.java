package com.vending.coin;

public class CoinValue {
	
	// will give a +/- 5% discrepancy in weight
	private final double nickleUpperWeight = 5.000 * 1.05;  // in gram
	private final double nickleLowerWeight = 5.000 * 0.95;; // in gram
	private final double dimeUpperWeight = 2.268 * 1.05;  // in gram
	private final double dimeLowerWeight = 2.268 * 0.95; // in gram
	private final double quarterUpperWeight = 5.670 * 1.05;  // in gram
	private final double quarterLowerWeight = 5.670 * 0.95; // in gram
	
	private final double nickleUpperDiameter = 21.21 * 1.05; // in mm
	private final double nickleLowerDiameter = 21.21 * 0.95;; // in mm
	private final double dimeUpperDiameter = 17.91 * 1.05; // in mm
	private final double dimeLowerDiameter = 17.91 * 0.95;; // in mm
	private final double quarterUpperDiameter = 24.26 * 1.05; // in mm
	private final double quarterLowerDiameter = 24.26 * 0.95;; // in mm
	
	public final int nickle = 5;
	public final int dime = 10;
	public final int quarter = 25;
	

	public int getCoin(Coin coin) {
		if(coin.getWeight() <=  nickleUpperWeight && coin.getWeight() >=  nickleLowerWeight && coin.getDiameter() <= nickleUpperDiameter && coin.getDiameter() >= nickleLowerDiameter){
			return nickle;
		}else if(coin.getWeight() <=  dimeUpperWeight && coin.getWeight() >=  dimeLowerWeight && coin.getDiameter() <= dimeUpperDiameter && coin.getDiameter() >= dimeLowerDiameter){
			return dime;
		}else if(coin.getWeight() <=  quarterUpperWeight && coin.getWeight() >=  quarterLowerWeight && coin.getDiameter() <= quarterUpperDiameter && coin.getDiameter() >= quarterLowerDiameter){
			return quarter;
		}else{
			return -1;
		}
	}
	
	public void ejectCoin(){
		
	}
}


//Denomination	Cent			Nickel		Dime			Quarter 
//Weight			2.500 g		5.000 g		2.268 g		5.670 g
//Diameter		0.75 in.		0.835 in.	0.705 in.	0.955 in.
//				19.05 mm		21.21 mm	 	17.91 mm		24.26 mm



//Accept Coins
//As a vendor
//I want a vending machine that accepts coins
//So that I can collect money from the customer
//The vending machine will accept valid coins (nickels, dimes, and quarters) and
//reject invalid ones (pennies). When a valid coin is inserted the amount of the coin
//will be added to the current amount and the display will be updated. When there
//are, no coins inserted, the machine displays INSERT COIN. Rejected coins are
//placed in the coin return.
//NOTE: The temptation here will be to create Coin objects that know their value.
//However, this is not how a real vending machine works. Instead, it identifies
//coins by their weight and size and then assigns a value to what was inserted.
//You will need to do something similar. This can be simulated using strings,
//constants, enums, symbols, or something of that nature.