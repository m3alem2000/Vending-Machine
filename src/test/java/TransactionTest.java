import static org.junit.Assert.*;

import org.junit.Test;

import com.vending.coin.Coin;
import com.vending.product.Inventory;

import bank.Transact;

public class TransactionTest {

	Transact transact;

	@Test
	public void pass_id_and_money_return_quantity_is_less_by_one_item() {
		Inventory inventory = new Inventory();
		transact = new Transact(inventory);
		transact.process(1, 150);
		assertEquals(4, inventory.getProductById(1).getQuantiy());
	}
	@Test
	public void give_25cent_for_change_get_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		transact = new Transact(inventory);
		transact.makeChange(25);
		assertEquals(9, coin.getQuarters());
		assertEquals(10, coin.getDimes());
		assertEquals(10, coin.getNickles());
	}
	
	@Test
	public void give_10cent_for_change_get_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		transact = new Transact(inventory);
		transact.makeChange(10);
		assertEquals(10, coin.getQuarters());
		assertEquals(9, coin.getDimes());
		assertEquals(10, coin.getNickles());
	}
	@Test
	public void give_5cent_for_change_get_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		transact = new Transact(inventory);
		transact.makeChange(5);
		assertEquals(10, coin.getQuarters());
		assertEquals(10, coin.getDimes());
		assertEquals(9, coin.getNickles());
	}
	
	@Test
	public void give_40cent_for_change_get_coin_inventory_updated() {
		Inventory inventory = new Inventory();
		Coin coin = new Coin();
		coin.setQuarters(10);
		coin.setDimes(10);
		coin.setNickles(10);
		transact = new Transact(inventory);
		transact.makeChange(40);
		assertEquals(9, coin.getQuarters());
		assertEquals(9, coin.getDimes());
		assertEquals(9, coin.getNickles());
	}

}
