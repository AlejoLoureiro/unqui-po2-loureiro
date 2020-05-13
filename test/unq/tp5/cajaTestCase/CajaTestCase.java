package unq.tp5.cajaTestCase;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.agencia.Agencia;
import ar.edu.unq.po2.tp5.caja.Caja;
import ar.edu.unq.po2.tp5.producto.Producto;
import ar.edu.unq.po2.tp5.producto.ProductoCooperativa;
import ar.edu.unq.po2.tp5.producto.ProductoTradicional;
import ar.edu.unq.po2.tp5.stock.Stock;

class CajaTestCase {

	private Caja caja;
	private Producto azucar;
	private Producto harina;
	private Producto leche;
	
	@BeforeEach
	void setUp() throws Exception {
		Stock stock = new Stock();
		azucar = new ProductoTradicional("Azucar", 35d);
		harina = new ProductoTradicional("Harina", 40d);
		leche = new ProductoCooperativa("Leche", 10d);
		stock.agregarProducto(azucar);
		stock.agregarProducto(harina);
		stock.agregarProducto(leche);
		caja = new Caja(stock);
	}

	@Test // Este test todavia no corre y no se cual es el error
	void testResgistrarProducto() {
		ArrayList<Producto> productosARegistrar = new ArrayList<Producto>();
		productosARegistrar.add(azucar);
		productosARegistrar.add(harina);
		caja.registrarProductos(productosARegistrar);
		assertEquals(1, caja.getStock().cantidadDeProductosDisponibles());
	}
	
	@Test
	void testCalcularPrecioDeCompra() {
		ArrayList<Producto> productosAComprar = new ArrayList<Producto>();
		productosAComprar.add(azucar);
		productosAComprar.add(harina);
		productosAComprar.add(leche);
		assertEquals(84d, caja.calcularPrecioCompra(productosAComprar));
	}

}
