package ar.edu.unq.po2.tp4.Supermercado.src.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.productos = new ArrayList<Producto>();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public Double getPrecioTotal() {
		Double total = 0d;
		for (Producto producto:productos) {
			total += producto.getPrecio(); 
		}
		return total;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	
}
