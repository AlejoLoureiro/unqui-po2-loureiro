package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento; 

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esDePreciosCuidados, double descuento) {
		super(nombre, precio, esDePreciosCuidados);
		this.descuento = descuento;
	}

	public double getPrecio() {
		return (super.getPrecio() - (super.getPrecio() * (descuento/ 100))); // calculo el precio final con el descuento
	}
	
}
