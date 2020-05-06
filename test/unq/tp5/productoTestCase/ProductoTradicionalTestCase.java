package unq.tp5.productoTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.producto.Producto;
import ar.edu.unq.po2.tp5.producto.ProductoTradicional;

class ProductoTradicionalTestCase {

	private ProductoTradicional azucar;
	
	
	@BeforeEach
	void setUp() throws Exception {
		azucar = new ProductoTradicional("Azucar", 35d);
	}

	@Test
	void testGetNombre() {
		assertEquals("Azucar", azucar.getNombre());
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(35d, azucar.getPrecio());
	}

}
