package supermercado;

import java.util.function.BooleanSupplier;

public class Producto {

	
	protected String nombre;
	protected double precio;
	protected boolean esPreciosCuidados;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPreciosCuidados = false;
	}
	
	public Producto(String nombre, double precio, boolean esPreciosCuidados) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPreciosCuidados = esPreciosCuidados;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	
	}
	
	public boolean esPrecioCuidado() {
		return esPreciosCuidados;
	}

	public void aumentarPrecio(double valor) {
		precio += valor;
	}
}
