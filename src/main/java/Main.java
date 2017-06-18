import java.io.IOException;

import com.vending.coin.Coin;
import com.vending.product.Inventory;
import com.vending.view.VendingMachineCLI;

public class Main{

		public static void main(String[] args) throws IOException {
			
			Coin coin = new Coin();
			coin.setQuarters(10);
			coin.setDimes(10);
			coin.setNickles(10);
			
			Inventory inventory = new Inventory();
			VendingMachineCLI VendingMachineCli = new VendingMachineCLI(inventory);
			
			VendingMachineCli.run();
		
		}
}
