package ar.edu.unq.po2.tp5.stock;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.po2.tp5.producto.Producto;

public class Stock {

	private List<List<Producto>> stock;
	
	public Stock() {
		stock = new ArrayList<>();
	}
	
	public void agregarProducto(Producto producto) {
		if (!this.tieneProducto(producto.getNombre())) {
			ArrayList<Producto> nuevoProducto = new ArrayList<Producto>();
			nuevoProducto.add(producto);
			stock.add(nuevoProducto);
		} else {
			for (List<Producto> listaProducto:stock) {
				if (listaEsDeProducto(listaProducto, producto.getNombre())){
					listaProducto.add(producto);
				}
			}
		}
	}
	
	private boolean listaEsDeProducto(List<Producto> lista, String nombreProducto) {
		return (!(lista.isEmpty()) && (lista.get(0).getNombre() == nombreProducto));
	}
	
	public boolean tieneProducto(String nombreProducto) {
		boolean result = false;
		for (List<Producto> listaProducto:stock) {
			if (this.listaEsDeProducto(listaProducto, nombreProducto)) {
				result = true;
			}
		}
		return result;
	}
	
	public void sacarProductoDeStock(String nombreProducto) {
		for (List<Producto> listaProducto:stock) {
			if (this.listaEsDeProducto(listaProducto, nombreProducto)) {
				listaProducto.remove(0);
			}
		}
		this.limpiarStock();
	}
	
	private void limpiarStock() {
		int i = 0;
		for (List<Producto> listaProducto:stock) {
			if (listaProducto.isEmpty()) {
				stock.remove(i);
			}
			i = i + 1;
		}
	}
	
	public int cantidadDeProductosDisponibles() {
		return stock.size();
	}
	
}