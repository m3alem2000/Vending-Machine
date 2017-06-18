import static org.junit.Assert.*;

import org.junit.Test;

import com.vending.coin.Coin;
import com.vending.product.Inventory;

import bank.Money;
import bank.Transact;

public class MoneyUpdateQty {
	Money money;

	@Test
	public void deposit_quarter_in_vending_machine_return_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		money = new Money(inventory);
		money.updateCoinQuantity(25);
		assertEquals(11, coin.getQuarters());
		assertEquals(10, coin.getDimes());
		assertEquals(10, coin.getNickles());
	}
	@Test
	public void deposit_dime_in_vending_machine_return_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		money = new Money(inventory);
		money.updateCoinQuantity(10);
		assertEquals(10, coin.getQuarters());
		assertEquals(11, coin.getDimes());
		assertEquals(10, coin.getNickles());
	}
	@Test
	public void deposit_nickle_in_vending_machine_return_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		money = new Money(inventory);
		money.updateCoinQuantity(5);
		assertEquals(10, coin.getQuarters());
		assertEquals(10, coin.getDimes());
		assertEquals(11, coin.getNickles());
	}

}
