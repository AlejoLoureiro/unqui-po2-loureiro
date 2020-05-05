package ar.edu.unq.po2.tp5.caja;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.producto.Producto;


public class Caja {

	private Stock stock;
	
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
	}
}
