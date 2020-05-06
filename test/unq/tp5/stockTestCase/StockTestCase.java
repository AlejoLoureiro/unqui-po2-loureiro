package unq.tp5.stockTestCase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.producto.Producto;
import ar.edu.unq.po2.tp5.producto.ProductoTradicional;
import ar.edu.unq.po2.tp5.stock.Stock;

class StockTestCase {
	
	private Stock stock;

	@BeforeEach
	void setUp() throws Exception {
		stock = new Stock();
		Producto azucar = new ProductoTradicional("Azucar", 35d);
		Producto harina = new ProductoTradicional("Harina", 40d);
		stock.agregarProducto(azucar);
		stock.agregarProducto(harina);
	}

	@Test
	void testAgregarProductoYTieneProducto() {
		Producto harina = new ProductoTradicional("Harina", 40d);
		assertEquals(true, stock.tieneProducto(harina.getNombre()));
		assertEquals(2, stock.cantidadDeProductosDisponibles());
	}
	
	@Test
	void testSacarProductoDeStock() {
		Producto harina = new ProductoTradicional("Harina", 40d);
		stock.sacarProductoDeStock(harina.getNombre());
		assertEquals(false, stock.tieneProducto(harina.getNombre()));
	}

}
