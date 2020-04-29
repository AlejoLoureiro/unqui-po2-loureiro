package ar.edu.unq.po2.tp4.Supermercado.src.supermercado;

import java.util.function.BooleanSupplier;

public class Producto {

	
	private String nombre;
	private double precio;
	private boolean esPreciosCuidados;
	
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
