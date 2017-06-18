import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.vending.product.Product;

public class TestProductGettersSetter {
	Product product;
	@Test
	public void add_product() {
		product = new Product();
		product.addProduct(1, "Cola", 0.50, 2);
		assertEquals(1, product.getProductId());
		assertEquals("Cola", product.getProductName());
		assertEquals(0.5, product.getPrice(),0.001);
		assertEquals(2, product.getQuantiy());
	}
}
