import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.vending.coin.Coin;
import com.vending.coin.CoinValue;

public class CoinQty {

	Coin coin;
	CoinValue coinValue;

	@Before
	public void setup(){
	coin = new Coin();
	coin.setQuarters(10);
	coin.setDimes(10);
	coin.setNickles(10);

	}
	@Test
	public void add_quarter() {
		coin.addQuarter();
		assertEquals(11, coin.getQuarters());
	}
	@Test
	public void subtract_quarter() {
		coin.subtractQuarter();
		assertEquals(9, coin.getQuarters());
	}
	@Test
	public void add_dime() {
		coin.addQuarter();
		assertEquals(11, coin.getQuarters());
	}
	@Test
	public void subtract_dime() {
		coin.subtractQuarter();
		assertEquals(9, coin.getQuarters());
	}
	@Test
	public void add_nickle() {
		coin.addQuarter();
		assertEquals(11, coin.getQuarters());
	}
	@Test
	public void subtract_nickle() {
		coin.subtractQuarter();
		assertEquals(9, coin.getQuarters());
	}
	
	@Test
	public void subtract_quarter_to_become_negative() {
		coin.setQuarters(0);
		coin.subtractQuarter();
		assertEquals(-1, coin.getQuarters());
	}
	@Test
	public void subtract_dime_to_become_negative() {
		coin.setDimes(0);
		coin.subtractDime();;
		assertEquals(-1, coin.getDimes());
	}
	@Test
	public void subtract_nickle_to_become_negative() {
		coin.setNickles(0);
		coin.subtractNickle();
		assertEquals(-1, coin.getNickles());
	}

}
