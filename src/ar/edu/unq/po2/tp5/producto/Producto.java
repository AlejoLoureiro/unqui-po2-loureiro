package ar.edu.unq.po2.tp5.producto;

public abstract class Producto {

	private String nombre;
	protected Double precio;
	protected boolean esDeCooperativa;
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esDeCooperativa = false;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public boolean getEsDeCooperativa() {
		return esDeCooperativa;
	}
	
}
