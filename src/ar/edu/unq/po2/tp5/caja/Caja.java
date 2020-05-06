package ar.edu.unq.po2.tp5.caja;

import java.util.ArrayList;

import ar.edu.unq.po2.tp5.producto.Producto;
import ar.edu.unq.po2.tp5.stock.Stock;


public class Caja {

	private Stock stock;
	
	public Caja(Stock stock) {
		this.stock = stock;
	}
	
	public Stock getStock() {
		return stock;
	}
	
	public void registrarProductos(ArrayList<Producto> productos) {
		for (Producto producto:productos) {
			stock.sacarProductoDeStock(producto.getNombre());
		}
		System.out.println(this.calcularPrecioCompra(productos));
	}
	
	public Double calcularPrecioCompra(ArrayList<Producto> productos) {
		Double total = 0.0;
		for (Producto producto:productos) {
			total += producto.getPrecio();
		}
		return total;
	}
}
