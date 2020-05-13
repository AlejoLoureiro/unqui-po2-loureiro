package ar.edu.unq.po2.tp5.factura;

public class Impuesto implements Factura {

	private Double tasaDelImpuesto;
	
	public Impuesto(Double tasa) {
		tasaDelImpuesto = tasa;
	}
	
	@Override
	public Double montoAPagar() {
		return tasaDelImpuesto;
	}

}
