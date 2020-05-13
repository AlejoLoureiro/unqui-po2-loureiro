package ar.edu.unq.po2.tp5.stock;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unq.po2.tp5.producto.Producto;

public class Stock {

	private Map<String,Integer> stock;
	
	public Stock() {
		stock = new HashMap<String,Integer>();
	}
	
	// agrega un producto nuevo o si el producto ya existe aumenta su cantidad
	public void agregarProducto(Producto producto) {
		if (!this.tieneProducto(producto.getNombre())) {
			stock.put(producto.getNombre(), 1);
		} else {
			this.incrementarProducto(producto);
		}
	}
	
	private void incrementarProducto(Producto producto) {
		Integer cantDeProductoStock = stock.get(producto.getNombre());
		stock.put(producto.getNombre(), cantDeProductoStock + 1);
	}
	
	public boolean tieneProducto(String nombreProducto) {
		return (stock.containsKey(nombreProducto) && (cantidadDeProductoEnStock(nombreProducto) > 0));
	}
	
	public void sacarProductoDeStock(String nombreProducto) {
		if (cantidadDeProductoEnStock(nombreProducto) > 0) {
			Integer cantDeProductoStock = stock.get(nombreProducto);
			stock.put(nombreProducto, cantDeProductoStock - 1);
		}
	}
	
	private Integer cantidadDeProductoEnStock(String nombreProducto) {
		int result = 0;
		if (stock.get(nombreProducto) != null && stock.get(nombreProducto) > 0) {
			result = stock.get(nombreProducto);
		}
		return result;
	}
	
	public Integer cantidadDeProductosDisponibles() {
		Integer result = 0; 
		for (Integer value: stock.values()) {
			if (value > 0) {
				result += 1;
			}
		}
		return result;
	}
	
}