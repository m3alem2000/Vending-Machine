import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.vending.coin.Coin;
import com.vending.coin.CoinValue;

public class SetCoinValue {
	Coin coin;
	CoinValue coinValue;

	@Before
	public void setup(){
	coinValue = new CoinValue ();

	}
	@Test
	public void nickleIsInserted() {
		coin = new Coin();
		coin.setDiameter(21.21);
		coin.setWeight(5.000);
		assertEquals(5, coinValue.getCoin(coin));
	}
	
	@Test
	public void dimeIsInserted() {
		coin = new Coin();
		coin.setDiameter(17.91);
		coin.setWeight(2.27);
		assertEquals(10, coinValue.getCoin(coin));
	}
	
	@Test
	public void quarterIsInserted() {
		coin = new Coin();
		coin.setDiameter(24.26);
		coin.setWeight(5.67);
		assertEquals(25, coinValue.getCoin(coin));
	}
	
	@Test
	public void pennyIsInserted() {
		coin = new Coin();
		coin.setDiameter(19.05);
		coin.setWeight(2.50);
		assertEquals(-1, coinValue.getCoin(coin));
	}
}
