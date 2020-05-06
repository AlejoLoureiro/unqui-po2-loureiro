package unq.tp5.productoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.producto.ProductoCooperativa;
import ar.edu.unq.po2.tp5.stock.Stock;

class ProductoCooperativaTestCase {

	private ProductoCooperativa azucarCooperativa;
	private Stock stock;
	
	@BeforeEach
	void setUp() throws Exception {
		azucarCooperativa = new ProductoCooperativa("Azucar", 50d);
	}

	@Test
	void testGetPrecio() {
		assertEquals(45d, azucarCooperativa.getPrecio());
	}

}
