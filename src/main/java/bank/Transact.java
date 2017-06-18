package bank;

import com.vending.coin.Coin;
import com.vending.product.Inventory;
import com.vending.product.Product;

public class Transact {
	Inventory inventory;
	public Transact(Inventory inventory){
		this.inventory = inventory;
	}
	public void process(int itemNumber, int deposit) {

		Product product = new Product();
		product = inventory.getProductById(itemNumber);
		int price = (int) (100 * product.getPrice());
		product.setQuantiy(product.getQuantiy() - 1);
		int change = deposit - price;
		makeChange(change);
	}

	public void makeChange(int change){
		int numQuarters;
		int numDimes;
		int numNickels;
		Coin coin = new Coin();

		numQuarters = (int) (change / 25);
		if(coin.getQuarters()>= numQuarters){
			change %= 25;
			if(numQuarters !=0){
				coin.subtractQuarter();
			}
		}

		numDimes = (int) (change / 10);
		if(coin.getDimes()>=numDimes){
			change %= 10;
			if(numDimes !=0){
				coin.subtractDime();
			}
		}

		numNickels = (int) (change / 5);
		if(coin.getNickles()>=numNickels){
			change %= 5;
			if(numNickels !=0){
				coin.subtractNickle();
			}

			String outputDisplay = "Your change is: \n" + "\t" + numQuarters
					+ " quarter(s) \n" + "\t" + numDimes + " dime(s) \n" + "\t" + numNickels + " nickel(s) \n";
			System.out.println(outputDisplay);
			System.out.println();

		}
	}
}